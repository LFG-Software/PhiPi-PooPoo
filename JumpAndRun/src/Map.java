import javax.swing.*;
import java.awt.*;

public class Map extends JPanel {       //zeichnet die Map

    public int x1 = 100;
    public int y1 = 500;
    public int x2 = 1000;
    public int y2 = y1;






    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.CYAN);
        this.setVisible(true);

        g.setColor(Color.RED);
        g.drawLine(x1,y1,x2,y2);


    }

}

