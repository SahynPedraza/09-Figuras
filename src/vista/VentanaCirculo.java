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
public class VentanaCirculo extends JFrame implements ActionListener {
	
	private JTextField txtN1= new JTextField();
	
	private JLabel lbN1 = new JLabel("CALCULAR POR RADIO");
	private JLabel lbN2 = new JLabel("Ingresa Radio");
	
	private JLabel lbResultado= new JLabel("Resultado");
	
	private JButton btnCalcularRadio= new JButton("Calcular");
	
	private Container c= getContentPane();
	
	private PCirculo pcir = new PCirculo();
	
	/**
	 * Dimenciones de ventana
	 */
	public VentanaCirculo(){
		super.setTitle("Operaciones");
		super.setSize(320, 480);
		cargarControles();
	}
	/**
	 * Dimenciones de cada elemento que conforma la ventana
	 */
	private void cargarControles() {
		
		c.setLayout(null);
		lbN1.setBounds(10,10, 280, 30);
		lbN2.setBounds(10,40, 280, 30);
		txtN1.setBounds(10, 70, 280, 30);
		
		btnCalcularRadio.setBounds(10, 100, 280, 30);
		
		lbResultado.setBounds(10,200, 280,30);
		
		c.add(lbN1);
		c.add(lbN2);
		c.add(txtN1);
		
		c.add(btnCalcularRadio);
		c.add(lbResultado);
		btnCalcularRadio.addActionListener(this);
		
	}
	/**
	 * Metodo con sentencia if para calcular mediante radio y diametro el area del circulo
	 */
	public void actionPerformed(ActionEvent arg0){
		Object boton = arg0.getSource();
			double s = pcir.Pcirculo(Double.parseDouble(txtN1.getText()));
			lbResultado.setText(String.format("El perimetro %s = %f metros cuadrados", txtN1.getText(), s));
		
	}

}
