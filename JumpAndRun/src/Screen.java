import javax.swing.*;
import java.awt.*;

public class Screen extends JPanel {       //zeichnet den Screen = Map

        //Problem: wird nicht gezeichnet



    public void paintComponents(Graphics g) {
        super.paintComponents(g);

        this.setBackground(Color.CYAN);

        g.setColor(Color.RED);
        g.fillRect(0,0,WIDTH,HEIGHT);

        this.setVisible(true);

    }
}

