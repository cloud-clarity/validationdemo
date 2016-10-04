package com.example;

import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class Shoe {

    private String type;

    @Min(3)
    @Max(75)
    private Integer size;

    public Shoe() {

    }

    public Shoe(String name, Integer size) {
        this.type = name;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
