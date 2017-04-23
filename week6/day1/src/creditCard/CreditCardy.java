package creditCard;

public interface CreditCardy {

  int getSumCVV();

  String getNameCardholder();

  String getCodeAccount();

  int cumeSumCVV(long codeAccount); // computes codeAccount checksum

  String toString (); //String.format("Name=%s CC#=%s CVV=%d");
}
