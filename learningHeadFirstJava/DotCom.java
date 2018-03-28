/*
########################
# TITLE: DotCom
# AUTHOR: lego
# DATE:  2018-03-26
# PURPOSE:

########################
*/

import java.util.ArrayList;


public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public void setName(String inputName) {
        name = inputName;
    }
    public String getName() {
        return name;
    }

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
//        System.out.println(result);
        return result;
    }

}