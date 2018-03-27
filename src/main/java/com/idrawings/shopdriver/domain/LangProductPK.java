package com.idrawings.shopdriver.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Sergej on 18.10.2017.
 */
public class LangProductPK implements Serializable {

    private Integer langId = 1;
    private Integer productId;

    @Column(name = "lang_id", nullable = false)
    @Id
    public Integer getLangId() {
        return langId;
    }

    public void setLangId(Integer langId) {
        this.langId = langId;
    }

    @Column(name = "product_id", nullable = false)
    @Id
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LangProductPK that = (LangProductPK) o;

        if (langId != null ? !langId.equals(that.langId) : that.langId != null) return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = langId != null ? langId.hashCode() : 0;
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        return result;
    }

}
