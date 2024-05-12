package com.sparta.idg.pizzastore259.entities;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;

@Entity
@Table(name = "pizza_order_toppings")
public class PizzaOrderToppingEntity {
    @EmbeddedId
    private PizzaOrderToppingEntityId id;

    @MapsId("orderId")
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "order_id", nullable = false)
    private PizzaOrderEntity order;

    @MapsId("toppingId")
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "topping_id", nullable = false)
    private ToppingEntity topping;

    public PizzaOrderToppingEntityId getId() {
        return id;
    }

    public void setId(PizzaOrderToppingEntityId id) {
        this.id = id;
    }

    public PizzaOrderEntity getOrder() {
        return order;
    }

    public void setOrder(PizzaOrderEntity order) {
        this.order = order;
    }

    public ToppingEntity getTopping() {
        return topping;
    }

    public void setTopping(ToppingEntity topping) {
        this.topping = topping;
    }

    @Override
    @Transactional
    public String toString() {
        return "PizzaOrderToppingEntity{" +
                "id=" + id +
                ", order=" + order +
                ", topping=" + topping +
                '}';
    }
}