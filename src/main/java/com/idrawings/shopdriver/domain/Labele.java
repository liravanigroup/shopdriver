package com.idrawings.shopdriver.domain;

/**
 * Created by Sergej on 18.10.2017.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "labels")
public class Labele {
    private Integer id;
    private String name;
    private String color;
    private Integer position;

    @javax.persistence.Id
    @javax.persistence.Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    @javax.persistence.Column(name = "color", nullable = false, length = 6)
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "position", nullable = false)
    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Labele labele = (Labele) o;

        if (id != null ? !id.equals(labele.id) : labele.id != null) return false;
        if (name != null ? !name.equals(labele.name) : labele.name != null) return false;
        if (color != null ? !color.equals(labele.color) : labele.color != null) return false;
        if (position != null ? !position.equals(labele.position) : labele.position != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        return result;
    }
}
