package com.sparta.idg.pizzastore259.repositories;

import com.sparta.idg.pizzastore259.entities.PizzaSizeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PizzaSizeEntityRepository extends JpaRepository<PizzaSizeEntity, Integer> {
    @Query(value = "SELECT * from pizza_sizes where size_name= ?1",nativeQuery = true)
    List<PizzaSizeEntity> findSizesByName(String sizeName);

    Optional<PizzaSizeEntity> findFirstById(int id); //Spring Expression Syntax
}
