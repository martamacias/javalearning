package curso.src.eventos;
import java.awt.event.*;

public class Eventos_05_Teclado {
    public static void main(String[] args) {
        MarcoEventos marco1 = new MarcoEventos();
        marco1.setTitle("Ventana teclado");

        EventoTeclado tecla = new EventoTeclado();
        marco1.addKeyListener(tecla);
    }
}
// implements KeyLister es lo mismo pero se deben poner todos los métodos (los he puesto igual)
class EventoTeclado extends KeyAdapter{

    @Override
    public void keyPressed(KeyEvent e) {
        // muestra el codigo de la tecla, solo presionada
        //int codigo = e.getKeyCode();
        //System.out.println(codigo);
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // escribe el caracter de la tecla, presionada y soltada
        char letra = e.getKeyChar();
        System.out.print(letra);
    }

}