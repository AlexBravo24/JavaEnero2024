package curso.condicionales;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Condicionales4_LDGR {

	public static void main(String[] args) {
		// Realiza un programa que lea una cadena (String)
		// por teclado y compruebe si es una letra mayúscula
		
		// Scanner entrada = new Scanner(System.in);
		
		char letra;
		
		letra=JOptionPane.showInputDialog("Escriba una letra: ").charAt(0);
		
		if(Character.isUpperCase(letra)) {
			JOptionPane.showMessageDialog(null, "Es una letra mayúscula");
		} else {
			JOptionPane.showMessageDialog(null, "Es una letra minúscula");
		}

	}

}
