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
package com.yangqisport.service.domain;

import com.yangqisport.service.enums.ActivityType;
import com.yangqisport.service.enums.ActivityTypeLevel;

/**
 * TODO Comment of ActivityItem
 * 
 * @author Administrator
 */
public class ActivityItemDO {

    private String name;

    private Long   age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    private ActivityType      type;

    private ActivityTypeLevel level;

    public ActivityType getType() {
        return type;
    }

    public void setType(ActivityType type) {
        this.type = type;
    }

    public ActivityTypeLevel getLevel() {
        return level;
    }

    public void setLevel(ActivityTypeLevel level) {
        this.level = level;
    }

}
