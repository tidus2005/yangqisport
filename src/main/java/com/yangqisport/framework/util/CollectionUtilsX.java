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
package com.yangqisport.framework.util;

import java.util.List;

/**
 * CollectionUtilsX
 * 
 * @author Administrator
 */
public class CollectionUtilsX {

    public static final <T> T unique(List<T> sources) {
        if (sources == null || sources.isEmpty())
            return null;
        if (sources.size() > 1)
            throw new IllegalArgumentException("sources more than ONE.");
        return sources.get(0);
    }

}
