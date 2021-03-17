
import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

public class Hand implements Comparable<Hand> {
    
    private List<Card> handCards;
    
    public Hand() {
        this.handCards = new ArrayList<>();
    }
    
    public void add(Card card) {
        if (card != null) {
            handCards.add(card);
        }
    }
    
    public void print() {
        for (Card card : handCards) {
            System.out.println(card);
        }
    }
    
    public void sort() {
        Collections.sort(this.handCards);
    }
    
    @Override
    public int compareTo(Hand handToBeCompared) {
        
        int thisHandValue = this.handCards.stream()
                .map(card -> card.getValue())
                .reduce(0, (a, b) -> a + b);
        int comparedHandValue = handToBeCompared.handCards.stream()
                .map(card -> card.getValue())
                .reduce(0, (a, b) -> a + b);
        return thisHandValue - comparedHandValue;
    }
    
    public void sortBySuit() {
        Collections.sort(handCards, new BySuitInValueOrder());
    }
    
}
