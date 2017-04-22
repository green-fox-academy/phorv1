package creditCard;

import java.util.List;

public class CreditCard implements CreditCardy {

  public static final String FORMAT = "Name=%s CC#=%s CVV=%d (validated)";
  private int sum, ordinalNumber;
  long codeAccount;
  private String name;
  private static int counter = 0;

  public CreditCard() {
    this.ordinalNumber = counter++;
    codeAccount = randomGenerator(16);
    this.name = "ABC" + ordinalNumber ;
    this.sum = cumeSumCVV(codeAccount);
  }

  @Override
  public int getSumCVV() {
    return sum;
  }

  @Override
  public String getNameCardholder() {
    return name;
  }

  @Override
  public String getCodeAccount() {
    return String.valueOf(codeAccount);
  }

  @Override
  public int cumeSumCVV(long codeAccount) {
    String[] codeAccountElements = String.valueOf(codeAccount).split("");
    int sum = 0;
    for (int i = 0; i < codeAccountElements.length; i++) {
      sum += Integer.parseInt(codeAccountElements[i]);
    }
    return sum;
  }

  @Override
  public String toString() {
    return String.format(FORMAT, getNameCardholder(), getCodeAccount(), getSumCVV());
  }

  long randomGenerator(int amountToRandomise) {
    String randomCode = "";
    for (int i = 0; i < amountToRandomise; i++) {
      if (i == 0) {
        int randomNumber = 1 + (int) (Math.random() * 9);
        randomCode += String.valueOf(randomNumber);
      } else {
        int randomNumber = (int) (Math.random() * 10);
        randomCode += String.valueOf(randomNumber);
      }
    }
    return Long.parseLong(randomCode);
  }

}
