package org.example.interfaces;

import java.util.Collection;
//Task implement this interface
public interface NumberRangeSummarizer {

    //collect inputs
    Collection<Integer> collect(String input);

    //get summarized string
    String summarizedCollection(Collection<Integer> input);
}
