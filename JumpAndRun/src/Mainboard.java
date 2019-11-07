import javax.swing.*;
import java.awt.*;


public class Mainboard  {       //enthält die einzige Main-Methode


    public Mainboard() {


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {     //macht Spiel weniger anfällig für Threads
            @Override
            public void run() {
                new Mainframe();
            }

        });
    }
}
