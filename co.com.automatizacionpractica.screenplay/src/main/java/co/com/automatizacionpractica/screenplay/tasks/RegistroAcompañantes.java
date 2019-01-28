package co.com.automatizacionpractica.screenplay.tasks;

import java.util.List;



import co.com.automatizacionpractica.screenplay.interactions.SeleccionarLista;
import co.com.automatizacionpractica.screenplay.model.DatosAcompañantes;
import co.com.automatizacionpractica.screenplay.userinterface.PaginaRegistroAcompañantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;  




public class RegistroAcompañantes implements Task {
	
	private List<DatosAcompañantes> datos;
	
	public RegistroAcompañantes(List<DatosAcompañantes> datos) {
		super();
		this.datos = datos;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(datos.get(0).getNombresNIño1()).into(PaginaRegistroAcompañantes.NOMBRE_NIÑO1));
		actor.attemptsTo(Enter.theValue(datos.get(0).getApellidosNIño1()).into(PaginaRegistroAcompañantes.APELLIDO_NIÑO1));
		actor.attemptsTo(Type.theValue(datos.get(0).getFechaNacimientoNIño1()).into(PaginaRegistroAcompañantes.FECHA_NACIMIENTO_NIÑO1));		
		actor.attemptsTo(Click.on(PaginaRegistroAcompañantes.CLICK_GENERO_NIÑO1));		
		actor.attemptsTo(SeleccionarLista.Desde(PaginaRegistroAcompañantes.SELECCIONA_GENERO_NIÑO1, datos.get(0).getGeneroNIño1().trim()));
		actor.attemptsTo(Enter.theValue(datos.get(0).getNumeroDocumentoNIño1()).into(PaginaRegistroAcompañantes.NUMERO_DOCUMENTO_NIÑO1));
		
		actor.attemptsTo(Enter.theValue(datos.get(0).getNombresNIño2()).into(PaginaRegistroAcompañantes.NOMBRE_NIÑO2));
		actor.attemptsTo(Enter.theValue(datos.get(0).getApellidosNIño2()).into(PaginaRegistroAcompañantes.APELLIDO_NIÑO2));		
		actor.attemptsTo(Type.theValue(datos.get(0).getFechaNacimientoNIño2()).into(PaginaRegistroAcompañantes.FECHA_NACIMIENTO_NIÑO2));
		actor.attemptsTo(Click.on(PaginaRegistroAcompañantes.CLICK_GENERO_NIÑO2));
	    actor.attemptsTo(SeleccionarLista.Desde(PaginaRegistroAcompañantes.SELECCIONA_GENERO_NIÑO2, datos.get(0).getGeneroNIño2().trim()));	
		actor.attemptsTo(Enter.theValue(datos.get(0).getNumeroDocumentoNIño2()).into(PaginaRegistroAcompañantes.NUMERO_DOCUMENTO_NIÑO2));
		
		actor.attemptsTo(Click.on(PaginaRegistroAcompañantes.NOMBRE_INFANTE));
		actor.attemptsTo(Enter.theValue(datos.get(0).getNombresInfante()).into(PaginaRegistroAcompañantes.NOMBRE_INFANTE));
		actor.attemptsTo(Enter.theValue(datos.get(0).getApellidosInfante()).into(PaginaRegistroAcompañantes.APELLIDO_INFANTE));
		actor.attemptsTo(Type.theValue(datos.get(0).getFechaNacimientoInfante()).into(PaginaRegistroAcompañantes.FECHA_NACIMIENTO_INFANTE));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		actor.attemptsTo(Click.on(PaginaRegistroAcompañantes.CLICK_BOTON_CONTINUAR), WaitUntil.the(PaginaRegistroAcompañantes.EQUIPAJE_PERSONA1,  isVisible()).forNoMoreThan(10).seconds());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		actor.attemptsTo(Click.on(PaginaRegistroAcompañantes.EQUIPAJE_PERSONA1));
		actor.attemptsTo(SeleccionarLista.Desde(PaginaRegistroAcompañantes.NO_GRACIAS_PERSONA1, datos.get(0).getServicioAdicional().trim()));
		actor.attemptsTo(Click.on(PaginaRegistroAcompañantes.EQUIPAJE_PERSONA2));
		actor.attemptsTo(SeleccionarLista.Desde(PaginaRegistroAcompañantes.NO_GRACIAS_PERSONA2, datos.get(0).getServicioAdicional().trim()));
		actor.attemptsTo(Click.on(PaginaRegistroAcompañantes.EQUIPAJE_PERSONA3));
		actor.attemptsTo(SeleccionarLista.Desde(PaginaRegistroAcompañantes.NO_GRACIAS_PERSONA3, datos.get(0).getServicioAdicional().trim()));
		
