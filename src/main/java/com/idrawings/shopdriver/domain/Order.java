package com.idrawings.shopdriver.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by Sergej on 18.10.2017.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "orders")
public class Order {
    private Long id;
    private Integer deliveryId;
    private BigDecimal deliveryPrice;
    private Integer paymentMethodId;
    private Byte paid;
    private Timestamp paymentDate;
    private Byte closed;
    private Timestamp date;
    private Integer userId;
    private String name;
    private String address;
    private String phone;
    private String email;
    private String comment;
    private Integer statusId;
    private String url;
    private String paymentDetails;
    private String ip;
    private BigDecimal totalPrice;
    private String note;
    private BigDecimal discount;
    private BigDecimal couponDiscount;
    private String couponCode;
    private Byte separateDelivery;
    private Timestamp modified;
    private Integer langId = 1;

    @javax.persistence.Id
    @javax.persistence.Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "delivery_id", nullable = true)
    public Integer getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Integer deliveryId) {
        this.deliveryId = deliveryId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "delivery_price", nullable = false, precision = 2)
    public BigDecimal getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(BigDecimal deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "payment_method_id", nullable = true)
    public Integer getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(Integer paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "paid", nullable = false)
    public Byte getPaid() {
        return paid;
    }

    public void setPaid(Byte paid) {
        this.paid = paid;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "payment_date", nullable = false)
    public Timestamp getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Timestamp paymentDate) {
        this.paymentDate = paymentDate;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "closed", nullable = false)
    public Byte getClosed() {
        return closed;
    }

    public void setClosed(Byte closed) {
        this.closed = closed;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "date", nullable = true)
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "user_id", nullable = true)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
    @javax.persistence.Column(name = "address", nullable = false, length = 255)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "phone", nullable = false, length = 32)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "email", nullable = false, length = 255)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "comment", nullable = false, length = 1024)
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "status_id", nullable = false)
    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "url", nullable = true, length = 255)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "payment_details", nullable = false, length = -1)
    public String getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(String paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "ip", nullable = false, length = 20)
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "total_price", nullable = false, precision = 2)
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "note", nullable = false, length = 1024)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "discount", nullable = false, precision = 2)
    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "coupon_discount", nullable = false, precision = 2)
    public BigDecimal getCouponDiscount() {
        return couponDiscount;
    }

    public void setCouponDiscount(BigDecimal couponDiscount) {
        this.couponDiscount = couponDiscount;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "coupon_code", nullable = false, length = 255)
    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "separate_delivery", nullable = false)
    public Byte getSeparateDelivery() {
        return separateDelivery;
    }

    public void setSeparateDelivery(Byte separateDelivery) {
        this.separateDelivery = separateDelivery;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "modified", nullable = false)
    public Timestamp getModified() {
        return modified;
    }

    public void setModified(Timestamp modified) {
        this.modified = modified;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "lang_id", nullable = false)
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

        Order order = (Order) o;

        if (id != null ? !id.equals(order.id) : order.id != null) return false;
        if (deliveryId != null ? !deliveryId.equals(order.deliveryId) : order.deliveryId != null) return false;
        if (deliveryPrice != null ? !deliveryPrice.equals(order.deliveryPrice) : order.deliveryPrice != null)
            return false;
        if (paymentMethodId != null ? !paymentMethodId.equals(order.paymentMethodId) : order.paymentMethodId != null)
            return false;
        if (paid != null ? !paid.equals(order.paid) : order.paid != null) return false;
        if (paymentDate != null ? !paymentDate.equals(order.paymentDate) : order.paymentDate != null)
            return false;
        if (closed != null ? !closed.equals(order.closed) : order.closed != null) return false;
        if (date != null ? !date.equals(order.date) : order.date != null) return false;
        if (userId != null ? !userId.equals(order.userId) : order.userId != null) return false;
        if (name != null ? !name.equals(order.name) : order.name != null) return false;
        if (address != null ? !address.equals(order.address) : order.address != null) return false;
        if (phone != null ? !phone.equals(order.phone) : order.phone != null) return false;
        if (email != null ? !email.equals(order.email) : order.email != null) return false;
        if (comment != null ? !comment.equals(order.comment) : order.comment != null) return false;
        if (statusId != null ? !statusId.equals(order.statusId) : order.statusId != null) return false;
        if (url != null ? !url.equals(order.url) : order.url != null) return false;
        if (paymentDetails != null ? !paymentDetails.equals(order.paymentDetails) : order.paymentDetails != null)
            return false;
        if (ip != null ? !ip.equals(order.ip) : order.ip != null) return false;
        if (totalPrice != null ? !totalPrice.equals(order.totalPrice) : order.totalPrice != null) return false;
        if (note != null ? !note.equals(order.note) : order.note != null) return false;
        if (discount != null ? !discount.equals(order.discount) : order.discount != null) return false;
        if (couponDiscount != null ? !couponDiscount.equals(order.couponDiscount) : order.couponDiscount != null)
            return false;
        if (couponCode != null ? !couponCode.equals(order.couponCode) : order.couponCode != null) return false;
        if (separateDelivery != null ? !separateDelivery.equals(order.separateDelivery) : order.separateDelivery != null)
            return false;
        if (modified != null ? !modified.equals(order.modified) : order.modified != null) return false;
        if (langId != null ? !langId.equals(order.langId) : order.langId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (deliveryId != null ? deliveryId.hashCode() : 0);
        result = 31 * result + (deliveryPrice != null ? deliveryPrice.hashCode() : 0);
        result = 31 * result + (paymentMethodId != null ? paymentMethodId.hashCode() : 0);
        result = 31 * result + (paid != null ? paid.hashCode() : 0);
        result = 31 * result + (paymentDate != null ? paymentDate.hashCode() : 0);
        result = 31 * result + (closed != null ? closed.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (paymentDetails != null ? paymentDetails.hashCode() : 0);
        result = 31 * result + (ip != null ? ip.hashCode() : 0);
        result = 31 * result + (totalPrice != null ? totalPrice.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (discount != null ? discount.hashCode() : 0);
        result = 31 * result + (couponDiscount != null ? couponDiscount.hashCode() : 0);
        result = 31 * result + (couponCode != null ? couponCode.hashCode() : 0);
        result = 31 * result + (separateDelivery != null ? separateDelivery.hashCode() : 0);
        result = 31 * result + (modified != null ? modified.hashCode() : 0);
        result = 31 * result + (langId != null ? langId.hashCode() : 0);
        return result;
    }
}
