package com;

public class Principal {

	public static void main(String[] args) {
		
		//Ejemplo de instanciar una nueva Persona
		Persona persona1 = new Persona ("Valeria", "Femenino", 25);
		
		
		//una vez crear volvemos Empleado clase abstracta
		//no podemos crear instancias de la misma por ello // argumentamos
		//estos pasos
		
		
		//Ejemplo de instanciar un nuevo Empleado
		//Empleado desarrollador = new Empleado("Alex", "masculino", 24, "AlX33", "java JR", 15000, "matutino");
		
		System.out.println(persona1);
		//System.out.println(desarrollador);	
		
		//Probar el método comer de nuestra persona
		persona1.comer();
		
		//Probar el metodo respirar de Persona
		System.out.println(persona1.respirar());
		
		//Probando el metodo polimorfico comer
		persona1.comer("pizza");
		
		persona1.comer("pollo", 4);
		
		
		//VAMOS A REVISAR QUE LOS METODOS SON HEREDADOS POR LA CLASE HIJA
	    //desarrollador.respirar();
	    
	    //EJEMPLO DE INSTANCIAR UN VENDEDOR, QUE ES UN OBJETO DE UNA CLASE NIETA
	    Vendedor liverpool= new Vendedor();
	    
	    liverpool.comer();
	    
	    liverpool.vender();
	    
	    
	}

	
	}

