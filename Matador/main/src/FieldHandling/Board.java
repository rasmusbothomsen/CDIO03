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
        amusements=new Amusement[16];
        fields=new Field[24];
        TextFileReader reader = new TextFileReader("FieldsText.txt",26);
        String[] readFiles = reader.fileReader();
        for(int i = 0; i<readFiles.length;i++){

        }



    }
    private void fieldsArrayFiller(int arrayToFill,String[] readFiles,int placementRead ) {

    }
    private void amusementsArrayFiller(int arrayToFill,String[] readFiles,int placementRead,boolean isFirst){
        if(isFirst) {
            this.amusements[arrayToFill] = new Amusement(readFiles[placementRead], readFiles[placementRead + 1], arrayToFill
                    , Integer.parseInt(readFiles[placementRead + 2]), amusements[arrayToFill +1], false, false);
        } else{
            this.amusements[arrayToFill] = new Amusement(readFiles[placementRead], readFiles[placementRead + 1], arrayToFill
                    , Integer.parseInt(readFiles[placementRead + 2]), amusements[arrayToFill -1], false, false);
        }
    }
}
