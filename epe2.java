package POO;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 * EPE 2: Actividad Evaluativa (EPE 2). Mi primera ventana en Java
 * 
 * @author Yury Llorca
 */

public class epe2 implements ActionListener {
    
    //variables para el ComboBox
    String[] Garsones = new String[] {"Seleccione Garson", "Garson 1", "Garson 2",
                                    "Garson 3", "Garzon 4"};

    private JLabel etiquetaSu, etiquetaG1, etiquetaG2; 
    private JPanel panelIzquierdo, panelDerecho, panelInferior;
    private static JButton botonIz1;

    private JButton botonIz2;

    private JButton botonIz3;

    private JButton botonIz4;

    private JButton botonIz5;
    private JButton botonDe1, botonDe2, botonDe3, botonDe4, botonDe5;
    private JButton botonIn1, botonIn2;
    private JScrollPane scroll;
    private JComboBox combo1;
    
    
    public void contruyePanelIzquierdo(){
        panelIzquierdo = new JPanel();
        etiquetaG1 = new JLabel("Liquidos");
        botonIz1=new JButton("Coca cola");
        botonIz2=new JButton("Fanta");
        botonIz3=new JButton("Sprite");
        botonIz4=new JButton("Té");
        botonIz5=new JButton("Café");
        combo1=new JComboBox<String>(Garsones);

        panelIzquierdo.setLayout(new BoxLayout(panelIzquierdo,BoxLayout.Y_AXIS));
        panelIzquierdo.setBackground(Color.gray);
        panelIzquierdo.add(etiquetaG1);
        panelIzquierdo.add(botonIz1);
        panelIzquierdo.add(botonIz2);
        panelIzquierdo.add(botonIz3);
        panelIzquierdo.add(botonIz4);
        panelIzquierdo.add(botonIz5);
        panelIzquierdo.add(combo1);

        botonIz1.addActionListener(this);
        botonIz2.addActionListener(this);
        botonIz3.addActionListener(this);
        botonIz4.addActionListener(this);
        botonIz5.addActionListener(this);
    }

    public void contruyePanelDerecho(){
        panelDerecho = new JPanel();
        etiquetaG2 = new JLabel("Comestibles y Postres");
        botonDe1=new JButton("Hamburguezas");
        botonDe2=new JButton("Completos");
        botonDe3=new JButton("Chorrillanas");
        botonDe4=new JButton("Papás Fritas");
        botonDe5=new JButton("Helado");
        panelDerecho.setLayout(new BoxLayout(panelDerecho,BoxLayout.Y_AXIS));
        panelDerecho.setBackground(Color.gray);
        panelDerecho.add(etiquetaG2);
        panelDerecho.add(botonDe1);
        panelDerecho.add(botonDe2);
        panelDerecho.add(botonDe3);
        panelDerecho.add(botonDe4);
        panelDerecho.add(botonDe5);

        botonDe1.addActionListener(this);
        botonDe2.addActionListener(this);
        botonDe3.addActionListener(this);
        botonDe4.addActionListener(this);
        botonDe5.addActionListener(this);
    }

    public void contruyePanelInferior(){
        panelInferior = new JPanel();
        botonIn1=new JButton("Aceptar");
        botonIn2=new JButton("Borrar");
        panelInferior.setLayout(new FlowLayout());
        panelInferior.setBackground(Color.green);
        panelInferior.add(botonIn1);
        panelInferior.add(botonIn2);
    }

