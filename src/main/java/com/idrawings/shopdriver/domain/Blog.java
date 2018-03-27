package com.idrawings.shopdriver.domain;

import java.sql.Timestamp;

/**
 * Created by Sergej on 18.10.2017.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "blog")
public class Blog {
    private Integer id;
    private String name;
    private String url;
    private String metaTitle;
    private String metaKeywords;
    private String metaDescription;
    private String annotation;
    private String description;
    private Byte visible;
    private Timestamp date;
    private String image;
    private Timestamp lastModify;
    private String typePost;

    @javax.persistence.Id
    @javax.persistence.Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "name", nullable = false, length = 512)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @javax.persistence.Column(name = "meta_title", nullable = false, length = 512)
    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
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
    @javax.persistence.Column(name = "meta_description", nullable = false, length = 512)
    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "annotation", nullable = false, length = -1)
    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
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
    @javax.persistence.Column(name = "visible", nullable = false)
    public Byte getVisible() {
        return visible;
    }

    public void setVisible(Byte visible) {
        this.visible = visible;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "date", nullable = false)
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "image", nullable = false, length = 255)
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "last_modify", nullable = false)
    public Timestamp getLastModify() {
        return lastModify;
    }

    public void setLastModify(Timestamp lastModify) {
        this.lastModify = lastModify;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "type_post", nullable = false)
    public String getTypePost() {
        return typePost;
    }

    public void setTypePost(String typePost) {
        this.typePost = typePost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Blog blog = (Blog) o;

        if (id != null ? !id.equals(blog.id) : blog.id != null) return false;
        if (name != null ? !name.equals(blog.name) : blog.name != null) return false;
        if (url != null ? !url.equals(blog.url) : blog.url != null) return false;
        if (metaTitle != null ? !metaTitle.equals(blog.metaTitle) : blog.metaTitle != null) return false;
        if (metaKeywords != null ? !metaKeywords.equals(blog.metaKeywords) : blog.metaKeywords != null)
            return false;
        if (metaDescription != null ? !metaDescription.equals(blog.metaDescription) : blog.metaDescription != null)
            return false;
        if (annotation != null ? !annotation.equals(blog.annotation) : blog.annotation != null) return false;
        if (description != null ? !description.equals(blog.description) : blog.description != null) return false;
        if (visible != null ? !visible.equals(blog.visible) : blog.visible != null) return false;
        if (date != null ? !date.equals(blog.date) : blog.date != null) return false;
        if (image != null ? !image.equals(blog.image) : blog.image != null) return false;
        if (lastModify != null ? !lastModify.equals(blog.lastModify) : blog.lastModify != null) return false;
        if (typePost != null ? !typePost.equals(blog.typePost) : blog.typePost != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (metaTitle != null ? metaTitle.hashCode() : 0);
        result = 31 * result + (metaKeywords != null ? metaKeywords.hashCode() : 0);
        result = 31 * result + (metaDescription != null ? metaDescription.hashCode() : 0);
        result = 31 * result + (annotation != null ? annotation.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (visible != null ? visible.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (lastModify != null ? lastModify.hashCode() : 0);
        result = 31 * result + (typePost != null ? typePost.hashCode() : 0);
        return result;
    }
}
