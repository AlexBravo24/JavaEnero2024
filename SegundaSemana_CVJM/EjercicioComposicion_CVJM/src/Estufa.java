
public class Estufa {
	
	private String marca;
	private int quemadores;
	private int capacidadHorno;
	
	public Estufa(){
		
	}

	public Estufa(String marca, int quemadores, int capacidadHorno) {
		super();
		this.marca = marca;
		this.quemadores = quemadores;
		this.capacidadHorno = capacidadHorno;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getQuemadores() {
		return quemadores;
	}

	public void setQuemadores(int quemadores) {
		this.quemadores = quemadores;
	}

	public int getCapacidadHorno() {
		return capacidadHorno;
	}

	public void setCapacidadHorno(int capacidadHorno) {
		this.capacidadHorno = capacidadHorno;
	}

	@Override
	public String toString() {
		return "Estufa [marca=" + marca + ", quemadores=" + quemadores + ", capacidadHorno=" + capacidadHorno + "]";
	}

	
	
	
}
