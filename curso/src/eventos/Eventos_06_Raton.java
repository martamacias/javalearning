package curso.src.eventos;
import java.awt.event.*;

public class Eventos_06_Raton {
    public static void main(String[] args) {
        MarcoEventos marco1 = new MarcoEventos();
        marco1.setTitle("Eventos de ratón");

        EventoRaton raton = new EventoRaton();
        marco1.addMouseListener(raton);
    }
}

// MouseAdapter para poner los métodos que queramos, no todos
class EventoRaton extends MouseAdapter{

    /*@Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Has hecho clic");
        System.out.println("Coordenada X: "+e.getX()+" Coordenada Y: "+e.getY());
        System.out.println("Número de clics seguidos: "+e.getClickCount());
    }*/

    @Override
    public void mousePressed(MouseEvent e) {
        // devuelve número según el botón del ratón:
        //System.out.println(e.getModifiersEx());

        // con el nombre del botón:
        if (e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK) System.out.println("Botón izquierdo");
        if (e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK) System.out.println("Rueda");
        if (e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK) System.out.println("Botón derecho");
    }
}


// implements MouseListener, hay que poner todos los métodos
/*class EventoRaton implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Has hecho clic");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("El ratón ha entrado en el marco");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("El ratón ha salido en el marco");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Acabas de presionar");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Acabas de levantar");
    }
}*/