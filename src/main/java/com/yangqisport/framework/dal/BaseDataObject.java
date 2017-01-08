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
package com.yangqisport.framework.dal;

import java.util.Date;

/**
 * BaseDataObject
 * 
 * @author Administrator
 */
public class BaseDataObject {

    /** ID |ID **/
    protected Long   id;

    /** 修改时间 |GMT_MODIFIY **/
    protected Date   gmtModifiy;

    /** 创建时间 |GMT_CREATE **/
    protected Date   gmtCreate;

    /** 数据修改者，默认SYS表示系统创建 |MODIFIER **/
    protected String modifier;

    /** 数据创建者，默认SYS表示系统创建 |CREATOR **/
    protected String creator;

    /** 逻辑删除标识：Y删除，N未删除 |IS_DELETED **/
    protected String isDeleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getGmtModifiy() {
        return gmtModifiy;
    }

    public void setGmtModifiy(Date gmtModifiy) {
        this.gmtModifiy = gmtModifiy;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

}
