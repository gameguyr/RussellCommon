//import main.SixthFileReader;
import LearningFileReaders.firstRound.SixthFileReader;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by lego on 6/23/17.
 */


public class MainTest {
    private static String filePath1 = "/Users/lego/git/RussellCommon/first_directory/dataDirectory/testRansomNote.txt";
    private static String filePath2 = "/Users/lego/git/RussellCommon/first_directory/dataDirectory/sampleFromToKillAMockingBird.txt";
    @Test
    public void testReturnStringArray() throws IOException {
        SixthFileReader sixthFileReader = new SixthFileReader();
        boolean isSuccess = sixthFileReader.areWordsFound(filePath1, filePath2);
        Assert.assertTrue(isSuccess);




    }
}
