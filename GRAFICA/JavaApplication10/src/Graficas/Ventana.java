
package Graficas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Ventana {

    public void ventana() {
        JFrame ventana = new JFrame();

        ventana.setSize(500, 500);
        ventana.setLocationRelativeTo(null);      //ubica la ventana en el centro por defecto 
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//se cierra la operacion cuando se cierra la ventana

        JPanel panel = new JPanel();
        panel.setSize(500, 500);

        ventana.setContentPane(panel);//se ancla el panel al frame

       
       JButton boton = new JButton("hola");
       panel.add(boton);
       boton.setBounds(100, 100, 100, 100);
       
       
        ventana.setVisible(true);
        panel.setVisible(true);
    }

}
