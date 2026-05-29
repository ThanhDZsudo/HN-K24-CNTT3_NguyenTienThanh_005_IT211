package com.example.hnk24cntt3_nguyentienthanh_005.controller;

import com.example.hnk24cntt3_nguyentienthanh_005.entities.Car;
import jakarta.persistence.Column;
import jakarta.persistence.metamodel.StaticMetamodel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Service
@Repository

public class CarController {

    @GetMapping("/cars")
    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car());
        return cars;
    }

    @RequestMapping("/cars/{id}")
    public Car getCar(@PathVariable long id) {
        Car car = new Car();
        car.id = id;
        return car;
    }

    @DeleteMapping("/cars/{id}")
    public void deleteCar(@PathVariable long id) {
        Car car = new Car();
        car.id = id;
    }

    @Override
    public String toString() {
        return "CarController";
    }


}
