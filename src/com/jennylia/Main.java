package com.jennylia;

import com.jennylia.libraries.sentenceTranslate;
import com.jennylia.libraries.utils.DataPopulator;
import com.jennylia.libraries.utils.MapPrinter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    DataPopulator dataPopulator = new DataPopulator();
    Map<String, String> corporateDictionary = dataPopulator.getDictionary();

    MapPrinter.printMap(corporateDictionary);

  }
}
