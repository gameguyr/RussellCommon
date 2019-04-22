package learningHeadFirstJava;/*
########################
# TITLE: DotComBustTestDrive
# AUTHOR: lego
# DATE:  2018-03-27
# PURPOSE: This purpose is to test the methods within DotComBust
########################
*/

public class DotComBustTestDrive {

    public static void main(String[] args) {
        DotComBust dotComBust = new DotComBust();
        dotComBust.setUpGame();

        int numberOfDotComs = dotComBust.getDotComArrayList().size();
        if (numberOfDotComs == 3) {
            System.out.println("The test passed");
        } else {
            System.out.println("The test failed");
        }


    }
}
