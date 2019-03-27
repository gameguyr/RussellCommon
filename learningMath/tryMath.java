import java.lang.Math;
public class tryMath {


    public static void main(String[] args) {
        double b = 143.323;
        long a = Math.round(b);
        System.out.println("Trying to round number:" + b);
        System.out.println(a);

        int c = 64;
        int d = 72;
        System.out.println("Trying to get the min of : " + c + " and : " + d);
        System.out.println(Math.min(c, d));
    }
}
