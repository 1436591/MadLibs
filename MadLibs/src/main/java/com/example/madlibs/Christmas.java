package com.example.madlibs;

import java.util.Arrays;
import java.util.List;

public class Christmas implements MadLib{
    private final List<String> prompts;

    public Christmas(){
        prompts = Arrays.asList(
                "Enter a time: ",
                "Enter a plural noun: ",
                "Enter an adjective: ",
                "Enter a noun: ",
                "Enter a name: ",
                "Enter an adjective: ",
                "Enter a song: ",
                "Enter an adjective: ",
                "Enter a food: ",
                "Enter a number: "
        );
    }

    public List<String> getPrompts() {
        return prompts;
    }

    @Override
    public String generateMadLib(List<String> userInputs) {
        String time = userInputs.get(0);
        String pnoun = userInputs.get(1);
        String adjective1 = userInputs.get(2);
        String noun = userInputs.get(3);
        String name = userInputs.get(4);
        String adjective2 = userInputs.get(5);
        String song = userInputs.get(6);
        String adjective3 = userInputs.get(7);
        String food = userInputs.get(8);
        String num = userInputs.get(9);

        return String.format("""
       It was %s on Christmas morning when I walked into the family room. My family was already there to open %s. I couldn't help but notice a\s
       %s %s sitting in the middle of the room. %s was %s about it. We always sing %s before opening %s. It is always a\s
       %s time with my family. %s revealed that the %s was actually made out of %s! Everyone loved it so much, we ate the whole thing in less than\s
       %s hours. Best Christmas ever!
      \s""", time, pnoun, adjective1, noun, name, adjective2, song, pnoun, adjective3, name, noun, food, num);
    }
}