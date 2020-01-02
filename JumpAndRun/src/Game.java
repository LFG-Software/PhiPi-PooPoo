import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class Game extends JPanel implements ActionListener {     //initialisiert das Spiel + ersetzt Klasse Mainboard

    public final int WIDTH = 1280;
    public final int HEIGHT = 940;
    private boolean running = false;
    public int x = 2, y = 3,width = 20, height = 20;
    public int velX = 500;
    public int velY = 500;



    public static Game game;
    public Mainframe mainframe;
    public Screen screen;
    public Random random;
    public Rectangle object;
    public Renderer renderer;
    public Player player;
    public Game player1;





    public Game() {
        mainframe = new Mainframe(WIDTH,HEIGHT);



        player = new Player();
        mainframe.add(player);

        movePlayer();


        //object = new Rectangle(WIDTH/2, HEIGHT/2,100,100);
        //run();

        mainframe.setVisible(true);

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







    public void paintComponent(Graphics g) {

        g.setColor(Color.CYAN);
        g.fillRect(0,0,WIDTH,HEIGHT);


        g.setColor(Color.BLACK);
        g.fillRect(x,y,width,height);



    }

    public void actionPerformed(ActionEvent e) {

        player.x = 200;
        player.y = 200;





        if (player.x < 0 || player.x > WIDTH) {
            velX = -velX;
        }

        if (player.y < 0 || player.y > HEIGHT) {
            velY = -velY;
        }


        player.x += 2;
        player.y += 2;





    }


    public void keyListener(KeyEvent keyEvent) {
        int test = 0;
        System.out.println(test);
        if(keyEvent.getKeyCode() == KeyEvent.VK_W) {
            test = 1;
            System.out.println(test);
        }

    }

    public void movePlayer() {


        if (player.x < 0 || player.x > WIDTH) {
            velX = -velX;
        }

        if (player.y < 0 || player.y > HEIGHT) {
            velY = -velY;
        }



        player.x += velX;
        player.y += velY;



    }








    public static void main(String[] args) {

              game = new Game();


            }


}