		actor.attemptsTo(Click.on(PaginaRegistroAcompañantes.EQUIPAJE_BODEGA_PERSONA1));
		actor.attemptsTo(SeleccionarLista.Desde(PaginaRegistroAcompañantes.EQUIPAJE_BODEGA_NO_GRACIAS1, datos.get(0).getServicioAdicional().trim()));
		actor.attemptsTo(Click.on(PaginaRegistroAcompañantes.EQUIPAJE_BODEGA_PERSONA2));
		actor.attemptsTo(SeleccionarLista.Desde(PaginaRegistroAcompañantes.EQUIPAJE_BODEGA_NO_GRACIAS2, datos.get(0).getServicioAdicional().trim()));
		actor.attemptsTo(Click.on(PaginaRegistroAcompañantes.EQUIPAJE_BODEGA_PERSONA3));
	    actor.attemptsTo(SeleccionarLista.Desde(PaginaRegistroAcompañantes.EQUIPAJE_BODEGA_NO_GRACIAS3, datos.get(0).getServicioAdicional().trim()));
		
		actor.attemptsTo(Click.on(PaginaRegistroAcompañantes.CHECK_INPERSONA1));
		actor.attemptsTo(SeleccionarLista.Desde(PaginaRegistroAcompañantes.NO_CHECK_INPERSONA1, datos.get(0).getServicioAdicional().trim()));
		actor.attemptsTo(Click.on(PaginaRegistroAcompañantes.CHECK_INPERSONA2));
		actor.attemptsTo(SeleccionarLista.Desde(PaginaRegistroAcompañantes.NO_CHECK_INPERSONA2, datos.get(0).getServicioAdicional().trim()));
		actor.attemptsTo(Click.on(PaginaRegistroAcompañantes.CHECK_INPERSONA3));
		actor.attemptsTo(SeleccionarLista.Desde(PaginaRegistroAcompañantes.NO_CHECK_INPERSONA3, datos.get(0).getServicioAdicional().trim()));
		
		actor.attemptsTo(Click.on(PaginaRegistroAcompañantes.FILA_RAPIDA));
		actor.attemptsTo(SeleccionarLista.Desde(PaginaRegistroAcompañantes.NO_FILA_RAPIDA, datos.get(0).getServicioAdicional().trim()));
		
		actor.attemptsTo(Click.on(PaginaRegistroAcompañantes.DES_CHECK));

		actor.attemptsTo(Click.on(PaginaRegistroAcompañantes.BOTON_CONTINUAR));
		actor.attemptsTo(Click.on(PaginaRegistroAcompañantes.YA_ESCOGI_LO_QUE_NECESITO));
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		actor.attemptsTo(WaitUntil.the(PaginaRegistroAcompañantes.TOTAL_SERVICIO_ADICIONAL, isVisible()));

	}

	public static RegistroAcompañantes conDatosAcompañantes(List<DatosAcompañantes> datos) {
		
		return Tasks.instrumented(RegistroAcompañantes.class, datos);
	}
	
	
}
