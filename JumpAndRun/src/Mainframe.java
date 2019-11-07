import javax.swing.*;
import java.awt.*;

public class Mainframe extends JFrame {     //macht den Frame und fügt dem Frame alle Komponenten des Spiels zu


    public int widthGame = 100000;
    private int heigthGame = 10000;

        public Mainframe() {
            super("Mainframe");

            setSize(widthGame,heigthGame);
            setDefaultCloseOperation(EXIT_ON_CLOSE);


            Map map = new Map();        //Problem: man sieht nicht die Map, nur den Character
            add(map);
            Character character = new Character();
            add(character);

            //Game game = new Game();
            //add(game);

            setVisible(true);
            setFocusable(true);         //für Keylisteners


        }


}
