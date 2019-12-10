import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class Game extends JFrame {     //initialisiert das Spiel + ersetzt Klasse Mainboard

    public final int WIDTH = 1280;
    public final int HEIGHT = 940;
    private boolean running = false;

    public static Game game;
    public Mainframe mainframe;
    public Screen screen;
    public Player player;
    public Random random;

    public Rectangle object;



    public Game() {
        mainframe = new Mainframe(WIDTH,HEIGHT);

        player = new Player();
        mainframe.add(player);





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


    public void paint(Graphics player) {
        player.setColor(Color.CYAN);
        player.fillRect(100,120,30,30);
    }



    public void keylistenerTest(KeyEvent keyEvent) {
        int test = 0;
        System.out.println(test);
        if(keyEvent.getKeyCode() == KeyEvent.VK_W) {
            test = 1;
            System.out.println(test);
        }

    }







    public static void main(String[] args) {

               game = new Game();


            }


}