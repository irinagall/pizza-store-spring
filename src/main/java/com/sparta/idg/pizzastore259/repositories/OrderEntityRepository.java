package com.sparta.idg.pizzastore259.repositories;

import com.sparta.idg.pizzastore259.entities.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderEntityRepository extends JpaRepository<OrderEntity, Integer> {
}