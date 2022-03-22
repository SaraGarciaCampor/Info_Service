package org.sara.infoservice.service;

import lombok.extern.slf4j.Slf4j;
import org.sara.infoservice.entities.Car;
import org.sara.infoservice.repositories.CarRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class CarService {
    private final CarRepository repository;

    public CarService(CarRepository repository) {
        this.repository = repository;
    }

    public Optional<Car> getCar(final Integer id) {
        return repository.findById(id);
    }
}
