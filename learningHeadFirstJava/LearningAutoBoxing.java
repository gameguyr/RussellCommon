public class LearningAutoBoxing {

    Integer i;
    int j;

    public static void main (String[] args) {
        LearningAutoBoxing t = new LearningAutoBoxing();
        t.go();
    }

    public void go() {
        j=i;
        System.out.println(j); // this throws null pointer exception
        System.out.println(i);
    }
}