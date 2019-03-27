
// the purpose of this class is to see that static methods cannot access
// non-static instance variables.
public class learningStaticDuck {
    private static int size;
    private static int duckCount = 0;

    public learningStaticDuck() {
        duckCount++;
    }



    public static void main (String [] args) {
        System.out.println("The size is: " + getSize());
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static int getSize() {
        return size;
    }

}
