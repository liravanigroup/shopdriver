package com.idrawings.shopdriver.domain;

import javax.persistence.Id;

/**
 * Created by Sergej on 18.10.2017.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "lang_pages")
public class LangPages {
    private Integer langId = 1;
    private Integer pageId;
    private String name;
    private String metaTitle;
    private String metaDescription;
    private String metaKeywords;
    private String description;

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
    @javax.persistence.Column(name = "page_id", nullable = false)
    public Integer getPageId() {
        return pageId;
    }

    public void setPageId(Integer pageId) {
        this.pageId = pageId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LangPages that = (LangPages) o;

        if (langId != null ? !langId.equals(that.langId) : that.langId != null) return false;
        if (pageId != null ? !pageId.equals(that.pageId) : that.pageId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (metaTitle != null ? !metaTitle.equals(that.metaTitle) : that.metaTitle != null) return false;
        if (metaDescription != null ? !metaDescription.equals(that.metaDescription) : that.metaDescription != null)
            return false;
        if (metaKeywords != null ? !metaKeywords.equals(that.metaKeywords) : that.metaKeywords != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = langId != null ? langId.hashCode() : 0;
        result = 31 * result + (pageId != null ? pageId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (metaTitle != null ? metaTitle.hashCode() : 0);
        result = 31 * result + (metaDescription != null ? metaDescription.hashCode() : 0);
        result = 31 * result + (metaKeywords != null ? metaKeywords.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
