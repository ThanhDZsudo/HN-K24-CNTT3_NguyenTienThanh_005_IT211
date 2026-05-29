package com.example.hnk24cntt3_nguyentienthanh_005.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.web.bind.annotation.ModelAttribute;

@Entity
public class CarDto {
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}
