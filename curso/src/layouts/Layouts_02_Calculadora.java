package curso.src.layouts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// CALCULADORA
public class Layouts_02_Calculadora{
    public static void main(String[] args) {
        new MarcoCalculadora();
    }
}

// marco
class MarcoCalculadora extends JFrame{
    public MarcoCalculadora(){
        setVisible(true);
        setTitle("Calculadora");
        setLocation(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        LaminaCalculadora lamina1 = new LaminaCalculadora();
        add(lamina1);
        //pack(); // compacta ventana
        setSize(400, 300);
    }
}

//laminas
class LaminaCalculadora extends JPanel{

    private JPanel lamina2 = new JPanel();
    private JButton pantalla = new JButton("0");
    private boolean principio;
    private String UltimaOperacion;
    private double resultado;

    public LaminaCalculadora(){
        principio = true;
        // lamina resultado
        setLayout(new BorderLayout());
        pantalla.setEnabled(false); // deshabilitar
        add(pantalla, BorderLayout.NORTH);

        // otra lamina para botones
        lamina2.setLayout(new GridLayout(4,4));

        // poner botones a la escucha
        ActionListener insertar = new InsertaNumero();
        ActionListener calcular = new AccionOperacion();
        
        //fila 1
        ponerBoton("7", insertar);
        ponerBoton("8", insertar);
        ponerBoton("9", insertar);
        ponerBoton("/", calcular);
        //fila 2
        ponerBoton("4", insertar);
        ponerBoton("5", insertar);
        ponerBoton("6", insertar);
        ponerBoton("*", calcular);
        //fila 3
        ponerBoton("1", insertar);
        ponerBoton("2", insertar);
        ponerBoton("3", insertar);
        ponerBoton("-", calcular);
        //fila 4
        ponerBoton("0", insertar);
        ponerBoton(".", insertar);
        ponerBoton("=", calcular);
        ponerBoton("+", calcular);

        add(lamina2, BorderLayout.CENTER);

        UltimaOperacion = "=";
    }

    private void ponerBoton(String titulo, ActionListener oyente){
        // poner los botones
        JButton boton = new JButton(titulo);
        boton.addActionListener(oyente);
        lamina2.add(boton);

    }

    // eventos numeros
    private class InsertaNumero implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            // capturar el numero
            String entrada = e.getActionCommand();

            if (principio){ //borra el numero inicial
                pantalla.setText("");
                principio = false;
            }

            pantalla.setText(pantalla.getText() + entrada);
        }
    }
    

    // eventos operaciones
    private class AccionOperacion implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String operacion = e.getActionCommand();
            calcular(Double.parseDouble(pantalla.getText()));
            UltimaOperacion = operacion;
            principio = true;
            
        }

        public void calcular(double x){
            if (UltimaOperacion.equals("+")) {resultado+=x;}
            if (UltimaOperacion.equals("-")) {resultado-=x;}
            if (UltimaOperacion.equals("*")) {resultado*=x;}
            if (UltimaOperacion.equals("/")) {resultado/=x;}
            if (UltimaOperacion.equals("=")) {resultado=x;}

            pantalla.setText(""+resultado);
        }


    }
}