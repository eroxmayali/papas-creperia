import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.File;
import java.util.*;
import java.util.ArrayList;


public class Creperia extends JPanel{

private int myWindowWidth = 700;
private int myWindowHeight = 600;
private String ImageToShow = "logo.png";
private int index = 0;
private int mySize = 0;

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
      BufferedImage myPic = ImageIO.read(new File(ImageToShow));
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
            this.cook();
            return "you chose small";
        }else if(x == 1){
            this.cook();
            return "you chose medium";
        }else if(x == 2){
            this.cook();
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
            ImageToShow = "nutella.png";
            this.repaint();
            return "you chose nutella";
        }else if(x==1){
            ImageToShow = "lemon.png";
            this.repaint();
            return "you chose sugar and lemon";
        }else if(x==2){
            ImageToShow = "strawb.png";
            this.repaint();
            return "you chose strawberry jam";
        }else if(x==3){
            ImageToShow = "caramel.png";
            this.repaint();
            return "you chose salted caramel";
        }else if(x==4){
            ImageToShow = "cinsug.png";
            this.repaint();
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

public int calcScore(){
    return 0;
}

ArrayList<String> pics = new ArrayList<String>(){
    {
    add("crepemaking1.png");
    add("crepemaking2.png");
    add("crepemaking3.png");
    add("crepemaking4.png");
    add("crepemaking5.png");
    add("crepemaking6.png");
    add("crepemaking7.png");
    add("crepemaking8.png");
    add("crepemaking9.png");
    add("crepemaking10.png");
    }
};

public void cook(){
    java.util.Timer timer = new java.util.Timer();
    timer.schedule(new TimerTask() {
 	    public void run() {
            ImageToShow = pics.get(index);
            index++;
			repaint();
            if(index==10){
                timer.cancel();
            }
    }
 }, 0, 1000);
}



}

