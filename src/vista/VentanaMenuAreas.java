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
public class VentanaMenuAreas extends JFrame implements ActionListener{

/**
 * Agregar boton con mensaje en caja
 */
	private JButton btnCuadrado= new JButton("Cuadrado");
	private JButton btnRectangulo= new JButton("Rectangulo");
	private JButton btnTriangulo= new JButton("Triangulo");
	private JButton btnCirculo= new JButton("Circulo");
	private Container c= getContentPane();
	
/**
 * Dimenciones de ventana
 */
	public VentanaMenuAreas(){
		super.setTitle("Menu");
		super.setSize(280, 280);
		cargarControles();
		
	}
	
	/**
	 * Dimensiones de cada elemento que conforma la ventana
	 */
	private void cargarControles() {
		c.setLayout(null);
		btnCuadrado.setBounds(50, 40, 150, 30);
		btnRectangulo.setBounds(50, 80, 150, 30);	
		btnTriangulo.setBounds(50, 120, 150, 30);	
		btnCirculo.setBounds(50, 160, 150, 30);	
		c.add(btnCuadrado);
		c.add(btnRectangulo);
		c.add(btnTriangulo);
		c.add(btnCirculo);
		btnCuadrado.addActionListener(this);
		btnRectangulo.addActionListener(this);
		btnTriangulo.addActionListener(this);
		btnCirculo.addActionListener(this);
	}
	/**
	 * Metodo que agrega la sentencia if para cada seleccion de boton de la ventana menu
	 */
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==btnCuadrado){
		VentanaACuadrado vtn= new VentanaACuadrado();
		vtn.setVisible(true);
			}
		
		if(arg0.getSource()==btnRectangulo){
			VentanaARectangulo vtn= new VentanaARectangulo();
			vtn.setVisible(true);
			}
		if(arg0.getSource()==btnTriangulo){
			VentanaATriangulo vtn= new VentanaATriangulo();
			vtn.setVisible(true);
			}
		if(arg0.getSource()==btnCirculo){
			VentanaACirculo vtn= new VentanaACirculo();
			vtn.setVisible(true);
			}
	}
		
	
}
