package com.sparta.idg.pizzastore259.repositories;

import com.sparta.idg.pizzastore259.entities.PizzaOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaOrderEntityRepository extends JpaRepository<PizzaOrderEntity, Integer> {
}