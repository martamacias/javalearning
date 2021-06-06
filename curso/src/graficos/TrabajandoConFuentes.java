package curso.src.graficos;
import java.awt.*;
import javax.swing.*;

public class TrabajandoConFuentes {
    public static void main(String[] args) {
        MarcoFuentes miMarco = new MarcoFuentes();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoFuentes extends JFrame{
    public MarcoFuentes(){
        setTitle("Prueba de fuentes");
        setSize(400,400);
        setLocation(500,200);
        setVisible(true);
        LaminaFuentes miLamina = new LaminaFuentes();
        add(miLamina);
        // todos los elementos con el mismo color:
        miLamina.setForeground(Color.BLUE);
    }
}
class LaminaFuentes extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        Font miFuente = new Font("Arial", Font.BOLD, 25);
        // se puede instanciar directamente
        g2.setFont(miFuente);
        g2.drawString("Marta", 100, 100);

        g2.setFont(new Font("Courier", Font.ITALIC, 23));
        g2.drawString("Prueba de fonts", 100, 200);
        // se puede poner color y poner más strings
    }
}
