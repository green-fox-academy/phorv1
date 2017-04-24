package SplitString;

import java.util.Arrays;

public class SplitString {

  public static void main(String[] args) {
    String givenString = "lovebarbara";
    try {
      System.out.println(Arrays.toString(splitString(givenString, 20)));
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  static String[] splitString(String inputString, int givenIndex) throws Exception {
    String[] returnStringArray = new String[2];
    String a;
    String b;
    try {
      a = inputString.substring(0, givenIndex);
      b = inputString.substring(givenIndex);
      returnStringArray[0] = a;
      returnStringArray[1] = b;

    } catch (StringIndexOutOfBoundsException e) {
      throw new Exception(
              "The number is higher then the length of the original String! Think before you act! Naaahh, try it again!");
    }
    return returnStringArray;
  }
}

