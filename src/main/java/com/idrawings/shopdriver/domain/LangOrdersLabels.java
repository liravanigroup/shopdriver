package com.idrawings.shopdriver.domain;

import javax.persistence.Id;

/**
 * Created by Sergej on 18.10.2017.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "lang_orders_labels")
public class LangOrdersLabels {
    private Integer langId = 1;
    private Integer orderLabelsId;
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
    @javax.persistence.Column(name = "order_labels_id", nullable = false)
    public Integer getOrderLabelsId() {
        return orderLabelsId;
    }

    public void setOrderLabelsId(Integer orderLabelsId) {
        this.orderLabelsId = orderLabelsId;
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

        LangOrdersLabels that = (LangOrdersLabels) o;

        if (langId != null ? !langId.equals(that.langId) : that.langId != null) return false;
        if (orderLabelsId != null ? !orderLabelsId.equals(that.orderLabelsId) : that.orderLabelsId != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = langId != null ? langId.hashCode() : 0;
        result = 31 * result + (orderLabelsId != null ? orderLabelsId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
