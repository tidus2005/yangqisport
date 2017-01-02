/**
 * Project: genesample
 * 
 * File Created at 2017Äê1ÔÂ2ÈÕ
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
package cn.tidux.xjbcoding.genesample1;

/**
 * TODO Comment of Utils
 * 
 * @author Administrator
 */
public class Utils {
    public static String toBinaryString(int v) {
        return Integer.toBinaryString(64 + v).substring(1);
    }
}
