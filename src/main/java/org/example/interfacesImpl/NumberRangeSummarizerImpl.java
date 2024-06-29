package org.example.interfacesImpl;

import org.example.interfaces.NumberRangeSummarizer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class NumberRangeSummarizerImpl implements NumberRangeSummarizer {

    //Sample input "1,3 6, 7, 8, 12, 13, 14, 15, 21, 22, 23, 24, 31"
    //Sample output "1, 3, 6-8, 12-15, 21-24, 31"

    @Override
    public Collection<Integer> collect(String input) {

        //Convert the string into array of strings
        String[] tempArray = input.split(",");
        //initialising the list that will hold the integers
        List<Integer> inputList= new ArrayList<>();

        for (int i=0; i< tempArray.length; i++){
            inputList.add(Integer.parseInt(tempArray[i]));
        }
        return inputList;
    }

    @Override
    public String summarizedCollection(Collection<Integer> input) {
        return "";
    }
}
