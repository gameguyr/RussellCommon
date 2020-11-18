package learningStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class RussIterate {

public static void main(String[] args) {
    ArrayList<Integer> list = (ArrayList) IntStream.iterate(2, i->i+1);
    System.out.println(list);
}
}
