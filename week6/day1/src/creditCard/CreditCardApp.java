package creditCard;


public class CreditCardApp {

  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
    CreditCard creditCard = new CreditCard();
      System.out.println(creditCard.toString());
    }
  }
}
