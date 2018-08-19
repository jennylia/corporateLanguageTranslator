package com.jennylia.libraries.utils;

import com.jennylia.libraries.sentenceTranslate;

import java.util.HashMap;
import java.util.Map;

public class DataPopulator {
  private Map<String, String> dictionary;

  private Map<String, String> produceDictionary() {
    String input = sentenceTranslate.raw;
    String regex = "\\.+";
    String[] parsedInput = input.split(regex);

    // Build the hash map in memory
    Map<String, String> dictionary = new HashMap<>();
    for (int i = 0; i < parsedInput.length; i++) {
      // the key
      dictionary.put(trimString(parsedInput[i]), trimString(parsedInput[++i]));
    }

    return dictionary;
  }

  private String trimString(String input) {
    String pattern = "(?m)^\\s*\\r?\\n|\\r?\\n\\s*(?!.*\\r?\\n)";
    String replacement = "";
    return input.replaceAll(pattern,replacement).trim();
  }

  public Map<String, String> getDictionary() {
    if (dictionary == null || dictionary.isEmpty()) {
      dictionary = produceDictionary();
    }
    return dictionary;
  }

}
