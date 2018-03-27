package com.idrawings.shopdriver.domain;

import java.sql.Timestamp;

/**
 * Created by Sergej on 18.10.2017.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "support_info")
public class SupportInfo {
    private Byte id;
    private String tempKey;
    private Timestamp tempTime;
    private Integer newMessages;
    private Integer balance;
    private String privateKey;
    private String publicKey;
    private String okayPublicKey;
    private Byte isAuto;

    @javax.persistence.Id
    @javax.persistence.Column(name = "id", nullable = false)
    public Byte getId() {
        return id;
    }

    public void setId(Byte id) {
        this.id = id;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "temp_key", nullable = true, length = 32)
    public String getTempKey() {
        return tempKey;
    }

    public void setTempKey(String tempKey) {
        this.tempKey = tempKey;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "temp_time", nullable = true)
    public Timestamp getTempTime() {
        return tempTime;
    }

    public void setTempTime(Timestamp tempTime) {
        this.tempTime = tempTime;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "new_messages", nullable = false)
    public Integer getNewMessages() {
        return newMessages;
    }

    public void setNewMessages(Integer newMessages) {
        this.newMessages = newMessages;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "balance", nullable = false)
    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "private_key", nullable = true, length = 2048)
    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "public_key", nullable = true, length = 2048)
    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "okay_public_key", nullable = true, length = 2048)
    public String getOkayPublicKey() {
        return okayPublicKey;
    }

    public void setOkayPublicKey(String okayPublicKey) {
        this.okayPublicKey = okayPublicKey;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "is_auto", nullable = false)
    public Byte getIsAuto() {
        return isAuto;
    }

    public void setIsAuto(Byte isAuto) {
        this.isAuto = isAuto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SupportInfo that = (SupportInfo) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (tempKey != null ? !tempKey.equals(that.tempKey) : that.tempKey != null) return false;
        if (tempTime != null ? !tempTime.equals(that.tempTime) : that.tempTime != null) return false;
        if (newMessages != null ? !newMessages.equals(that.newMessages) : that.newMessages != null) return false;
        if (balance != null ? !balance.equals(that.balance) : that.balance != null) return false;
        if (privateKey != null ? !privateKey.equals(that.privateKey) : that.privateKey != null) return false;
        if (publicKey != null ? !publicKey.equals(that.publicKey) : that.publicKey != null) return false;
        if (okayPublicKey != null ? !okayPublicKey.equals(that.okayPublicKey) : that.okayPublicKey != null)
            return false;
        if (isAuto != null ? !isAuto.equals(that.isAuto) : that.isAuto != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (tempKey != null ? tempKey.hashCode() : 0);
        result = 31 * result + (tempTime != null ? tempTime.hashCode() : 0);
        result = 31 * result + (newMessages != null ? newMessages.hashCode() : 0);
        result = 31 * result + (balance != null ? balance.hashCode() : 0);
        result = 31 * result + (privateKey != null ? privateKey.hashCode() : 0);
        result = 31 * result + (publicKey != null ? publicKey.hashCode() : 0);
        result = 31 * result + (okayPublicKey != null ? okayPublicKey.hashCode() : 0);
        result = 31 * result + (isAuto != null ? isAuto.hashCode() : 0);
        return result;
    }
}
