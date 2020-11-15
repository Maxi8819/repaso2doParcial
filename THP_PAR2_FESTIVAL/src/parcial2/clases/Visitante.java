package parcial2.clases;

public class Visitante {
	
	private int dni;
	private Pulsera pulsera;

	public Visitante(int dni) {
		this.setDni(dni);
		this.pulsera = null;
	}

	public int getDni() {
		return dni;
	}

	private void setDni(int dni) {
		this.dni = dni;
	}

	public Pulsera getPulsera() {
		return pulsera;
	}

	public void colocarPulsera(Pulsera pulsera) {
		this.pulsera = pulsera;
	}

	public void contarActividad() {
		pulsera.contar();
		
	}

	@Override
	public String toString() {
		return "pulsera=" + pulsera + "]";
	}
	
	

}
