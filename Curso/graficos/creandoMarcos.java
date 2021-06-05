package Curso.graficos;

import javax.swing.*;

public class creandoMarcos{
    public static void main(String[] args) {
        // crear nuevo marco
        miMarco marco1 = new miMarco();
        // hacer el marco visible
        marco1.setVisible(true);
        // cuando se cierre se acaba el programa
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class miMarco extends JFrame{
    public miMarco(){
        setSize(500,300);
    }
}