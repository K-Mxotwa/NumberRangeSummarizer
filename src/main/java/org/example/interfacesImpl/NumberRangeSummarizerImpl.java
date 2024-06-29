package org.example.interfacesImpl;

import org.example.interfaces.NumberRangeSummarizer;

import java.util.Collection;
import java.util.List;

public class NumberRangeSummarizerImpl implements NumberRangeSummarizer {
    @Override
    public Collection<Integer> collect(String input) {
        return List.of();
    }

    @Override
    public String summarizedCollection(Collection<Integer> input) {
        return "";
    }
}
