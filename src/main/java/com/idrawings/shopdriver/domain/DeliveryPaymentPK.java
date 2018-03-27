package com.idrawings.shopdriver.domain;

import java.io.Serializable;

/**
 * Created by Sergej on 18.10.2017.
 */
public class DeliveryPaymentPK implements Serializable {
    private Integer deliveryId;
    private Integer paymentMethodId;

    @javax.persistence.Column(name = "delivery_id", nullable = false)
    @javax.persistence.Id
    public Integer getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Integer deliveryId) {
        this.deliveryId = deliveryId;
    }

    @javax.persistence.Column(name = "payment_method_id", nullable = false)
    @javax.persistence.Id
    public Integer getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(Integer paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeliveryPaymentPK that = (DeliveryPaymentPK) o;

        if (deliveryId != null ? !deliveryId.equals(that.deliveryId) : that.deliveryId != null) return false;
        if (paymentMethodId != null ? !paymentMethodId.equals(that.paymentMethodId) : that.paymentMethodId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = deliveryId != null ? deliveryId.hashCode() : 0;
        result = 31 * result + (paymentMethodId != null ? paymentMethodId.hashCode() : 0);
        return result;
    }
}
