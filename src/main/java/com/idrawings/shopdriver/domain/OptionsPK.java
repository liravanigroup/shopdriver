package com.idrawings.shopdriver.domain;

import java.io.Serializable;

/**
 * Created by Sergej on 18.10.2017.
 */
public class OptionsPK implements Serializable {

    private Integer productId;
    private Integer featureId;
    private Integer langId = 1;

    @javax.persistence.Column(name = "product_id", nullable = false)
    @javax.persistence.Id
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @javax.persistence.Column(name = "feature_id", nullable = false)
    @javax.persistence.Id
    public Integer getFeatureId() {
        return featureId;
    }

    public void setFeatureId(Integer featureId) {
        this.featureId = featureId;
    }

    @javax.persistence.Column(name = "lang_id", nullable = false)
    @javax.persistence.Id
    public Integer getLangId() {
        return langId;
    }

    public void setLangId(Integer langId) {
        this.langId = langId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OptionsPK that = (OptionsPK) o;

        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        if (featureId != null ? !featureId.equals(that.featureId) : that.featureId != null) return false;
        if (langId != null ? !langId.equals(that.langId) : that.langId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productId != null ? productId.hashCode() : 0;
        result = 31 * result + (featureId != null ? featureId.hashCode() : 0);
        result = 31 * result + (langId != null ? langId.hashCode() : 0);
        return result;
    }
}
