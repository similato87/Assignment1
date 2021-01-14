/*
Results of the run:

userId:1000
status:ACTIVEMEMBER
----------------------
userId:10
status:INACTIVEMEMBER
----------------------
userId:0
status:NONMEMBER
----------------------

Process finished with exit code 0

*/

package com.demo.controller;

import com.demo.service.BuyerService;

import java.lang.reflect.InvocationTargetException;

public class BuyerController {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        //Initialize the buyer service
        BuyerService.init();

        //print all the goods
        BuyerService.printAllBuyers();
    }
}
