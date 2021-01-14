package com.demo.service;

import com.demo.model.Part;
import com.demo.dao.PartDao;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;

public class PartService {

    //Initialize the goods
    public static void init() {
        PartDao.createDefaultList();
    }

    //Get all goods from the DAO layer
    public static Set<Part> getAllParts() {
        return PartDao.getParts();
    }

    //Print all attributes and parameters of all goods
    public static void printAllParts() throws InvocationTargetException, IllegalAccessException {

        //For-Each
        for (Part g : getAllParts()) {

            //Get all the member variables of the Part class
            Field[] gmemberVariables = g.getClass().getDeclaredFields();

            //Get all the methods of the Part class
            Method[] gmethod = g.getClass().getMethods();

            //Use loop to print the member variable name and calls the methods
            for (int i = 0; i < gmemberVariables.length; i++) {
                System.out.println(gmemberVariables[i].getName() + ":" + gmethod[i].invoke(g));

            }

            //Add a gorgeous dividing line
            System.out.println("----------------------");

        }
    }

}
