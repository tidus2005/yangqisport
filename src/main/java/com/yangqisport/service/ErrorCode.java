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
package com.yangqisport.service;

/**
 * TODO Comment of ErrorCode
 * 
 * @author Administrator
 */
public class ErrorCode {

    /** 注册密码不一致 **/
    public static final String USER_REG_PWD_NOT_EQUALS    = "USER_REG_PWD_NOT_EQUALS";

    /** 注册密码模式错误 **/
    public static final String USER_REG_PWD_PATTERN_ERROR = "USER_REG_PWD_PATTERN_ERROR";

    /** 登陆失败，用戶不存在或密碼錯誤 **/
    public static final String USER_LOGIN_LOGIN_FAILED    = "USER_LOGIN_LOGIN_FAILED";

    /** 用户登陆ID已经存在 **/
    public static final String USER_REG_LOGINID_EXISTS    = "USER_REG_LOGINID_EXISTS";

    /** 用户授权失败 **/
    public static final String USER_LOGIN_AUTH_FAIL       = "USER_LOGIN_AUTH_FAIL";

    /** 用户不存在 **/
    public static final String USER_NOT_EXISTS            = "USER_NOT_EXISTS";

}
