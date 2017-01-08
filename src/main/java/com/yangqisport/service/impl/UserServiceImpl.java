/**
 * Project: yangqisport
 * 
 * File Created at 2015年5月6日
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
package com.yangqisport.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

//import weibo4j.Users;
//import weibo4j.examples.oauth2.Log;
//import weibo4j.model.WeiboException;

import com.yangqisport.dal.dataobject.User;
import com.yangqisport.dal.dataobject.UserExample;
import com.yangqisport.dal.dataobject.UserInterestActivity;
import com.yangqisport.dal.mapper.UserInterestActivityMapper;
import com.yangqisport.dal.mapper.UserMapper;
import com.yangqisport.framework.service.BusinessException;
import com.yangqisport.framework.util.CollectionUtilsX;
import com.yangqisport.service.ErrorCode;
import com.yangqisport.service.UserService;
import com.yangqisport.service.domain.ActivityItemDO;
import com.yangqisport.service.domain.UserDO;

/**
 * UserServiceImpl
 * 
 * @author Administrator
 */
@Service
public class UserServiceImpl implements UserService {

    public static final Logger         LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper                 userMapper;

    @Autowired
    private UserInterestActivityMapper userInterestActivityMapper;

    /*
     * (non-Javadoc)
     * @see
     * com.yangqisport.service.UserService#register(com.yangqisport.service.
     * domain.UserDO)
     */
    @Override
    public UserDO register(String loginId, String password, String repassword) {
        Assert.notNull(loginId);
        Assert.notNull(password);
        Assert.notNull(repassword);

        if (!password.equals(repassword)) {
            throw new BusinessException(ErrorCode.USER_REG_PWD_NOT_EQUALS);
        }

        UserExample userExample = new UserExample();
        userExample.createCriteria().andLoginIdEqualTo(loginId);
        if (userMapper.countByExample(userExample) > 0) {
            throw new BusinessException(ErrorCode.USER_REG_LOGINID_EXISTS);
        }

        UserDO userDO = new UserDO();
        User user = new User();
        user.setLoginId(loginId);
        user.setPassword(repassword);
        userMapper.insertSelective(user);
        userDO.setId(user.getId());
        BeanUtils.copyProperties(user, userDO);
        LOGGER.info("new user register : %s", userDO);

        return userDO;
    }

    /*
     * (non-Javadoc)
     * @see com.yangqisport.service.UserService#login(java.lang.String,
     * java.lang.String)
     */
    @Override
    public UserDO login(String loginId, String password) {
        Assert.notNull(loginId);
        Assert.notNull(password);

        UserExample example = new UserExample();
        example.createCriteria().andLoginIdEqualTo(loginId).andPasswordEqualTo(password);

        User user = CollectionUtilsX.unique(userMapper.selectByExample(example));

        if (user == null) {
            throw new BusinessException(ErrorCode.USER_LOGIN_LOGIN_FAILED);
        }

        UserDO userDO = new UserDO();
        BeanUtils.copyProperties(user, userDO);

        return userDO;
    }

    /*
     * (non-Javadoc)
     * @see com.yangqisport.service.UserService#logout(java.lang.String)
     */
    @Override
    public UserDO logout(String loginId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UserDO getUserByUserId(Long userId) {
        Assert.notNull(userId);
        UserExample example = new UserExample();
        example.createCriteria().andIdEqualTo(userId);
        User user = CollectionUtilsX.unique(userMapper.selectByExample(example));
        UserDO userDO = new UserDO();
        BeanUtils.copyProperties(user, userDO);
        return userDO;
    }

    @Override
    public UserDO login(String authString, String platform, boolean autoRegister) {
        Assert.notNull(authString);
        Assert.notNull(platform);
        UserDO userDO = new UserDO();
        User user = null;
//        if (platform.equals("weibo")) {
//            weibo4j.model.User weiboUser = getWeiboUserInfo(authString);
//            userDO.setAvatar(weiboUser.getProfileImageUrl());
//            userDO.setBindAcctWeibo(weiboUser.getId());
//            userDO.setNickname(weiboUser.getName());
//            userDO.setLoginId("weibo_" + weiboUser.getId());
//            userDO.setSex(weiboUser.getGender());
//            userDO.setMemo(weiboUser.getDescription());
//            userDO.setRegion(weiboUser.getLocation());
//
//            UserExample userExample = new UserExample();
//            userExample.createCriteria().andBindAcctWeiboEqualTo(weiboUser.getId());
//            user = CollectionUtilsX.unique(userMapper.selectByExample(userExample));
//            if (user == null) {
//                user = new User();
//                BeanUtils.copyProperties(userDO, user);
//                userMapper.insertSelective(user);
//                userDO.setId(user.getId());
//            } else {
//                BeanUtils.copyProperties(user, userDO);
//            }
//        } else {
//            throw new BusinessException(ErrorCode.USER_LOGIN_AUTH_FAIL, "登陆失败，三方平台校验错误");
//        }

        return userDO;
    }

    /**
     * 获取微博用户信息
     * 
     * @param accessToken
     * @return
     */
//    private weibo4j.model.User getWeiboUserInfo(String authString) {
//        String accessToken = null;
//        String uid = null;
//        try {
//            accessToken = authString.split(",")[0];
//            uid = authString.split(",")[1];
//        } catch (Exception ex) {
//            throw new BusinessException(ErrorCode.USER_LOGIN_LOGIN_FAILED,
//                    "微博平台authString格式错误！正确为 accessToken,uid");
//        }
//
//        Users um = new Users(accessToken);
//        try {
//            weibo4j.model.User user = um.showUserById(uid);
//            Log.logInfo(user.toString());
//            return user;
//        } catch (WeiboException e) {
//            throw new BusinessException(ErrorCode.USER_LOGIN_LOGIN_FAILED,e.getMessage());
//        }
//    }

    @Override
    public void settingUserInterestActivity(Long userId, List<ActivityItemDO> interestActivityItems) {
        Assert.notNull(userId);
        Assert.notNull(interestActivityItems);

        UserDO userDO = getUserByUserId(userId);
        if (userDO == null) {
            throw new BusinessException(ErrorCode.USER_NOT_EXISTS);
        }

        for (ActivityItemDO activityItemDO : interestActivityItems) {
            UserInterestActivity userInterestActivity = new UserInterestActivity();
            userInterestActivity.setActivityType(activityItemDO.getType().code());
            userInterestActivity.setLevel(activityItemDO.getLevel().code());
            userInterestActivity.setUserId(userId);
            userInterestActivityMapper.insertSelective(userInterestActivity);
        }
    }
}
