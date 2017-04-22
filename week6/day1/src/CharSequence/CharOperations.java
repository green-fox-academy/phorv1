package CharSequence;

public class CharOperations implements CharSequence {

  private String input;

  public CharOperations(String input) {
    this.input = input;
  }

  @Override
  public int length() {
    return input.length();
  }

  @Override
  public char charAt(int index) {
    return input.charAt(length() - (index + 1));
  }

  @Override
  public String subSequence(int start, int end) {
    String reversed = reverse(input);
    return reversed.substring(start, end);
  }

  @Override
  public String toString() {
    return reverse(input);
  }

  private String reverse(String inputString) {
    StringBuilder original = new StringBuilder(inputString);
    return original.reverse().toString();
  }

}

