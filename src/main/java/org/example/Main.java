package org.example;

import org.example.interfaces.NumberRangeSummarizer;
import org.example.interfacesImpl.NumberRangeSummarizerImpl;

import java.util.Collection;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        String input = "1 ,3 ,6, 7, 8, 12, 13, 14, 15, 21, 22, 23, 24, 31 , 32, 33";
        NumberRangeSummarizer numberRangeSummarizer = new NumberRangeSummarizerImpl();
        Collection<Integer> integers = numberRangeSummarizer.collect(input);
        String summerizedString = numberRangeSummarizer.summarizedCollection(integers);
        System.out.println(summerizedString);

    }
}