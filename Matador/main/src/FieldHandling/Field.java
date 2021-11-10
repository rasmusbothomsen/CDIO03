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
    private String type;

    public Field(String fieldName, String fieldDiscription, int placementOnBoard) {
        this.fieldName = fieldName;
        this.fieldDiscription = fieldDiscription;
        this.placementOnBoard = placementOnBoard;
    }


}








class Amusement extends Field {
    private int cost;
    private Player playerwhoOwnsIt;
    private boolean isOwned;
    private boolean allIsOwned;



    private Amusement sameType;

    @Override
    public String toString() {
        return "Amusement{" +
                "cost=" + cost +
                ", playerwhoOwnsIt=" + playerwhoOwnsIt +
                ", isOwned=" + isOwned +
                ", allIsOwned=" + allIsOwned +
                ", sameType=" + sameType +
                '}';
    }

    public Amusement(String fieldName, String fieldDiscription, int placementOnBoard,
                     int cost) {
        super(fieldName, fieldDiscription, placementOnBoard);
        this.cost = cost;
        this.isOwned = false;
        this.allIsOwned = false;
    }

    public void setSameType(Amusement sameType) {
        this.sameType = sameType;
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

}
