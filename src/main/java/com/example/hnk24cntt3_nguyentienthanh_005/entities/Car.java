package com.example.hnk24cntt3_nguyentienthanh_005.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.web.bind.annotation.ModelAttribute;

@Entity
public class Car {
    @Id
    private Long id1;
    public long id;
    public String model;
    public String brand;
    public float price;
    public String status;
    public Car() {
    }

    public Car(long id, String model, String brand, float price, String status) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.price = price;
        this.status = status;
    }

    public Car(String model, String brand, float price, String status) {
        this.model = model;
        this.brand = brand;
        this.price = price;
        this.status = status;
    }

    public Car(String brand, float price, String status) {
        this.brand = brand;
        this.price = price;
        this.status = status;
    }

    public Car(float price, String status) {
        this.price = price;
        this.status = status;
    }

    public Car(String status){
        this.status = status;
    }
}
