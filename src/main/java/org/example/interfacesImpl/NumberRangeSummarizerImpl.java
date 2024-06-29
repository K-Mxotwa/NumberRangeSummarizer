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
        if(input != ""){
            for (int i=0; i< tempArray.length; i++){
                inputList.add(Integer.parseInt(tempArray[i].trim()));
            }
            inputList.sort(Integer::compareTo);
        }
        return inputList;
    }


    @Override
    public String summarizedCollection(Collection<Integer> input) {

        //for building summarized ranges
        StringBuilder summarizedString = new StringBuilder();
        //for tracking minimum of the rage
        int beginning;
        //for tracking maximum of the range
        int end;
        //check the base case
        if(input == null || input.isEmpty()){
            return "";
        }

        else {
            List<Integer> inputList = new ArrayList<>(input);
            beginning  = inputList.get(0);
            end = inputList.get(0);

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
        //appending the last range
        rangeMaker(summarizedString, beginning,end);
        return summarizedString.toString();
    }

    private void rangeMaker(StringBuilder summarizedString, int beginning, int end) {

        //checking if there is range that is already recorded
        if(summarizedString.length()>0){
            summarizedString.append(", ");
        }

        //saving single value rage
        if(beginning == end){
            summarizedString.append(beginning);
        }

        else{
            //saving multiple value range
            summarizedString.append(beginning).append(" - ").append(end);
        }
    }
}
