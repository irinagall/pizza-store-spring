package com.sparta.idg.pizzastore259;

import com.sparta.idg.pizzastore259.entities.PizzaOrderEntity;
import com.sparta.idg.pizzastore259.entities.PizzaOrderToppingEntity;
import com.sparta.idg.pizzastore259.entities.PizzaOrderToppingEntityId;
import com.sparta.idg.pizzastore259.repositories.PizzaOrderEntityRepository;
import com.sparta.idg.pizzastore259.repositories.PizzaOrderToppingEntityRepository;
import com.sparta.idg.pizzastore259.repositories.PizzaSizeEntityRepository;
import com.sparta.idg.pizzastore259.service.PizzaStoreService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@SpringBootApplication
public class PizzaStore259Application {

    public static void main(String[] args) {
        SpringApplication.run(PizzaStore259Application.class, args);
    }


    @Bean//of what this method returns // generally we'd do this over the CustomCommandLineRunner
    public CommandLineRunner runner(PizzaOrderEntityRepository pizzaOrderEntityRepository, PizzaSizeEntityRepository pizzaSizeEntityRepository, PizzaOrderToppingEntityRepository pizzaOrderToppingEntityRepository, PizzaOrderToppingEntityRepository pizzaOrderToppingEntityIdRepository,PizzaStoreService pizzaStoreService) {


        Logger logger = LoggerFactory.getLogger(Controller.class);

        return args ->{
            //custom repo method
            logger.info(pizzaSizeEntityRepository.findSizesByName("Small").toString());

            //this comes before actually -repo methods
            System.out.println("pizzaOrderEntityRepository.findAll().toString()");
            logger.info(pizzaOrderEntityRepository.findAll().toString());
            System.out.println("pizzaOrderEntityRepository.findById(2).toString()");
            logger.info(pizzaOrderEntityRepository.findById(2).toString());
            System.out.println("pizzaOrderEntityRepository.existsById(1)))");
            logger.info(String.valueOf(pizzaOrderEntityRepository.existsById(1)));
            System.out.println("find all toppings");
            logger.info(pizzaOrderToppingEntityRepository.findAll().toString());
            System.out.println("get topping entity id repo count");
            logger.info(String.valueOf(pizzaOrderToppingEntityIdRepository.count()));
        //System.out.print(String.valueOf(pizzaOrderEntityRepository.findById(1)));


            pizzaStoreService.getAllOrders();


        };

      /*  return args ->{


            logger.info(pizzaSizeEntityRepository.findFirstById(1).toString());


            pizzaStoreService.getAllSizes();
        };
*/
    }
        //IoC -> create an object from CommandLineRunner Interface -> in order to do that, I need -> OrderEntityRepository object -> (What Spring is doing here is injecting PizzaOrderEntityRepository pizzaOrderEntityRepository into the CommandLineRunner )

    }