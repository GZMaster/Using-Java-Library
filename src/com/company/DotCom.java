package com.company;

import java.util.*;

public class DotCom {

    private String name;
    private ArrayList<String> locationCells;
    // private int num of hits;
    // dont need that now

    public void setName(String dotName){
        dotName = name;
    }

    public void setLocationCells(ArrayList<String> loc){

        locationCells = loc;

    }


    public String checkYourself(String userInput){

        String result = "miss";

        int index = locationCells.indexOf(userInput);
        if (index >= 0){
            locationCells.remove(index);

            if (locationCells.isEmpty()){
                result = "Kill";
                System.out.println("Ouch! You sunk " + name + "  :  ( ");
            }   else {
                result = "hit";
            }   // close if
        }   // close if

        return result;
    }   // close method


}   // close class
