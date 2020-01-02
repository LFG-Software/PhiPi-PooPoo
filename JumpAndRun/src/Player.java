import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.Time;

public class Player extends JPanel  {     //zeichnet den Player


    public int x = 0, y = 0;




    public void paintComponent(Graphics g) {



        g.setColor(Color.CYAN);
        g.fillRect(x,y,100,100);

        repaint();

    }

}
