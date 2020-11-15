package parcial2.clases;

import java.util.ArrayList;

public class Festival {

	private static final int DIAS_FESTIVAL = 4;
	private ArrayList<Actividad> actividades;
	private ArrayList<Contador> visitantesPorDia;

	public Festival() {
		this.actividades = new ArrayList <Actividad>();
		this.visitantesPorDia = new ArrayList<Contador>();
		crearContadores();
		// TODO Debe inicializar los contadores de visitantesPorDia
	}

	public void crearContadores() {
		for (int i = 0; i < DIAS_FESTIVAL; i++) {
			visitantesPorDia.add(new Contador());
		}
	}

	public Visitante crearVisitante(int dni, int dia) {
		Visitante visitante = new Visitante(dni);
		asignarPulsera(visitante, dia);
		return visitante;
	}

	private void asignarPulsera(Visitante visitante, int dia) {
		if(tienePulseraAsignada(visitante)){
			String codigo =visitante.getDni()+"-"+dia;
			Pulsera p = new Pulsera (codigo);
			visitante.colocarPulsera(p);
			visitantesPorDia.get(dia).incrementar();
		}	
	}
	private boolean tienePulseraAsignada(Visitante visitante) {
		// TODO Auto-generated method stub
		return visitante.getPulsera()==null;
	}

	public void registrarActividad(TipoActividad tipo, int nroDia, String descripcion, String sala) {
		actividades.add(new Actividad(actividades.size() + 1, sala, descripcion, nroDia, tipo));
	}


	private ArrayList<Actividad> obtenerActividadesPorTipo(TipoActividad tipo) {
		ArrayList <Actividad> actObtenidas = new ArrayList<Actividad>();
		for (Actividad a : actividades) {
			if(a.getTipo()==tipo) {
				actObtenidas.add(a);
			}		
		}
		return actObtenidas;
	}

	public void listarVisitantesPorTipoActividad(TipoActividad tipo) {
		ArrayList <Actividad> actObtenidas=obtenerActividadesPorTipo(tipo);
		ArrayList<Visitante> v = new ArrayList<Visitante>();
		for (Actividad a : actObtenidas) {		
			a.agregarVisitantesSinRepetir(v);
		}
		System.out.println(v.toString());
		
	}

	public void registrarIngresoEnActividad(Visitante visitante, int dia, String nombreActividad) {
		Actividad actividad = buscarActividad(dia, nombreActividad);
		if (actividad != null) {
			actividad.registrarVisitante(visitante);
		}
	}

	private Actividad buscarActividad(int dia, String nombreActividad) {
		Actividad actividad = null;
		int i = 0;
		while (i < actividades.size() && actividad == null) {
			if (actividades.get(i).coincide(dia, nombreActividad)) {
				actividad = actividades.get(i);
			} else {
				i++;
			}
		}
		return actividad;
	}

}
