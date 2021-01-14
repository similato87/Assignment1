package com.demo.dao;

import com.demo.model.Buyer;


import java.util.HashSet;
import java.util.Set;

public class BuyerDao {

    //Use a static collection of buyers in the DAO layer to replace the data in the database
    static Set<Buyer> Buyers = new HashSet<>();

    //Return the buyer set
    public static Set<Buyer> getBuyers() {
        return Buyers;
    }

    //Add the initialized data as required by the problem
    public static void init() {

        //Add the instantiated buyers to the set.
        Buyers.add(new Buyer());
        Buyers.add(new Buyer(10));
        Buyers.add(new Buyer(1000));


    }
}
