package com;

public interface IMetodo {
	
	// Interface funcional - Es aquella que solo cuenta con UN
	// m�todo abstracto
	
	public void operar(int a, int b);
	
	// Al tener un m�todo m�s declarado, esto ya NO es una
	// interface funcional. Se vuelve una interface normal.
	// public void saludar(String mensaje);

}
