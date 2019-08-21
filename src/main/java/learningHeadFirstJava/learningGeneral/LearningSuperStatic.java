package learningHeadFirstJava.learningGeneral;
// to see what instances variables abd what constructors
// run and in what order

class LearningStaticSuper{


    static {
        System.out.println("super static block");
    }


    LearningStaticSuper(){
        System.out.println("super constructor");
    }
}