package EjercicioHerencia_CVJM;

public class Perro extends Animal{

	private String raza;
	private int tamaño;
	private String pasatiempoFav;
	
	public Perro() {
		
	}

	public Perro(String nombre, String color, int edad, String raza, int tamaño, String pasatiempoFav) {
		super(nombre, color, edad);
		this.raza = raza;
		this.tamaño = tamaño;
		this.pasatiempoFav = pasatiempoFav;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public String getPasatiempoFav() {
		return pasatiempoFav;
	}

	public void setPasatiempoFav(String pasatiempoFav) {
		this.pasatiempoFav = pasatiempoFav;
	}

	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", tamaño=" + tamaño + ", pasatiempoFav=" + pasatiempoFav + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
