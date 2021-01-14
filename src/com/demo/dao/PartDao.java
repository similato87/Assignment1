package com.demo.dao;

import com.demo.model.Part;

import java.util.HashSet;
import java.util.Set;

public class PartDao {

    //Use a static collection of goods in the DAO layer to replace the data in the database
    static Set<Part> parts = new HashSet<>();

    //Return the goods set
    public static Set<Part> getParts() {
        return parts;
    }

    //Add the initialized data as required by the problem
    public static void createDefaultList() {


        //Add the instantiated goods to the set.
        parts.add(new Part("GSM_digital_hand-held_radiotelephone_sets", "1FBACF3FC", 498.65));
        parts.add(new Part("Electronic_equipment_for_sound_processing_and_transmission", "1FBBAB7CD", 128.54));
        parts.add(new Part("Components_of_other_automatic_data_processing_equipment", "1F8FB68C1", 987.65));

    }

}
