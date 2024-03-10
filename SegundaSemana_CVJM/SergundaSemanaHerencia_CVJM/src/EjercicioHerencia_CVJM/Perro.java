package EjercicioHerencia_CVJM;

public class Perro extends Animal{

	private String raza;
	private int tama�o;
	private String pasatiempoFav;
	
	public Perro() {
		
	}

	public Perro(String nombre, String color, int edad, String raza, int tama�o, String pasatiempoFav) {
		super(nombre, color, edad);
		this.raza = raza;
		this.tama�o = tama�o;
		this.pasatiempoFav = pasatiempoFav;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getTama�o() {
		return tama�o;
	}

	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
	}

	public String getPasatiempoFav() {
		return pasatiempoFav;
	}

	public void setPasatiempoFav(String pasatiempoFav) {
		this.pasatiempoFav = pasatiempoFav;
	}

	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", tama�o=" + tama�o + ", pasatiempoFav=" + pasatiempoFav + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
