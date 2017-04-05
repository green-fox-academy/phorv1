package AnagramApp;

import org.junit.Test;
import static org.junit.Assert.*;

public class AnagramTest {
  @Test
  public void isAnagram() throws Exception {
    Anagram anagramTest = new Anagram();
    String testString1 = "lLohe2dd";
    String testString2 = "hell o2dd";
    assertTrue(anagramTest.isAnagram(testString1, testString2));

  }

}