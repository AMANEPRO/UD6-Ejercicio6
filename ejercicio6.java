package ejercicios;

import javax.swing.JOptionPane;

public class ejercicio6 {
	public static void main (String []args) {
		
		String numerousuario=JOptionPane.showInputDialog("Por favor, introduce un numero");
		
		cantidadcaracteres(numerousuario);
		
		if (cantidadcaracteres(numerousuario)!=1) {
		
			System.out.println("El numero que has escrito tiene " + cantidadcaracteres(numerousuario) + " caracteres de largo");
		
		} else {
			
			if (cantidadcaracteres(numerousuario)==1);
			
			System.out.println("El numero que has escrito tiene " + cantidadcaracteres(numerousuario) + " caracter de largo");
		}
		
	}

	private static int cantidadcaracteres(String numerousuario) {
		
		int largo=numerousuario.length();
		
		return largo;
		}
	
			  
	
}

