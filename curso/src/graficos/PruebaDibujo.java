package curso.src.graficos;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class PruebaDibujo {
    public static void main(String[] args) {
        MarcoDibujos miMarco = new MarcoDibujos();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoDibujos extends JFrame{
    public MarcoDibujos(){
        setTitle("Prueba de dibujo");
        setSize(400,400);
        setLocation(500,200);
        setVisible(true);
        LaminaFiguras miLamina = new LaminaFiguras();
        add(miLamina);
    }
}

class LaminaFiguras extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        // java Graphics
        //g.drawRect(50, 50, 200, 200);
        //g.drawLine(50, 50, 300, 200); //x1,y1,x2,y2
        //g.drawArc(50, 100, 100, 200, 120, 150);

        // java Graphics2D
        Graphics2D g2 = (Graphics2D) g; //convertir a Graphics2D
        Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
        g2.draw(rectangulo);
        
        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo); //se usa el rectangulo para meter la elipse
        g2.draw(elipse);

        // se puede instanciar directamente:
        g2.draw(new Line2D.Double(100,100,300,250));

        // circulo que englobe todo:
        double centroX = rectangulo.getCenterX();
        double centroY = rectangulo.getCenterY();
        double radio = 150;

        Ellipse2D circulo = new Ellipse2D.Double();
        circulo.setFrameFromCenter(centroX, centroY, centroX+radio, centroY+radio);
        g2.draw(circulo);
    }
}