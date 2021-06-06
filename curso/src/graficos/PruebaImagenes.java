package curso.src.graficos;
import java.awt.*;
import java.io.*;
import javax.swing.*;
import javax.imageio.*;

public class PruebaImagenes {
    public static void main(String[] args) {
        MarcoImagenes miMarco = new MarcoImagenes();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoImagenes extends JFrame{
    public MarcoImagenes(){
        setTitle("Prueba de imagenes");
        setBounds(50,50,500,500);
        setVisible(true);
        LaminaImagenes miLamina = new LaminaImagenes();
        add(miLamina);
    }
}
class LaminaImagenes extends JPanel{
    public LaminaImagenes(){ // constructor
        try {
            // el path de la imagen
            //File imagenFile = new File("curso/src/graficos/coche.png");

            // leer la imagen, se puede instanciar file directamente
            //imagen = ImageIO.read(imagenFile);

            imagen = ImageIO.read(new File("curso/src/graficos/circulo.png"));
        } catch (IOException e) {
            System.out.println("La imagen no se ha encontrado");
        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        // método copyArea
        // mosaico
        int ancho = imagen.getWidth(this); // this se refiere a la lamina
        int alto = imagen.getHeight(this);
        // dibujar primera imagen
        g.drawImage(imagen, 0, 0, null);
        
        for (int i = 0; i <500; i++) {
            for (int j=0; j<500; j++){
                // copia la imagen que ya hemos puesto antes
                g.copyArea(0, 0, ancho, alto, ancho*i, alto*j);
                
            }
        }
    }
    private Image imagen;
}
