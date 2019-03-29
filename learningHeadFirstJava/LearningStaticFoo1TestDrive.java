public class LearningStaticFoo1TestDrive {
    public static void main(String [] args){



        System.out.println("Before any instances are made: " + LearningStaticFoo1.x);
        LearningStaticFoo1 foo1 = new LearningStaticFoo1();
//        LearningStaticPlayer playerTwo = new LearningStaticPlayer("Jordan Peterson");
        System.out.println("After an object is created: ");
        foo1.go(23);
    }

}
