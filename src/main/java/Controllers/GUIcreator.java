package Controllers;
import FieldHandling.*;
import gui_fields.GUI_Field;
import gui_fields.GUI_Street;
import gui_main.GUI;

import java.awt.*;

public class GUIcreator {
    public static void main(String[] args) {
        GUI gui = new GUI();

    }

    public static GUI guiCreator() {
        Board board = new Board();
        Object[] fields = board.getFields();
        GUI_Field[] guiFields = fieldsCreator(fields);
return null;
    }
    private static GUI_Field[] fieldsCreator(Object[] fieldFromBoard){
        GUI_Field[] guiFields = new GUI_Field[24];
        for (int i =0; i<fieldFromBoard.length;i++){
                if(fieldFromBoard[i].getClass().equals(Amusement.class)){
                    guiFields[i] = new GUI_Street(((Amusement)fieldFromBoard[i]).getFieldName(),((Amusement) fieldFromBoard[i]).getFieldDiscription(),"heh", Integer.toString(((Amusement) fieldFromBoard[i]).getCost()), Color.GRAY,Color.PINK );
                }
            if(fieldFromBoard[i].getClass().equals(Chance.class)){

            }
            if(fieldFromBoard[i].getClass().equals(RestRoom.class)){

            }
            if(fieldFromBoard[i].getClass().equals(Field.class)){

            }
        }

return null;
    }
}
