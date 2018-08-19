package com.jennylia;

import com.jennylia.libraries.utils.DataPopulator;
import com.jennylia.libraries.utils.MapPrinter;
import com.jennylia.translator.SentenceTranslator;

import java.util.Map;

public class Main {

  public static void main(String[] args) {
    DataPopulator dataPopulator = new DataPopulator();
    Map<String, String> corporateDictionary = dataPopulator.getDictionary();
    // Verify the dictionary works
//    MapPrinter.printMap(corporateDictionary);

    SentenceTranslator translator = new SentenceTranslator();
    String sampleResponse = translator.translateSentence("Kiss my ass");
    System.out.println(sampleResponse);
  }
}
