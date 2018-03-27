package com.idrawings.shopdriver.domain;

import java.io.Serializable;

/**
 * Created by Sergej on 18.10.2017.
 */
public class SettingsLangPK implements Serializable {
    private String name;
    private Integer langId = 1;

    @javax.persistence.Column(name = "name", nullable = false, length = 128)
    @javax.persistence.Id
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

        SettingsLangPK that = (SettingsLangPK) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (langId != null ? !langId.equals(that.langId) : that.langId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (langId != null ? langId.hashCode() : 0);
        return result;
    }
}
