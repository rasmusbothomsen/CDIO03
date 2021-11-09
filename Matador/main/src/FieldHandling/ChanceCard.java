package FieldHandling;


public class ChanceCard {
    public ChanceCard(String nameOfCard, String cardDescription, int effectOnPlayer) {
        this.nameOfCard = nameOfCard;
        this.cardDescription = cardDescription;
        this.effectOnPlayer = effectOnPlayer;
    }

    protected String nameOfCard;

    @Override
    public String toString() {
        return "ChanceCard{" +
                "nameOfCard='" + nameOfCard + '\'' +
                ", cardDescription='" + cardDescription + '\'' +
                ", effectOnPlayer=" + effectOnPlayer +
                '}';
    }

    protected String cardDescription;
    protected int effectOnPlayer;

    public String getNameOfCard() {
        return nameOfCard;
    }

    public String getCardDescription() {
        return cardDescription;
    }

    public int getEffectOnPlayer() {
        return effectOnPlayer;
    }
}
