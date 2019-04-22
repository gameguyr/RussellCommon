package LearningFileReaders;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.floor;
import static java.lang.Math.random;

/**
 * Created by lego on 6/23/17.
 */


public class MyPracticeClass {

    public static void main(String[] args) {
    }


    /**
     *
     The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
     * @param weekday true if day is a weekday, false if day is a weekend
     * @param vacation true is you're on vacation. fals eis not
     * @return true if you should sleep in and false if not
     */
    public static boolean sleepIn(boolean weekday, boolean vacation) {

        boolean value = false;

        if (weekday == true && vacation == true) {
            value = true;
        } else if (weekday == false && vacation == true) {
            value = true;
        } else if (weekday == true && vacation == false) {
            value = false;
        } else if (weekday == false && vacation == false) {
            value = true;
        }

        return value;

    }

    /**
     * This is the same function as above but it is the solution form online
     * @param weekday
     * @param vacation
     * @return
     */
    public boolean sleepInFromOnline(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }

        return false;

        // Solution notes: better to write "vacation" than "vacation == true"
        // though they mean exactly the same thing.
        // Likewise "!weekday" is better than "weekday == false".
        // This all can be shortened to: return (!weekday || vacation);
        // Here we just put the return-false last, or could use an if/else.
    }


    /**
     * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
     * We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
     * @param aSmile
     * @param bSmile
     * @return
     */
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ((aSmile && bSmile) || (!aSmile && !bSmile)) {
            return true;
        }
        return false;
    }

    public static boolean monkeyTroubleFromOnline(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        }
        if (!aSmile && !bSmile) {
            return true;
        }
        return false;
        // The above can be shortened to:
        //   return ((aSmile && bSmile) || (!aSmile && !bSmile));
        // Or this very short version (think about how this is the same as the above)
        //   return (aSmile == bSmile);
    }

    /**
     *Given two int values, return their sum. Unless the two values are the same, then return double their sum.
     * @param firstInput
     * @param secondInput
     * @return
     */
    public static int doubleSum(int firstInput, int secondInput) {
        if (firstInput == secondInput) {
            int value =  (firstInput + firstInput) * 2;
            return value;
        }
        int value =  firstInput + secondInput;
        return value;
    }

    public static int integerFunction(){
        int value = (int) floor(1 + 3 * random());
        return value;
    }

    public static double sierpinski(double inputValue, List<Double> vertexLocationArray) {
        int indexForChosenVertex = integerFunction() - 1;
        double chosenVertex = vertexLocationArray.get(indexForChosenVertex);
        double nextValue = (inputValue + chosenVertex) / 2;
        return nextValue;
    }


}


