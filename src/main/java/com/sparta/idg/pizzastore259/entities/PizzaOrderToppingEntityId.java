package com.sparta.idg.pizzastore259.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PizzaOrderToppingEntityId implements Serializable {
    private static final long serialVersionUID = -3442046965943876562L;
    @NotNull
    @Column(name = "order_id", nullable = false)
    private Integer orderId;

    @NotNull
    @Column(name = "topping_id", nullable = false)
    private Integer toppingId;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getToppingId() {
        return toppingId;
    }

    public void setToppingId(Integer toppingId) {
        this.toppingId = toppingId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PizzaOrderToppingEntityId entity = (PizzaOrderToppingEntityId) o;
        return Objects.equals(this.orderId, entity.orderId) &&
                Objects.equals(this.toppingId, entity.toppingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, toppingId);
    }

    @Override
    public String toString() {
        return "PizzaOrderToppingEntityId{" +
                "orderId=" + orderId +
                ", toppingId=" + toppingId +
                '}';
    }
}