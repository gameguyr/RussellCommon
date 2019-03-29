public class LearningStaticSuperTests extends LearningStaticSuper {
    static int rand;


    static {
        rand = (int) (Math.random() * 6);
        System.out.println("static block " + rand);
    }



    LearningStaticSuperTests() {
        System.out.println("constructor");
    }


    public static void main(String [] args) {
        System.out.println("in main");
        LearningStaticSuperTests st = new LearningStaticSuperTests();

        // We can see that the static vaiables get instantiated when the class is loaded.
        // The first class that tries to get loaded is LearningStaticSuperTests but before that its
        // super class LearningStaticSuper needs to get loaded.   So the JVM loads this...
        // LearningStaticSuper
        // and creates its static variables then it can load this
        // LearningStaticSuperTests
        // and create its static variables
        // once the classes are loaded we can proceed to execute the main() method
        // which prints this "in main"
        // then in main() it will instantiate a LearningStaticSuperTests object
        // which needs to run the super constructor first before it can construct itself.
        // That is why the printing out happens in that way.


    }
}