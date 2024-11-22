package com.example.madlibs;

import java.util.Arrays;
import java.util.List;

public class Easter implements MadLib {

    private final List<String> prompts;

    public Easter() {
        prompts = Arrays.asList(
                "Please enter a verb: ",
                "Please enter another verb: ",
                "Please enter a noun: ",
                "Please enter another noun: ",
                "Please enter an adjective: ",
                "Please enter a plural noun: ",
                "Please enter another verb: ",
                "Please enter another adjective: ",
                "Please enter a group of people: ",
                "Please enter another adjective: "
        );
    }

    public List<String> getPrompts() {
        return prompts;
    }

    @Override
    public String generateMadLib(List<String> userInputs) {
        String verb1 = userInputs.get(0);
        String verb2 = userInputs.get(1);
        String noun1 = userInputs.get(2);
        String noun2 = userInputs.get(3);
        String adjective1 = userInputs.get(4);
        String pluralNoun1 = userInputs.get(5);
        String verb3 = userInputs.get(6);
        String adjective2 = userInputs.get(7);
        String people = userInputs.get(8);
        String adjective3 = userInputs.get(9);

        return String.format("""
        This Easter, prepare to celebrate! We have a very special guest coming to town, the Easter Bunny!\s
        The Easter Bunny’s job is to %s across the globe and %s joy and holiday to all.
        He will leave you with a %s full of little candy %s capsules with %s treats inside, and maybe even some jelly %s!\s
        However, it’s important not to %s the most %s feature of Easter, spending time with %s and loved ones.
        To help you along, the Easter Bunny sometimes hides a bunch of treat eggs for you and your friends and family to dig up and find.\s
        If you find one, you can expect something a little extra %s!
       \s""", verb1, verb2, noun1, noun2, adjective1, pluralNoun1, verb3, adjective2, people, adjective3);
    }
}