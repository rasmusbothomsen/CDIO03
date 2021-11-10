package FieldHandling;


import org.junit.jupiter.api.Test;

class BoardTest {
    @Test
    void testIfBoardArrayIsCorrect(){
        Board board = new Board();
        Object[] fieldsTest = board.getFields();
        System.out.println(board);
        System.out.println(board.toClasses());
        System.out.println();
    }
    @Test
    void testClassEquals(){
        Board board = new Board();
        Object[] fieldsTest = board.getFields();
        System.out.println(fieldsTest[3].getClass().equals(Chance.class));
        System.out.println(fieldsTest[2].getClass().equals(Amusement.class));
        System.out.println(fieldsTest[3].getClass().equals(Chance.class));



    }

}