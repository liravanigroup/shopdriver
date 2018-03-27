package com.idrawings.shopdriver.domain;

import java.sql.Timestamp;

/**
 * Created by Sergej on 18.10.2017.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "pages")
public class Page {
    private Integer id;
    private String url;
    private String name;
    private String metaTitle;
    private String metaDescription;
    private String metaKeywords;
    private String description;
    private Integer menuId;
    private Integer position;
    private Byte visible;
    private Timestamp lastModify;

    @javax.persistence.Id
    @javax.persistence.Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "url", nullable = false, length = 255)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
    @javax.persistence.Column(name = "meta_title", nullable = false, length = 512)
    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "meta_description", nullable = false, length = 512)
    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "meta_keywords", nullable = false, length = 512)
    public String getMetaKeywords() {
        return metaKeywords;
    }

    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "description", nullable = false, length = -1)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "menu_id", nullable = false)
    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "position", nullable = false)
    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "visible", nullable = false)
    public Byte getVisible() {
        return visible;
    }

    public void setVisible(Byte visible) {
        this.visible = visible;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "last_modify", nullable = false)
    public Timestamp getLastModify() {
        return lastModify;
    }

    public void setLastModify(Timestamp lastModify) {
        this.lastModify = lastModify;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Page page = (Page) o;

        if (id != null ? !id.equals(page.id) : page.id != null) return false;
        if (url != null ? !url.equals(page.url) : page.url != null) return false;
        if (name != null ? !name.equals(page.name) : page.name != null) return false;
        if (metaTitle != null ? !metaTitle.equals(page.metaTitle) : page.metaTitle != null) return false;
        if (metaDescription != null ? !metaDescription.equals(page.metaDescription) : page.metaDescription != null)
            return false;
        if (metaKeywords != null ? !metaKeywords.equals(page.metaKeywords) : page.metaKeywords != null)
            return false;
        if (description != null ? !description.equals(page.description) : page.description != null) return false;
        if (menuId != null ? !menuId.equals(page.menuId) : page.menuId != null) return false;
        if (position != null ? !position.equals(page.position) : page.position != null) return false;
        if (visible != null ? !visible.equals(page.visible) : page.visible != null) return false;
        if (lastModify != null ? !lastModify.equals(page.lastModify) : page.lastModify != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (metaTitle != null ? metaTitle.hashCode() : 0);
        result = 31 * result + (metaDescription != null ? metaDescription.hashCode() : 0);
        result = 31 * result + (metaKeywords != null ? metaKeywords.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (menuId != null ? menuId.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (visible != null ? visible.hashCode() : 0);
        result = 31 * result + (lastModify != null ? lastModify.hashCode() : 0);
        return result;
    }
}
