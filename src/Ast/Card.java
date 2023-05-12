package Ast;

import java.util.ArrayList;
import java.util.List;

public class Card {
    //---------------------------    Attributes     -------------------------------
    private List<CardArgs> cardArgs;

    //---------------------------    Constructor     -------------------------------
    public Card() {
        this.cardArgs = new ArrayList<>();
    }

    //---------------------------    Setters & Getters     -------------------------------
    public List<CardArgs> getCardArgs() {
        return cardArgs;
    }

    public void setCardArgs(List<CardArgs> cardArgs) {
        this.cardArgs = cardArgs;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "Card{" +
                "cardArgs=" + cardArgs +
                '}';
    }
}
