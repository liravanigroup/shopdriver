package com.idrawings.shopdriver.domain;

import java.sql.Timestamp;

/**
 * Created by Sergej on 18.10.2017.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "users")
public class User {
    private Integer id;
    private String email;
    private String password;
    private String name;
    private String phone;
    private String address;
    private Integer groupId;
    private String lastIp;
    private Timestamp created;
    private String remindCode;
    private Timestamp remindExpire;

    @javax.persistence.Id
    @javax.persistence.Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "email", nullable = false, length = 255)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "password", nullable = false, length = 255)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "name", nullable = false, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "phone", nullable = false, length = 32)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "address", nullable = false, length = 255)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "group_id", nullable = false)
    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "last_ip", nullable = true, length = 20)
    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "created", nullable = true)
    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "remind_code", nullable = true, length = 32)
    public String getRemindCode() {
        return remindCode;
    }

    public void setRemindCode(String remindCode) {
        this.remindCode = remindCode;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "remind_expire", nullable = true)
    public Timestamp getRemindExpire() {
        return remindExpire;
    }

    public void setRemindExpire(Timestamp remindExpire) {
        this.remindExpire = remindExpire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != null ? !id.equals(user.id) : user.id != null) return false;
        if (email != null ? !email.equals(user.email) : user.email != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (phone != null ? !phone.equals(user.phone) : user.phone != null) return false;
        if (address != null ? !address.equals(user.address) : user.address != null) return false;
        if (groupId != null ? !groupId.equals(user.groupId) : user.groupId != null) return false;
        if (lastIp != null ? !lastIp.equals(user.lastIp) : user.lastIp != null) return false;
        if (created != null ? !created.equals(user.created) : user.created != null) return false;
        if (remindCode != null ? !remindCode.equals(user.remindCode) : user.remindCode != null) return false;
        if (remindExpire != null ? !remindExpire.equals(user.remindExpire) : user.remindExpire != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (groupId != null ? groupId.hashCode() : 0);
        result = 31 * result + (lastIp != null ? lastIp.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (remindCode != null ? remindCode.hashCode() : 0);
        result = 31 * result + (remindExpire != null ? remindExpire.hashCode() : 0);
        return result;
    }
}
