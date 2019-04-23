package learningMath;
////////////////////////
// TITLE: LearningRandom
// AUTHOR: russell lego
// DATE: 2019-04-22
// PURPOSE: to understand how to work with
////////////////////////

public class LearningRandom {

    public static void main(String[] args) {

        //number that you want to shift the random domain to
        int shiftNumber = 10;
        System.out.println( returnRandomInt(shiftNumber) );
        System.out.println( returnRandomInt(shiftNumber) );
        System.out.println( returnRandomInt(shiftNumber) );
        System.out.println( returnRandomInt(shiftNumber) );
        System.out.println( returnRandomInt(shiftNumber) );
        System.out.println( returnRandomInt(shiftNumber) );

    }

    public static String returnRandomInt(int shiftNumber) {
        String myString = "" + Math.random() * shiftNumber;
        return myString;
    }

}
