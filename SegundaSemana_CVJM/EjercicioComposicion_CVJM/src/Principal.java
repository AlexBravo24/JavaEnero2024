
public class Principal {

	public static void main(String[] args) {
		
		Refrigerador enfriamiento=new Refrigerador ("Mabe", 160, 2);
		Estufa coccion= new Estufa ("Whirlpool", 4, 60);
		Microondas calentamiento= new Microondas ("Panasonic", 40 , 70 );

		Cocina domestica=new Cocina (20, "madera", 9, enfriamiento, coccion, calentamiento);
		
		System.out.println(domestica);
		
		
	}

}
