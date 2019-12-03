import javax.swing.*;
import java.awt.*;

public class Game extends JFrame implements Runnable  {     //initialisiert das Spiel + ersetzt Klasse Mainboard

    public int WIDTH = 640;
    public int HEIGHT = 320;
    private boolean running = false;


    public Game() {
        new Mainframe(WIDTH,HEIGHT);



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




    public static void main(String[] args) {        //zeigt nur frame ohne iwas darauf
                new Game();


            }


}