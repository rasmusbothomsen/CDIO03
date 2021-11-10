package FieldHandling;

import TextReader.TextFileReader;

import java.util.Arrays;
import java.util.Random;


public class CardDeck {

    private ChanceCard[] cardDeck;
    private int whereInDeck;

    public ChanceCard pullCard() {
        ChanceCard tempCard = cardDeck[whereInDeck-1];
        whereInDeck++;
        return tempCard;
    }
    private void checkWhereInDeck(){
        if(whereInDeck==cardDeck.length){
            cardShuffler();
            whereInDeck=1;
        }
    }

    public CardDeck(){
        this.whereInDeck = 1;
       this.cardDeck=cardDeckFiller();
       cardShuffler();


   }

    private ChanceCard[] cardDeckFiller() {
        TextFileReader reader = new TextFileReader("ChanceCardText.txt");
        String[] cardsText = reader.fileReader();
        int amoutOfUnuseableText = 0;
        for (String s : cardsText) {
            if (s.startsWith("Card")) {
                amoutOfUnuseableText++;
            }
        }
        ChanceCard[] cards = new ChanceCard[cardsText.length - amoutOfUnuseableText];
        for (int i = 0, a = 0; i < cards.length; i++, a++) {
            if (cardsText[i].startsWith("Card")) {
                a++;
            }
            cards[i] = new ChanceCard(cardsText[a], cardsText[a + 1], i); // Virker ikke helt korrekt

        }


        return cards;
    }

    @Override
    public String toString() {
        return "CardDeck{" +
                "cardDeck=" + Arrays.toString(cardDeck) +
                '}';
    }

    private void cardShuffler() {
        Random rand = new Random();
        ChanceCard temp;
        for (int i = 0; i < cardDeck.length; i++) {
            int randomIndexSwap = rand.nextInt(cardDeck.length);
            temp = this.cardDeck[randomIndexSwap];
            this.cardDeck[randomIndexSwap] = this.cardDeck[i];
            this.cardDeck[i] = temp;

        }

    }
}
