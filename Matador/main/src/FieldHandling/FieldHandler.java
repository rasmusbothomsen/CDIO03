package FieldHandling;

import TurnHandling.Player;

public class FieldHandler {
    private CardDeck cardDeck;
    private Board board;

    public FieldHandler() {
        this.cardDeck = new CardDeck();
        this.board = new Board();
    }
    public void initiateField(Player player){
        Object[] fields = board.getFields();
        if(fields[player.getPlacementONBoard()].getClass().equals(Amusement.class)){
            isAmusement(player,fields);
        }
        if(fields[player.getPlacementONBoard()].getClass().equals(Chance.class)){
            isChance(player,fields);
        }
        if(fields[player.getPlacementONBoard()].getClass().equals(RestRoom.class)){
            isRestroom(player,fields);
        }
        if(fields[player.getPlacementONBoard()].getClass().equals(Field.class)){
            isField(player,fields);
        }




    }
    private void isAmusement(Player player, Object[] fields){
       Amusement amusement= ((Amusement) fields[player.getPlacementONBoard()]);
       if(amusement.isOwned()){
           if(amusement.isAllIsOwned()){
               player.addMoney(amusement.getCost()*-2);
           }else{
               player.addMoney(amusement.getCost()*-1);
           }
       }else{
           player.addMoney(amusement.getCost()*-1);
           amusement.setPlayerwhoOwnsIt(player);
       }
    }
    private void isChance(Player player, Object[] fields){

    }
    private void isRestroom(Player player, Object[] fields){

    }
    private void isField(Player player,Object[] fields){

    }

}
