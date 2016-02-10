package pkl55.controller;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import pkl55.panelcomponent.AllMenuButton;

public class CardLayoutController {

    private CardLayout cardLayout;
    private JPanel parentCard;

    public CardLayout getCardLayout() {
        return cardLayout;
    }

    public void setCardLayout(CardLayout cardLayout) {
        this.cardLayout = cardLayout;
    }

    public JPanel getParentCard() {
        return parentCard;
    }

    public void setParentCard(JPanel parentCard) {
        this.parentCard = parentCard;
    }

    public void next() {
        cardLayout.next(parentCard);
    }

    public void previous() {
        cardLayout.previous(parentCard);
    }

    public void show(AllMenuButton button, String cardName) {
        cardLayout.show(parentCard, cardName);
        switch (cardName) {
            case "dssubpanel":
                button.getDs1().setActive();
                button.getKuesioner1().reset();
                button.getHelp1().reset();
                button.getAbout1().reset();
                break;
            case "kuessubpanel":
                button.getKuesioner1().setActive();
                button.getDs1().reset();
                button.getHelp1().reset();
                button.getAbout1().reset();
                break;
            case "helpsubpanel":
                button.getHelp1().setActive();
                button.getDs1().reset();
                button.getKuesioner1().reset();
                button.getAbout1().reset();
                break;
            case "aboutsubpanel":
                button.getAbout1().setActive();
                button.getDs1().reset();
                button.getKuesioner1().reset();
                button.getHelp1().reset();
                break;
        }

    }

    public void show(String cardName) {
        cardLayout.show(parentCard, cardName);
    }

    public JScrollPane getScrollCard() {
        for (Component comp : parentCard.getComponents()) {
            if (comp.isVisible()) {
                if (comp instanceof JScrollPane) {
                    System.out.println(comp.getName());
                    return (JScrollPane) comp;
                }
            }
        }
        return null;
    }
}
