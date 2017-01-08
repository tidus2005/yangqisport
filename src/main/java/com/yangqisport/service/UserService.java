/**
 * Project: yangqisport
 * 
 * File Created at 2015年5月5日
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

import java.util.List;

import com.yangqisport.service.domain.ActivityItemDO;
import com.yangqisport.service.domain.UserDO;

/**
 * UserService
 * 
 * @author Administrator
 */
public interface UserService {

    public UserDO register(String loginId, String password, String repassword);

    /**
     * 用户登录
     * 
     * @param loginId
     * @param password
     * @return
     */
    public UserDO login(String loginId, String password);

    /**
     * @param accessToken
     * @param platform 外部平台
     * @param autoRegister 是否自动注册
     * @return
     */
    public UserDO login(String accessToken, String platform, boolean autoRegister);

    public UserDO logout(String userId);

    public UserDO getUserByUserId(Long userId);

    /**
     * 设置用户感兴趣的活动
     * 
     * @param userId
     * @param interestActivityItems
     */
    public void settingUserInterestActivity(Long userId, List<ActivityItemDO> interestActivityItems);

}
