package CountLetterApp;

import java.util.HashMap;

public class CountLetter {

  public HashMap<Character, Integer> getCountLetter(String string) {
    HashMap<Character, Integer> countLetter = new HashMap<>();
    String checkString = string.toLowerCase();
    for (int i = 0; i < checkString.length(); i++) {
      if (countLetter.containsKey(checkString.charAt(i))) {
        countLetter.put(checkString.charAt(i), countLetter.get(checkString.charAt(i))+1);
      } else {
        countLetter.put(checkString.charAt(i), 1);
      }
    }
    return countLetter;
  }
}
