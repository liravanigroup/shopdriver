package com.idrawings.shopdriver.domain;

import java.math.BigDecimal;

/**
 * Created by Sergej on 18.10.2017.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "currencies")
public class Currency {
    private Integer id;
    private String name;
    private String sign;
    private String code;
    private BigDecimal rateFrom;
    private BigDecimal rateTo;
    private Integer cents;
    private Integer position;
    private Byte enabled;

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
    @javax.persistence.Column(name = "sign", nullable = false, length = 20)
    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "code", nullable = false, length = 3)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "rate_from", nullable = false, precision = 2)
    public BigDecimal getRateFrom() {
        return rateFrom;
    }

    public void setRateFrom(BigDecimal rateFrom) {
        this.rateFrom = rateFrom;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "rate_to", nullable = false, precision = 2)
    public BigDecimal getRateTo() {
        return rateTo;
    }

    public void setRateTo(BigDecimal rateTo) {
        this.rateTo = rateTo;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "cents", nullable = false)
    public Integer getCents() {
        return cents;
    }

    public void setCents(Integer cents) {
        this.cents = cents;
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
    @javax.persistence.Column(name = "enabled", nullable = false)
    public Byte getEnabled() {
        return enabled;
    }

    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Currency that = (Currency) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (sign != null ? !sign.equals(that.sign) : that.sign != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (rateFrom != null ? !rateFrom.equals(that.rateFrom) : that.rateFrom != null) return false;
        if (rateTo != null ? !rateTo.equals(that.rateTo) : that.rateTo != null) return false;
        if (cents != null ? !cents.equals(that.cents) : that.cents != null) return false;
        if (position != null ? !position.equals(that.position) : that.position != null) return false;
        if (enabled != null ? !enabled.equals(that.enabled) : that.enabled != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (sign != null ? sign.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (rateFrom != null ? rateFrom.hashCode() : 0);
        result = 31 * result + (rateTo != null ? rateTo.hashCode() : 0);
        result = 31 * result + (cents != null ? cents.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (enabled != null ? enabled.hashCode() : 0);
        return result;
    }
}
