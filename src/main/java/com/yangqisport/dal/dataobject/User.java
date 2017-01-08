package com.yangqisport.dal.dataobject;

import com.yangqisport.framework.dal.BaseDataObject;
import java.util.Date;

public class User extends BaseDataObject {
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

    /**登陆名 |LOGIN_ID **/
    private String loginId;

    /**昵称 |NICKNAME **/
    private String nickname;

    /**密码 |PASSWORD **/
    private String password;

    /**性别 |SEX **/
    private String sex;

    /**头像 |AVATAR **/
    private String avatar;

    /**行业 |INDUSTRY **/
    private String industry;

    /**地区 |REGION **/
    private String region;

    /**签名备注 |MEMO **/
    private String memo;

    /**生日 |BIRTHDAY **/
    private Date birthday;

    /**微信Id |BIND_ACCT_WX **/
    private String bindAcctWx;

    /**微博用户ID |BIND_ACCT_WEIBO **/
    private String bindAcctWeibo;

    /**QQId |BIND_ACCT_QQ **/
    private String bindAcctQq;

    /**身高 |TALL **/
    private Long tall;

    /**体重 |WEIGHT **/
    private Long weight;

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

    /**登陆名 |LOGIN_ID **/
    public String getLoginId() {
        return loginId;
    }

    /**登陆名 |LOGIN_ID **/
    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    /**昵称 |NICKNAME **/
    public String getNickname() {
        return nickname;
    }

    /**昵称 |NICKNAME **/
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**密码 |PASSWORD **/
    public String getPassword() {
        return password;
    }

    /**密码 |PASSWORD **/
    public void setPassword(String password) {
        this.password = password;
    }

    /**性别 |SEX **/
    public String getSex() {
        return sex;
    }

    /**性别 |SEX **/
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**头像 |AVATAR **/
    public String getAvatar() {
        return avatar;
    }

    /**头像 |AVATAR **/
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**行业 |INDUSTRY **/
    public String getIndustry() {
        return industry;
    }

    /**行业 |INDUSTRY **/
    public void setIndustry(String industry) {
        this.industry = industry;
    }

    /**地区 |REGION **/
    public String getRegion() {
        return region;
    }

    /**地区 |REGION **/
    public void setRegion(String region) {
        this.region = region;
    }

    /**签名备注 |MEMO **/
    public String getMemo() {
        return memo;
    }

    /**签名备注 |MEMO **/
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**生日 |BIRTHDAY **/
    public Date getBirthday() {
        return birthday;
    }

    /**生日 |BIRTHDAY **/
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**微信Id |BIND_ACCT_WX **/
    public String getBindAcctWx() {
        return bindAcctWx;
    }

    /**微信Id |BIND_ACCT_WX **/
    public void setBindAcctWx(String bindAcctWx) {
        this.bindAcctWx = bindAcctWx;
    }

    /**微博用户ID |BIND_ACCT_WEIBO **/
    public String getBindAcctWeibo() {
        return bindAcctWeibo;
    }

    /**微博用户ID |BIND_ACCT_WEIBO **/
    public void setBindAcctWeibo(String bindAcctWeibo) {
        this.bindAcctWeibo = bindAcctWeibo;
    }

    /**QQId |BIND_ACCT_QQ **/
    public String getBindAcctQq() {
        return bindAcctQq;
    }

    /**QQId |BIND_ACCT_QQ **/
    public void setBindAcctQq(String bindAcctQq) {
        this.bindAcctQq = bindAcctQq;
    }

    /**身高 |TALL **/
    public Long getTall() {
        return tall;
    }

    /**身高 |TALL **/
    public void setTall(Long tall) {
        this.tall = tall;
    }

    /**体重 |WEIGHT **/
    public Long getWeight() {
        return weight;
    }

    /**体重 |WEIGHT **/
    public void setWeight(Long weight) {
        this.weight = weight;
    }
}