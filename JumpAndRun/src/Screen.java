import javax.swing.*;
import java.awt.*;

public class Screen extends JPanel {       //zeichnet den Screen = Map






    public void paintComponent(Graphics g) {


        g.setColor(Color.MAGENTA);
        g.fillRect(0,0,1000,1000);

        g.setColor(Color.BLACK);
        g.drawLine(1,1,100,100);





    }

}

