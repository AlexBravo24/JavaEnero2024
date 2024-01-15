package com;

public class Principal {

	public static void main(String[] args) {
		// En la POO, solo debe existir una clase 
		//con el metodo principal
		
		//ya que aqui llamaremos posteriormente a los
		//objetos  que tendran sus propias acciones
		
		//para una plantilla no se marca la casilla main
		
		//Aqui ya puedo crear una variable de mi clase 
		//Persona. La creacion de esta variable
		//Se le conoce como "instancia" u objeto en si
		
       Persona persona1 = new Persona();
       
       
       //Si yo quiero asignarle nombre a persona1
       
       //persona1.nombre="Carlos"; <--forma incorrecta 
       //de asignar valores un objeto.
       
       //Instanciando una persona con el contrsutor con todos 
       //los parametros
       Persona persona2 = new Persona("Daniel", 25, "Mexicana", 1.8, 70);
       
       //instanciar una nueva persona con solo nombre
       Persona persona3 = new Persona("Ana");
       
       //Probando el metodo getnombre en la persona3
       System.out.println(persona3.getNombre());
       System.out.println(persona3.getEdad());
       
       
       //probando setnombre en persona 1 que esta vacio
       persona1.setNombre("Carlos");
       persona1.setNacionalidad("Ingles");
       
       System.out.println(persona1.getNacionalidad());
       
       //Imorimir los atributos completos de mi objeto en consola
       System.out.println(persona2);
       
       //Modelar un objeto de su agrado
       //5 atributos por lo menos
       //crean contructor vacio, constructor con todos los parametros
       //metodo toString()
       //y aqui en esta clase Principal, instancia o crean uno vacio
       //y los mandan a imprimir en consola
       
       Puerta madera = new Puerta();
       Puerta Metalica = new Puerta("Metalica", "Blanca", 2.20, 1.00, 3000);
       
       madera.setMaterial("Madera");;
       
       System.out.println(madera);
       System.out.println(Metalica);
    }

}
