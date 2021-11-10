package FieldHandling;
import TextReader.TextFileReader;

import java.util.Arrays;

public class Board {
    private Field[] fields;

    @Override
    public String toString() {
        String boardDiscription="Fied  1: \t";
        for(int i =0;i<this.fields.length;i++){
            boardDiscription+=this.fields[i].getFieldName();
            if(i<this.fields.length-1) {
                boardDiscription += "\nField " + (i + 2) + ":\t";
            }
        }

        return boardDiscription;
    }

    public Board() {
        this.fields=fields;
        fillArrays();
    }
    private void fillArrays(){
        fields=new Field[23];
        TextFileReader reader = new TextFileReader("FieldsText.txt");
        String[] readFiles = reader.fileReader();
        int amoutOfAmusements=0;
        for(int i =0,a=0; i<readFiles.length;i++){
            if(readFiles[i].startsWith("Amusement")){
                amoutOfAmusements++;
                ifAmusementToArray(a,readFiles,i+1,(amoutOfAmusements%2!=0));
                a++;
            }
            if(readFiles[i].startsWith("Field")){
                ifFieldToArray(a,readFiles,i+1);
                a++;
            }


        }



    }
    private void ifFieldToArray(int arrayToFill,String[] readFiles,int placementRead ) {
        this.fields[arrayToFill]= new Field(readFiles[placementRead],readFiles[placementRead+1],placementRead);

    }

    public Field[] getFields() {
        return fields;
    }

    private void ifAmusementToArray(int arrayToFill, String[] readFiles, int placementRead, boolean isFirst){
        if(isFirst) {
            this.fields[arrayToFill] = new Amusement(readFiles[placementRead], readFiles[placementRead + 1], arrayToFill
                    , Integer.parseInt(readFiles[placementRead + 2]), false, false);
        } else{
            this.fields[arrayToFill] = new Amusement(readFiles[placementRead], readFiles[placementRead + 1], arrayToFill
                    , Integer.parseInt(readFiles[placementRead + 2]), false, false);
        }
    }
}
