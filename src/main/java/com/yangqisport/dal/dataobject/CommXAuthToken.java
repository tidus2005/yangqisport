package com.yangqisport.dal.dataobject;

import com.yangqisport.framework.dal.BaseDataObject;
import java.util.Date;

public class CommXAuthToken extends BaseDataObject {
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

    /**用户ID |USER_ID **/
    private String userId;

    /**TOKEN串 |TOKEN **/
    private String token;

    /**过期时点 |EXPIRE_IN **/
    private Long expireIn;

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

    /**用户ID |USER_ID **/
    public String getUserId() {
        return userId;
    }

    /**用户ID |USER_ID **/
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**TOKEN串 |TOKEN **/
    public String getToken() {
        return token;
    }

    /**TOKEN串 |TOKEN **/
    public void setToken(String token) {
        this.token = token;
    }

    /**过期时点 |EXPIRE_IN **/
    public Long getExpireIn() {
        return expireIn;
    }

    /**过期时点 |EXPIRE_IN **/
    public void setExpireIn(Long expireIn) {
        this.expireIn = expireIn;
    }
}