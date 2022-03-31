package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Card> deck = Arrays.asList(
                new Card("heart", "ace"),
                new Card("heart", "10"),
                new Card("heart", "3"),
                new Card("heart", "4"),
                new Card("heart", "6"),
                new Card("heart", "5"),
                new Card("heart", "7"),
                new Card("heart", "8"),
                new Card("heart", "9"),
                new Card("heart", "2"),
                new Card("heart", "jack"),
                new Card("heart", "queen"),
                new Card("heart", "king"),
                new Card("club", "ace"),
                new Card("club", "2"),
                new Card("club", "3"),
                new Card("club", "4"),
                new Card("club", "6"),
                new Card("club", "5"),
                new Card("club", "7"),
                new Card("club", "8"),
                new Card("club", "9"),
                new Card("club", "10"),
                new Card("club", "jack"),
                new Card("club", "queen"),
                new Card("club", "king"),
                new Card("spade", "ace"),
                new Card("spade", "2"),
                new Card("spade", "3"),
                new Card("spade", "4"),
                new Card("spade", "6"),
                new Card("spade", "5"),
                new Card("spade", "7"),
                new Card("spade", "8"),
                new Card("spade", "9"),
                new Card("spade", "10"),
                new Card("spade", "jack"),
                new Card("spade", "queen"),
                new Card("spade", "king"),
                new Card("diamond", "ace"),
                new Card("diamond", "2"),
                new Card("diamond", "3"),
                new Card("diamond", "4"),
                new Card("diamond", "5"),
                new Card("diamond", "6"),
                new Card("diamond", "7"),
                new Card("diamond", "8"),
                new Card("diamond", "9"),
                new Card("diamond", "10"),
                new Card("diamond", "jack"),
                new Card("diamond", "queen"),
                new Card("diamond", "king")
        );


        List<Card> hearts = filter(deck, (Card c) -> "heart".equals(c.getSuit()));
        List<Card> spades = filter(deck, (Card c) -> "spade".equals(c.getSuit()));
        List<Card> diamonds = filter(deck, (Card c) -> "diamond".equals(c.getSuit()));
        List<Card> club = filter(deck, (Card c) -> "club".equals(c.getSuit()));


        Comparator<Card> c = (Card a1, Card a2) -> a1.getOrdinal().compareTo(a2.getOrdinal());

        hearts.sort(c);
        spades.sort(c);
        diamonds.sort(c);
        club.sort(c);

        System.out.println("complete deck");
        System.out.println(deck);


        System.out.println("deck filtered by suit and sorted by ordinal ");


        System.out.println("hearts");
        System.out.println(hearts);
        System.out.println("spades");
        System.out.println(spades);
        System.out.println("diamonds");
        System.out.println(diamonds);
        System.out.println("club");
        System.out.println(club);

    }

    public static List<Card> filter(List<Card> deck, Card.CardPredicate c) {
        List<Card> result = new ArrayList<>();

        for (Card card : deck) {
            if (c.test(card)) {
                result.add(card);
            }
        }
        return result;
    }
}
