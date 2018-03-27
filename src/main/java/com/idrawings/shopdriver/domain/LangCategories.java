package com.idrawings.shopdriver.domain;

import javax.persistence.Id;

/**
 * Created by Sergej on 18.10.2017.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "lang_categories")
public class LangCategories {
    private Integer langId = 1;
    private Integer categoryId;
    private String name;
    private String nameH1;
    private String metaTitle;
    private String metaKeywords;
    private String metaDescription;
    private String annotation;
    private String description;
    private String autoMetaTitle;
    private String autoMetaKeywords;
    private String autoMetaDesc;
    private String autoDescription;

    @Id
    @javax.persistence.Basic
    @javax.persistence.Column(name = "lang_id", nullable = false)
    public Integer getLangId() {
        return langId;
    }

    public void setLangId(Integer langId) {
        this.langId = langId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "category_id", nullable = false)
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
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
    @javax.persistence.Column(name = "name_h1", nullable = false, length = 255)
    public String getNameH1() {
        return nameH1;
    }

    public void setNameH1(String nameH1) {
        this.nameH1 = nameH1;
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
    @javax.persistence.Column(name = "auto_meta_title", nullable = false, length = 512)
    public String getAutoMetaTitle() {
        return autoMetaTitle;
    }

    public void setAutoMetaTitle(String autoMetaTitle) {
        this.autoMetaTitle = autoMetaTitle;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "auto_meta_keywords", nullable = false, length = 512)
    public String getAutoMetaKeywords() {
        return autoMetaKeywords;
    }

    public void setAutoMetaKeywords(String autoMetaKeywords) {
        this.autoMetaKeywords = autoMetaKeywords;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "auto_meta_desc", nullable = false, length = 512)
    public String getAutoMetaDesc() {
        return autoMetaDesc;
    }

    public void setAutoMetaDesc(String autoMetaDesc) {
        this.autoMetaDesc = autoMetaDesc;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "auto_description", nullable = false, length = -1)
    public String getAutoDescription() {
        return autoDescription;
    }

    public void setAutoDescription(String autoDescription) {
        this.autoDescription = autoDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LangCategories that = (LangCategories) o;

        if (langId != null ? !langId.equals(that.langId) : that.langId != null) return false;
        if (categoryId != null ? !categoryId.equals(that.categoryId) : that.categoryId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (nameH1 != null ? !nameH1.equals(that.nameH1) : that.nameH1 != null) return false;
        if (metaTitle != null ? !metaTitle.equals(that.metaTitle) : that.metaTitle != null) return false;
        if (metaKeywords != null ? !metaKeywords.equals(that.metaKeywords) : that.metaKeywords != null) return false;
        if (metaDescription != null ? !metaDescription.equals(that.metaDescription) : that.metaDescription != null)
            return false;
        if (annotation != null ? !annotation.equals(that.annotation) : that.annotation != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (autoMetaTitle != null ? !autoMetaTitle.equals(that.autoMetaTitle) : that.autoMetaTitle != null)
            return false;
        if (autoMetaKeywords != null ? !autoMetaKeywords.equals(that.autoMetaKeywords) : that.autoMetaKeywords != null)
            return false;
        if (autoMetaDesc != null ? !autoMetaDesc.equals(that.autoMetaDesc) : that.autoMetaDesc != null) return false;
        if (autoDescription != null ? !autoDescription.equals(that.autoDescription) : that.autoDescription != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = langId != null ? langId.hashCode() : 0;
        result = 31 * result + (categoryId != null ? categoryId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (nameH1 != null ? nameH1.hashCode() : 0);
        result = 31 * result + (metaTitle != null ? metaTitle.hashCode() : 0);
        result = 31 * result + (metaKeywords != null ? metaKeywords.hashCode() : 0);
        result = 31 * result + (metaDescription != null ? metaDescription.hashCode() : 0);
        result = 31 * result + (annotation != null ? annotation.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (autoMetaTitle != null ? autoMetaTitle.hashCode() : 0);
        result = 31 * result + (autoMetaKeywords != null ? autoMetaKeywords.hashCode() : 0);
        result = 31 * result + (autoMetaDesc != null ? autoMetaDesc.hashCode() : 0);
        result = 31 * result + (autoDescription != null ? autoDescription.hashCode() : 0);
        return result;
    }
}
