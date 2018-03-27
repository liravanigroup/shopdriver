package com.idrawings.shopdriver.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by Sergej on 18.10.2017.
 */
@Entity
@Table(name = "brands")
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @OneToMany(mappedBy = "brand", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Product> products;

    private String name;
    private String url;
    private String metaTitle;
    private String metaKeywords;
    private String metaDescription;
    private String annotation;
    private String description;
    private String image;
    private Timestamp lastModify;
    private Integer position;
    private Byte visible;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    @Column(name = "url", nullable = false, length = 255)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
    @Column(name = "image", nullable = false, length = 255)
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Basic
    @Column(name = "last_modify", nullable = false)
    public Timestamp getLastModify() {
        return lastModify;
    }

    public void setLastModify(Timestamp lastModify) {
        this.lastModify = lastModify;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Brand brand = (Brand) o;

        if (id != null ? !id.equals(brand.id) : brand.id != null) return false;
        if (name != null ? !name.equals(brand.name) : brand.name != null) return false;
        if (url != null ? !url.equals(brand.url) : brand.url != null) return false;
        if (metaTitle != null ? !metaTitle.equals(brand.metaTitle) : brand.metaTitle != null) return false;
        if (metaKeywords != null ? !metaKeywords.equals(brand.metaKeywords) : brand.metaKeywords != null)
            return false;
        if (metaDescription != null ? !metaDescription.equals(brand.metaDescription) : brand.metaDescription != null)
            return false;
        if (annotation != null ? !annotation.equals(brand.annotation) : brand.annotation != null) return false;
        if (description != null ? !description.equals(brand.description) : brand.description != null)
            return false;
        if (image != null ? !image.equals(brand.image) : brand.image != null) return false;
        if (lastModify != null ? !lastModify.equals(brand.lastModify) : brand.lastModify != null) return false;
        if (position != null ? !position.equals(brand.position) : brand.position != null) return false;
        if (visible != null ? !visible.equals(brand.visible) : brand.visible != null) return false;

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
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (lastModify != null ? lastModify.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (visible != null ? visible.hashCode() : 0);
        return result;
    }
}
