public class LearningStaticPlayerTestDrive {
    public static void main(String [] args) {
        System.out.println("Before any instances are made: " + LearningStaticPlayer.playerCount);
        LearningStaticPlayer playerOne = new LearningStaticPlayer("Tiger Woods");
//        LearningStaticPlayer playerTwo = new LearningStaticPlayer("Jordan Peterson");
        System.out.println("After an object is created: " + LearningStaticPlayer.playerCount);

//        System.out.println("playerOne: " + playerOne.playerCount);
//        System.out.println("playerTwo: " + playerTwo.playerCount);
    }
}