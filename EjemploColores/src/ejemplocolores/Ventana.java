package ejemplocolores;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ventana extends JFrame implements ActionListener {
    JTextField colorHEX = new JTextField();
    JTextField R = new JTextField();
    JTextField G = new JTextField();
    JTextField B = new JTextField();
    JLabel label1, label2;
    JLabel r,g,b;
    JButton prueba1, prueba2;
    
    public Ventana() {
        this.setLayout(null);
        this.setBounds(100,100,550,400);
        this.setTitle("Prueba de colores");
        
        label1 = new JLabel("Color hexadecimal");
        label1.setBounds(20,30,150,30);
        this.add(label1);
        
        colorHEX.setBounds(10,60,120,30);
        colorHEX.setVisible(true);
        this.add(colorHEX);
        
        prueba1 = new JButton("HEX");
        prueba1.setBounds(10,100,120,30);
        prueba1.addActionListener(this);
        prueba1.setVisible(true);
        this.add(prueba1);
        
        
        label2 = new JLabel("Colores RGB");
        label2.setBounds(420, 30,150,30);
        this.add(label2);
        r = new JLabel("R");
        r.setBounds(380, 60, 20,30);
        R.setBounds(400, 60, 120,30);

        g = new JLabel("G");
        g.setBounds(380, 100, 120,30);
        G.setBounds(400, 100, 120,30);
        
        b = new JLabel("B");
        b.setBounds(380, 140, 120,30);        
        B.setBounds(400, 140, 120,30);
        
        r.setVisible(true);
        R.setVisible(true);
        g.setVisible(true);
        G.setVisible(true);
        b.setVisible(true);
        B.setVisible(true);
        
        this.add(R);
        this.add(r);
        this.add(G);
        this.add(g);
        this.add(B);
        this.add(b);
        
        
        prueba2 = new JButton("RGB");
        prueba2.setBounds(400, 200, 120,30);
        prueba2.addActionListener(this);
        prueba2.setVisible(true);
        this.add(prueba2);
        


        this.setVisible(true);
    }
    
    // Metodo para convertir un Color Hexadecimal a entero
    // Esto para que Java reconozca colores como #FF0000
    public int hex( String color_hex )
    {
        return Integer.parseInt(color_hex,  16 );
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
    if(ae.getSource() == prueba1)
    {
        System.out.println("PRUEBA DE COLORES HEXADECIMAL");
        String color = colorHEX.getText();
        // Creamos el color con el siguiente objeto
        Color fondo;
        // Le enviamos como parametro el metodo que creamos, el HEX
        // En este caso va a recibir el codigo escrito en la consola
        // Pero lo que va donde dice (color), deberia de ser el codigo
        // En Hexadecimal, sin el #
        fondo = new Color(hex(color));
        
        // Como ustedes no necesitan tanto metodo lo unico que van a hacer es
        // Color nuevo_color = new Color(hex(HEXADECIMAL));
        // Donde hex(HEXADECIMAL) es el metodo que agregamos
        // HEXADECIMAL puede ser #4DB6AC, #00E676, #F57F17
        // Solo recuerden que tiene que ir sin el #
        // Como por ejemplo
        // Color color1 = new Color(hex("4DB6AC"));
        // Color color2 = new Color(hex("00E676"));
        // Color color3 = new Color(hex("F57F17"));
        // Recuerden que este metodo recibe cadenas y el otro recibe numeros enteros
        JOptionPane.showMessageDialog(this, "Se va a cambiar el color del fondo segun HEX");
        this.getContentPane().setBackground(fondo);
    }
    else if(ae.getSource() == prueba2)
    {
        System.out.println("PRUEBA DE COLORES RGB");
        // en este caso vamos a recibir los 3 campos que estan en la ventana y los convertimos a enteroas
        int color_r,color_g,color_b;
        color_r = Integer.parseInt(R.getText());
        color_g = Integer.parseInt(G.getText());
        color_b = Integer.parseInt(B.getText());
        // Creamos el color con el siguiente objeto
        Color fondo;
        // En este caso vamos a crear el color con los RGB del color
        // Miramos los RGB del color que queremos en la pagina que les comparti
        // Y lo agregamos el new Color
        fondo = new Color(color_r,color_g,color_b);
        
        // Como ustedes no estan trabajando con tantos metodos, lo unico que deben de hacer es
        // Color nuevo_color = new Color(R,G,B);
        // Donde R, es el numero en R de la pagina
        // Donde G, es el numero en G de la pagina
        // Donde B, es el numero en B de la pagina
        
        // Y ya pueden usar los colores que ustedes quieran.
        JOptionPane.showMessageDialog(this, "Se va a cambiar el color del fondo segun RGB");
        this.getContentPane().setBackground(fondo);
        System.out.println("Este es un mensaje bonito que se ve al cambiar de color el fondo");
        // ESTOY AGREGANDO MAS CODIGO INTERESANTE
    }
    }
    
}
