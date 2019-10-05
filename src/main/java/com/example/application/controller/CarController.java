package com.example.application.controller;

import com.example.application.model.Car;
import com.example.application.model.Color;
import com.example.application.model.Engine;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@RestController
public class CarController {

    private Map<Long, Car> cars;

    @PostConstruct
    public void init(){
        cars = new HashMap<>();

        Engine engine1 = new Engine("Ecotec 2.0", 172, 2000);
        Engine engine2 = new Engine("Ecoboost 1.5", 150, 1499);

        cars.put(111L, new Car("Opel", "Corsa", 2018, Color.BLUE, engine1));
        cars.put(222L, new Car("Ford", "Fiesta", 2018, null, engine2));
        cars.put(333L, new Car("Fiat", "Punto", 2017, Color.BLACK, null));
    }

    @GetMapping("/car/{serialNumber}")
    public Car getCarInfo(@PathVariable long serialNumber){
        if (cars.containsKey(serialNumber)){
            return cars.get(serialNumber);
        }
        return null;
    }

    @PostMapping("/addCar/{serialNumber}")
    public boolean addCar(@PathVariable long serialNumber, @RequestBody Car newCar){

        if (!cars.containsKey(serialNumber)){
            cars.put(serialNumber, newCar);
            return true;
        }
        return false;
    }
}
