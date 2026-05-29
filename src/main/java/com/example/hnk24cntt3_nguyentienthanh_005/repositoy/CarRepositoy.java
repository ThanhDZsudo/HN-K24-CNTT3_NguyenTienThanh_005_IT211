package com.example.hnk24cntt3_nguyentienthanh_005.repositoy;

import com.example.hnk24cntt3_nguyentienthanh_005.entities.Car;
import org.springframework.stereotype.Repository;

@Repository
public class CarRepositoy {
    private Car car;
    public void setCar(Car car) {
        this.car = car;
    }
    public Car getCar() {
        return car;
    }
}
