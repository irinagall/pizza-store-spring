package com.sparta.idg.pizzastore259.repositories;

import com.sparta.idg.pizzastore259.entities.ToppingEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ToppingEntityRepository extends JpaRepository<ToppingEntity, Integer> {
}