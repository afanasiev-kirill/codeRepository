package ca.sheridancollege.week3.softwarefundamentals.exercise1;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author afanasie
 */

public class CardTrick {
    private static int CardPicker(int max){
        Random rand = new Random(); //instance of random class
        //generate random values from 0-24
        return rand.nextInt(max);
    }
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Scanner consoleReader = new Scanner(System.in);
        for (int i=0; i<magicHand.length; i++)
        {
            magicHand[i] = new Card();
            magicHand[i].setValue(CardPicker(13));
            magicHand[i].setSuit(Card.SUITS[CardPicker(3)]);
            //assign c to magichHand[i] here
            System.out.println(magicHand[i].getValue() + " " + magicHand[i].getSuit() + " ");
        }
        //insert code to ask the user for Card value and suit, create their card
        Card guessCard = new Card();
        System.out.println("Pick the card number [1 - 13]");
        guessCard.setValue(consoleReader.nextInt());
        System.out.println("Pick the card suit 0-3");
        guessCard.setSuit(Card.SUITS[consoleReader.nextInt()]);
        // and search magicHand here
        //Then report the result here
        for(Card card : magicHand){
                System.out.print(card.getValue() + " " + card.getSuit() + " - ");
            if(guessCard.getValue() == card.getValue() &&
                    guessCard.getSuit().equals(card.getSuit())){
                System.out.println("You guessed the card");
            }else{
                System.out.println("You did not guess the card");
            }
        }
        consoleReader.close();
    }
}