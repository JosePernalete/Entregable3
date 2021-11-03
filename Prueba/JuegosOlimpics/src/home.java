
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.*;

public class Home extends JFrame {

    private JPanel panel;
    private JButton Config, deportistaBoton, paisBoton, btn3, btn4, btn5, btn6, btn7, btn8, btn9;

    Home() {

        this.setSize(500, 500);
        this.setResizable(false);
        getContentPane().setBackground(Color.orange);

        // Botón configuración
        Config = new JButton();
        setLayout(new FlowLayout(FlowLayout.RIGHT));
        Config.setIcon(new ImageIcon("src/Images/configuration.png"));
        // Config.setBackground(Color.red);
        this.add(Config);

        // Panel
        panel = new JPanel();

        deportistaBoton = new JButton("DEPORTISTA");
        deportistaBoton.setBackground(Color.white);
        ImageIcon iconoDepo = new ImageIcon("Icono_deportista.png");
        deportistaBoton.setIcon(iconoDepo);

        ActionListener irDeportistas = new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Deportistas deportista = new Deportistas();
            }
        };

        deportistaBoton.addActionListener(irDeportistas);

        paisBoton = new JButton("PAIS");
        paisBoton.setBackground(Color.white);
        ImageIcon iconoPais = new ImageIcon("Icono_pais.png");
        paisBoton.setIcon(iconoPais);

        ActionListener irPais = new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Pais pais = new Pais();

            }
        };

        paisBoton.addActionListener(irPais);

        btn3 = new JButton("DISCIPLINA");
        btn3.setBackground(Color.white);
        ImageIcon iconoDisc = new ImageIcon("Icono_disciplinas.png");
        btn3.setIcon(iconoDisc);

        btn4 = new JButton("SIN DEFINIR");
        btn4.setBackground(Color.white);
        btn5 = new JButton("SIN DEFINIR");
        btn5.setBackground(Color.white);
        btn6 = new JButton("SIN DEFINIR");
        btn6.setBackground(Color.white);
        btn7 = new JButton("SIN DEFINIR");
        btn7.setBackground(Color.white);
        btn8 = new JButton("SIN DEFINIR");
        btn8.setBackground(Color.white);
        btn9 = new JButton("SIN DEFINIR");
        btn9.setBackground(Color.white);

        panel.setLayout(new GridLayout(3, 3, 80, 80));
        panel.add(deportistaBoton);
        panel.add(paisBoton);
        panel.add(btn3);
        panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);
        panel.add(btn7);
        panel.add(btn8);
        panel.add(btn9);

        panel.setBackground(Color.lightGray);
        this.add(panel);

    }

    public static void main(String[] args) {
        Home home = new Home();
        home.setVisible(true);
    }

}
