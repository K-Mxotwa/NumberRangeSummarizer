import org.example.interfaces.NumberRangeSummarizer;
import org.example.interfacesImpl.NumberRangeSummarizerImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class NumberRangeSummarizerTest {

    //private String input = "1,3 ,6, 7, 8, 12, 13, 14, 15, 21, 22, 23, 24, 31";
    private NumberRangeSummarizer numberRangeSummarizer;

    @Before
    public void creation(){
        numberRangeSummarizer = new NumberRangeSummarizerImpl();
    }

    @Test
    public void testEmptyInput(){
        String input = "";
        Collection<Integer> integers = numberRangeSummarizer.collect(input);
        String summerizedString = numberRangeSummarizer.summarizedCollection(integers);
        assertEquals("", summerizedString);

    }

    @Test
    public void testSingleValueInput(){
        String input = "13";
        Collection<Integer> integers = numberRangeSummarizer.collect(input);
        String summerizedString = numberRangeSummarizer.summarizedCollection(integers);
        assertEquals("13", summerizedString);

    }

    @Test
    public void testMultiplePositiveUnsortedValuesInput(){
        String input = "77, 76, 1, 3, 6, 7, 8, 12, 13, 14, 15, 21, 22, 23, 24, 31";
        Collection<Integer> integers = numberRangeSummarizer.collect(input);
        String summerizedString = numberRangeSummarizer.summarizedCollection(integers);
        assertEquals("1, 3, 6 - 8, 12 - 15, 21 - 24, 31, 76 - 77", summerizedString);
    }

    @Test
    public void testMultipleNegetivePositiveUnsortedValuesInput(){
        String input = "1 ,3 ,6, 7, 8, -12, -13, -14, 15, 21, 22, 23, 24, 31";
        Collection<Integer> integers = numberRangeSummarizer.collect(input);
        String summerizedString = numberRangeSummarizer.summarizedCollection(integers);
        assertEquals("-14 - -12, 1, 3, 6 - 8, 15, 21 - 24, 31", summerizedString);
    }

    @Test
    public void testNegetiveUnsortedValuesInput(){
        String input = "-42, -1 ,-3 ,-6, -7, -8, -12, -13, -14, -15, -21, -22, -23, -24, -31";
        Collection<Integer> integers = numberRangeSummarizer.collect(input);
        String summerizedString = numberRangeSummarizer.summarizedCollection(integers);
        assertEquals("-42, -31, -24 - -21, -15 - -12, -8 - -6, -3, -1", summerizedString);
    }
}
