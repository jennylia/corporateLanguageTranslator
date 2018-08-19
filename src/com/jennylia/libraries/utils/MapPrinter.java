package com.jennylia.libraries.utils;

import java.util.Map;

public class MapPrinter {
  public static void printMap(Map<?,?> map){
    map.forEach((k, v) -> System.out.println(k + " $translates to$ " + v));
  }
}
