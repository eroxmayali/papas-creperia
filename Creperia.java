import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.File;
import java.util.Random;
import java.util.ArrayList;

public class Creperia extends JPanel{

private Image[] allPics;
private ArrayList<Image> pics;
private int myWindowWidth = 700;
private int myWindowHeight = 600;

public Creperia() {
    JFrame easel = new JFrame();		
      easel.setSize (myWindowWidth, myWindowHeight);
      easel.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      easel.add (this);
      easel.setVisible (true);
}

public void paintComponent (Graphics g) {
    System.out.println("asdfd");
    try{
      BufferedImage myPic = ImageIO.read(new File("logo.png"));
      g.drawImage(myPic, 0, 0, null);	
   } catch(Exception e){
        e.printStackTrace();
   }
} 


    public String chooseSize(){
        String[] sizes = {"Small", "Medium", "Large"};

             int x = JOptionPane.showOptionDialog(null, "Choose a size.",
                "Batter Station",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, sizes, sizes[0]);
        if(x == 0){
            return "you chose small";
        }else if(x == 1){
            return "you chose medium";
        }else if(x == 2){
            return "you chose large";
        }else{
            return null;
        }
    }
    
    

    public String chooseFilling(){
String[] fillings = {"Nutella", "Sugar and Lemon", "Strawberry Jam", "Salted Caramel", "Cinnamon Sugar"};

        int x = JOptionPane.showOptionDialog(null, "Choose a filling.",
                "Filling Station",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, fillings, fillings[0]);
        // System.out.println(x);
        if(x==0){
            return "you chose nutella";
        }else if(x==1){
            return "you chose sugar and lemon";
        }else if(x==2){
            return "you chose strawberry jam";
        }else if(x==3){
            return "you chose salted caramel";
        }else if(x==4){
            return "you chose cinnamon sugar";
        }else {
            return null;
        }
    }

    public String chooseTopping(){
String[] toppings = {"Whipped Cream", "Banana", "Strawberry"};

        int x = JOptionPane.showOptionDialog(null, "Choose a topping.",
                "Filling Station",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, toppings, toppings[0]);
        if(x == 0){
            return "you chose whipped cream";
        }else if(x == 1){
            return "you chose banana";
        }else if(x == 2){
            return "you chose strawberry";
        }else{
            return null;
        }
    }
}
