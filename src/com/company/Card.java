package com.company;

public class Card {
    private String suit;
    private String ordinal;

    public Card(String suit, String ordinal) {
        this.ordinal = ordinal;
        this.suit = suit;
    }

    public Integer getOrdinal() {

        if ("ace".equals(ordinal)) {
            return 0;
        }
        if ("jack".equals(ordinal)) {
            return 11;
        }
        if ("queen".equals(ordinal)) {
            return 12;
        }
        if ("king".equals(ordinal)) {
            return 13;
        }
        return Integer.parseInt(ordinal);
    }

    public void setOrdinal(String ordinal) {
        this.ordinal = ordinal;
    }


    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    interface CardPredicate {
        public boolean test(Card c);
    }

    public String toString() {
        return "Card{" +
                "suit:'" + suit + '\'' +
                ", ordinal=" + ordinal +
                '}';
    }
}
