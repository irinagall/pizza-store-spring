package com.sparta.idg.pizzastore259.repositories;

import com.sparta.idg.pizzastore259.entities.OrderDetailEntity;
import com.sparta.idg.pizzastore259.entities.OrderDetailEntityId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailEntityRepository extends JpaRepository<OrderDetailEntity, OrderDetailEntityId> {
}