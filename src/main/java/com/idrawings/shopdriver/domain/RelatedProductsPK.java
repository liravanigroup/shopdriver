package com.idrawings.shopdriver.domain;

import java.io.Serializable;

/**
 * Created by Sergej on 18.10.2017.
 */
public class RelatedProductsPK implements Serializable {
    private Integer productId;
    private Integer relatedId;

    @javax.persistence.Column(name = "product_id", nullable = false)
    @javax.persistence.Id
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @javax.persistence.Column(name = "related_id", nullable = false)
    @javax.persistence.Id
    public Integer getRelatedId() {
        return relatedId;
    }

    public void setRelatedId(Integer relatedId) {
        this.relatedId = relatedId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RelatedProductsPK that = (RelatedProductsPK) o;

        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        if (relatedId != null ? !relatedId.equals(that.relatedId) : that.relatedId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productId != null ? productId.hashCode() : 0;
        result = 31 * result + (relatedId != null ? relatedId.hashCode() : 0);
        return result;
    }
}
