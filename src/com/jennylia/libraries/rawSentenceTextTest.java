package com.jennylia.libraries;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class rawSentenceTextTest {

  @Test
  public void testParser(){
    String input =
         "    Who the fuck cares? .................................... Are you sure it’s a problem?\n"
        + "    He’s got his head up his ass ........................... He’s not familiar with the problem.\n"
        + "    Eat shit ............................................... You don’t say.\n"
        + "    Eat shit and die ....................................... Excuse me? \n"
        + "    Eat shit and die, motherfucker ......................... Excuse me, sir?\n"
        + "\n";

    String regex = "\\.+";
    String[] parsedInput = input.split(regex);
    System.out.println(Arrays.toString(parsedInput));

  }

}