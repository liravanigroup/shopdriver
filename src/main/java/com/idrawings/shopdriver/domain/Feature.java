package com.idrawings.shopdriver.domain;

import org.hibernate.annotations.Type;

import javax.persistence.*;

/**
 * Created by Sergej on 18.10.2017.
 */
@Entity
@Table(name = "features")
public class Feature {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Basic
    @Column(name = "name", nullable = false, length = 255)
    private String name;

    @Basic
    @Column(name = "position", nullable = false)
    private Integer position;

    @Column(name = "in_filter", columnDefinition = "TINYINT")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean inFilter;

    @Column(name = "yandex", columnDefinition = "TINYINT")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean yandex;

    @Basic
    @Column(name = "auto_name_id", nullable = false, length = 64)
    private String autoNameId;

    @Basic
    @Column(name = "auto_value_id", nullable = false, length = 64)
    private String autoValueId;

    @Basic
    @Column(name = "url", nullable = false, length = 255)
    private String url;


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


    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }


    public boolean getInFilter() {
        return inFilter;
    }

    public void setInFilter(boolean inFilter) {
        this.inFilter = inFilter;
    }

    public boolean getYandex() {
        return yandex;
    }

    public void setYandex(boolean yandex) {
        this.yandex = yandex;
    }


    public String getAutoNameId() {
        return autoNameId;
    }

    public void setAutoNameId(String autoNameId) {
        this.autoNameId = autoNameId;
    }

    public String getAutoValueId() {
        return autoValueId;
    }

    public void setAutoValueId(String autoValueId) {
        this.autoValueId = autoValueId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Feature that = (Feature) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (position != null ? !position.equals(that.position) : that.position != null) return false;
//        if (inFilter != null ? !inFilter.equals(that.inFilter) : that.inFilter != null) return false;
//        if (yandex != null ? !yandex.equals(that.yandex) : that.yandex != null) return false;
        if (autoNameId != null ? !autoNameId.equals(that.autoNameId) : that.autoNameId != null) return false;
        if (autoValueId != null ? !autoValueId.equals(that.autoValueId) : that.autoValueId != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
//        result = 31 * result + (inFilter != null ? inFilter.hashCode() : 0);
//        result = 31 * result + (yandex != null ? yandex.hashCode() : 0);
        result = 31 * result + (autoNameId != null ? autoNameId.hashCode() : 0);
        result = 31 * result + (autoValueId != null ? autoValueId.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }
}
