package org.sara.infoservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.sara.infoservice.entities.Car;
import org.sara.infoservice.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/service/v1/car")
@ResponseBody
@Slf4j
public class CarController {
    @Autowired
    private CarService service;

    @GetMapping("/{carId}")
    public @ResponseBody Car getCar(@PathVariable Integer carId) {
        log.warn("Looking for car {}",carId);
        Car car = service.getCar(carId).orElseThrow(() -> {
            log.error("Car not found");
            return new ResponseStatusException(HttpStatus.NOT_FOUND, "Car not found");
        });
        log.info("Found car {}",car);
        return car;
    }

}
