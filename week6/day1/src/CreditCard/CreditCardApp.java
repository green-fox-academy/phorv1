package CreditCard;


import java.util.ArrayList;
import java.util.List;

public class CreditCardApp {

  public static void main(String[] args) {
    List<CreditCard> creditCards = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
    CreditCard creditCard = new CreditCard();
    creditCards.add(creditCard);
    }
    for (CreditCard card : creditCards) {
      System.out.println(card);
    }
  }
}
