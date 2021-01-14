package com.demo.Controller;

/*
Results of the run:

description:GSM_digital_hand-held_radiotelephone_sets
code:1FBACF3FC
price:498.65
----------------------
description:Components_of_other_automatic_data_processing_equipment
code:1F8FB68C1
price:987.65
----------------------
description:Electronic_equipment_for_sound_processing_and_transmission
code:1FBBAB7CD
price:128.54
----------------------

Process finished with exit code 0

 */


import com.demo.Model.APOPart;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class APOController {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        //Create a set of goods
        Set<APOPart> goods = new HashSet<>();

        //Add the instantiated goods to the set.
        goods.add(new APOPart("GSM_digital_hand-held_radiotelephone_sets", "1FBACF3FC", 498.65));
        goods.add(new APOPart("Electronic_equipment_for_sound_processing_and_transmission", "1FBBAB7CD", 128.54));
        goods.add(new APOPart("Components_of_other_automatic_data_processing_equipment", "1F8FB68C1", 987.65));


        for (APOPart g : goods) {

            //Get all the member variables of the goods class
            Field[] memberVariables = g.getClass().getDeclaredFields();

            //Get all the methods of the goods class
            Method[] method = g.getClass().getMethods();

            //Use loop to print the member variable name and calls the method
            for (int i = 0; i < memberVariables.length; i++) {
                System.out.println(memberVariables[i].getName() + ":" + method[i].invoke(g));

            }

            //Add a gorgeous dividing line
            System.out.println("----------------------");

        }

    }
}
