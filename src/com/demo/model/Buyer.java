package com.demo.model;

import com.demo.service.BuyerService;

public class Buyer {
    private int userId;
    private String status;

    //constructor without arguments
    public Buyer() {
        this.userId = 0;
        this.status = "NONMEMBER";
    }

    //constructor with a required argument
    public Buyer(int userId) {
        this.userId = userId;
        this.status = checkStatus(userId);
    }

    //Getters
    public int getUserId() {
        return userId;
    }

    public String getStatus() {
        return status;
    }

    //Invoke the inspection service in the service layer
    private String checkStatus(int userId) {
        return BuyerService.checkUserStatus(userId);


    }

}
