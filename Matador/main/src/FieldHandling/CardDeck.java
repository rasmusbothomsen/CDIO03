package FieldHandling;

import TextReader.TextFileReader;
import org.w3c.dom.Text;

import java.io.IOException;

public class CardDeck {

    protected ChanceCard[] cardDeck;



    private ChanceCard[] cardDeckFiller() {
        TextFileReader reader = new TextFileReader("ChanceCardText.txt",25);
        String[] cards = reader.fileReader();



    return null;
    }
}
