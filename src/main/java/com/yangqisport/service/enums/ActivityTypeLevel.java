/**
 * Project: yangqisport
 * 
 * File Created at 2015年5月10日
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
package com.yangqisport.service.enums;

/**
 * ActivityItemLevel
 * 
 * @author Administrator
 */
public enum ActivityTypeLevel {

    NEWER("0"),
    NOMARL("1"),
    MASTER("2");

    private String code;

    private ActivityTypeLevel(String code) {
        this.code = code;
    }

    public String code() {
        return code;
    }
    
}
