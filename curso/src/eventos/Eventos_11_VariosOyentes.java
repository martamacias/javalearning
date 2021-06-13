package curso.src.eventos;

import javax.swing.*;
import java.awt.event.*;

public class Eventos_11_VariosOyentes {
    public static void main(String[] args) {
        MarcoEventos marco1 = new MarcoEventos();
        marco1.setLocation(1000, 200);
        marco1.add(new LaminaPrincipal());

        marco1.setSize(300, 200);
    }
}

class LaminaPrincipal extends JPanel {

    // se va a tener que usar dentro de otros métodos
    JButton botonCerrar;

    public LaminaPrincipal(){
        JButton botonNuveo = new JButton("Nuevo");
        add(botonNuveo);

        botonCerrar = new JButton("Cerrar todo");
        add(botonCerrar);

        OyenteNuevo oyente = new OyenteNuevo();

        botonNuveo.addActionListener(oyente);
    }
    
    private class OyenteNuevo implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            new MarcoEmergente(botonCerrar);
            // pasar el boton
        }

    }
}

class MarcoEmergente extends JFrame {
    // número de ventana va incrementando
    private static int contador = 0;

    // crear nuevas ventanas
    public MarcoEmergente(JButton botonLamina){
        setVisible(true);
        contador ++;
        setTitle("Ventana " + contador);
        // se crean en posiciones diferentes
        setBounds(60*contador, 60*contador, 300, 200);

        // cerrar ventanas
        CierraMarcos oyenteCerrar = new CierraMarcos();
        botonLamina.addActionListener(oyenteCerrar);
    }

    // cerrar marcos emergentes
    private class CierraMarcos implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            dispose(); // cierra ventanas
        }

    }
}