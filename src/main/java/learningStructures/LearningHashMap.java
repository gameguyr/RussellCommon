////////////////////////
// TITLE: LearningHashMap
// AUTHOR: lego
// DATE: 2019-10-02
// PURPOSE: 
////////////////////////
package learningStructures;

import java.util.HashMap;

public class LearningHashMap {
    HashMap hashMap = new HashMap<String, Integer>();
    String firstKey = "FIRST_KEY";
    String secondKey = "SECOND_KEY";
    int firstKeyInitialization = 1;
    int secondKeyInitialization = 1;

    int firstKeyUpdate = 68;
    int secondKeyKeyUpdate = 68;

    public static void main(String[] args) {
        LearningHashMap learningHashMap = new LearningHashMap();
        learningHashMap.initializeHashMap(learningHashMap.firstKeyInitialization, learningHashMap.secondKeyInitialization);
        System.out.println("This is initialization");
        System.out.println(learningHashMap.hashMap.toString());

        learningHashMap.updateHashMap(learningHashMap.firstKeyUpdate, learningHashMap.secondKeyKeyUpdate);
        System.out.println("This is update");
        System.out.println(learningHashMap.hashMap.toString());

        Integer together = (int) learningHashMap.hashMap.get("FIRST_KEY") + 10;
        System.out.println("This is together: " + together);

    }

    public void initializeHashMap(Integer firstKeyInitialization, Integer secondKeyInitialization) {
        hashMap.put(this.firstKey, firstKeyInitialization);
        hashMap.put(this.secondKey, secondKeyInitialization);
    }

    public void updateHashMap(Integer firstKeyUpdate, Integer secondKeyKeyUpdate) {
        hashMap.put(this.firstKey, firstKeyUpdate);
        hashMap.put(this.secondKey, secondKeyKeyUpdate);
    }

}
