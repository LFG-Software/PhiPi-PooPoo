import javax.swing.*;
import java.awt.*;

public class Character extends JPanel {     //zeichnet den Character

    //Problem: wird nicht gezeichnet


    public int x1 = 100;
    public int y1 = 500;
    public int x2 = 1000;
    public int y2 = y1;

    public int x_Position = (x1 + x2)/2;
    public int y_Position = y1;
    private int breite = 10;
    private int hoehe = 10;



    public void paintComponent(Graphics Character) {



        Character.setColor(Color.RED);
        Character.fillRect(x_Position,y_Position,breite,hoehe);
        setVisible(true);


    }


}
