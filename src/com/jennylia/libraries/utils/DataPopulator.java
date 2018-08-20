package com.jennylia.libraries.utils;

import com.jennylia.libraries.rawSentenceText;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataPopulator {
  private Map<String, String> dictionary;

  private Map<String, String> produceDictionary() {
    String input = rawSentenceText.raw;
    String[] parsedInputByLine = input.split("\n");
    String regex = "\\.\\.+";

    Map<String, String> dictionary = new HashMap<>();

    try {
      for (String sentences : parsedInputByLine) {
        if (sentences != null && sentences.isEmpty() == false) {
          String[] tokens = sentences.split(regex);
          dictionary.put(trimString(tokens[0]), trimString(tokens[1]));
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("meh");
    }

    return dictionary;
  }

  private String trimString(String input) {
    String pattern = "(?m)^\\s*\\r?\\n|\\r?\\n\\s*(?!.*\\r?\\n)";
    String replacement = "";
    return input.replaceAll(pattern, replacement).trim();
  }

  public Map<String, String> getDictionary() {
    if (dictionary == null || dictionary.isEmpty()) {
      dictionary = produceDictionary();
    }
    return dictionary;
  }

}
