package learningHeadFirstJava;/*
########################
# TITLE: SimpleDotComGame
# AUTHOR: lego
# DATE:  2018-03-26
# PURPOSE:
########################
*/


import java.util.ArrayList;

public class SimpleDotComGame {

    public static void main(String[] args) {
        int numberOfGuesses = 0;

        GameHelper helper = new GameHelper();

//        SimpleDotCom theDotCom = new SimpleDotCom();
        SimpleDotComImproved theDotCom = new SimpleDotComImproved();
        Integer randomNumber = (int) (Math.random() *5 );


        ArrayList<String> locations = new ArrayList<>() ;

        locations.add(randomNumber.toString());
        locations.add(Integer.toString(randomNumber + 1));
        locations.add(Integer.toString(randomNumber + 2));

        theDotCom.setLocationCells(locations);

        boolean isAlive = true;


        while (isAlive == true) {
            String guess = helper.getUserInput("enter a number");

            String result = theDotCom.checkYourself(guess);

            numberOfGuesses++;

            if (result.equals("kill")){
                isAlive = false;
                System.out.println("You took " + numberOfGuesses + " guesses");

            }
        }
    }



}
