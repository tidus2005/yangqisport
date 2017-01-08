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
package com.yangqisport.service.enums;

/**
 * TODO Comment of ActivityType
 * 
 * @author Administrator
 */
public enum ActivityType {

    SWIMMING("SWIMMING"),
    RUNNING("RUNNING"),
    FOOTBALL("FOOTBALL");

    private String code;

    private ActivityType(String code) {
        this.code = code;
    }

    public String code() {
        return code;
    }

}
