package com.idrawings.shopdriver.domain;

import java.io.Serializable;

/**
 * Created by Sergej on 18.10.2017.
 */
public class OrdersLabelsPK implements Serializable {
    private Integer orderId;
    private Integer labelId;

    @javax.persistence.Column(name = "order_id", nullable = false)
    @javax.persistence.Id
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @javax.persistence.Column(name = "label_id", nullable = false)
    @javax.persistence.Id
    public Integer getLabelId() {
        return labelId;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrdersLabelsPK that = (OrdersLabelsPK) o;

        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (labelId != null ? !labelId.equals(that.labelId) : that.labelId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderId != null ? orderId.hashCode() : 0;
        result = 31 * result + (labelId != null ? labelId.hashCode() : 0);
        return result;
    }
}
