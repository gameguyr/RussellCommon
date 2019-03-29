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

        System.out.println("Trying out random numbers");
        double randomNumber1 = Math.random();
        double randomNumber2 = Math.random();
        double randomNumber3 = Math.random();
        double randomNumber4 = Math.random();

        System.out.println(randomNumber1);
        System.out.println(randomNumber2);
        System.out.println(randomNumber3);
        System.out.println(randomNumber4);

        System.out.println("Trying to round random numbers");
        Long roundedRandomNumber1 = Math.round(Math.random()); // this one is wrapped in the Long wrapper class
        long roundedRandomNumber2 = Math.round(Math.random());
        long roundedRandomNumber3 = Math.round(Math.random());
        long roundedRandomNumber4 = Math.round(Math.random());

        System.out.println(roundedRandomNumber1.longValue()); // this is how to get the value from the wrapper class
        System.out.println(roundedRandomNumber2);
        System.out.println(roundedRandomNumber3);
        System.out.println(roundedRandomNumber4);

        System.out.println("Trying to round random numbers with casting and * 10");
        Integer castedRandomNumber1 = (int) (Math.random() * 10);
        int castedRandomNumber2 = (int) (Math.random() * 10);
        int castedRandomNumber3 = (int) (Math.random() * 10);
        int castedRandomNumber4 = (int) (Math.random() * 10);

        System.out.println(castedRandomNumber1.intValue());
        System.out.println(castedRandomNumber2);
        System.out.println(castedRandomNumber3);
        System.out.println(castedRandomNumber4);
    }


}
