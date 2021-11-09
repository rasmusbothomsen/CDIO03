package FieldHandling;

public class ChanceCard {
    public ChanceCard(String nameOfCard, String cardDescription, int effectOnPlayer) {
        this.nameOfCard = nameOfCard;
        this.cardDescription = cardDescription;
        this.effectOnPlayer = effectOnPlayer;
    }

    protected String nameOfCard;
    protected String cardDescription;
    protected int effectOnPlayer;

}
