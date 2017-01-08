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
package com.yangqisport.framework.web;

import javax.servlet.http.HttpServletRequest;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.yangqisport.framework.exception.ErrorCode;
import com.yangqisport.framework.exception.TiduxException;
import com.yangqisport.framework.service.BusinessException;
import com.yangqisport.framework.web.vo.ResultVO;

/**
 * GeneralResultHandler
 * 
 * @author Administrator
 */
@Component("generalResultInterceptor")
public class GeneralResultInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {

        ResultVO resultVO = new ResultVO();
        Object rval = invocation.proceed();
        if (rval instanceof ResultVO) {
            return rval;
        }
        resultVO.setResult(rval);
        return resultVO;

    }

}
