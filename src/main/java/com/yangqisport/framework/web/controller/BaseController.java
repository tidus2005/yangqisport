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
package com.yangqisport.framework.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.yangqisport.framework.auth.XAuthTokenHolder;
import com.yangqisport.framework.exception.ErrorCode;
import com.yangqisport.framework.exception.TiduxException;
import com.yangqisport.framework.service.BusinessException;
import com.yangqisport.framework.web.vo.ResultVO;

/**
 * BaseController
 * 
 * @author Administrator
 */
public class BaseController {

    public static final Logger LOGGER = LoggerFactory.getLogger(BaseController.class);

    public String getUserId() {
        if (XAuthTokenHolder.get() == null) {
            throw new BusinessException(ErrorCode.AUTH_FAIL_USER_UNLOGIN, "用户未登陆或授权");
        }
        return XAuthTokenHolder.get().getUserId();
    }

    @ExceptionHandler
    public ResultVO handleException(HttpServletRequest request, Exception ex) {
        ResultVO resultVO = new ResultVO();
        if (ex instanceof BusinessException) {
            resultVO.setCode(((BusinessException) ex).getErrorCode());
            resultVO.setMsg(((BusinessException) ex).getErrorMsg());
        } else if (ex instanceof TiduxException) {
            resultVO.setCode(((TiduxException) ex).getErrorCode());
            resultVO.setMsg(((TiduxException) ex).getErrorMsg());
        } else if (ex instanceof MissingServletRequestParameterException) {
            resultVO.setCode(ErrorCode.MISS_ARGS);
            resultVO.setMsg(ex.getMessage());
        } else {
            resultVO.setCode(ErrorCode.UNKNOWN_ERROR);
            resultVO.setMsg(ex.getMessage());
            ex.printStackTrace();
        }
        return resultVO;
    }
}
