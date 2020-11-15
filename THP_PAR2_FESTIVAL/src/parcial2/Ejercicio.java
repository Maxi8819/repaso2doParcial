package parcial2;

import parcial2.clases.Festival;
import parcial2.clases.TipoActividad;
import parcial2.clases.Visitante;

public class Ejercicio {

	public static void main(String[] args) {
		Festival festival = new Festival();
		
		festival.registrarActividad(TipoActividad.RECITAL, 1, "Rock de Ort", "Anfiteatro 1");
		festival.registrarActividad(TipoActividad.RECITAL, 1, "DanceMix", "Anfiteatro 2");
		festival.registrarActividad(TipoActividad.CHARLA, 1, "El Arte Digital Interactivo y la Programacion", "Biblioteca");
		festival.registrarActividad(TipoActividad.MUESTRA, 1, "Arte Digital Interactivo", "Biblioteca");
		festival.registrarActividad(TipoActividad.MUESTRA, 2, "Arte Digital Interactivo", "Biblioteca");
		festival.registrarActividad(TipoActividad.TALLER, 2, "Musica Electroacustica", "SALA MULTIMED");
		festival.registrarActividad(TipoActividad.RECITAL, 2, "Electroacustico", "SALA MULTIMED");
		festival.registrarActividad(TipoActividad.MUESTRA, 3, "Arte Digital Interactivo", "Biblioteca");
		festival.registrarActividad(TipoActividad.TALLER, 3, "Literatura Automatica", "CEO");
		festival.registrarActividad(TipoActividad.CHARLA, 4, "Lenguajes 3D", "Biblioteca");
		festival.registrarActividad(TipoActividad.MUESTRA, 4, "Arte Digital Interactivo", "Biblioteca");
		festival.registrarActividad(TipoActividad.RECITAL, 4, "Otras Voces", "Anfiteatro 2");
		festival.registrarActividad(TipoActividad.RECITAL, 4, "Rock de Ort", "Anfiteatro 1");
		
		Visitante visitante = festival.crearVisitante(18475143, 1);
		
		festival.registrarIngresoEnActividad(visitante, 1, "Rock de Ort");
		festival.registrarIngresoEnActividad(visitante, 2, "Arte Digital Interactivo");
		festival.registrarIngresoEnActividad(visitante, 3, "Literatura Automatica");
		festival.registrarIngresoEnActividad(visitante, 4, "Lenguajes 3D");
		
		visitante = festival.crearVisitante(33547815, 2);
		
		festival.registrarIngresoEnActividad(visitante, 2, "Arte Digital Interactivo");
		festival.registrarIngresoEnActividad(visitante, 2, "Electroacustico");
		festival.registrarIngresoEnActividad(visitante, 3, "Literatura Automatica");
		festival.registrarIngresoEnActividad(visitante, 4, "Rock de Ort");
		
		festival.listarVisitantesPorTipoActividad(TipoActividad.CHARLA);
		festival.listarVisitantesPorTipoActividad(TipoActividad.RECITAL);
	}

}
