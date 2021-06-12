package curso.src.eventos;

import javax.swing.*;
import java.awt.event.*;

// todo en una única clase
public class Eventos_09_FocoVentana  extends JFrame implements WindowFocusListener{
    public static void main(String[] args) {
        Eventos_09_FocoVentana miv = new Eventos_09_FocoVentana();
        miv.iniciar();
    }

    public void iniciar(){
        marco1 = new Eventos_09_FocoVentana();
        marco2 = new Eventos_09_FocoVentana();
        marco1.setVisible(true);
        marco2.setVisible(true);

        marco1.setBounds(50, 100, 600, 350);
        marco2.setBounds(700, 100, 600, 350);

        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        marco1.addWindowFocusListener(this);
        marco2.addWindowFocusListener(this);
    }

    // que ventana tiene el foco
    @Override
    public void windowGainedFocus(WindowEvent e) {
        // TODO Auto-generated method stub
        
        if (e.getSource()==marco1) { marco1.setTitle("Tengo el foco!");}
        else { marco2.setTitle("Tengo el foco!");}
    }

    @Override
    public void windowLostFocus(WindowEvent e) {
        // TODO Auto-generated method stub
        
        if (e.getSource()==marco1) { marco1.setTitle("");}
        else { marco2.setTitle("");}
    }

    Eventos_09_FocoVentana marco1;
    Eventos_09_FocoVentana marco2;
}
