package creditCard;

public class CreditCard implements CreditCardy {

  @Override
  public int getSumCVV() {
    return 0;
  }

  @Override
  public String getNameCardholder() {
    return null;
  }

  @Override
  public String getCodeAccount() {
    return randomGenerator(16);
  }

  @Override
  public int cumeSumCVV(String codeAccount) {
    return 0;
  }

  @Override
  public String toString() {
    return super.toString();
  }

  String randomGenerator(int amountToRandomise) {
    String randomCode = "";
    for (int i = 0; i < amountToRandomise; i++) {
      int randomIndex = (int) (Math.random() * 10);
      randomCode += randomIndex;
    }
    return randomCode;
  }

}
