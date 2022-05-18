import java.util.HashMap;
import ecs100.*;
/**
 * Holds a collection of Pokemon cards in a hashmap
 * Allows user to add, find, print all, and hide details of Pokemon cards
 *
 * @author LH
 * @version 19/5/22
 */
public class Cards
{
    // instance variables - replace the example below with your own
    private HashMap<Integer, Card> library; // declaring the hashmap
    private int currCardId;     // store the current id of Pokemonn card being added
    private Card currCard;    // store the instance of the current Pokemon card
    

    /**
     * Constructor for objects of class Contacts
     */
    public Cards()
    {
        // initialise instance variables
        library = new HashMap<Integer, Card>();     //initialise hashmap
        
        // Creating Contacts
        Card c1 = new Card(1, "Charizard", "357.52", "charizard.png");
        Card c2 = new Card(2, "Pikachu", "2.84", "pikachu.jpg");
        Card c3 = new Card(3, "Weedle", "0.29", "weedle.jpg");
        
        // Add contacts to collection 
        library.put(1, c1);
        library.put(2, c2);
        library.put(3, c3);
        
        this.currCardId = 3;         // Store the current card id
    }
}
