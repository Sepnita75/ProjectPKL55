package pkl55.kuesioner.SectionPane;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Point;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class CardLayoutController {

    private CardLayout cardLayout;
    private JPanel parentCard;

    public CardLayoutController(JPanel parentCard, CardLayout cardLayout) {
        this.cardLayout = cardLayout;
        this.parentCard = parentCard;
    }


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

    public void show(String cardName) {
        cardLayout.show(parentCard, cardName);
    }

    public JScrollPane getScrollCard() {
        for (Component comp : parentCard.getComponents()) {
            if (comp.isVisible()) {
                if(comp instanceof JScrollPane){
                    System.out.println(comp.getName());
                    return (JScrollPane) comp;
                }
            }
        }
        return null;
    }
}