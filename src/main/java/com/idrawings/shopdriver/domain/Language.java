package com.idrawings.shopdriver.domain;

import javax.persistence.*;

/**
 * Created by Sergej on 18.10.2017.
 */
@Entity
@Table(name = "languages")
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Basic
    @Column(name = "name", nullable = false, length = 255)
    private String name;

    @Basic
    @Column(name = "label", nullable = false, length = 10)
    private String label;

    @Basic
    @Column(name = "href_lang", nullable = false, length = 10)
    private String hrefLang;

    @Basic
    @Column(name = "enabled", nullable = false)
    private Byte enabled;

    @Basic
    @Column(name = "position", nullable = false)
    private Integer position;

    @Basic
    @Column(name = "name_ru", nullable = false, length = 255)
    private String nameRu;

    @Basic
    @Column(name = "name_ua", nullable = false, length = 255)
    private String nameUa;

    @Basic
    @Column(name = "name_en", nullable = false, length = 255)
    private String nameEn;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }


    public String getHrefLang() {
        return hrefLang;
    }

    public void setHrefLang(String hrefLang) {
        this.hrefLang = hrefLang;
    }


    public Byte getEnabled() {
        return enabled;
    }

    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }


    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }


    public String getNameRu() {
        return nameRu;
    }

    public void setNameRu(String nameRu) {
        this.nameRu = nameRu;
    }


    public String getNameUa() {
        return nameUa;
    }

    public void setNameUa(String nameUa) {
        this.nameUa = nameUa;
    }


    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Language that = (Language) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (label != null ? !label.equals(that.label) : that.label != null) return false;
        if (hrefLang != null ? !hrefLang.equals(that.hrefLang) : that.hrefLang != null) return false;
        if (enabled != null ? !enabled.equals(that.enabled) : that.enabled != null) return false;
        if (position != null ? !position.equals(that.position) : that.position != null) return false;
        if (nameRu != null ? !nameRu.equals(that.nameRu) : that.nameRu != null) return false;
        if (nameUa != null ? !nameUa.equals(that.nameUa) : that.nameUa != null) return false;
        if (nameEn != null ? !nameEn.equals(that.nameEn) : that.nameEn != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (label != null ? label.hashCode() : 0);
        result = 31 * result + (hrefLang != null ? hrefLang.hashCode() : 0);
        result = 31 * result + (enabled != null ? enabled.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (nameRu != null ? nameRu.hashCode() : 0);
        result = 31 * result + (nameUa != null ? nameUa.hashCode() : 0);
        result = 31 * result + (nameEn != null ? nameEn.hashCode() : 0);
        return result;
    }
}
