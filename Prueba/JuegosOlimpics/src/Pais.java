
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.Border;

import java.awt.*;
import javax.swing.table.DefaultTableModel;

public class Pais extends JFrame {

    // private JTable table = new JTable();
    private JButton nuevo = new JButton("Nuevo");
    private JButton volver = new JButton("Volver");
    private JPanel P = new JPanel();
    private Border border;

    public Pais() {
        P.setLayout(new FlowLayout());
        P.add(nuevo);
        P.add(volver);
        P.setBorder(border);
        setVisible(true);
        setSize(500, 500);
        setResizable(false);
    }

    /*
     * public class pais extends JFrame {
     * 
     * public pais() {
     * 
     * setVisible(true); setSize(500, 500); setResizable(false);
     * setTitle("Gestor de Olimpiadas - PAIS"); setLayout(new FlowLayout()); JButton
     * nuevo; this.add(nuevo = new JButton()); JButton volver; this.add(volver = new
     * JButton()); this.add(new JTable()); }
     */

}
