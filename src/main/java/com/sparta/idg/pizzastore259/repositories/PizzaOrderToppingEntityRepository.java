package com.sparta.idg.pizzastore259.repositories;

import com.sparta.idg.pizzastore259.entities.PizzaOrderToppingEntity;
import com.sparta.idg.pizzastore259.entities.PizzaOrderToppingEntityId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaOrderToppingEntityRepository extends JpaRepository<PizzaOrderToppingEntity, PizzaOrderToppingEntityId> {
}