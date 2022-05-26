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
        Card c1 = new Card(1, "Charizard", 357.52, "charizard.png");
        Card c2 = new Card(2, "Pikachu", 2.84, "pikachu.jpg");
        Card c3 = new Card(3, "Weedle", 0.29, "weedle.jpg");
        
        // Add contacts to collection 
        library.put(1, c1);
        library.put(2, c2);
        library.put(3, c3);
        
        this.currCardId = 3;         // Store the current card id
    }
    
    /**
     * Set card Id
     */
    public void setCardId()
    {
       this.currCardId += 1;
    }
    
    /**
     * Add a card to the map
     */
    public void addCard(String name, double value, String img)
    {
    library.put(currCardId, new Card
    (currCardId, name, value, img));
    }
    
    /**
     * Find a contact based on name
     * Sets the current contact instance if found
     * @return boolean false if not found
     */
    public boolean findCard(String name){
        // search
        for (int contactId: library.keySet()) {
            if (library.get(contactId).getName().toLowerCase().equals(name.toLowerCase())){
            currCard = library.get(contactId); // set the current book
            library.get(contactId).displayImg();   // show book cover
            return true;
            }
        }
        return false;
    }
    
    /**
     * Getter for current contact instance
     */
    public Card getCard() {
        return this.currCard;
    }
    
    /**
     * Print details of all contacts
     */
    public void printAll() {
        //Traverse map
        for(int cardId : library.keySet()) {
            UI.println(cardId + " - Details: ");
            UI.println(library.get(cardId).getName() + "  $"
                            + library.get(cardId).getValue() + " \n");
                                
        }
    }
    
}
