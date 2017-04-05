package CountLetterApp;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountLetterTest {
  @Test
  public void getCountLetter() throws Exception {
    CountLetter countLetter = new CountLetter();
    String string = "pmm t t TT";
    System.out.println(string);
    System.out.println(countLetter.getCountLetter(string));
    HashMap<Character, Integer> testHashMap = new HashMap<>();
    testHashMap.put('p', 1);
    testHashMap.put('m', 2);
    testHashMap.put(' ', 3);
    testHashMap.put('t', 4);
    assertEquals(testHashMap, countLetter.getCountLetter(string));
  }

}