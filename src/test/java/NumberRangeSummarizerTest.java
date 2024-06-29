import org.example.interfaces.NumberRangeSummarizer;
import org.example.interfacesImpl.NumberRangeSummarizerImpl;

import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class NumberRangeSummarizerTest {

    //private String input = "1,3 ,6, 7, 8, 12, 13, 14, 15, 21, 22, 23, 24, 31";
    private NumberRangeSummarizer numberRangeSummarizer;
    public void creation(){
        numberRangeSummarizer = new NumberRangeSummarizerImpl();
    }

    public void testEmptyInput(){
        String input = "";
        Collection<Integer> integers = numberRangeSummarizer.collect(input);
        String summerizedString = numberRangeSummarizer.summarizedCollection(integers);
        assertEquals("", summerizedString);

    }

    public void testSingleValueInput(){
        String input = "13";
        Collection<Integer> integers = numberRangeSummarizer.collect(input);
        String summerizedString = numberRangeSummarizer.summarizedCollection(integers);
        assertEquals("13", summerizedString);

    }

    public void testMultiplePositiveUnsortedValuesInput(){
        String input = "77, 76, 1, 3, 6, 7, 8, 12, 13, 14, 15, 21, 22, 23, 24, 31";
        Collection<Integer> integers = numberRangeSummarizer.collect(input);
        String summerizedString = numberRangeSummarizer.summarizedCollection(integers);
        assertEquals("13", summerizedString); //change with real expected results
    }

    public void testMultipleNegetivePositiveUnsortedValuesInput(){
        String input = "1 ,3 ,6, 7, 8, -12, -13, -14, 15, 21, 22, 23, 24, 31";
        Collection<Integer> integers = numberRangeSummarizer.collect(input);
        String summerizedString = numberRangeSummarizer.summarizedCollection(integers);
        assertEquals("13", summerizedString); //change with real expected results
    }

    public void testNegetiveUnsortedValuesInput(){
        String input = "-42, -1 ,-3 ,-6, -7, -8, -12, -13, -14, -15, -21, -22, -23, -24, -31";
        Collection<Integer> integers = numberRangeSummarizer.collect(input);
        String summerizedString = numberRangeSummarizer.summarizedCollection(integers);
        assertEquals("13", summerizedString);//change with real expected results
    }
}
