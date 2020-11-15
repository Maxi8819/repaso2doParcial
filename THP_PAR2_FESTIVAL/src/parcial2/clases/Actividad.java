package parcial2.clases;

import java.util.ArrayList;

public class Actividad {
	private int numero;
	private String sala;
	private String descripcion;
	private int dia;
	private TipoActividad tipo;
	private ArrayList<Visitante> visitantes;

	public Actividad(int numero, String sala, String descripcion, int dia, TipoActividad tipo) {
		this.numero = numero;
		this.sala = sala;
		this.descripcion = descripcion;
		this.dia = dia;
		this.tipo = tipo;
		this.visitantes = new ArrayList<>();
	}

	public void registrarVisitante(Visitante visitante) {
		if (!(estaRegistrado(visitante))) {
			visitantes.add(visitante);
		}
	}

	private boolean estaRegistrado(Visitante visitante) {
		return visitantes.indexOf(visitante) != -1;
	}

	public TipoActividad getTipo() {
		return tipo;
	}

	public int cantidadDeVisitantes() {
		ArrayList<Visitante> v = new ArrayList<Visitante>();
		agregarVisitantesSinRepetir(v);
		return v.size();
	}
	
	public boolean coincide(int dia, String descripcion) {
		return dia == this.dia && descripcion.equals(this.descripcion);
	}
	
	public void agregarVisitantesSinRepetir(ArrayList<Visitante> visitantesUnicos) {
		for (Visitante visitante : visitantes) {
			if (visitantesUnicos.indexOf(visitante) == -1) {
				visitantesUnicos.add(visitante);
			}
		}
	}

	@Override
	public String toString() {
		return "Actividad [numero=" + numero + ", sala=" + sala + ", descripcion=" + descripcion + ", dia=" + dia
				+ ", tipo=" + tipo + ", visitantes=" + visitantes + "]";
	}

}
