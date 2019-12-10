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
            JPanel master = new JPanel(new CardLayout());




            screen = new Screen();
            add(screen);


            player = new Player();
            //add(player);









            setVisible(true);
            setFocusable(true);  //für Keylisteners


        }





}
