package com.idrawings.shopdriver.domain;

import java.sql.Date;

/**
 * Created by Sergej on 18.10.2017.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "managers")
public class Manager {
    private Integer id;
    private String lang;
    private String login;
    private String password;
    private String permissions;
    private Byte cntTry;
    private Date lastTry;
    private String comment;
    private Byte menuStatus;

    @javax.persistence.Id
    @javax.persistence.Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "lang", nullable = false, length = 2)
    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "login", nullable = false, length = 255)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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
    @javax.persistence.Column(name = "permissions", nullable = true, length = 1024)
    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "cnt_try", nullable = false)
    public Byte getCntTry() {
        return cntTry;
    }

    public void setCntTry(Byte cntTry) {
        this.cntTry = cntTry;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "last_try", nullable = true)
    public Date getLastTry() {
        return lastTry;
    }

    public void setLastTry(Date lastTry) {
        this.lastTry = lastTry;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "comment", nullable = true, length = 512)
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "menu_status", nullable = false)
    public Byte getMenuStatus() {
        return menuStatus;
    }

    public void setMenuStatus(Byte menuStatus) {
        this.menuStatus = menuStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Manager that = (Manager) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (lang != null ? !lang.equals(that.lang) : that.lang != null) return false;
        if (login != null ? !login.equals(that.login) : that.login != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (permissions != null ? !permissions.equals(that.permissions) : that.permissions != null) return false;
        if (cntTry != null ? !cntTry.equals(that.cntTry) : that.cntTry != null) return false;
        if (lastTry != null ? !lastTry.equals(that.lastTry) : that.lastTry != null) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        if (menuStatus != null ? !menuStatus.equals(that.menuStatus) : that.menuStatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (lang != null ? lang.hashCode() : 0);
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (permissions != null ? permissions.hashCode() : 0);
        result = 31 * result + (cntTry != null ? cntTry.hashCode() : 0);
        result = 31 * result + (lastTry != null ? lastTry.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (menuStatus != null ? menuStatus.hashCode() : 0);
        return result;
    }
}
