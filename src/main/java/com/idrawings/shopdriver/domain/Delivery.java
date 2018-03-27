package com.idrawings.shopdriver.domain;

import java.math.BigDecimal;

/**
 * Created by Sergej on 18.10.2017.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "delivery")
public class Delivery {
    private Integer id;
    private String name;
    private String description;
    private BigDecimal freeFrom;
    private BigDecimal price;
    private Byte enabled;
    private Integer position;
    private Byte separatePayment;
    private String image;

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
    @javax.persistence.Column(name = "description", nullable = false, length = -1)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "free_from", nullable = false, precision = 2)
    public BigDecimal getFreeFrom() {
        return freeFrom;
    }

    public void setFreeFrom(BigDecimal freeFrom) {
        this.freeFrom = freeFrom;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "price", nullable = false, precision = 2)
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "enabled", nullable = false)
    public Byte getEnabled() {
        return enabled;
    }

    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "position", nullable = false)
    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "separate_payment", nullable = true)
    public Byte getSeparatePayment() {
        return separatePayment;
    }

    public void setSeparatePayment(Byte separatePayment) {
        this.separatePayment = separatePayment;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "image", nullable = false, length = 255)
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Delivery that = (Delivery) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (freeFrom != null ? !freeFrom.equals(that.freeFrom) : that.freeFrom != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (enabled != null ? !enabled.equals(that.enabled) : that.enabled != null) return false;
        if (position != null ? !position.equals(that.position) : that.position != null) return false;
        if (separatePayment != null ? !separatePayment.equals(that.separatePayment) : that.separatePayment != null)
            return false;
        if (image != null ? !image.equals(that.image) : that.image != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (freeFrom != null ? freeFrom.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (enabled != null ? enabled.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (separatePayment != null ? separatePayment.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        return result;
    }
}
