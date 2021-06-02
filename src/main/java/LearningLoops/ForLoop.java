package LearningLoops;

import java.util.stream.IntStream;

public class ForLoop {
    int[] my_array = IntStream.range(1, 10).toArray();

//
    public static void main(String[] args) {
        ForLoop myForLoop = new ForLoop();
        for(int i=0; i < myForLoop.my_array.length; i++) {
            System.out.println(myForLoop.my_array[i]);
        }
    }
}



