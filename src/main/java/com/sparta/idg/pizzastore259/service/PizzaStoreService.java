package com.sparta.idg.pizzastore259.service;

import com.sparta.idg.pizzastore259.entities.PizzaOrderEntity;
import com.sparta.idg.pizzastore259.entities.PizzaSizeEntity;
import com.sparta.idg.pizzastore259.repositories.PizzaOrderEntityRepository;
import com.sparta.idg.pizzastore259.repositories.PizzaSizeEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PizzaStoreService {

    private final PizzaOrderEntityRepository pizzaOrderEntityRepository;
    private PizzaStoreService pizzaStoreService;
    private final PizzaSizeEntityRepository pizzaSizeEntityRepository;
    //private final PizzaSizeEntityRepository pizzaSizeEntityRepository;

    @Autowired
    public PizzaStoreService(PizzaOrderEntityRepository pizzaOrderEntityRepository,
                             PizzaSizeEntityRepository pizzaSizeEntityRepository){
        this.pizzaOrderEntityRepository= pizzaOrderEntityRepository;
        this.pizzaSizeEntityRepository = pizzaSizeEntityRepository;
    }
    @Transactional
   public void getAllOrders(){
        List<PizzaOrderEntity> allOrders = pizzaOrderEntityRepository.findAll();
      System.out.println(allOrders);
    }

    public void getAllSizes(){
        List<PizzaSizeEntity> allPizzaSizes = pizzaSizeEntityRepository.findAll();
       // System.out.println(allPizzaSizes);
    }

}
