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
public class VentanaMenuPrincipal extends JFrame implements ActionListener{
	/**
	 * Agregar boton con mensaje en caja
	 */
	private JLabel lbN1 = new JLabel("CALCULADORA DE FIGURAS BASICAS");
	private JButton btnPerimetros= new JButton("Perimetros");
	private JButton btnAreas= new JButton("Areas");
	private Container c= getContentPane();
	
	/**
	 * Dimenciones de ventana
	 */
	public VentanaMenuPrincipal(){
		super.setTitle("Menu");
		super.setSize(280, 280);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cargarControles();
		
	}
	
	/**
	 * Dimensiones de cada elemento que conforma la ventana
	 */	
	private void cargarControles() {
		c.setLayout(null);
		lbN1.setBounds(15,10, 280, 30);
		btnPerimetros.setBounds(50, 40, 150, 30);
		btnAreas.setBounds(50, 80, 150, 30);
		c.add(lbN1);
		c.add(btnPerimetros);
		c.add(btnAreas);
		btnPerimetros.addActionListener(this);
		btnAreas.addActionListener(this);
		
	}
	/**
	 * Metodo que agrega la sentencia if para cada seleccion de boton de la ventana menu
	 */	
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==btnPerimetros){
		VentanaMenuPerimetros vtn= new VentanaMenuPerimetros();
		vtn.setVisible(true);
			}
		
		if(arg0.getSource()==btnAreas){
			VentanaMenuAreas vtn= new VentanaMenuAreas();
			vtn.setVisible(true);
			}
	}
		
	
}
