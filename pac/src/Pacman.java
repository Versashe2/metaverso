package src;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Pacman extends JFrame {

    public Pacman() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new Board());
        
        setTitle("Metaverso");                    // Nombre de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);  //Deja de correr el programa al cerrar la ventana
        setSize(380, 420);                       // Tamaño de la Ventana.
        setLocationRelativeTo(null);             // Posición donde se inicia la ventana, al ser null es en el centro.  
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            var ex = new Pacman();
            ex.setVisible(true);
        });
    }
}