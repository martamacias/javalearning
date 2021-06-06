package curso.src.graficos;

import java.awt.*;
import javax.swing.*;

public class CreandoMarcoCentrado {
    public static void main(String[] args) {
        MarcoCentrado miMarco = new MarcoCentrado();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoCentrado extends JFrame{
    public MarcoCentrado(){
        Toolkit mipantalla = Toolkit.getDefaultToolkit();
        Dimension sizepantalla = mipantalla.getScreenSize();
        int alturaPantalla = sizepantalla.height;
        int anchoPantalla = sizepantalla.width;
        setTitle("Marco Centrado");
        // tamaño + centrar
        setSize(anchoPantalla/2, alturaPantalla/2);
        setLocation(anchoPantalla/4, alturaPantalla/4);
    }
}
