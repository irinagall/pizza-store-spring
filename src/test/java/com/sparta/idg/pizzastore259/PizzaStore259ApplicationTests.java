package com.sparta.idg.pizzastore259;

import com.sparta.idg.pizzastore259.entities.PizzaOrderEntity;
import com.sparta.idg.pizzastore259.entities.PizzaOrderToppingEntity;
import com.sparta.idg.pizzastore259.repositories.PizzaOrderEntityRepository;
import com.sparta.idg.pizzastore259.repositories.PizzaOrderToppingEntityRepository;
import com.sparta.idg.pizzastore259.repositories.PizzaSizeEntityRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PizzaStore259ApplicationTests {

    @Autowired
    private PizzaOrderToppingEntityRepository pizzaOrderToppingEntityRepository;

    @Autowired //Field create a bean of this type
    private PizzaOrderEntityRepository pizzaOrderEntityRepository;

    @Autowired
    private PizzaSizeEntityRepository pizzaSizeEntityRepository;

    @Autowired
    private PizzaSizeEntityRepository pizzaOrderToppingEntityIdRepository;

    @Test
    @DisplayName("find all orders in orderEntity Repo using .findAll()")
    void findAllOrdersInOrderEntityRepoUsingFindAll() {

        System.out.println("find all orders in orderEntity Repo using .findAll()");
        for(PizzaOrderEntity orderEntity : pizzaOrderEntityRepository.findAll()){
            System.out.println(orderEntity.getCustomerName());
        }
    }


    @Test
    @DisplayName("get small pizza size ")
    void getSmallPizzaSize(){
        assertEquals("Small", pizzaSizeEntityRepository.findById(1).get().getSizeName());
    }

    @Test
    @DisplayName("expect the first customer name when searching by id 1")
    void expectTheFirstCustomerNameWhenSearchingById1(){
        assertEquals("John Doe", pizzaOrderEntityRepository.findById(1).get().getCustomerName());
    }


}
