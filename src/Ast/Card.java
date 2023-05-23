package Ast;

import Ast.Classes.HtmlElement;

import java.util.ArrayList;
import java.util.List;

public class Card extends HtmlElement {
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

    @Override
    public String generateHtmlAttribute() {
        return "";
    }

    @Override
    public String generateHtmlCode() {
        StringBuilder sb = new StringBuilder();

        if(cardArgs != null && !cardArgs.isEmpty())
        {
            for(CardArgs cardArg:cardArgs)
            {
                sb.append(cardArg.generateHtmlCode());
            }
        }

        return sb.toString();
    }

    @Override
    public String generateStyleCode() {
        return "";
    }
}
