package com.jennylia.translator;

import com.jennylia.libraries.utils.DataPopulator;

import java.util.Map;

public class SentenceTranslator {

  private DataPopulator dataPopulator = new DataPopulator();
  private Map<String, String> corporateDictionary = dataPopulator.getDictionary();

  public String translateSentence(String input) {
    if (corporateDictionary.get(input) == null) {
      corporateDictionary.put(input, "temporary sentence... find something less offensive to put here");
    }

    return corporateDictionary.get(input);
  }

}
