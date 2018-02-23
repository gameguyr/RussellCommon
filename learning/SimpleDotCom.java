/*
########################
# TITLE: SimpleDotCom
# AUTHOR: lego
# DATE:  2018-02-22
# PURPOSE: to build a simple battleship game where we try to guess which element in teh array
contains the ship.  We are calling the ships DotCom's
########################
*/

public class SimpleDotCom {
    private int[] locationCells;
    private int numberOfHits = 0;

    public void setLocationCells(int[] locations) {
        locationCells = locations;
    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "hit";
                numberOfHits++;
                break;
            }
        }
        if (numberOfHits == locationCells.length) {
            result = "kill";

        }
        System.out.println(result);
        return  result;
    }

}
