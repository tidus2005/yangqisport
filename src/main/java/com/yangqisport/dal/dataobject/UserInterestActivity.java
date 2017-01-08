package com.yangqisport.dal.dataobject;

import com.yangqisport.framework.dal.BaseDataObject;
import java.util.Date;

public class UserInterestActivity extends BaseDataObject {
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

    /**爱好项：@ACTIVITY_TYPE |ACTIVITY_TYPE **/
    private String activityType;

    /**级别：@ACTIVITY_TYPE_LEVEL 0,-入门级，1-熟练级，2-大师级 |LEVEL **/
    private String level;

    /**用户Id |USER_ID **/
    private Long userId;

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

    /**爱好项：@ACTIVITY_TYPE |ACTIVITY_TYPE **/
    public String getActivityType() {
        return activityType;
    }

    /**爱好项：@ACTIVITY_TYPE |ACTIVITY_TYPE **/
    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    /**级别：@ACTIVITY_TYPE_LEVEL 0,-入门级，1-熟练级，2-大师级 |LEVEL **/
    public String getLevel() {
        return level;
    }

    /**级别：@ACTIVITY_TYPE_LEVEL 0,-入门级，1-熟练级，2-大师级 |LEVEL **/
    public void setLevel(String level) {
        this.level = level;
    }

    /**用户Id |USER_ID **/
    public Long getUserId() {
        return userId;
    }

    /**用户Id |USER_ID **/
    public void setUserId(Long userId) {
        this.userId = userId;
    }
}