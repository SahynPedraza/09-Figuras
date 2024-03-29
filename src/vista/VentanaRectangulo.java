package vista;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import modelo.*;
/**
 * 
 * @author SAIN PEDRAZA GUERRERO
 *
 */
public class VentanaRectangulo extends JFrame implements ActionListener {
	/**
	 * Elementos que conformaran la ventana
	 */	
	private JTextField txtN1= new JTextField();
	private JTextField txtN2= new JTextField();
	
	private JLabel lbN1= new JLabel("Ingresa la base:");
	private JLabel lbN2= new JLabel("Ingresa la altura:");
	
	
	private JLabel lbResultado= new JLabel("Resultado");
	
	private JButton btnCalcular= new JButton("Calcular");
	
	private Container c= getContentPane();
	
	
	private PRectangulo prec = new PRectangulo();
	
	/**
	 * Dimenciones de ventana
	 */	
	public VentanaRectangulo(){
		super.setTitle("Operaciones");
		super.setSize(320, 480);
		cargarControles();
	}
	/**
	 * Dimenciones de los elementos que conformaran ventana
	 */
	private void cargarControles() {
		
		c.setLayout(null);
		lbN1.setBounds(10,10, 280, 30);
		txtN1.setBounds(10, 40, 280, 30);
		
		lbN2.setBounds(10,70, 280, 30);
		txtN2.setBounds(10, 100, 280, 30);

		btnCalcular.setBounds(10, 170, 280, 30);
		
		lbResultado.setBounds(10,200, 280,30);
		c.add(lbN1);
		c.add(txtN1);
		c.add(lbN2);
		c.add(txtN2);
		c.add(btnCalcular);
		c.add(lbResultado);
		btnCalcular.addActionListener(this);
		
	}
	/**
	 * Metodo de boton para calcular perimetro
	 */
	public void actionPerformed(ActionEvent arg0) {
		double r = prec.Prectangulo(Double.parseDouble(txtN1.getText()), Double.parseDouble(txtN2.getText()));
		lbResultado.setText(String.format("El perimetro es: \n" + "La base %s * \n altura %s \n = %f", txtN1.getText(), txtN2.getText(), r)); 		
	}

}
