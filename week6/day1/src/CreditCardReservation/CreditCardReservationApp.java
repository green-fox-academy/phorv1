package CreditCardReservation;

import creditCard.CreditCard;
import java.util.ArrayList;
import java.util.List;

public class CreditCardReservationApp {

  public static void main(String[] args) {
    List<CreditCardReservation> creditCardResList = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      CreditCardReservation creditCardRes = new CreditCardReservation();
      creditCardResList.add(creditCardRes);
    }
    for (CreditCardReservation card : creditCardResList) {
      System.out.println(card);
    }

  }

}
