package com.idrawings.shopdriver.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by Sergej on 18.10.2017.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "coupons")
public class Coupon {
    private Integer id;
    private String code;
    private Timestamp expire;
    private String type;
    private BigDecimal value;
    private BigDecimal minOrderPrice;
    private Byte single;
    private Integer usages;

    @javax.persistence.Id
    @javax.persistence.Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "code", nullable = false, length = 256)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "expire", nullable = true)
    public Timestamp getExpire() {
        return expire;
    }

    public void setExpire(Timestamp expire) {
        this.expire = expire;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "type", nullable = false)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "value", nullable = false, precision = 2)
    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "min_order_price", nullable = true, precision = 2)
    public BigDecimal getMinOrderPrice() {
        return minOrderPrice;
    }

    public void setMinOrderPrice(BigDecimal minOrderPrice) {
        this.minOrderPrice = minOrderPrice;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "single", nullable = false)
    public Byte getSingle() {
        return single;
    }

    public void setSingle(Byte single) {
        this.single = single;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "usages", nullable = false)
    public Integer getUsages() {
        return usages;
    }

    public void setUsages(Integer usages) {
        this.usages = usages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coupon coupon = (Coupon) o;

        if (id != null ? !id.equals(coupon.id) : coupon.id != null) return false;
        if (code != null ? !code.equals(coupon.code) : coupon.code != null) return false;
        if (expire != null ? !expire.equals(coupon.expire) : coupon.expire != null) return false;
        if (type != null ? !type.equals(coupon.type) : coupon.type != null) return false;
        if (value != null ? !value.equals(coupon.value) : coupon.value != null) return false;
        if (minOrderPrice != null ? !minOrderPrice.equals(coupon.minOrderPrice) : coupon.minOrderPrice != null)
            return false;
        if (single != null ? !single.equals(coupon.single) : coupon.single != null) return false;
        if (usages != null ? !usages.equals(coupon.usages) : coupon.usages != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (expire != null ? expire.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (minOrderPrice != null ? minOrderPrice.hashCode() : 0);
        result = 31 * result + (single != null ? single.hashCode() : 0);
        result = 31 * result + (usages != null ? usages.hashCode() : 0);
        return result;
    }
}
