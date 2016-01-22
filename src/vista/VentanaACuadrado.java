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
public class VentanaACuadrado extends JFrame implements ActionListener{
	
	private JTextField txtN1= new JTextField();
	
	private JLabel lbN1= new JLabel("Ingresa el Area:");
	
	private JLabel lbResultado= new JLabel("Resultado");
	
	private JButton btnCalcular= new JButton("Calcular");
	
	private Container c= getContentPane();
	
	/**
	 * Objeto op de la clase PCuadrado que es llamana para calcular perimetros
	 */
private PCuadrado acua = new PCuadrado();
	
	/**
	 * Dimenciones de ventana
	 */
	public VentanaACuadrado(){
		super.setTitle("Operaciones");
		super.setSize(320, 480);
		cargarControles();
	}
	/**
	 * Dimenciones de ventana en tamañanos de botones y cajas de texto
	 */
	private void cargarControles() {
		
		c.setLayout(null);
		lbN1.setBounds(10,10, 280, 30);
		txtN1.setBounds(10, 40, 280, 30);

		btnCalcular.setBounds(10, 170, 280, 30);
		
		lbResultado.setBounds(10,200, 280,30);
		c.add(lbN1);
		c.add(txtN1);
		c.add(btnCalcular);
		c.add(lbResultado);
		btnCalcular.addActionListener(this);
		
	}
	/**
	 * Metodo del boton calcular
	 */
	public void actionPerformed(ActionEvent arg0) {
		double r = acua.Acuadrado(Double.parseDouble(txtN1.getText()));
		lbResultado.setText(String.format("El area %s Es = %f", txtN1.getText(), r)); 		
	}
}
