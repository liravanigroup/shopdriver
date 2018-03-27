package com.idrawings.shopdriver.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "lang_products")
@IdClass(LangProductPK.class)
public class LangProduct implements Serializable {

    private static final long serialVersionUID = 6817231825287655605L;

    @Column(name = "lang_id", nullable = false)
    @Id
    private Integer langId;

    @Column(name = "product_id", nullable = false)
    @Id
    private Integer productId;

    @Basic
    @Column(name = "name", nullable = false, length = 512)
    private String name;
    @Basic
    @Column(name = "annotation", nullable = false, length = -1)
    private String annotation;
    @Basic
    @Column(name = "description", nullable = false, length = -1)
    private String description;
    @Basic
    @Column(name = "meta_title", nullable = false, length = 512)
    private String metaTitle;
    @Basic
    @Column(name = "meta_keywords", nullable = false, length = 512)
    private String metaKeywords;
    @Basic
    @Column(name = "meta_description", nullable = false, length = 512)
    private String metaDescription;
    @Basic
    @Column(name = "special", nullable = true, length = 255)
    private String special;


    public Integer getLangId() {
        return langId;
    }

    public void setLangId(Integer langId) {
        this.langId = langId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }

    public String getMetaKeywords() {
        return metaKeywords;
    }

    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LangProduct that = (LangProduct) o;

        if (langId != null ? !langId.equals(that.langId) : that.langId != null) return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (annotation != null ? !annotation.equals(that.annotation) : that.annotation != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (metaTitle != null ? !metaTitle.equals(that.metaTitle) : that.metaTitle != null) return false;
        if (metaKeywords != null ? !metaKeywords.equals(that.metaKeywords) : that.metaKeywords != null) return false;
        if (metaDescription != null ? !metaDescription.equals(that.metaDescription) : that.metaDescription != null)
            return false;
        return special != null ? special.equals(that.special) : that.special == null;
    }

    @Override
    public int hashCode() {
        int result = langId != null ? langId.hashCode() : 0;
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (annotation != null ? annotation.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (metaTitle != null ? metaTitle.hashCode() : 0);
        result = 31 * result + (metaKeywords != null ? metaKeywords.hashCode() : 0);
        result = 31 * result + (metaDescription != null ? metaDescription.hashCode() : 0);
        result = 31 * result + (special != null ? special.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LangProduct{");
        sb.append("langId=").append(langId);
        sb.append(", productId=").append(productId);
        sb.append(", name='").append(name).append('\'');
        sb.append(", annotation='").append(annotation).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", metaTitle='").append(metaTitle).append('\'');
        sb.append(", metaKeywords='").append(metaKeywords).append('\'');
        sb.append(", metaDescription='").append(metaDescription).append('\'');
        sb.append(", special='").append(special).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
