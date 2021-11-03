
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.*;

public class NuevoDeportista extends JFrame {
    private Label nombre, apellido, email, telefono, pais, disciplina;
    private TextField nombreText, apellidoText, emailText, telefonoText;
    private JButton guardar;
    // private BoxField paisBox, disciplinaBox;

    public NuevoDeportista() {
        this.setSize(500, 800);
        this.setResizable(false);
        setTitle("Gestor de Olimpiadas - NUEVO DEPORTISTA");
        setLayout(new FlowLayout());
        nombre = new Label("NOMBRE");
        nombreText = new TextField(" ", 20);

        apellido = new Label("APELLIDO");
        apellidoText = new TextField(" ", 20);

        email = new Label("EMAIL");
        emailText = new TextField(" ", 20);

        telefono = new Label("TELEFONO");
        telefonoText = new TextField(" ", 20);

        // pais = new Label("PAIS");
        // paisBox = new BoxField();

        // disciplina = new Label("DISCIPLINA");
        // disciplinaBox = new BoxField();

        guardar = new JButton("GUARDAR");
        add(guardar);
    }
}
