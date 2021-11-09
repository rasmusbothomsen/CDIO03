package TextReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReader {
    public TextFileReader(String fileName, int arrayLenght) {
        this.fileName = fileName;
        this.arrayLenght=arrayLenght;
    }

    private String fileName;
    private int arrayLenght;

private String[] fileReaderPriv() throws IOException {
    BufferedReader reader = new BufferedReader(new FileReader(fileName));
    String currentline=reader.readLine();
    String[] allText= new String[arrayLenght];
    for(int i =0; currentline!=null||i<arrayLenght;i++){
        allText[i]=currentline;
        currentline=reader.readLine();
    }
    reader.close();
    return allText;


}
public String[] fileReader(){
    String[] returnFile= new String[arrayLenght];
    try {
        returnFile = fileReaderPriv();
    } catch (IOException e) {
        e.printStackTrace();
    }
    return returnFile;
}

}
