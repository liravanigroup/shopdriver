package com.idrawings.shopdriver.domain;

import javax.persistence.*;

/**
 * Created by Sergej on 18.10.2017.
 */
@Entity
@Table(name = "options")
public class Option {

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "feature_id")
    private Feature feature;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lang_id")
    private Language language;

    @Basic
    @Column(name = "value", nullable = false, length = 1024)
    private String value;

    @Basic
    @Column(name = "translit", nullable = false, length = 255)
    private String translit;


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Feature getFeature() {
        return feature;
    }

    public void setFeatureId(Feature feature) {
        this.feature = feature;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getTranslit() {
        return translit;
    }

    public void setTranslit(String translit) {
        this.translit = translit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Option option = (Option) o;

//        if (productId != null ? !productId.equals(option.productId) : option.productId != null) return false;
//        if (featureId != null ? !featureId.equals(option.featureId) : option.featureId != null) return false;
//        if (langId != null ? !langId.equals(option.langId) : option.langId != null) return false;
        if (value != null ? !value.equals(option.value) : option.value != null) return false;
        if (translit != null ? !translit.equals(option.translit) : option.translit != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
//        int result = productId != null ? productId.hashCode() : 0;
//        result = 31 * result + (featureId != null ? featureId.hashCode() : 0);
//        result = 31 * result + (langId != null ? langId.hashCode() : 0);
//        result = 31 * result + (value != null ? value.hashCode() : 0);
//        result = 31 * result + (translit != null ? translit.hashCode() : 0);
//        return result;
        return 0;
    }
}
