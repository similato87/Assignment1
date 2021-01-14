package com.demo.service;

import com.demo.dao.BuyerDao;
import com.demo.model.Buyer;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;


public class BuyerService {

    //Initialize the Buyers
    public static void init() {
        BuyerDao.init();
    }

    //Get all buyers from the DAO layer
    public static Set<Buyer> getAllBuyers() {
        return BuyerDao.getBuyers();
    }

    //Print all attributes and parameters of all Buyers
    public static void printAllBuyers() throws InvocationTargetException, IllegalAccessException {

        //For-Each
        for (Buyer b : getAllBuyers()) {

            //Get all the member variables of the Buyer class
            Field[] bmemberVariables = b.getClass().getDeclaredFields();

            //Get all the methods of the Buyer class
            Method[] bmethod = b.getClass().getMethods();


            //Use loop to print the member variable name and calls the methods
            for (int i = 0; i < bmemberVariables.length; i++) {
                System.out.println(bmemberVariables[i].getName() + ":" + bmethod[i].invoke(b));

            }

            //Add a gorgeous dividing line
            System.out.println("----------------------");

        }
    }

    public static String checkUserStatus(int userId) {
        if (userId == 0) return "NONMEMBER";
        else if (userId < 100) return "INACTIVEMEMBER";
        else return "ACTIVEMEMBER";
    }


}
