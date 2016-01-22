package modelo;
/**
 * 
 * @author SAIN PEDRAZA GUERRERO
 *
 */
public interface perimetros {
	/**
	 * 
	 * @param n1 variable para perimetro area ingresando un numero
	 * @return
	 */
	public double Pcuadrado(double n1);
	/**
	 * 
	 * @param n1 variable para perimetro area ingresando un numero
	 * @param n2 variable para perimetro area ingresando un segundo numero
	 * @return
	 */
	public double Prectangulo(double n1, double n2);
	/**
	 * 
	 * @param n1 variable para perimetro area ingresando un numero
	 * @return
	 */
	public double PtrianguloEquilatero(double n1);
	/**
	 * 
	 * @param lado variable para perimetro area ingresando altura
	 * @param base variable para perimetro area ingresando base
	 * @return
	 */
	public double PtrianguloIsosceles(double lado, double base);
	/**
	 * 
	 * @param lado1 variable para perimetro area ingresando lado1
	 * @param lado2 variable para perimetro area ingresando lado2
	 * @param lado3 variable para perimetro area ingresando lado3
	 * @return
	 */
	public double PtrianguloEscaleno(double lado1, double lado2, double lado3);
	/**
	 * 
	 * @param n1 variable para perimetro area ingresando un numero
	 * @return
	 */
	public double Pcirculo(double n1);
	

}
