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
private int myWindowWidth = 300;
private int myWindowHeight = 400;

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


    public int chooseSize(){
        return 0;
    }
    

    public String chooseFilling(){

        return null;
    }
}
