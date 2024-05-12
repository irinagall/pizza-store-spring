package com.sparta.idg.pizzastore259.service;

import com.sparta.idg.pizzastore259.entities.PizzaOrderEntity;
import com.sparta.idg.pizzastore259.entities.PizzaSizeEntity;
import com.sparta.idg.pizzastore259.entities.ToppingEntity;
import com.sparta.idg.pizzastore259.repositories.PizzaOrderEntityRepository;
import com.sparta.idg.pizzastore259.repositories.PizzaSizeEntityRepository;
import com.sparta.idg.pizzastore259.repositories.ToppingEntityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PizzaStoreService {
    Logger logger = LoggerFactory.getLogger(Controller.class);

    private final PizzaOrderEntityRepository pizzaOrderEntityRepository;
    private final ToppingEntityRepository toppingEntityRepository;
    private PizzaStoreService pizzaStoreService;
    private final PizzaSizeEntityRepository pizzaSizeEntityRepository;
    //private final PizzaSizeEntityRepository pizzaSizeEntityRepository;

    @Autowired
    public PizzaStoreService(PizzaOrderEntityRepository pizzaOrderEntityRepository,
                             PizzaSizeEntityRepository pizzaSizeEntityRepository, ToppingEntityRepository toppingEntityRepository){
        this.pizzaOrderEntityRepository= pizzaOrderEntityRepository;
        this.pizzaSizeEntityRepository = pizzaSizeEntityRepository;
        this.toppingEntityRepository = toppingEntityRepository;
    }
    @Transactional
   public void getAllOrders(){
        List<PizzaOrderEntity> allOrders = pizzaOrderEntityRepository.findAll();
     // System.out.println(allOrders);
    }

    public void getAllSizes(){
        List<PizzaSizeEntity> allPizzaSizes = pizzaSizeEntityRepository.findAll();
       // System.out.println(allPizzaSizes);
    }



    public List<BigDecimal> findAllPricesForToppings(){
        logger.info("Starting findToppings method ");
        List<ToppingEntity> allToppings = toppingEntityRepository.findAll();
        logger.info("Collected all toppings");
        List<BigDecimal> allCostToppings = new ArrayList<>();
        logger.info("created list to store toppings prices");

        for(ToppingEntity toppingEntity : allToppings){
              allCostToppings.add(toppingEntity.getPrice());
              logger.info("Found all toppings prices ");
           };

        return allCostToppings;
    }



}
