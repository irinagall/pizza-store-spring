package com.sparta.idg.pizzastore259;

import com.sparta.idg.pizzastore259.entities.OrderEntity;
import com.sparta.idg.pizzastore259.repositories.OrderEntityRepository;
import com.sparta.idg.pizzastore259.repositories.PizzaSizeEntityRepository;
import org.hibernate.query.sqm.mutation.internal.cte.CteInsertStrategy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PizzaSize259ApplicationTests {

    @Autowired //Field- create a bean of this type
    private OrderEntityRepository orderEntityRepository;
    @Autowired
    private PizzaSizeEntityRepository pizzaSizeEntityRepository;

    @Test
    @DisplayName("Try and crash Sprng")
    void tryAndCrashSpring() {
        for(OrderEntity orderEntity : orderEntityRepository.findAll()){
            System.out.println(orderEntity.getCustomerName());
        }
    }


    @Test
    @DisplayName("get small pizza size ")
    void getSmallPizzaSize(){
        assertEquals("Small", pizzaSizeEntityRepository.findById(1).get().getSizeName());
    }


}
