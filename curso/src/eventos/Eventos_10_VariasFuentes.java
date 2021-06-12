package curso.src.eventos;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Eventos_10_VariasFuentes {
    public static void main(String[] args) {
        MarcoEventos marco1 = new MarcoEventos();
        marco1.setTitle("Multiples Focos");

        LaminaFuentes lamina = new LaminaFuentes();
        marco1.add(lamina);

        marco1.setSize(1000,500);
    }
}

class LaminaFuentes extends JPanel {
    
    public LaminaFuentes(){

        // cambiar el color con botones
        AccionColor accion_amarillo = new AccionColor("Amarillo", new ImageIcon("curso/img/amarillo.gif"), 
        Color.YELLOW);
        AccionColor accion_azul = new AccionColor("Azul", new ImageIcon("curso/img/azul.gif"), 
        Color.BLUE);
        AccionColor accion_rojo = new AccionColor("Rojo", new ImageIcon("curso/img/rojo.gif"), 
        Color.RED);
        
        /*JButton botonAzul = new JButton(accion_azul);
        JButton botonAmarillo = new JButton(accion_amarillo);
        JButton botonRojo = new JButton(accion_rojo);*/

        add(new JButton(accion_amarillo));
        add(new JButton(accion_azul));
        add(new JButton(accion_rojo));

        //cambiar el color con combinaciones de teclas
        // mapa de entrada
        InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);

        // accion según entrada de tecla
        KeyStroke teclaAmarilla = KeyStroke.getKeyStroke("ctrl A");

        //asignar teclas a objeto (normal y simplificado)
        mapaEntrada.put(teclaAmarilla, "fondo_amarillo");
        mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondo_azul");
        mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "fondo_rojo");

        //asignar objeto a acción
        ActionMap mapaAccion = getActionMap();
        mapaAccion.put("fondo_amarillo", accion_amarillo);
        mapaAccion.put("fondo_azul", accion_azul);
        mapaAccion.put("fondo_rojo", accion_rojo);
    }

    private class AccionColor extends AbstractAction {

        public AccionColor(String nombre, Icon icono, Color color_boton){
            
            putValue(Action.NAME, nombre);
            putValue(Action.SMALL_ICON, icono);
            putValue(Action.SHORT_DESCRIPTION, "Poner la lámina de color "+nombre);
            putValue("color_fondo", color_boton);
        }

        public void actionPerformed(ActionEvent e) {
            Color c = (Color) getValue("color_fondo");
            setBackground(c);
        }
    
    }
}

