/*
########################
# TITLE: ArrayListPlay
# AUTHOR: lego
# DATE:  2018-03-26
# PURPOSE:Just to fool around and see methods of String[] and ArrayList<String>
########################
*/

public class ArrayListPlay {
    public static void main(String[] args){
        String a = new String("Oh fuck yes!");
        String b = new String("Oh hell no!");

        String[] myStringArray = new String[2];

        myStringArray[1] = a;
        myStringArray[0] = b;
        int theLength = (int) myStringArray.length;


    }
}
