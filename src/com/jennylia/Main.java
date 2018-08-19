package com.jennylia;

import com.jennylia.libraries.sentenceTranslate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) {

    String input = sentenceTranslate.raw;
    String regex = "\\.+";
    String[] parsedInput = input.split(regex);

    // Build the hash map in memory
    Map<String, String> dictionary = new HashMap<>();
    for (int i = 0; i < parsedInput.length; i++) {
      // the key
      dictionary.put(parsedInput[i].trim(), parsedInput[++i].trim());
    }

    dictionary.forEach((k, v) -> System.out.println(k + " $translates to$ " + v));
  }
}
