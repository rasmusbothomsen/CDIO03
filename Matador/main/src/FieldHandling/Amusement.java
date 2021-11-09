package FieldHandling;

import Controllers.Player;

public class Amusement {
    protected int placeMentOnBoard;
    protected int cost;
    protected Player playerwhoOwnsIt;
    protected boolean isOwned;

    public Amusement(int placeMentOnBoard, int cost, Player playerwhoOwnsIt, boolean isOwned, boolean allIsOwned) {
        this.placeMentOnBoard = placeMentOnBoard;
        this.cost = cost;
        this.playerwhoOwnsIt = playerwhoOwnsIt;
        this.isOwned = isOwned;
        this.allIsOwned = allIsOwned;
    }

    protected boolean allIsOwned;

}
