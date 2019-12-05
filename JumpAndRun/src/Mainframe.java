import javax.swing.*;
import java.awt.*;

public class Mainframe extends JFrame {     //macht den Frame und fügt dem Frame alle Komponenten des Spiels zu

    public Screen screen;
    public Player player;
    public JLayeredPane jLayeredPane;




    public Mainframe(int width, int height) {
            super("JumpAndRun");





            setSize(width, height);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setResizable(false);

            jLayeredPane = new JLayeredPane();
            add(jLayeredPane);


            screen = new Screen();
            jLayeredPane.add(screen, new Integer(0));
            

            player = new Player();
            jLayeredPane.add(player, new Integer(100));









            setVisible(true);
            setFocusable(true);  //für Keylisteners


        }





}
