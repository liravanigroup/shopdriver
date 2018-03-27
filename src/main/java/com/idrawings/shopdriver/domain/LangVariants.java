package com.idrawings.shopdriver.domain;

import javax.persistence.Id;

/**
 * Created by Sergej on 18.10.2017.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "lang_variants")
public class LangVariants {
    private Integer langId = 1;
    private Integer variantId;
    private String name;
    private String units = "";

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
    @javax.persistence.Column(name = "variant_id", nullable = false)
    public Integer getVariantId() {
        return variantId;
    }

    public void setVariantId(Integer variantId) {
        this.variantId = variantId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "name", nullable = false, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "units", nullable = false, length = 32)
    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LangVariants that = (LangVariants) o;

        if (langId != null ? !langId.equals(that.langId) : that.langId != null) return false;
        if (variantId != null ? !variantId.equals(that.variantId) : that.variantId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (units != null ? !units.equals(that.units) : that.units != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = langId != null ? langId.hashCode() : 0;
        result = 31 * result + (variantId != null ? variantId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (units != null ? units.hashCode() : 0);
        return result;
    }
}
