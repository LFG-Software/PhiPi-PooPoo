import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.Time;

public class Player extends JPanel  {     //zeichnet den Player


    int x = 0, y = 0, velX = 1, velY = 1;


    public Player(int xPosition, int yPosition, int playerWidth, int playerHeight) {

        int x = xPosition;
        int y = yPosition;
        int width = playerWidth;
        int height = playerHeight;


        Rectangle player = new Rectangle(x,y,width,height);

        repaint(player);

        setVisible(true);



    }


    public void paintComponent(Graphics g) {

        g.fillRect(0,0,10000,10000);

        g.setColor(Color.CYAN);
        g.fillRect(x,y,50,50);


        if (x < 0 || x > 590) {     //just4fun
            velX = -velX; }

        if (y < 0 || y > 270) {
            velY = -velY; }


        x += velX;
        y += velY;
        repaint();

    }

}
