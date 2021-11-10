package FieldHandling;
import TextReader.TextFileReader;

public class Board {
    private Amusement[] amusements;
    private Field[] fields;
    private CardDeck chanceDeck;

    public Board() {
        fillArrays();
        this.fields=fields;
        this.amusements= amusements;
        this.chanceDeck = new CardDeck();
    }
    private void fillArrays(){
        TextFileReader reader = new TextFileReader("FieldsText.txt",25);
        fields=new Field[24];
        amusements=new Amusement[16];



    }
    private Field[] fieldsArrayFiller(int i) {
        return null;
    }
    private Amusement[] amusementsArrayFiller(int i){
        return null;
    }
}