    public void contruyeVentana(){
        JFrame frame = new JFrame();
        scroll = new JScrollPane(new JTextArea("Observaciones a las comandas",10,15));
        etiquetaSu = new JLabel("Recepción de pedidos y comandas");
        Font aux=etiquetaSu.getFont();
        etiquetaSu.setFont(new Font(aux.getFontName(), aux.getStyle(), 30));
        frame.setLayout(new BorderLayout());

        //agregamos los paneles al frame principal
        frame.add(etiquetaSu,BorderLayout.NORTH);
        frame.add(scroll, BorderLayout.CENTER);
        frame.add(panelIzquierdo,BorderLayout.WEST);
        frame.add(panelDerecho,BorderLayout.EAST);
        frame.add(panelInferior,BorderLayout.SOUTH);
        //Configuramos el frame
        frame.pack();
        frame.setBounds(0, 0, 800, 600);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public epe2(){
        contruyePanelInferior();
        contruyePanelIzquierdo();
        contruyePanelDerecho();
        contruyeVentana();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonIz1) {
         JOptionPane optionPane = new JOptionPane("Se ha seleccionado " + botonIz1.getText(),JOptionPane.WARNING_MESSAGE);
         JDialog dialog = optionPane.createDialog("Selección de Producto");
         dialog.setAlwaysOnTop(true); // to show top of all other application
         dialog.setVisible(true); // to visible the dialog
        }
        if (e.getSource() == botonIz2) {
            JOptionPane optionPane = new JOptionPane("Se ha seleccionado " + botonIz2.getText(),JOptionPane.WARNING_MESSAGE);
            JDialog dialog = optionPane.createDialog("Selección de Producto");
            dialog.setAlwaysOnTop(true); // to show top of all other application
            dialog.setVisible(true); // to visible the dialog
        }
        if (e.getSource() == botonIz3) {
            JOptionPane optionPane = new JOptionPane("Se ha seleccionado " + botonIz3.getText(),JOptionPane.WARNING_MESSAGE);
            JDialog dialog = optionPane.createDialog("Selección de Producto");
            dialog.setAlwaysOnTop(true); // to show top of all other application
            dialog.setVisible(true); // to visible the dialog
        }
        if (e.getSource() == botonIz4) {
            JOptionPane optionPane = new JOptionPane("Se ha seleccionado " + botonIz4.getText(),JOptionPane.WARNING_MESSAGE);
            JDialog dialog = optionPane.createDialog("Selección de Producto");
            dialog.setAlwaysOnTop(true); // to show top of all other application
            dialog.setVisible(true); // to visible the dialog
        }
        if (e.getSource() == botonIz5) {
            JOptionPane optionPane = new JOptionPane("Se ha seleccionado " + botonIz5.getText(),JOptionPane.WARNING_MESSAGE);
            JDialog dialog = optionPane.createDialog("Selección de Producto");
            dialog.setAlwaysOnTop(true); // to show top of all other application
            dialog.setVisible(true); // to visible the dialog
        }
        if (e.getSource() == botonDe1) {
            JOptionPane optionPane = new JOptionPane("Se ha seleccionado " + botonDe1.getText(),JOptionPane.WARNING_MESSAGE);
            JDialog dialog = optionPane.createDialog("Selección de Producto");
            dialog.setAlwaysOnTop(true); // to show top of all other application
            dialog.setVisible(true); // to visible the dialog
        }
        if (e.getSource() == botonDe2) {
            JOptionPane optionPane = new JOptionPane("Se ha seleccionado " + botonDe2.getText(),JOptionPane.WARNING_MESSAGE);
            JDialog dialog = optionPane.createDialog("Selección de Producto");
            dialog.setAlwaysOnTop(true); // to show top of all other application
            dialog.setVisible(true); // to visible the dialog
        }
        if (e.getSource() == botonDe3) {
            JOptionPane optionPane = new JOptionPane("Se ha seleccionado " + botonDe3.getText(),JOptionPane.WARNING_MESSAGE);
            JDialog dialog = optionPane.createDialog("Selección de Producto");
            dialog.setAlwaysOnTop(true); // to show top of all other application
            dialog.setVisible(true); // to visible the dialog
        }
        if (e.getSource() == botonDe4) {
            JOptionPane optionPane = new JOptionPane("Se ha seleccionado " + botonDe4.getText(),JOptionPane.WARNING_MESSAGE);
            JDialog dialog = optionPane.createDialog("Selección de Producto");
            dialog.setAlwaysOnTop(true); // to show top of all other application
            dialog.setVisible(true); // to visible the dialog
        }
        if (e.getSource() == botonDe5) {
            JOptionPane optionPane = new JOptionPane("Se ha seleccionado " + botonDe5.getText(),JOptionPane.WARNING_MESSAGE);
            JDialog dialog = optionPane.createDialog("Selección de Producto");
            dialog.setAlwaysOnTop(true); // to show top of all other application
            dialog.setVisible(true); // to visible the dialog
        }
      }

    public static void main (String [] inforux) {
        new epe2();
    }


}