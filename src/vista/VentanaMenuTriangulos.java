package vista;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 * 
 * @author SAIN PEDRAZA GUERRERO
 *
 */
public class VentanaMenuTriangulos extends JFrame implements ActionListener{
	/**
	 * Agrega los elementos que se mandaran a llamar cajas de texto y botones
	 */
	private JButton btnTEscaleno= new JButton("Triangulo Escaleno");
	private JButton btnTIsosceles= new JButton("Triangulo Isosceles");
	private JButton btnTEquilatero= new JButton("Triangulo Equilatero");
	private Container c= getContentPane();
	/**
	 * Dimenciones de ventana
	 */	
	public VentanaMenuTriangulos(){
		super.setTitle("Menu");
		super.setSize(280, 280);
		cargarControles();	
	}
	/**
	 * Metodo que agraga con tamaños los botones y cajas de texto
	 */	
	private void cargarControles() {
		c.setLayout(null);
		btnTEscaleno.setBounds(50, 40, 150, 30);
		btnTIsosceles.setBounds(50, 80, 150, 30);	
		btnTEquilatero.setBounds(50, 120, 150, 30);	
		c.add(btnTEscaleno);
		c.add(btnTIsosceles);
		c.add(btnTEquilatero);
		btnTEscaleno.addActionListener(this);
		btnTIsosceles.addActionListener(this);
		btnTEquilatero.addActionListener(this);
	}
	/**
	 * Metodo de menu con sentencia if para seleccion de cada boton
	 */	
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==btnTEscaleno){
		VentanaTrianguloEscaleno vtn= new VentanaTrianguloEscaleno();
		vtn.setVisible(true);
			}
		
		if(arg0.getSource()==btnTIsosceles){
			VentanaTrianguloIsosceles vtn= new VentanaTrianguloIsosceles();
			vtn.setVisible(true);
			}
		if(arg0.getSource()==btnTEquilatero){
			VentanaTrianguloEquilatero vtn= new VentanaTrianguloEquilatero();
			vtn.setVisible(true);
			}
	}
		
	
}
