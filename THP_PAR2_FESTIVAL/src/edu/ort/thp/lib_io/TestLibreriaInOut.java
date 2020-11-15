package edu.ort.thp.lib_io;

public class TestLibreriaInOut {

	public static void main(String[] args) {
		String nombre;
		int nro1, nro2, resultadoSuma = 0;
		boolean sigo;
		nombre = InOut.pedirTexto("Como te llamas?");
		do {
			nro1 = InOut.pedirEntero("Ingresa un nro " + nombre + ":");
			nro2 = InOut.pedirEntero("Bien " + nombre + ", ahora ingresa otro nro:");
			resultadoSuma = sumar(nro1, nro2);
			InOut.mostrar(nro1 + " + " + nro2 + " = " + resultadoSuma);
			sigo = InOut.preguntarSiNo("Sigo?");
		} while(sigo);
		InOut.mostrar("Adios " + nombre);

	}

	private static int sumar(int nro1, int nro2) {
		return nro1 + nro2;
	}

}
