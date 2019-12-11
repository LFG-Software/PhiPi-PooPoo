import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class Game extends JFrame implements ActionListener {     //initialisiert das Spiel + ersetzt Klasse Mainboard

    public final int WIDTH = 1280;
    public final int HEIGHT = 940;
    private boolean running = false;
    public int x = 2, y = 3,width = 20, height = 20;



    public static Game game;
    public Mainframe mainframe;
    public Screen screen;
    public Random random;
    public Rectangle object;
    public Renderer renderer;
    public Player player;





    public Game() {
        mainframe = new Mainframe(WIDTH,HEIGHT);



        player = new Player(x,y,width,height);
        mainframe.add(player);


        object = new Rectangle(WIDTH/2, HEIGHT/2,100,100);




        setSize(WIDTH,HEIGHT);
        setVisible(true);
        mainframe.setVisible(true);

        //run();
    }

    public void start() {

        running = true;
    }

    public void stop() {
        System.exit(1);
    }



    public void run() {                 //"game loop"

        long lastTime = System.nanoTime();
        double fps = 60.0;
        double ns = 1000000000.0;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int frames = 0;

        start();

        //wenn spiel läuft soll die position der objekte und die map aktualisiert werden, falls tod das spiel beenden
        while (running) {

            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;

            while (delta >= 0) {
            update();
            delta--;
        }
            if(running)
                render();

            frames++;

            if (System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                System.out.println("FPS: " + frames);
                frames = 0;
                }

        }
        if (!running) {
            stop();
        }
    }
    private void update() { //aktualisiert das spiel




        if (WIDTH == 2734321/* wenn spieler tot*/) {
            running = false;
        }
    }

    private void render() {

    }





    public void paint(Graphics g) {

        g.setColor(Color.CYAN);
        g.fillRect(0,0,WIDTH,HEIGHT);


        g.setColor(Color.BLACK);
        g.fillRect(object.x,object.y,object.width,object.height);

        int velX = 3;
        int velY = 3;

        if (object.x < 0 || object.x > WIDTH) {     //just4fun
            velX = -velX; }

        if (object.y < 0 || object.y > HEIGHT) {
            velY = -velY; }


        object.x += velX;
        object.y += velY;


    }

    public void actionPerformed(ActionEvent e) {


    }


    public void keyListener(KeyEvent keyEvent) {
        int test = 0;
        System.out.println(test);
        if(keyEvent.getKeyCode() == KeyEvent.VK_W) {
            test = 1;
            System.out.println(test);
        }

    }


    public void paintComponent(Graphics g) {

        int velX = 3;
        int velY = 3;

        if (object.x < 0 || object.x > WIDTH) {     //just4fun
            velX = -velX; }

        if (object.y < 0 || object.y > HEIGHT) {
            velY = -velY; }


        object.x += velX;
        object.y += velY;
        repaint();

    }






    public static void main(String[] args) {

              game = new Game();


            }


}