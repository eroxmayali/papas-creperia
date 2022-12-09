import java.awt.*;
import java.util.Random;
import java.util.ArrayList;

public class Customer {

    Random r = new Random();

    private int size;
    private String fill;
    private String top;
    private String name;
    
// size: 0 = small, 1 = medium, 2 = large

    public Customer() {
        this.name = randomName();
        this.size = randomSize();
        this.fill = randomFillings();
        this.top = randomToppings();
    }

    public String randomName() {
        return names.get(r.nextInt(names.size()));
     }

      public int randomSize() {
         return sizes.get(r.nextInt(sizes.size()));
      }

     public String randomFillings() {
        return fillings.get(r.nextInt(fillings.size()));
     }

     public String randomToppings() {
        return toppings.get(r.nextInt(toppings.size()));
     }

    ArrayList<Integer> sizes = new ArrayList<Integer>(){
        {
            add(0);
            add(1);
            add(2);
        }
    };

ArrayList<String> fillings = new ArrayList<String>() {
    {
       add("Nutella");
       add("Sugar and Lemon");
       add("Strawberry Jam");
       add("Salted Caramel");
       add("Cinnamon Sugar");
    }
 };

ArrayList<String> toppings = new ArrayList<String>() {
    {
       add("Whipped Cream");
       add("Banana");
       add("Strawberry");
    }
 };

 ArrayList<String> names = new ArrayList<String>() {
    {
       add("Nikko");
       add("Emily");
       add("Jake");
       add("Khalia");
       add("Elle");
    }
 };

    // Note: all of this classes instance variables are private.  The only way for 
    //  other classes to get their value is to use the 'accessor' -- the method that
    //  returns that instance variables value.  
    
    
    public String getName() {
        return(name);
    }




}