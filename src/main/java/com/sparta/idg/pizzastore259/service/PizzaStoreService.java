package com.sparta.idg.pizzastore259.service;

import com.sparta.idg.pizzastore259.entities.OrderDetailEntity;
import com.sparta.idg.pizzastore259.repositories.OrderDetailEntityRepository;
import com.sparta.idg.pizzastore259.repositories.PizzaSizeEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaStoreService {

    private final OrderDetailEntityRepository orderDetailEntityRepository;
    private PizzaStoreService pizzaStoreService;
   //private final PizzaSizeEntityRepository pizzaSizeEntityRepository;

    @Autowired
    public PizzaStoreService(OrderDetailEntityRepository orderDetailEntityRepository){
        this.orderDetailEntityRepository=orderDetailEntityRepository;
    }
    public void getAllOrders(){
        List<OrderDetailEntity> allOrders = orderDetailEntityRepository.findAll();
        System.out.println(allOrders);
    }
}
