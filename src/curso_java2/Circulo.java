package curso_java2;

public class Circulo implements AreaCalculavel{
	double raio;
	
	public double calculaArea() {
		return raio * raio * Math.PI;
	}
	
}
