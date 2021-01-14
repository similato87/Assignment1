package com.demo.Model;

public class APOPart {
    //Member variables
    private String description;
    private String code;
    private double price;

    //Constructor
    public APOPart(String description, String code, double price) {
        this.description = description;
        this.code = code;
        this.price = price;
    }

    //Methods
    public String getDescription() {
        return description;
    }

    public String getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }
}
