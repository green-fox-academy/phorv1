package ExtensionApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Extension {

  int add(int a, int b) {
    return a + b;
  }

  int maxOfThree(int a, int b, int c) {
    if (a > b && a > c)
      return a;
    else if (b > a && b > c)
      return b;
    else
      return c;
  }

  int median(List<Integer> pool) {
    Collections.sort(pool);
    if (pool.size() % 2 == 1 )
    return pool.get((pool.size() / 2));
    else
      return (pool.get(pool.size()/2 - 1) + (pool.get(pool.size() / 2))) / 2;
  }

  boolean isVowel(char c) {
    return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c);
  }

  String translate(String hungarian) {
    String teve = new String();
    for (char c : hungarian.toCharArray()) {
      if (isVowel(c)) {
        teve = teve + c + "v" + c;
      } else {
        teve = teve + c;
      }
    }
    return teve;
  }
}
