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
package com.yangqisport.framework.web.vo;

/**
 * ResultVO
 * 
 * @author Administrator
 */
public class ResultVO {

    protected String code      = "SUCCESS";

    protected String msg;

    protected Object result;

    protected long   timestamp = System.currentTimeMillis();

    public ResultVO(Object result) {
        this.result = result;
    }

    public ResultVO() {
        // TODO Auto-generated constructor stub
    }

    public ResultVO(String code, String msg, Object result) {
        super();
        this.code = code;
        this.msg = msg;
        this.result = result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

}
