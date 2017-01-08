/**
 * Project: yangqisport
 * 
 * File Created at 2015年5月7日
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

/**
 * XAuthTokenService
 * 
 * @author Administrator
 */
public interface XAuthTokenService {

    public XAuthToken getTokenByUserId(String userId);

    public XAuthToken createToken(String loginId);

    public void removeToken(String token);

    public boolean validateToken(String token);

    public XAuthToken getToken(String token);

}
