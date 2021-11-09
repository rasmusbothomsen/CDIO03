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

    public String getNameOfCard() {
        return nameOfCard;
    }

    public void setNameOfCard(String nameOfCard) {
        this.nameOfCard = nameOfCard;
    }

    public String getCardDescription() {
        return cardDescription;
    }

    public void setCardDescription(String cardDescription) {
        this.cardDescription = cardDescription;
    }

    public int getEffectOnPlayer() {
        return effectOnPlayer;
    }

    public void setEffectOnPlayer(int effectOnPlayer) {
        this.effectOnPlayer = effectOnPlayer;
    }
}
