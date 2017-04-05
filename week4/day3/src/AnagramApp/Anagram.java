package AnagramApp;

import java.util.Arrays;

public class Anagram {

  public boolean isAnagram(String string1, String string2) {
    String copyOfString1 = string1.replaceAll("\\s", "").toLowerCase();
    String copyOfString2 = string2.replaceAll("\\s", "").toLowerCase();

    if (copyOfString1.equals(copyOfString2)) {
      return true;
    } else if (copyOfString1.length() != copyOfString2.length()) {
      return false;
    } else {
      char[] string1CharArray= copyOfString1.toCharArray();
      char[] string2CharArray= copyOfString2.toCharArray();

      Arrays.sort(string1CharArray);
      Arrays.sort(string2CharArray);

    return Arrays.equals(string1CharArray, string2CharArray);
    }
  }
}
