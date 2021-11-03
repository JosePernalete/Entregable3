
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
<<<<<<< HEAD
=======
import java.awt.Graphics;
import javax.swing.ImageIcon;
>>>>>>> aad8098 (paises)
import javax.swing.*;

public class home {
    public static void main(String[] args) {
        System.out.println("JE");
        // ParteSuperior superior = new ParteSuperior();
        Inicio inicio = new Inicio();
    }

}

class ParteSuperior extends JFrame {

    private JButton config;

    public ParteSuperior() {
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(500, 200);
        this.add(config);
        ActionListener abrirConfig = new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Settings conf = new Settings();
            }
        };

        config.addActionListener(abrirConfig);
    }
}

class Inicio extends JFrame {
<<<<<<< HEAD
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
=======
    private JButton paisBoton;
    private JButton deportista;
    private JButton disciplina;

>>>>>>> aad8098 (paises)

    public Inicio() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setResizable(false);
        setTitle("Gestor de Olimpiadas");
        setVisible(true);
        setLayout(new GridLayout(3, 3, 100, 100));

        paisButton = new JButton("PAIS");
        deportistaBoton = new JButton("DEPORTISTA");
        disciplinaBoton = new JButton("DISCIPLINA");

        ActionListener abrirDeportista = new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Deportistas deportista = new Deportistas();
            }
        };

        deportistaBoton.addActionListener(abrirDeportista);

        ActionListener abrirPais = new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Country pais = new Country();
            }
        };

<<<<<<< HEAD
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
=======
        paisBoton.addActionListener(abrirPais);

        this.add(deportista);
        this.add(paisBoton);
        this.add(disciplina);
    }
    
@Override
      public void paint (Graphics g){
      	    ImageIcon image = new ImageIcon(getClass().getResource("Images/logoOlimpic.jpg"));
        	g.drawImage(image.getImage(),0,0,getWidth(),getHeight(),this);
    	    super.paint(g);
    	  
      }  
}
>>>>>>> aad8098 (paises)

    /*
     * @Override public void paint (Graphics g){ ImageIcon image = new
     * ImageIcon(getClass().getResource("Images/logoOlimpic.jpg"));
     * g.drawImage(image.getImage(),0,0,getWidth(),getHeight(),this);
     * super.paint(g);
     * 
     * }
     */
}
