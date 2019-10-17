////////////////////////
// TITLE: Test
// AUTHOR: lego
// DATE: 2019-10-17
// PURPOSE: 
////////////////////////
package learningHeadFirstJava.flashCard;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("hello");
        arrayList.add("my");
        arrayList.add("name");
        arrayList.add("is");
        arrayList.add("Russell");

        for (int i=0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
            System.out.println(i);
        }

        System.out.println(arrayList.size());
    }
}
