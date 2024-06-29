package org.example.interfacesImpl;

import org.example.interfaces.NumberRangeSummarizer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

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
        inputList.sort(Integer::compareTo);
        return inputList;
    }


    @Override
    public String summarizedCollection(Collection<Integer> input) {
        StringBuilder summarizedString = new StringBuilder();
        if(input == null || input.isEmpty()){
            return "";
        }

        else {
            List<Integer> inputList = new ArrayList<>(input);


            //for tracking minimum of the rage
            int beginning  = inputList.get(0);
            //for tracking maximum of the range
            int end = inputList.get(0);

            for(int i=1; i<inputList.size(); i++){
                //candidate maximum tracking
                int currentNumber = inputList.get(i);
                if(currentNumber - 1 == end){
                    end = currentNumber;
                }else{
                    //sequence does not continue so save current range
                    rangeMaker(summarizedString, beginning,end);
                    //updating beginning and end to for new range
                    beginning = currentNumber;
                    end = currentNumber;
                }
            }
        }
        return summarizedString.toString();
    }

    private void rangeMaker(StringBuilder summarizedString, int beginning, int end) {

        if(summarizedString.length()>0){
            summarizedString.append(", ");
        }

        if(beginning == end){
            summarizedString.append(beginning);
        }

        else{
            summarizedString.append(beginning).append("-").append(end);
        }
    }
}
