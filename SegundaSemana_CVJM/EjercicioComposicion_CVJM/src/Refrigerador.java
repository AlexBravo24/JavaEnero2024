
public class Refrigerador {
	private String marca;
	private int capacidad;
	private double temperaturaMin;
	
	public Refrigerador() {
		
	}

	public Refrigerador(String marca, int capacidad, double temperaturaMin) {
		super();
		this.marca = marca;
		this.capacidad = capacidad;
		this.temperaturaMin = temperaturaMin;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public double getTemperaturaMin() {
		return temperaturaMin;
	}

	public void setTemperaturaMin(double temperaturaMin) {
		this.temperaturaMin = temperaturaMin;
	}

	@Override
	public String toString() {
		return "Refrigerador [marca=" + marca + ", capacidad=" + capacidad + ", temperaturaMin=" + temperaturaMin + "]";
	}
	
}