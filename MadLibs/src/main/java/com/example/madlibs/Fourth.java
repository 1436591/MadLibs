package com.example.madlibs;

import java.util.Arrays;
import java.util.List;

public class Fourth implements MadLib {
    private final List<String> prompts;

    public Fourth() {
        prompts = Arrays.asList(
                "Enter an adjective: ",
                "Enter an adjective: ",
                "Enter a noun: ",
                "Enter an adjective (try a number!): ",
                "Enter a noun: ",
                "Enter a noun: ",
                "Enter a verb: ",
                "Enter a noun (maybe a color?): ",
                "Enter a noun (animal): ",
                "Enter an adjective: "
        );
    }

    public List<String> getPrompts() {
        return prompts;
    }

    @Override
    public String generateMadLib(List<String> userInputs) {
        String adj1 = userInputs.get(0);
        String adj2 = userInputs.get(1);
        String noun1 = userInputs.get(2);
        String adj3 = userInputs.get(3);
        String noun2 = userInputs.get(4);
        String noun3 = userInputs.get(5);
        String verb1 = userInputs.get(6);
        String noun4 = userInputs.get(7);
        String noun5 = userInputs.get(8);
        String adj4 = userInputs.get(9);

        return String.format("""
        On the %s morning of the 4th of July, we decided to throw the %s party of the century. We packed a %s and %s hot dogs.\s
        As we arrived at the park, we realized we had forgotten to bring a %s, so we had to improvise with a %s.\s
        Everyone started %s, and before long, the sky turned %s with fireworks. Suddenly, a %s ran by and scared everyone, causing a panic.\s
        People were running in all directions, while someone yelled, "get the %s!" By the end of the night, we were all feeling %s but happy we survived the most %s 4th of July ever!
       \s""", adj1, adj2, noun1, adj3, noun2, noun3, verb1, noun4, noun5, noun5, adj4, adj1);
    }
}
