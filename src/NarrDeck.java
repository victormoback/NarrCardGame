import java.awt.event.*;

public final class NarrDeck extends RandomCardDeck {

    public NarrDeck() {
        selectCards();
    }

    public void selectCards() {
        int i = 0;
        RenderedCard[] selected = new RenderedCard[36];

        for (int c = 0; c < cards.length; c++) {
            if (cards[c].getValue() > 5) {
                selected[i++] = cards[c];
            }
        }
        cards = selected;
    }

    public void addMouseListenersToCards(MouseListener m) {
        for (int c = 0; c < cards.length; c++) {
            cards[c].addMouseListener(m);
        }
    }
}