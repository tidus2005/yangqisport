/**
 * Project: yangqisport
 * 
 * File Created at 2015年5月8日
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

import com.yangqisport.framework.exception.TiduxException;

/**
 * TODO Comment of AuthException
 * 
 * @author Administrator
 */
public class AuthException extends TiduxException {

    public static final String VALIDATE_TOKEN_FAIL = "VALIDATE_TOKEN_FAIL";

    public AuthException(String errorCode) {
        super(errorCode);
    }

    private static final long serialVersionUID = 8966657069902447674L;

}
