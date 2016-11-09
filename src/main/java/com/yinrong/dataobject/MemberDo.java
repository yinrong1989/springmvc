package com.yinrong.dataobject;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by yinrong on 2016/11/9.
 */
public class MemberDo {
    private String memberId;

    /**
     * This property corresponds to db column <tt>MEMBER_NAME</tt>.
     */
    private String memberName;

    /**
     * This property corresponds to db column <tt>MEMBER_SHORT_NAME</tt>.
     */
    private String memberShortName;

    /**
     * This property corresponds to db column <tt>MEMBER_TYPE</tt>.
     */
    private long memberType;

    /**
     * This property corresponds to db column <tt>STATUS</tt>.
     */
    private long status;

    /**
     * This property corresponds to db column <tt>LOCK_STATUS</tt>.
     */
    private long lockStatus;

    /**
     * This property corresponds to db column <tt>FROM_IP</tt>.
     */
    private String fromIp;

    /**
     * This property corresponds to db column <tt>ACTIVE_TIME</tt>.
     */
    private Date activeTime;

    /**
     * This property corresponds to db column <tt>CREATE_TIME</tt>.
     */
    private Date createTime;

    /**
     * This property corresponds to db column <tt>UPDATE_TIME</tt>.
     */
    private Date updateTime;

    /**
     * This property corresponds to db column <tt>CREATE_USER</tt>.
     */
    private String createUser;

    /**
     * This property corresponds to db column <tt>UPDATE_USER</tt>.
     */
    private String updateUser;

    /**
     * This property corresponds to db column <tt>MEMO</tt>.
     */
    private String memo;

    /**
     * This property corresponds to db column <tt>SECURITY_LEVEL</tt>.
     */
    private String securityLevel;

    private BigDecimal tradeLimit;
    //========== getters and setters ==========

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberShortName() {
        return memberShortName;
    }

    public void setMemberShortName(String memberShortName) {
        this.memberShortName = memberShortName;
    }

    public long getMemberType() {
        return memberType;
    }

    public void setMemberType(long memberType) {
        this.memberType = memberType;
    }

    public long getStatus() {
        return status;
    }

    public void setStatus(long status) {
        this.status = status;
    }

    public long getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(long lockStatus) {
        this.lockStatus = lockStatus;
    }

    public String getFromIp() {
        return fromIp;
    }

    public void setFromIp(String fromIp) {
        this.fromIp = fromIp;
    }

    public Date getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(Date activeTime) {
        this.activeTime = activeTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
    }

    public BigDecimal getTradeLimit() {
        return tradeLimit;
    }

    public void setTradeLimit(BigDecimal tradeLimit) {
        this.tradeLimit = tradeLimit;
    }
}
