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
public class VentanaTrianguloEscaleno extends JFrame implements ActionListener {
	/**
	 * Elementos que seran llamados cajas de texto, labels y botones
	 */	
	private JTextField txtN1= new JTextField();
	private JTextField txtN2= new JTextField();
	private JTextField txtN3= new JTextField();
	
	private JLabel lbN1 = new JLabel("Ingresa lado 1");
	private JLabel lbN2 = new JLabel("Ingresa lado 2");
	private JLabel lbN3 = new JLabel("Ingresa lado 3");
		
	private JLabel lbResultado= new JLabel("Resultado");
	
	private JButton btnCalcular= new JButton("Calcular");
	
	private Container c= getContentPane();
	/**
	 * Objeto op de la clase PTrianguloEquilatero para calcular area de triangulo escaleno
	 */	
	private PTrianguloEscaleno ptriesca = new PTrianguloEscaleno();
	
	/**
	 * Dimenciones de ventana
	 */	
	public VentanaTrianguloEscaleno(){
		super.setTitle("Operaciones");
		super.setSize(320, 480);
		cargarControles();
	}
	/**
	 * Dimenciones de cada elemento de la ventana en tamaño
	 */	
	private void cargarControles() {
		
		c.setLayout(null);
		lbN1.setBounds(10,10, 280, 30);
		txtN1.setBounds(10, 40, 280, 30);
		
		lbN2.setBounds(10,70, 280, 30);
		txtN2.setBounds(10, 100, 280, 30);
		
		lbN3.setBounds(10,130, 280, 30);
		txtN3.setBounds(10, 160, 280, 30);
		
		btnCalcular.setBounds(10, 200, 280, 30);
		
		lbResultado.setBounds(10,230, 280,30);
		c.add(lbN1);
		c.add(txtN1);
		c.add(lbN2);
		c.add(txtN2);
		c.add(lbN3);
		c.add(txtN3);
		c.add(btnCalcular);
		c.add(lbResultado);
		btnCalcular.addActionListener(this);
		
	}
	/**
	 * Metodo del boton calcular para el diametro del triangulo escaleno
	 */	
	public void actionPerformed(ActionEvent arg0) {
		double r = ptriesca.PtrianguloEscaleno(Double.parseDouble(txtN1.getText()), Double.parseDouble(txtN2.getText()), Double.parseDouble(txtN3.getText()));
		lbResultado.setText(String.format("El perimetro es: \n" + "L1 %s + \n L2 %s + L3 %s \n = %f", txtN1.getText(), txtN2.getText(), txtN3.getText(), r)); 		
	}

}
