package FieldHandling;

import TextReader.TextFileReader;


public class CardDeck {

    protected ChanceCard[] cardDeck;



    protected ChanceCard[] cardDeckFiller() {
        TextFileReader reader = new TextFileReader("ChanceCardText.txt",25);
        String[] cards = reader.fileReader();
        System.out.println(cards[3]);



    return null;
    }
}
