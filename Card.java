import ecs100.*;
/**
 * Support class of pokemon
 * A pokemon contains id, name, monetary value, and picture
 *
 * @author LH
 * @version 19/5/22
 */
public class Card
{
    // fields
    private int id;
    private String name;
    private double value;
    private String image;
    static final String DEFAULT_IMAGE = "pokemon.png";
    int locX = 100;
    int locY = 100;
    final double WIDTH = 230;
    final double HEIGHT = 360;

    /**
     * Constructor for objects in class Card
     */
    public Card(int  key, String nam, double val, String img)
    {
        // initialise instance variables
        id = key;
        name = nam;
        value = val;
        if (img == null) {
            this.image = DEFAULT_IMAGE;
        } else {
            this.image = img;
        }
    }

    /**
     * Constructor overloading
     * Sets image to default
     */
    public Card(int key, String nam, double val)
    {
       this(key, nam, val, DEFAULT_IMAGE);
    }
    
    /**
     * Display img
     */
    public void displayImg() {
               
        UI.drawImage(this.image, locX, locY, WIDTH, HEIGHT);
    }
    
    /**
     * Reports whether the point is on the image
     */
    public boolean onImage(double x, double y){
        // an easy approximation is to pretend it is the enclosing rectangle.
        // It is nicer to do a little bit of geometry and get it right
       if ((x >=locX) && (x<=locX+WIDTH) && (y>locY) && (y<=locY+HEIGHT)){
           return true;
        } else{
            return false;
        }

    }
    
    /**
     * Get ID
     */
    public int getId(){
        return this.id;
    }
    
    /**
     * Get name
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * Get Value
     */
    public double getValue(){
        return this.value;
    }
}
