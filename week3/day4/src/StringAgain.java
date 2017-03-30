
public class StringAgain {
  public static void main(String[] args) {
    String words = "xxxxxxxxxXXXXalfm lakmf";
    char from = 'x';
    String to = "";

    System.out.println(replace(words, from, to));
  }

  public static String replace(String s, char from, String to){
    if (s.length() < 1) {
      return s;
    } else {
      String letter;
      if (s.charAt(0) != from) {
        letter = s.charAt(0) + to;
      } else{
        letter = to;
      }
        return letter + replace(s.substring(1), from, to);
    }
  }
}
