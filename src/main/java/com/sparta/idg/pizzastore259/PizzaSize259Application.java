package com.sparta.idg.pizzastore259;

import com.sparta.idg.pizzastore259.repositories.OrderEntityRepository;
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
public class PizzaSize259Application {

    public static void main(String[] args) {
        SpringApplication.run(PizzaSize259Application.class, args);
    }


    @Bean//of what this method returns
    public CommandLineRunner runner (OrderEntityRepository orderEntityRepository, PizzaSizeEntityRepository PizzaSizeEntityRepository, PizzaSizeEntityRepository pizzaSizeEntityRepository, PizzaStoreService pizzaStoreService){

        //return args -> System.out.println(orderEntityRepository.findAll().toString());
        return args ->{
            Logger logger = LoggerFactory.getLogger(Controller.class);

            logger.info(orderEntityRepository.findAll().toString());
            logger.info(String.valueOf(orderEntityRepository.findById(1)));
            logger.info(pizzaSizeEntityRepository.findSizesByName("Small").toString());
            logger.info(pizzaSizeEntityRepository.findFirstById(1).toString());
            logger.info(pizzaSizeEntityRepository.findFirstById(1).toString());
            pizzaStoreService.getAllOrders();
        };
    }
    //IoC -> create an object from CommandLineRunner Interface -> in order to do that, I need -> OrderEntityRepository object -> (What Spring is doing here is injecting OrderEntityRepository orderEntityRepository into the CommandLineRunner )

}
