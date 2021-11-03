package Entregable3.Prueba.JuegosOlimpics.src;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

public class deportistas extends JFrame {
    private JButton nuevoBoton;
    private JButton exportarCSV;
    private JButton volver;

    public deportistas() {
        setSize(500, 500);
        setResizable(false);
        setTitle("Gestor de Olimpiadas - DEPORTISTAS");
        setVisible(true);
        setLayout(new FlowLayout());
        nuevoBoton = new JButton("NUEVO");
        exportarCSV = new JButton("EXPORTAR CSV");
        volver = new JButton("VOLVER");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
