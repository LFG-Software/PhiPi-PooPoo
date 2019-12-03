import javax.swing.*;
import java.awt.*;

public class Mainframe extends JFrame {     //macht den Frame und fügt dem Frame alle Komponenten des Spiels zu






        public Mainframe(int width,int height) {
            super("JumpAndRun");


            setSize(new Dimension(width, height));
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setResizable(false);

            Screen screen = new Screen();           //zeigt nix von beiden
            add(screen);

            Character character = new Character();
            add(character);



            setVisible(true);
            setFocusable(true);  //für Keylisteners





        }


}
