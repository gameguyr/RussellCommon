package learningHeadFirstJava.dotComGame;/*
########################
# TITLE: SimpleDotComTestDrive
# AUTHOR: lego
# DATE:  2018-02-22
# PURPOSE: to test the SimpleDotCom class and its features
########################
*/


public class SimpleDotComTestDrive {

    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);

        if (result.equals("hit")) {
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }

    }
}
