package curso.src.eventos;
import java.awt.event.*;

public class Eventos_07_Raton {
    public static void main(String[] args) {
        MarcoEventos marco1 = new MarcoEventos();
        marco1.setTitle("Eventos de ratón");

        EventosRaton2 raton = new EventosRaton2();
        marco1.addMouseMotionListener(raton);
    }
}

class EventosRaton2 implements MouseMotionListener{

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Estás arrastrando");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Estás moviendo");
    }

}