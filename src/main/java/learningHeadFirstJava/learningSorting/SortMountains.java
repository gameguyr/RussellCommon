////////////////////////
// TITLE: SortMountains
// AUTHOR: lego
// DATE: 2019-11-04
// PURPOSE: 
////////////////////////
package learningHeadFirstJava.learningSorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SortMountains {

    LinkedList<Mountain> mountains = new LinkedList<>();



    public static void main(String[] args){
        new SortMountains().go();

    }

    public void go(){
        mountains.add(new Mountain("Longs", 14255));
        mountains.add(new Mountain("Elbert", 14433));
        mountains.add(new Mountain("Maroon", 14156));
        mountains.add(new Mountain("Castle", 14265));

        System.out.println("as entered: \n" + mountains);

        Collections.sort(mountains, new NameCompare());
        System.out.println("by name: \n" + mountains);

        Collections.sort(mountains, new HeightCompare());
        System.out.println("by height: \n" + mountains);


    }

    class NameCompare implements Comparator<Mountain> {
        public int compare(Mountain mountainOne, Mountain mountainTwo) {
            return mountainOne.getName().compareTo(mountainTwo.getName());
        }
    }

    class HeightCompare implements Comparator<Mountain> {
        public int compare(Mountain mountainOne, Mountain mountainTwo) {
            return (mountainTwo.height - mountainOne.height);

            }
        }
    }

    class Mountain {
        String name;
        int height;

        Mountain(String input_name, int input_height) {
            name = input_name;
            height = input_height;
        }

        public String getName() {return name;}

        public int getHeight(){return height;}

        public String toString(){
            return name + " " + height;
        }


    }




