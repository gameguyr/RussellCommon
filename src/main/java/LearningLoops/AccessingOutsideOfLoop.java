package LearningLoops;

public class AccessingOutsideOfLoop {

    public static void main(String[] args) {
        int[] partitions = {1, 2, 3, 4, 5, 6};
        boolean foundPartition = false;
        int testPartition = 4;
        int partitionToQuery = 0;
        int offsetToQuery;
        while (!foundPartition) {
            for (int partition: partitions) {
                if (partition == testPartition) {
                    foundPartition = true;
                    partitionToQuery = partition;
                }
            }
        }

        System.out.println(String.format("Here is your partition: %s", partitionToQuery));
    }
}
