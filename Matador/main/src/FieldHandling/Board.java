package FieldHandling;
import TextReader.TextFileReader;

public class Board {


    private Object[] fields;

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
        fillArrays();
    }
    private void fillArrays(){
        this.fields=new Object[24];
        TextFileReader reader = new TextFileReader("FieldsText.txt");
        String[] readFiles = reader.fileReader();
        for(int i =0,a=0,b=0; i<readFiles.length;i++){
            if(readFiles[i].startsWith("Amusement")){
                ifAmusementToArray(a,readFiles,i+1);
                a++;
            }
            if(readFiles[i].startsWith("Field")){
                ifFieldToArray(a,readFiles,i+1);
                a++;
            }


        }



    }
    private void ifFieldToArray(int arrayToFill,String[] readFiles,int placementRead ) {
        this.fields[arrayToFill]= new Object(readFiles[placementRead],readFiles[placementRead+1],placementRead);

    }

    public Object[] getFields() {
        return fields;
    }

    private void ifAmusementToArray(int arrayToFill, String[] readFiles, int placementRead){

            this.fields[arrayToFill] = new Amusement(readFiles[placementRead], readFiles[placementRead + 1], arrayToFill, Integer.parseInt(readFiles[placementRead + 2]));



    }
}
