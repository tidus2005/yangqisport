/**
 * Project: yangqisport
 * 
 * File Created at 2015年5月8日
 * $Id$
 * 
 * Copyright 2008 Alibaba.com Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Alibaba Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Alibaba.com.
 */
package com.yangqisport.framework.auth;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.yangqisport.dal.dataobject.CommXAuthToken;
import com.yangqisport.dal.dataobject.CommXAuthTokenExample;
import com.yangqisport.dal.mapper.CommXAuthTokenMapper;
import com.yangqisport.framework.util.AESUtils;
import com.yangqisport.framework.util.CollectionUtilsX;

/**
 * AESXAuthTokenServiceImpl
 * 
 * @author Administrator
 */
@Service("AESXAuthTokenService")
public class AESXAuthTokenServiceImpl implements XAuthTokenService {

    private String                  tokenGenKey  = "AESXAuthTokenServiceImpl!@#$%^&*()~!@#$%^&";

    private long                    expireOffset = 60 * 60 * 24 * 365;

    private Map<String, XAuthToken> tokenMap     = new HashMap<String, XAuthToken>();

    @Autowired
    private CommXAuthTokenMapper    commXAuthTokenMapper;

    @Override
    public XAuthToken getTokenByUserId(String userId) {
        Assert.notNull(userId);
        XAuthToken xAuthToken = new XAuthToken();

        CommXAuthTokenExample example = new CommXAuthTokenExample();
        example.createCriteria().andUserIdEqualTo(userId);

        CommXAuthToken commXAuthToken = CollectionUtilsX.unique(commXAuthTokenMapper
                .selectByExample(example));
        if (commXAuthToken != null) {
            BeanUtils.copyProperties(commXAuthToken, xAuthToken);
        } else {
            xAuthToken = createToken(userId);
        }

        return xAuthToken;
    }

    /*
     * (non-Javadoc)
     * @see
     * com.yangqisport.framework.auth.XAuthTokenService#createToken(java.lang
     * .String)
     */
    @Override
    public XAuthToken createToken(String userId) {
        Assert.notNull(userId);
        String token = AESUtils.encryptString(userId, tokenGenKey + UUID.randomUUID().toString());
        XAuthToken xAuthToken = new XAuthToken();
        xAuthToken.setExpireIn(System.currentTimeMillis() + expireOffset);
        xAuthToken.setUserId(userId);
        xAuthToken.setToken(token);
        //        tokenMap.put(token, xAuthToken);
        CommXAuthToken commXAuthToken = new CommXAuthToken();
        BeanUtils.copyProperties(xAuthToken, commXAuthToken);
        commXAuthTokenMapper.insertSelective(commXAuthToken);
        return xAuthToken;
    }

    /*
     * (non-Javadoc)
     * @see
     * com.yangqisport.framework.auth.XAuthTokenService#removeToken(java.lang
     * .String)
     */
    @Override
    public void removeToken(String token) {
        Assert.notNull(token);

        //tokenMap.remove(token);
    }

    @Override
    public XAuthToken getToken(String token) {
        CommXAuthTokenExample example = new CommXAuthTokenExample();
        example.createCriteria().andTokenEqualTo(token);

        CommXAuthToken commXAuthToken = CollectionUtilsX.unique(commXAuthTokenMapper
                .selectByExample(example));
        XAuthToken xAuthToken = new XAuthToken();
        BeanUtils.copyProperties(commXAuthToken, xAuthToken);
        return xAuthToken;
    }

    /*
     * (non-Javadoc)
     * @see
     * com.yangqisport.framework.auth.XAuthTokenService#validateToken(java.lang
     * .String)
     */
    @Override
    public boolean validateToken(String token) {
        if (token == null || token.isEmpty())
            return false;

        XAuthToken xAuthToken = getToken(token);
        if (xAuthToken != null && xAuthToken.getExpireIn() >= System.currentTimeMillis()) {
            return true;
        }

        //        if (token != null && token.length() > 0 && tokenMap.containsKey(token)
        //                && tokenMap.get(token).getExpireTime() >= System.currentTimeMillis()) {
        //            return true;
        //        }
        return false;
    }

    public void setExpireOffset(long expireOffset) {
        this.expireOffset = expireOffset;
    }

    public void setTokenGenKey(String tokenGenKey) {
        this.tokenGenKey = tokenGenKey;
    }

}
