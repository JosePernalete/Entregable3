
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.*;

public class Country extends JFrame {

    public Country() {
        setVisible(true);
        setSize(500, 500);
        setResizable(false);
        setTitle("Gestor de Olimpiadas - PAIS");
        setLayout(new FlowLayout());
        JButton nuevo;
        this.add(nuevo = new JButton());
        JButton volver;
        this.add(volver = new JButton());
        this.add(new JTable());
    }

}
