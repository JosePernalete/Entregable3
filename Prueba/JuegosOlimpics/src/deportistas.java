
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Deportistas extends JFrame {
    private JButton nuevoBoton;
    private JButton exportarCSV;
    private JButton volver;

    public Deportistas() {
        setSize(500, 500);
        setResizable(false);
        setTitle("Gestor de Olimpiadas - DEPORTISTAS");
        setVisible(true);
        setLayout(new FlowLayout());
        nuevoBoton = new JButton("NUEVO");
        exportarCSV = new JButton("EXPORTAR CSV");
        volver = new JButton("VOLVER");

        ActionListener volverHome = new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Home home = new Home();
            }
        };

        volver.addActionListener(volverHome);

        this.add(nuevoBoton);
        this.add(exportarCSV);
        this.add(volver);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
