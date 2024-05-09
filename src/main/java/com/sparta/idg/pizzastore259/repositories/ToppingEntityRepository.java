package com.sparta.idg.pizzastore259.repositories;

import com.sparta.idg.pizzastore259.entities.PizzaSizeEntity;
import com.sparta.idg.pizzastore259.entities.ToppingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ToppingEntityRepository extends JpaRepository<ToppingEntity, Integer> {
    @Query(value = "SELECT * from toppings where topping_name= ?1",nativeQuery = true)
    List<ToppingEntity> findToppingByName(String toppingName);

    Optional<ToppingEntityRepository> findFirstById(int id);
}