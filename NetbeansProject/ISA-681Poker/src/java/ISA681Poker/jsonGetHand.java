/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ISA681Poker;

import ISA681.CardDeck.Card;
import ISA681.CardDeck.DeckOfCards;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author b1wolt
 */
public class jsonGetHand extends ActionSupport
{
    private final List<Card>Hand;
    public jsonGetHand()
{
    pokerHands pokerHands = new pokerHands();
    DeckOfCards deck = new DeckOfCards();
    deck.shuffle();
    List<Card> Hand1 = new ArrayList<>();
    List<Card> Hand2 = new ArrayList<>();
    for (int i = 0; i < 5; i++)
    {
        Hand1.add(deck.draw());
        Hand2.add(deck.draw());
    }

    pokerHands.setDeckOfCards(deck);
    pokerHands.setPlayer1Hand1(Hand1);
    pokerHands.setPlayer2Hand2(Hand2);
    Hand = pokerHands.GetPlayer1Hand();
   
}
    
       @Actions( {
    @Action(value = "/jsontable", results = {
      @Result(name = "success", type = "json")
    })
  })
        @Override
  public String execute()
  {
      return SUCCESS;
       
  }
  
  public List<Card> getHand()
  {
      return Hand;
  }
  
  
    
    
}
