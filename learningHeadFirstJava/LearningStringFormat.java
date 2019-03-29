public class LearningStringFormat {
    Double myTestScore = new Double(1000000);

    public Double getMyTestScore(){
        return myTestScore;
    }

    public static void main(String [] args) {
        LearningStringFormat myLearningStringFormat = new LearningStringFormat();
        double score = myLearningStringFormat.getMyTestScore();
        System.out.println("Printing out the score in different formats");
        System.out.println("Score as a string");
        String scoreString = Double.toString(score);
        System.out.println(scoreString);

        System.out.println("Score with commas");
        String myFormattedString = String.format("%,.0f", score);
        System.out.println(myFormattedString);

        System.out.println(String.format("I have %.2f, bugs to fix.", 476578.09876));
    }
}
