package com.example.madlibs;

import java.util.List;

public interface MadLib {
    String generateMadLib(List<String> userInputs);
    List<String> getPrompts();
}
