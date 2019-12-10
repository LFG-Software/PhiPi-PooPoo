import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Screen extends JPanel {       //zeichnet den Screen = Map


    int x = 0, y = 0, velX = 5, velY = 5;

    int x1,y1,x2,y2,x3,y3,x4,y4,x5,y5,x6,y6,x7,y7,x8,y8,x9,y9,x10,y10,x11,y11;

    Random random;
    int max = 1000;
    int maxY = 1000;




    public void paintComponent(Graphics g) {


        g.setColor(Color.MAGENTA);
        g.fillRect(0,0,10000,10000);

        g.setColor(Color.YELLOW);
        g.drawLine(x1,y1,x2,y2);

        g.setColor(Color.GREEN);
        g.fillRect(x3,y3,x4,y4);

        g.setColor(Color.CYAN);
        g.fillOval(x5,y5,x6,y6);

        g.setColor(Color.RED);
        g.fillArc(x7,y7,x8,y8,x9,x9);

        g.setColor(Color.ORANGE);
        g.fillRect(x10,y10,x11,y11);

        random = new Random();      //just4fun
        int randomNumX = random.nextInt(max);
        int randomNumY = random.nextInt(maxY);
        int randomNumX2 = random.nextInt(max);
        int randomNumY2 = random.nextInt(maxY);
        int randomNumX3 = random.nextInt(max);
        int randomNumY3 = random.nextInt(maxY);
        int randomNumX4 = random.nextInt(max);
        int randomNumY4 = random.nextInt(maxY);
        int randomNumX5 = random.nextInt(max);
        int randomNumY5 = random.nextInt(maxY);
        int randomNumX6 = random.nextInt(max);
        int randomNumY6 = random.nextInt(maxY);
        int randomNumX7 = random.nextInt(max);
        int randomNumY7 = random.nextInt(maxY);
        int randomNumX8 = random.nextInt(max);
        int randomNumY8 = random.nextInt(maxY);
        int randomNumX9 = random.nextInt(max);
        int randomNumY9 = random.nextInt(maxY);
        int randomNumX10 = random.nextInt(max);
        int randomNumY10 = random.nextInt(maxY);
        int randomNumX11 = random.nextInt(max);
        int randomNumY11 = random.nextInt(maxY);


        x1 = randomNumX;
        y1 = randomNumY;
        x2 = randomNumX2;
        y2 = randomNumY2;
        x3 = randomNumX3;
        y3 = randomNumY3;
        x4 = randomNumX4;
        y4 = randomNumY4;
        x5 = randomNumX5;
        y5 = randomNumY5;
        x6 = randomNumX6;
        y6 = randomNumY6;
        x7 = randomNumX7;
        y7 = randomNumY7;
        x8 = randomNumX8;
        y8 = randomNumY8;
        x9 = randomNumX9;
        y9 = randomNumY9;
        x10 = randomNumX10;
        y10 = randomNumY10;
        x11 = randomNumX11;
        y11 = randomNumY11;




        repaint();


        g.setColor(Color.CYAN);
        g.fillRect(x,y,100,100);


        if (x < 0 || x > 1180) {     //just4fun
            velX = -velX ; }

        if (y < 0 || y > 840) {
            velY = -velY ; }


        x += velX;
        y += velY;






        repaint();



    }

}

