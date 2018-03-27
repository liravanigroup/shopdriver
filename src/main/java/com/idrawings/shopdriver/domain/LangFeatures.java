package com.idrawings.shopdriver.domain;

import javax.persistence.Id;

/**
 * Created by Sergej on 18.10.2017.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "lang_features")
public class LangFeatures {
    private Integer langId = 1;
    private Integer featureId;
    private String name;

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
    @javax.persistence.Column(name = "feature_id", nullable = false)
    public Integer getFeatureId() {
        return featureId;
    }

    public void setFeatureId(Integer featureId) {
        this.featureId = featureId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "name", nullable = false, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LangFeatures that = (LangFeatures) o;

        if (langId != null ? !langId.equals(that.langId) : that.langId != null) return false;
        if (featureId != null ? !featureId.equals(that.featureId) : that.featureId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = langId != null ? langId.hashCode() : 0;
        result = 31 * result + (featureId != null ? featureId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
