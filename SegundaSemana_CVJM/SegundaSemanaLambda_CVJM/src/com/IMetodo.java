package com;

public interface IMetodo {

	/*Interface funcional - Es aquella que solo cuenta con un metodo abstracto
	 * 
	 * pregunta de examen: ¿podemos crear una instancia/objeto en una interface? no, 
	 * pero podemos crear una instancia de una clase anonima 
	 * para poder crear una interface
		
		Diferencia entre clase y objeto: 
		Una clase es la plantilla/molde que permite crear mi objetos
		El objeto es la variable de esa clase
	 */
	
	public void operar (int a, int b);
	
	//Al tener un metodo mas declarado esto ya no es una interface funcional.
	// (Debe ser definido por una clase)
	
	//public void saludar (String mensaje);
	
	
}
