import ecs100.*;
import java.util.regex.*;
/**
 * Write a description of class GUI here.
 *
 * @author LH
 * @version 19/5/22
 */ 
public class GUI
{
    // instance variables 
    private Cards cards;      //declare Cards instance
    private Card card;        // declare Card instance

    /**
     * Constructor for objects of class GUI
     */
    public GUI()
    {
        // initialise instance variables
        cards = new Cards();      // instantiate the contacts object
        UI.initialise();
        UI.setMouseListener(this::clearCard);
        UI.addButton("Print all", cards::printAll);  
        UI.addButton("Add a Pokemon card", this::addCard);
        UI.addButton("Find a Pokemon card", this::findCard);
        UI.addButton("Clear all", UI::clearText);
        UI.addButton("Quit", UI::quit);
    }

    /**
     * Add a card to collection
     */
    public void addCard()
    {
        // Ask the user for contact details
        String name = UI.askString("Name: ");
        nameErrorCheck(name);
        
        double value = UI.askDouble("Value: ");
        valueErrorCheck(value);
        
               
        UI.println("Select a card image");
        String imgFileName = UIFileChooser.open("Choose an image file: ");
        
        cards.setCardId();
        cards.addCard(name, value, imgFileName);
        UI.println("Pokemon added");  
    }
    
   
        
        
    
    
    /**
     * Error checks name
     */
    public void nameErrorCheck(String name){
         if ((name.length()>=4) && (name.length()<=12)){
            if (Pattern.matches("^[A-Za-z- ]+$", name)){
                return;
            }else{
                UI.println("Enter a valid name");
                addCard();
            }
        } else{
            UI.println("Enter a valid name");
            addCard();
        }
    }
    
    /**
     * Error checks value
     */
    public void valueErrorCheck(double value){
        if ((value>=0.01) && (value<=9000000)){
            
        }else {
            UI.println("Enter a valid value");
            addCard();        
        }
            
        }
    
       
    /**
     * Find a card based on name
     * Prints out card details if found
     */
    public void findCard(){
        String cardName = UI.askString("Name of Pokemon: ");
        if (cards.findCard(cardName.toUpperCase())) {
            UI.println("Found Pokemon");
            UI.clearGraphics();
            card = cards.getCard();
            UI.println("Value: $" + card.getValue());
            card.displayImg();
        } else {
            UI.println("Pokemon not found");
        }
    }
    
    /**
     * Hides card details if image clicked
     */
    public void clearCard(String action, double x, double y){
        if (action.equals("clicked")){
            if(card.onImage(x, y)){
            UI.clearText(); 
            UI.clearGraphics();
        }   
        else {
        UI.println("Click on the image to clear the text");
    
    }
}}}
