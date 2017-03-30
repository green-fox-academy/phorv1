
public class String1 {
  public static void main(String[] args) {
    String words = "xxxxxxxxxXXXXalfm lakmf";
    char from = 'x';
    String to = "y";

    System.out.println(replace(words, from, to));
  }

  public static String replace(String s, char from, String to){
    if (s.length() < 1) {
      return s;
    }
    else {
      String first = from == s.charAt(0) ? to : String.valueOf(s.charAt(0));
      return first + replace(s.substring(1), from, to);
    }
  }
}
