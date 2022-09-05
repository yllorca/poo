package POO;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

/**
 * EPE 1: Un restaurant conocido de la región 
 * te pide realizar su ventana de recepción de pedidos y 
 * comandas para los garzones y personal de cocina. 
 * Para esto, se requiere una interfaz de usuario para pantalla táctil, 
 * de fácil uso.
 * Debe crear una sola ventana que contenga lo siguiente:
 * Debe contener 10 botones de comandas con nombres de posibles bebidas, comestibles, postres, etc. 
 * Debe contener 1 combobox para selección de empleados. 
 * Debe contener 1 campo de texto para agregar observaciones a las comandas.

 * 
 * @author Yury Llorca
 */
public class epe1 {
    
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

    public epe1(){
        contruyePanelInferior();
        contruyePanelIzquierdo();
        contruyePanelDerecho();
        contruyeVentana();
    }

    public static void main (String [] inforux){
        new epe1();
    }


}