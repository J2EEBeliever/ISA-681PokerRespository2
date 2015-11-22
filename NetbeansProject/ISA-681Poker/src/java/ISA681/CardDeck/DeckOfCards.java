/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ISA681.CardDeck;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author b1wolt
 */
public class DeckOfCards {
    private Stack<Card> deck;
    
    public DeckOfCards()
    {
       
        for (int i = 1 ; i<=52; i++)
        {
            deck.push(new Card(i));
        }
        
    }
    
    public void shuffle()
    {
       
        List<Card> Listdeck = new ArrayList<>(deck);
      deck = new Stack<>();
        
        for (int i = 0; i<52;i++)
        {
          
            int slot = 0 + (int)(Math.random() * ((((52 - i) -1) - 0) + 1));
            deck.push(Listdeck.get(slot));
            Listdeck.remove(slot);
          
             
        }
        
          deck.addAll(Listdeck);
    }
    
    public Card draw()
    {
        
        return deck.pop();
    }
    
    
}
