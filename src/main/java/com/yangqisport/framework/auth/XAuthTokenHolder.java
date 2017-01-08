/**
 * Project: yangqisport
 * 
 * File Created at 2015年5月11日
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
 * XAuthTokenHolder
 * 
 * @author Administrator
 */
public class XAuthTokenHolder {

    private static ThreadLocal<XAuthToken> TOKEN_LOCAL = new ThreadLocal<XAuthToken>();

    public static void set(XAuthToken xAuthToken) {
        TOKEN_LOCAL.set(xAuthToken);
    }

    public static XAuthToken get() {
        return TOKEN_LOCAL.get();
    }

    public static void remove() {
        TOKEN_LOCAL.remove();
    }
}
