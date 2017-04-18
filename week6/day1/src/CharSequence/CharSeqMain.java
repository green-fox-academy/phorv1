package CharSequence;

public class CharSeqMain {

  public static void main(String[] args) {

    CharOperations charOperations = new CharOperations("abcdefghijk");

    System.out.println(charOperations.length());
    System.out.println(charOperations.charAt(3));
    System.out.println(charOperations.subSequence(3, 7));
    System.out.println(charOperations.toString());

  }
}

