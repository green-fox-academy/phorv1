package blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

  List<Card> cards;

  Deck (int numberOfCards) {
    cards = new ArrayList<>();
    fill(numberOfCards);
  }

  public void shuffle() {
    Collections.shuffle(cards);
  }


  public Card draw() {
    Card drawedCard = cards.get(0);
    cards.remove(0);
    return drawedCard;
  }

  @Override
  public String toString() {
    String cardsByColors = "";
    for (String color : Card.COLORS) {
      cardsByColors += getNumberOfCardsWithColor(color) + " " + color;
      if (Card.COLORS.indexOf(color) != (Card.COLORS.size() - 1)) {
        cardsByColors += ", ";
      }
    }
    return  cards.size() + " cards - " + cardsByColors;
  }

  private int getNumberOfCardsWithColor(String color) {
    int cardCounter = 0;
    for (Card card : cards) {
      if (card.getColor().equals(color)) {
        cardCounter++;
      }
    }
    return cardCounter;
  }


  private void fill(int numberOfCards) {
    int cardsAdded = 0;
    while (cardsAdded < numberOfCards) {
      String value = Card.VALUES.get((int) (Math.random() * Card.VALUES.size()));
      String color;
      if (cardsAdded > 4) {
        color = Card.COLORS.get(cardsAdded % 4);
      } else {
        color = Card.COLORS.get((int) (Math.random() * Card.COLORS.size()));
      }
      if (!isCardInDeck(color, value)) {
        cards.add(new Card(color, value));
        cardsAdded++;
      }
    }
  }

  private boolean isCardInDeck(String color, String value) {
    for (Card card : cards) {
      if (card.getColor().equals(color) && card.getValue().equals(value)){
        return true;
      }
    }
    return false;
  }


}
