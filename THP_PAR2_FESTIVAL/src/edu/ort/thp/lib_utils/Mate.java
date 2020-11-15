package edu.ort.thp.lib_utils;

public class Mate {

	public static int enteroAlAzar(int base, int tope) {
		return base + (int) (Math.random()*(tope - base + 1)); 
	}

	public static double equis(double parcial, double total) {
		// La cuenta puede fallar si total es 0.
		// Esta funcion devuelve 0 cuando pasa eso, lo cual no está del todo bien.
		double resultado = 0;
		if (total !=0) {
			resultado = parcial * 100 / total;
		}
		return resultado;
	}

}
