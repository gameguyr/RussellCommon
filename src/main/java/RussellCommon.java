public class RussellCommon {


    public static String secondsToMinutesAndSeconds(int numSeconds) {
        String minutesAndSeconds = "NUMBER_OF_MINUTES minutes NUMBER_OF_SECONDS seconds";
        int numberOfSecondsPerMinute = 60;
        int numberOfMinutes = numSeconds / numberOfSecondsPerMinute;
        int numberOfSeconds = numSeconds % numberOfSecondsPerMinute;
        minutesAndSeconds = minutesAndSeconds.replace("NUMBER_OF_MINUTES", Integer.toString(numberOfMinutes));
        minutesAndSeconds = minutesAndSeconds.replace("NUMBER_OF_SECONDS", Integer.toString(numberOfSeconds));
        return minutesAndSeconds;
    }

    public static int minutesAndSecondsToSeconds(int numMinutes, int numSeconds) {
        return (numMinutes * 60) + numSeconds;
    }

    /**
     * This method takes in an array of integers for both minutes and seconds and returns the total number of seconds
     * @param numMinutes an array of minutes
     * @param numSeconds an array of corresponding seconds
     * @return the total number of seconds
     * @throws Exception just an exception when the two arrays are not the same size
     */
    public static int minutesAndSecondsToSeconds(int[] numMinutes, int[] numSeconds) throws Exception {
        if (numMinutes.length != numSeconds.length) {
            throw new Exception("Arrays are not the same size");
        }
        int totalNumberSeconds = 0;
        for (int i=0; i < numMinutes.length; i++) {
            totalNumberSeconds += minutesAndSecondsToSeconds(numMinutes[i], numSeconds[i]);
        }
        return totalNumberSeconds;
    }

    public static void main(String[] args) {
        int[] numberOfMinutes = {1, 1, 1, 1};
        int[] numberOfSeconds = {23,28,18,34};
        try {
            int totalNumberOfSeconds = RussellCommon.minutesAndSecondsToSeconds(numberOfMinutes, numberOfSeconds);
            System.out.println(RussellCommon.secondsToMinutesAndSeconds(totalNumberOfSeconds));
        } catch (Exception exception) {
            System.out.println(exception);
        }

    }
}
