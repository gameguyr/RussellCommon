/*
########################
# TITLE: DotComBust
# AUTHOR: lego
# DATE:  2018-03-26
# PURPOSE:
Goal: Sink all of the computer’s Dot Coms in the fewest number of guesses.
You’re given a rating level based on how well you perform.

Setup: When the game program is launched, the computer places three Dot Coms, randomly, on the virtual 7 x 7 grid.
When that’s complete, the game asks for your first guess.

How you play: We haven’t learned to build a GUI yet, so this version works at the command-line.
The computer will prompt you to enter a guess (a cell), which you’ll type at the command-line (as “A3”, “C5”, etc.).
In response to your guess, you’ll see a result at the command-line, either “hit”, “miss”, or “You sunk Pets.com”
(or whatever the lucky Dot Com of the day is). When you’ve sent all three Dot Coms to that big 404 in the sky,
the game ends by printing out your rating.
########################
*/

import java.util.ArrayList;

public class DotComBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComArrayList = new ArrayList<>();
    private int numberOfGuesses = 0;

    public ArrayList<DotCom> getDotComArrayList() {
        return dotComArrayList;
    }

    public void setUpGame(){
        DotCom one = new DotCom();
        one.setName("Yahoo.com");
        dotComArrayList.add(one);

        DotCom two = new DotCom();
        two.setName("Ask.com");
        dotComArrayList.add(two);

        DotCom three = new DotCom();
        three.setName("RocketFuel.com");
        dotComArrayList.add(three);

        for (DotCom dotComToSet : dotComArrayList) {
            ArrayList<String> locationCells = helper.placeDotCom(3);
            dotComToSet.setLocationCells(locationCells);
        }

        System.out.println("You're goal is to sink three dot coms.");
        System.out.println(one.getName() + ", " + two.getName() + ", and " + three.getName());
        System.out.println("Try to sink them all with the fewest amount of guesses.");

    }

    private void startPlaying() {
        while (!dotComArrayList.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess ");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numberOfGuesses++;

        String result = "miss";

        for (DotCom dotComToTest :dotComArrayList) {
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                dotComArrayList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);

    }

    private void finishGame() {
        System.out.println("All dot Coms are dead! Your stock is now worthless");
        if ( numberOfGuesses <= 18) {
            System.out.println("It only took you " + numberOfGuesses + " guesses.");
            System.out.println("You got out before your options sank.");
        } else {
            System.out.println("Took you long enough. " + numberOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options");
        }
    }

    public static void main (String[] args ) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }

}
