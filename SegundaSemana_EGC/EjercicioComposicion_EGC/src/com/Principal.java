package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TarjetaVideo sony = new TarjetaVideo("AMD", "Zen 2", 10.28, 2.23);
		TarjetaVideo microSoft = new TarjetaVideo("AMD", "Zen 2", 12, 3.8);
		AlmacenamientoInterno sonyA = new AlmacenamientoInterno("Kingston", "SSDNVMe", 9.8, 1000);
		AlmacenamientoInterno microS = new AlmacenamientoInterno("Adata", "SSDNVMe", 7.8, 1000);
		
		Consola playstation5 = new Consola("Sony", "Chasis D", 2023, sony, sonyA);
		Consola xboxX = new Consola("Microsoft", "Series X", 2020, microSoft, microS);
		
		System.out.println(playstation5);
		System.out.println(xboxX);

	}

}
