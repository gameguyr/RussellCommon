/*
########################
# TITLE: SimpleDotComImproved
# AUTHOR: lego
# DATE:  2018-03-26
# PURPOSE: This will be the same as the SimpleDotCom but using the ArrayList
########################
*/


import java.util.ArrayList;

public class SimpleDotComImproved {
    private ArrayList<String> locationCells;
//    private int numberOfHits = 0;

    public void setLocationCells(ArrayList<String> locations) {
        locationCells = locations;
    }

    public String checkYourself(String userInput) {

        String result = "miss";

        int index = locationCells.indexOf(userInput);

        if (index >= 0 ) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
                }


        }
        System.out.println(result);
        return result;
    }

}