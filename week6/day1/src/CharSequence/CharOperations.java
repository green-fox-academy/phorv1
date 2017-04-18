package CharSequence;

public class CharOperations implements CharSequence{

  String input;

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
  public CharSequence subSequence(int start, int end) {
    return input.subSequence(start, end);
  }

  @Override
  public String toString() {
    return input.toString();
  }

}

