package learningHeadFirstJava.learningGeneral;

import java.util.ArrayList;

public class LearningArrayOfIntegers {


    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        myArray.add(1);
        myArray.add(1);
        myArray.add(1);

        System.out.printf("%d", myArray.get(1));
    }


}