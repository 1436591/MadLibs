package com.example.madlibs;

import java.util.Arrays;
import java.util.List;

public class Halloween implements MadLib {

    private final List<String> prompts;

    public Halloween() {
        prompts = Arrays.asList(
                "Enter an adjective: ",
                "Enter a noun: ",
                "Enter an adjective: ",
                "Enter a noun (plural): ",
                "Enter a verb: ",
                "Enter a verb ending with -ing: ",
                "Enter a noun: ",
                "Enter a body part: ",
                "Enter a noun ending with -ing: ",
                "Enter an adjective: "
        );
    }

    public List<String> getPrompts() {
        return prompts;
    }

    @Override
    public String generateMadLib(List<String> userInputs) {
        String adj1 = userInputs.get(0);
        String noun1 = userInputs.get(1);
        String adj2 = userInputs.get(2);
        String pluralNoun = userInputs.get(3);
        String verb1 = userInputs.get(4);
        String verbIng = userInputs.get(5);
        String noun2 = userInputs.get(6);
        String bodyPart = userInputs.get(7);
        String nounIng = userInputs.get(8);
        String adj3 = userInputs.get(9);

        return String.format("""
        It was a %s Halloween night. The %s was shining in the sky. The air was filled with %s %s.\s
        Kids were %s and %s down the streets, dressed in %s costumes.\s
        As I walked through the neighborhood, I couldn't shake the feeling that someone was watching me.
        Suddenly, I felt a tap on my %s. Turning around, I saw a %s %s.
        It was the most %s Halloween I have ever experienced!
       \s""", adj1, noun1, adj2, pluralNoun, verb1, verbIng, noun2, bodyPart, nounIng, nounIng, adj3);
    }
}