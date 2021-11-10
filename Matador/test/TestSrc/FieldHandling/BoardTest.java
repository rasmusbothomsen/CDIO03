package FieldHandling;


import org.junit.jupiter.api.Test;

class BoardTest {
    @Test
    void testIfBoardArrayIsCorrect(){
        Board board = new Board();
        Field[] fieldsTest = board.getFields();
        System.out.println(board);
    }

}