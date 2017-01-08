package com.yangqisport.dal.dataobject;

import com.yangqisport.framework.dal.BaseDataObject;
import java.util.Date;

public class Activity extends BaseDataObject {
    /**ID |ID **/
    private Long id;

    /**修改时间 |GMT_MODIFIY **/
    private Date gmtModifiy;

    /**创建时间 |GMT_CREATE **/
    private Date gmtCreate;

    /**数据修改者，默认SYS表示系统创建 |MODIFIER **/
    private String modifier;

    /**数据创建者，默认SYS表示系统创建 |CREATOR **/
    private String creator;

    /**逻辑删除标识：Y删除，N未删除 |IS_DELETED **/
    private String isDeleted;

    /**类型:@ACTIVITY_TYPE |TYPE **/
    private String type;

    /**活动开始时间 |GMT_BEGIN **/
    private Date gmtBegin;

    /**活动位置 |LOCATION **/
    private String location;

    /**加入用户统计 |JOIN_USER_COUNT **/
    private Integer joinUserCount;

    /**活动最大人数 |MAX_JOIN_NUM **/
    private Integer maxJoinNum;

    /**费用类型：@ACTIVITY_COST_TYPE AA:AA, FREE:免费 |COST_TYPE **/
    private String costType;

    /**活动标题 |TITLE **/
    private String title;

    /**活动介绍 |INTRODUCTION **/
    private String introduction;

    /**封面图片，json格式 |COVER_IMAGES **/
    private String coverImages;

    /**活动发布者ID |PUBLISHER_USER_ID **/
    private Long publisherUserId;

    /**ID |ID **/
    public Long getId() {
        return id;
    }

    /**ID |ID **/
    public void setId(Long id) {
        this.id = id;
    }

    /**修改时间 |GMT_MODIFIY **/
    public Date getGmtModifiy() {
        return gmtModifiy;
    }

    /**修改时间 |GMT_MODIFIY **/
    public void setGmtModifiy(Date gmtModifiy) {
        this.gmtModifiy = gmtModifiy;
    }

    /**创建时间 |GMT_CREATE **/
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**创建时间 |GMT_CREATE **/
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**数据修改者，默认SYS表示系统创建 |MODIFIER **/
    public String getModifier() {
        return modifier;
    }

    /**数据修改者，默认SYS表示系统创建 |MODIFIER **/
    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    /**数据创建者，默认SYS表示系统创建 |CREATOR **/
    public String getCreator() {
        return creator;
    }

    /**数据创建者，默认SYS表示系统创建 |CREATOR **/
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**逻辑删除标识：Y删除，N未删除 |IS_DELETED **/
    public String getIsDeleted() {
        return isDeleted;
    }

    /**逻辑删除标识：Y删除，N未删除 |IS_DELETED **/
    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**类型:@ACTIVITY_TYPE |TYPE **/
    public String getType() {
        return type;
    }

    /**类型:@ACTIVITY_TYPE |TYPE **/
    public void setType(String type) {
        this.type = type;
    }

    /**活动开始时间 |GMT_BEGIN **/
    public Date getGmtBegin() {
        return gmtBegin;
    }

    /**活动开始时间 |GMT_BEGIN **/
    public void setGmtBegin(Date gmtBegin) {
        this.gmtBegin = gmtBegin;
    }

    /**活动位置 |LOCATION **/
    public String getLocation() {
        return location;
    }

    /**活动位置 |LOCATION **/
    public void setLocation(String location) {
        this.location = location;
    }

    /**加入用户统计 |JOIN_USER_COUNT **/
    public Integer getJoinUserCount() {
        return joinUserCount;
    }

    /**加入用户统计 |JOIN_USER_COUNT **/
    public void setJoinUserCount(Integer joinUserCount) {
        this.joinUserCount = joinUserCount;
    }

    /**活动最大人数 |MAX_JOIN_NUM **/
    public Integer getMaxJoinNum() {
        return maxJoinNum;
    }

    /**活动最大人数 |MAX_JOIN_NUM **/
    public void setMaxJoinNum(Integer maxJoinNum) {
        this.maxJoinNum = maxJoinNum;
    }

    /**费用类型：@ACTIVITY_COST_TYPE AA:AA, FREE:免费 |COST_TYPE **/
    public String getCostType() {
        return costType;
    }

    /**费用类型：@ACTIVITY_COST_TYPE AA:AA, FREE:免费 |COST_TYPE **/
    public void setCostType(String costType) {
        this.costType = costType;
    }

    /**活动标题 |TITLE **/
    public String getTitle() {
        return title;
    }

    /**活动标题 |TITLE **/
    public void setTitle(String title) {
        this.title = title;
    }

    /**活动介绍 |INTRODUCTION **/
    public String getIntroduction() {
        return introduction;
    }

    /**活动介绍 |INTRODUCTION **/
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    /**封面图片，json格式 |COVER_IMAGES **/
    public String getCoverImages() {
        return coverImages;
    }

    /**封面图片，json格式 |COVER_IMAGES **/
    public void setCoverImages(String coverImages) {
        this.coverImages = coverImages;
    }

    /**活动发布者ID |PUBLISHER_USER_ID **/
    public Long getPublisherUserId() {
        return publisherUserId;
    }

    /**活动发布者ID |PUBLISHER_USER_ID **/
    public void setPublisherUserId(Long publisherUserId) {
        this.publisherUserId = publisherUserId;
    }
}