package com.example.hnk24cntt3_nguyentienthanh_005.service;

import com.example.hnk24cntt3_nguyentienthanh_005.entities.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    List<Car> cars;
    public List<Car> getCars() {
        return cars;
    }
    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
    public CarService() {
        cars = new ArrayList<>();
    }
    public CarService(List<Car> cars) {
        this.cars = cars;
    }
    public CarService(Long id, List<Car> cars) {
    }
}
