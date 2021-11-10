package FieldHandling;

import TurnHandling.Player;

public class Field {
    private String fieldName;
    private String fieldDiscription;

    public String getFieldName() {
        return fieldName;
    }

    public String getFieldDiscription() {
        return fieldDiscription;
    }

    public int getPlacementOnBoard() {
        return placementOnBoard;
    }

    private int placementOnBoard;

    public Field(String fieldName, String fieldDiscription, int placementOnBoard) {
        this.fieldName = fieldName;
        this.fieldDiscription = fieldDiscription;
        this.placementOnBoard = placementOnBoard;
    }
}


class Chance extends Field{


    public Chance(String fieldName, String fieldDiscription, int placementOnBoard) {
        super(fieldName, fieldDiscription, placementOnBoard);
    }
}

class Amusement extends Field{
    private int cost;
    private Player playerwhoOwnsIt;
    private Amusement sameType;
    private boolean isOwned;
    private boolean allIsOwned;

    public Amusement(String fieldName, String fieldDiscription, int placementOnBoard,
                     int cost, Amusement sameType, boolean isOwned, boolean allIsOwned ) {
        super(fieldName, fieldDiscription, placementOnBoard);
        this.cost = cost;
        this.sameType = sameType;
        this.isOwned = isOwned;
        this.allIsOwned = allIsOwned;
    }

    public int getCost() {
        return cost;
    }

    public void setPlayerwhoOwnsIt(Player playerwhoOwnsIt) {
        this.playerwhoOwnsIt = playerwhoOwnsIt;
    }

    public Player getPlayerwhoOwnsIt() {
        return playerwhoOwnsIt;
    }

    public Amusement getSameType() {
        return sameType;
    }

    public boolean isOwned() {
        return isOwned;
    }

    public boolean isAllIsOwned() {
        return allIsOwned;
    }


    class RestRoom extends Field{

        public RestRoom(String fieldName, String fieldDiscription, int placementOnBoard) {
            super(fieldName, fieldDiscription, placementOnBoard);
        }
    }

    class GoToRestRoom extends Field{

        public GoToRestRoom(String fieldName, String fieldDiscription, int placementOnBoard) {
            super(fieldName, fieldDiscription, placementOnBoard);
        }
    }

    class Start extends Field{

        public Start(String fieldName, String fieldDiscription, int placementOnBoard) {
            super(fieldName, fieldDiscription, placementOnBoard);
        }
    }
}
