package com.example.madlibs;

import java.util.Arrays;
import java.util.List;

public class Thanksgiving implements MadLib {

    private final List<String> prompts;

    public Thanksgiving() {
        prompts = Arrays.asList(
                "Enter a noun: ",
                "Enter an adjective: ",
                "Enter a noun (animal): ",
                "Enter a verb (present tense): ",
                "Enter a verb (past tense): ",
                "Enter a noun (plural): ",
                "Enter a noun (food): ",
                "Enter a verb ending with -ing: ",
                "Enter an adjective: ",
                "Enter a noun (natural feature): "
        );
    }

    public List<String> getPrompts() {
        return prompts;
    }

    @Override
    public String generateMadLib(List<String> userInputs) {
        if (userInputs.size() != prompts.size()) {
            return "Error: Insufficient data to generate the story.";
        }

        String noun1 = userInputs.get(0);
        String adjective1 = userInputs.get(1);
        String animal1 = userInputs.get(2);
        String verbPresent = userInputs.get(3);
        String verbPast = userInputs.get(4);
        String pluralNoun = userInputs.get(5);
        String food = userInputs.get(6);
        String verbIng = userInputs.get(7);
        String adjective2 = userInputs.get(8);
        String naturalFeature = userInputs.get(9);

        return String.format("""
        Last Thanksgiving, we celebrated with a large %s. The day was filled with %s activities.\s
        We saw a %s %s in the backyard, which made everyone %s.\s
        After we ate our dinner, we sat down to enjoy some classic %s.\s
        The best part was the delicious %s that my grandmother made.\s
        Everyone couldn't stop %s about how %s it was.\s
        As the sun set behind the %s, we all felt thankful for another wonderful Thanksgiving.
       \s""", noun1, adjective1, animal1, verbPresent, verbPast, pluralNoun, food, verbIng, adjective2, naturalFeature);
    }
}