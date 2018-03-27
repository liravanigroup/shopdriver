package com.idrawings.shopdriver.domain;


import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by Sergej on 18.10.2017.
 */
@Entity
@Table(name = "categories")
public class Category {

    private Integer id;

    @ManyToMany(mappedBy = "categories")
    private List<Product> products;


    private Integer parentId;
    private String name;
    private String nameH1;
    private String yandexName;
    private String metaTitle;
    private String metaKeywords;
    private String metaDescription;
    private String annotation;
    private String description;
    private String url;
    private String image;
    private Integer position;
    private Byte visible;
    private String externalId;
    private Byte levelDepth;
    private String autoMetaTitle;
    private String autoMetaKeywords;
    private String autoMetaDesc;
    private String autoDescription;
    private Timestamp lastModify;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "parent_id", nullable = false)
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "name_h1", nullable = false, length = 255)
    public String getNameH1() {
        return nameH1;
    }

    public void setNameH1(String nameH1) {
        this.nameH1 = nameH1;
    }

    @Basic
    @Column(name = "yandex_name", nullable = false, length = 255)
    public String getYandexName() {
        return yandexName;
    }

    public void setYandexName(String yandexName) {
        this.yandexName = yandexName;
    }

    @Basic
    @Column(name = "meta_title", nullable = false, length = 512)
    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }

    @Basic
    @Column(name = "meta_keywords", nullable = false, length = 512)
    public String getMetaKeywords() {
        return metaKeywords;
    }

    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    @Basic
    @Column(name = "meta_description", nullable = false, length = 512)
    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    @Basic
    @Column(name = "annotation", nullable = false, length = -1)
    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    @Basic
    @Column(name = "description", nullable = false, length = -1)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "url", nullable = false, length = 255)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "image", nullable = false, length = 255)
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Basic
    @Column(name = "position", nullable = false)
    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Basic
    @Column(name = "visible", nullable = false)
    public Byte getVisible() {
        return visible;
    }

    public void setVisible(Byte visible) {
        this.visible = visible;
    }

    @Basic
    @Column(name = "external_id", nullable = false, length = 36)
    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    @Basic
    @Column(name = "level_depth", nullable = false)
    public Byte getLevelDepth() {
        return levelDepth;
    }

    public void setLevelDepth(Byte levelDepth) {
        this.levelDepth = levelDepth;
    }

    @Basic
    @Column(name = "auto_meta_title", nullable = false, length = 512)
    public String getAutoMetaTitle() {
        return autoMetaTitle;
    }

    public void setAutoMetaTitle(String autoMetaTitle) {
        this.autoMetaTitle = autoMetaTitle;
    }

    @Basic
    @Column(name = "auto_meta_keywords", nullable = false, length = 512)
    public String getAutoMetaKeywords() {
        return autoMetaKeywords;
    }

    public void setAutoMetaKeywords(String autoMetaKeywords) {
        this.autoMetaKeywords = autoMetaKeywords;
    }

    @Basic
    @Column(name = "auto_meta_desc", nullable = false, length = 512)
    public String getAutoMetaDesc() {
        return autoMetaDesc;
    }

    public void setAutoMetaDesc(String autoMetaDesc) {
        this.autoMetaDesc = autoMetaDesc;
    }

    @Basic
    @Column(name = "auto_description", nullable = false, length = -1)
    public String getAutoDescription() {
        return autoDescription;
    }

    public void setAutoDescription(String autoDescription) {
        this.autoDescription = autoDescription;
    }

    @Basic
    @Column(name = "last_modify", nullable = false)
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

        Category that = (Category) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (parentId != null ? !parentId.equals(that.parentId) : that.parentId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (nameH1 != null ? !nameH1.equals(that.nameH1) : that.nameH1 != null) return false;
        if (yandexName != null ? !yandexName.equals(that.yandexName) : that.yandexName != null) return false;
        if (metaTitle != null ? !metaTitle.equals(that.metaTitle) : that.metaTitle != null) return false;
        if (metaKeywords != null ? !metaKeywords.equals(that.metaKeywords) : that.metaKeywords != null) return false;
        if (metaDescription != null ? !metaDescription.equals(that.metaDescription) : that.metaDescription != null)
            return false;
        if (annotation != null ? !annotation.equals(that.annotation) : that.annotation != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (image != null ? !image.equals(that.image) : that.image != null) return false;
        if (position != null ? !position.equals(that.position) : that.position != null) return false;
        if (visible != null ? !visible.equals(that.visible) : that.visible != null) return false;
        if (externalId != null ? !externalId.equals(that.externalId) : that.externalId != null) return false;
        if (levelDepth != null ? !levelDepth.equals(that.levelDepth) : that.levelDepth != null) return false;
        if (autoMetaTitle != null ? !autoMetaTitle.equals(that.autoMetaTitle) : that.autoMetaTitle != null)
            return false;
        if (autoMetaKeywords != null ? !autoMetaKeywords.equals(that.autoMetaKeywords) : that.autoMetaKeywords != null)
            return false;
        if (autoMetaDesc != null ? !autoMetaDesc.equals(that.autoMetaDesc) : that.autoMetaDesc != null) return false;
        if (autoDescription != null ? !autoDescription.equals(that.autoDescription) : that.autoDescription != null)
            return false;
        if (lastModify != null ? !lastModify.equals(that.lastModify) : that.lastModify != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (nameH1 != null ? nameH1.hashCode() : 0);
        result = 31 * result + (yandexName != null ? yandexName.hashCode() : 0);
        result = 31 * result + (metaTitle != null ? metaTitle.hashCode() : 0);
        result = 31 * result + (metaKeywords != null ? metaKeywords.hashCode() : 0);
        result = 31 * result + (metaDescription != null ? metaDescription.hashCode() : 0);
        result = 31 * result + (annotation != null ? annotation.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (visible != null ? visible.hashCode() : 0);
        result = 31 * result + (externalId != null ? externalId.hashCode() : 0);
        result = 31 * result + (levelDepth != null ? levelDepth.hashCode() : 0);
        result = 31 * result + (autoMetaTitle != null ? autoMetaTitle.hashCode() : 0);
        result = 31 * result + (autoMetaKeywords != null ? autoMetaKeywords.hashCode() : 0);
        result = 31 * result + (autoMetaDesc != null ? autoMetaDesc.hashCode() : 0);
        result = 31 * result + (autoDescription != null ? autoDescription.hashCode() : 0);
        result = 31 * result + (lastModify != null ? lastModify.hashCode() : 0);
        return result;
    }
}
