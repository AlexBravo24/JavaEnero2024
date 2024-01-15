
public class Cocina {

	private int espaciom2;
	private String material;
	private int numeroElectrodomesticos;
	
	private Refrigerador enfriamiento;
	private Estufa coccion;
	private Microondas calentamiento;
	
	public Cocina() {
		
	}

	public Cocina(int espaciom2, String material, int numeroElectrodomesticos, Refrigerador enfriamiento,
			Estufa coccion, Microondas calentamiento) {
		super();
		this.espaciom2 = espaciom2;
		this.material = material;
		this.numeroElectrodomesticos = numeroElectrodomesticos;
		this.enfriamiento = enfriamiento;
		this.coccion = coccion;
		this.calentamiento = calentamiento;
	}

	public int getEspaciom2() {
		return espaciom2;
	}

	public void setEspaciom2(int espaciom2) {
		this.espaciom2 = espaciom2;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getNumeroElectrodomesticos() {
		return numeroElectrodomesticos;
	}

	public void setNumeroElectrodomesticos(int numeroElectrodomesticos) {
		this.numeroElectrodomesticos = numeroElectrodomesticos;
	}

	public Refrigerador getEnfriamiento() {
		return enfriamiento;
	}

	public void setEnfriamiento(Refrigerador enfriamiento) {
		this.enfriamiento = enfriamiento;
	}

	public Estufa getCoccion() {
		return coccion;
	}

	public void setCoccion(Estufa coccion) {
		this.coccion = coccion;
	}

	public Microondas getCalentamiento() {
		return calentamiento;
	}

	public void setCalentamiento(Microondas calentamiento) {
		this.calentamiento = calentamiento;
	}

	@Override
	public String toString() {
		return "Cocina [espaciom2=" + espaciom2 + ", material=" + material + ", numeroElectrodomesticos="
				+ numeroElectrodomesticos + ", enfriamiento=" + enfriamiento + ", coccion=" + coccion
				+ ", calentamiento=" + calentamiento + "]";
	}
	
	
	
	
	
}

