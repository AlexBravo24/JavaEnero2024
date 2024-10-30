
public class Microondas {
	private String marca;
	private int capacidad;
	private double temperaturaMax;
	
	public Microondas() {
		
	}

	public Microondas(String marca, int capacidad, double temperaturaMax) {
		super();
		this.marca = marca;
		this.capacidad = capacidad;
		this.temperaturaMax = temperaturaMax;
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

	public double getTemperaturaMax() {
		return temperaturaMax;
	}

	public void setTemperaturaMax(double temperaturaMax) {
		this.temperaturaMax = temperaturaMax;
	}

	@Override
	public String toString() {
		return "Microondas [marca=" + marca + ", capacidad=" + capacidad + ", temperaturaMax=" + temperaturaMax + "]";
	}
	

	
}
