package Entregable3.Prueba.JuegosOlimpics.src;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import javax.swing.*;

public class home {
    public static void main(String[] args) {
        Inicio inicio = new Inicio();
        inicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inicio.setSize(500, 500);
        inicio.setResizable(false);
        inicio.setTitle("Gestor de Olimpiadas");
        inicio.setVisible(true);
        inicio.setLayout(new GridLayout(3, 3, 100, 100));
    }

}

class Inicio extends JFrame {
    private JButton paisButton;
    private JButton deportistaBoton;
    private JButton disciplinaBoton;
    private JButton paisBoton;
    private JButton deportista;
    private JButton disciplina;
    private JButton sinDefinir1;
    private JButton sinDefinir2;
    private JButton sinDefinir3;
    private JButton sinDefinir4;
    private JButton sinDefinir5;
    private JButton sinDefinir6;

    public Inicio() {
        paisButton = new JButton("PAIS");
        deportistaBoton = new JButton("DEPORTISTA");
        disciplinaBoton = new JButton("DISCIPLINA");

        ActionListener abrirDeportista = new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                deportistas deportista = new deportistas();
            }
        };

        deportistaBoton.addActionListener(abrirDeportista);

        ActionListener abrirPais = new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                pais pais = new pais();
            }
        };

        paisButton.addActionListener(abrirPais);

        this.add(deportistaBoton);
        this.add(paisButton);
        this.add(disciplinaBoton);
        this.add(new JButton("SIN DEFINIR"));
        this.add(new JButton("SIN DEFINIR"));
        this.add(new JButton("SIN DEFINIR"));
        this.add(new JButton("SIN DEFINIR"));
        this.add(new JButton("SIN DEFINIR"));
        this.add(new JButton("SIN DEFINIR"));
    }

    /*
     * @Override public void paint (Graphics g){ ImageIcon image = new
     * ImageIcon(getClass().getResource("Images/logoOlimpic.jpg"));
     * g.drawImage(image.getImage(),0,0,getWidth(),getHeight(),this);
     * super.paint(g);
     * 
     * }
     */
}
