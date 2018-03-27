package com.idrawings.shopdriver.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by Sergej on 18.10.2017.
 */
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Basic
    @Column(name = "url", nullable = false)
    private String url;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Image> images;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Variant> variants;

    @ManyToMany
    @JoinTable(name = "products_categories",
            joinColumns = {@JoinColumn(name = "product_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "category_id", referencedColumnName = "id")})
    private List<Category> categories;


    private List<Option> options;


    private String name;
    private String annotation;
    private String description;
    private Byte visible;

    private Integer position;

    private String metaTitle;
    private String metaKeywords;
    private String metaDescription;
    private Timestamp created;
    private Byte featured;
    private String externalId;
    private Double rating;
    private Integer votes;
    private String special;
    private Timestamp lastModify;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Brand getbrand() {
        return brand;
    }

    public void setbrand(Brand brand) {
        this.brand = brand;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 512)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "visible", nullable = false)
    public Byte getVisible() {
        return visible;
    }

    public void setVisible(Byte visible) {
        this.visible = visible;
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
    @Column(name = "created", nullable = true)
    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    @Basic
    @Column(name = "featured", nullable = true)
    public Byte getFeatured() {
        return featured;
    }

    public void setFeatured(Byte featured) {
        this.featured = featured;
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
    @Column(name = "rating", nullable = true, precision = 1)
    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    @Basic
    @Column(name = "votes", nullable = true)
    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }

    @Basic
    @Column(name = "special", nullable = true, length = 255)
    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
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

        Product that = (Product) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (brand != null ? !brand.equals(that.brand) : that.brand != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (annotation != null ? !annotation.equals(that.annotation) : that.annotation != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (visible != null ? !visible.equals(that.visible) : that.visible != null) return false;
        if (position != null ? !position.equals(that.position) : that.position != null) return false;
        if (metaTitle != null ? !metaTitle.equals(that.metaTitle) : that.metaTitle != null) return false;
        if (metaKeywords != null ? !metaKeywords.equals(that.metaKeywords) : that.metaKeywords != null) return false;
        if (metaDescription != null ? !metaDescription.equals(that.metaDescription) : that.metaDescription != null)
            return false;
        if (created != null ? !created.equals(that.created) : that.created != null) return false;
        if (featured != null ? !featured.equals(that.featured) : that.featured != null) return false;
        if (externalId != null ? !externalId.equals(that.externalId) : that.externalId != null) return false;
        if (rating != null ? !rating.equals(that.rating) : that.rating != null) return false;
        if (votes != null ? !votes.equals(that.votes) : that.votes != null) return false;
        if (special != null ? !special.equals(that.special) : that.special != null) return false;
        if (lastModify != null ? !lastModify.equals(that.lastModify) : that.lastModify != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (annotation != null ? annotation.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (visible != null ? visible.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (metaTitle != null ? metaTitle.hashCode() : 0);
        result = 31 * result + (metaKeywords != null ? metaKeywords.hashCode() : 0);
        result = 31 * result + (metaDescription != null ? metaDescription.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (featured != null ? featured.hashCode() : 0);
        result = 31 * result + (externalId != null ? externalId.hashCode() : 0);
        result = 31 * result + (rating != null ? rating.hashCode() : 0);
        result = 31 * result + (votes != null ? votes.hashCode() : 0);
        result = 31 * result + (special != null ? special.hashCode() : 0);
        result = 31 * result + (lastModify != null ? lastModify.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Product{");
        sb.append("id=").append(id);
        sb.append(", url='").append(url).append('\'');
        sb.append(", brand=").append(brand);
        sb.append(", name='").append(name).append('\'');
        sb.append(", annotation='").append(annotation).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", visible=").append(visible);
        sb.append(", position=").append(position);
        sb.append(", metaTitle='").append(metaTitle).append('\'');
        sb.append(", metaKeywords='").append(metaKeywords).append('\'');
        sb.append(", metaDescription='").append(metaDescription).append('\'');
        sb.append(", created=").append(created);
        sb.append(", featured=").append(featured);
        sb.append(", externalId='").append(externalId).append('\'');
        sb.append(", rating=").append(rating);
        sb.append(", votes=").append(votes);
        sb.append(", special='").append(special).append('\'');
        sb.append(", lastModify=").append(lastModify);
        sb.append('}');
        return sb.toString();
    }
}
