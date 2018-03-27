package com.idrawings.shopdriver.domain;

/**
 * Created by Sergej on 18.10.2017.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "categories_features")
@javax.persistence.IdClass(CategoriesFeaturesPK.class)
public class CategoriesFeatures {
    private Integer categoryId;
    private Integer featureId;

    @javax.persistence.Id
    @javax.persistence.Column(name = "category_id", nullable = false)
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @javax.persistence.Id
    @javax.persistence.Column(name = "feature_id", nullable = false)
    public Integer getFeatureId() {
        return featureId;
    }

    public void setFeatureId(Integer featureId) {
        this.featureId = featureId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CategoriesFeatures that = (CategoriesFeatures) o;

        if (categoryId != null ? !categoryId.equals(that.categoryId) : that.categoryId != null) return false;
        if (featureId != null ? !featureId.equals(that.featureId) : that.featureId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = categoryId != null ? categoryId.hashCode() : 0;
        result = 31 * result + (featureId != null ? featureId.hashCode() : 0);
        return result;
    }
}
