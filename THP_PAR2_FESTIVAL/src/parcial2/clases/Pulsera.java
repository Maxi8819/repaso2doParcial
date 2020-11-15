package parcial2.clases;

public class Pulsera {
	// TODO implementar COMPLETA
	private String codigo;
	private int salasVisitadas;
	
	Pulsera (String codigo){
		this.codigo=codigo;
		this.salasVisitadas=0;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getSalasVisitadas() {
		return salasVisitadas;
	}
	
	public void contar() {
		this.salasVisitadas++;
	}

	@Override
	public String toString() {
		return "Pulsera [codigo=" + codigo + ", salasVisitadas=" + salasVisitadas + "]";
	}
	
	
}
