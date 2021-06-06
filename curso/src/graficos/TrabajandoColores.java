package curso.src.graficos;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class TrabajandoColores {
    public static void main(String[] args) {
        MarcoColor miMarco = new MarcoColor();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoColor extends JFrame{
    public MarcoColor(){
        setTitle("Prueba de color");
        setSize(400,400);
        setLocation(500,200);
        setVisible(true);
        LaminaColor miLamina = new LaminaColor();
        add(miLamina);
        // definir un color de fondo
        miLamina.setBackground(Color.GRAY);
        //miLamina.setBackground(SystemColor.window); // color del sistema
    }
}
class LaminaColor extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g; //convertir a Graphics2D

        Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
        g2.setColor(Color.BLACK); // cambiar color
        g2.draw(rectangulo); // trazo
        g2.setColor(Color.RED); //cambiar color
        g2.fill(rectangulo); // relleno
        
        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        //g2.setColor(Color.CYAN);
        g2.setColor(new Color(20,100,200)); // con rgb, se puede instanciar a parte
        // brighter() o darker() para cambiar el brillo del color con Color...
        g2.fill(elipse);
    }
}