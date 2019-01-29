package co.com.automatizacionpractica.screenplay.tasks;

import java.util.List;


import co.com.automatizacionpractica.screenplay.interactions.SeleccionarLista;
import co.com.automatizacionpractica.screenplay.model.DatosReserva;
import co.com.automatizacionpractica.screenplay.userinterface.PaginaReservaDeVuelo;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class ReservarVuelo implements Task {
	
	WebElementFacade  borrar;
	
	
	
	int posicionCalendario=2;
	private List<DatosReserva> datos;
	
	public ReservarVuelo(List<DatosReserva> datos) {
		super();
		this.datos = datos;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		
	
		actor.attemptsTo(Scroll.to(PaginaReservaDeVuelo.BOTON_RESERVAR));
		actor.attemptsTo(Click.on(PaginaReservaDeVuelo.CHECK_IDA));		
		actor.attemptsTo(Click.on(PaginaReservaDeVuelo.CLICK_CIUDAD_ORIGEN));
		actor.attemptsTo(SeleccionarLista.Desde(PaginaReservaDeVuelo.SELECCIONA_CIUDAD_ORIGEN, datos.get(0).getCiudadOrigen().trim()));
		actor.attemptsTo(Click.on(PaginaReservaDeVuelo.CLICK_CIUDAD_DESTINO));
		actor.attemptsTo(SeleccionarLista.Desde(PaginaReservaDeVuelo.SELECCIONA_CIUDAD_DESTINO, datos.get(0).getCiudadDestino().trim()));
		actor.attemptsTo(Enter.theValue(datos.get(0).getFechaIda()).into(PaginaReservaDeVuelo.FECHA_IDA));
		actor.attemptsTo(Click.on(PaginaReservaDeVuelo.CLICK_NUMERO_PASAJEROS_ADULTOS));
		actor.attemptsTo(SeleccionarLista.Desde(PaginaReservaDeVuelo.SELECCIONA_NUMERO_PASAJEROS_ADULTOS, datos.get(0).getNumeroPasajerosAdultos().trim()));
		actor.attemptsTo(Click.on(PaginaReservaDeVuelo.CLICK_NUMERO_PASAJEROS_NIÑOS));
		actor.attemptsTo(SeleccionarLista.Desde(PaginaReservaDeVuelo.SELECCIONA_NUMERO_PASAJEROS_NIÑOS, datos.get(0).getNumeroPasajerosMenores().trim()));
		actor.attemptsTo(Click.on(PaginaReservaDeVuelo.CLICK_NUMERO_INFANTES));
		actor.attemptsTo(SeleccionarLista.Desde(PaginaReservaDeVuelo.SELECCIONA_NUMERO_INFANTES, datos.get(0).getNumeroPasajerosInfantes().trim()));
		actor.attemptsTo(Click.on(PaginaReservaDeVuelo.CHECK_PRECIO_DEL_MES));
	    actor.attemptsTo(Click.on(PaginaReservaDeVuelo.CLICK_TIPO_MONEDA));
		actor.attemptsTo(SeleccionarLista.Desde(PaginaReservaDeVuelo.SELECCIONA_TIPO_MONEDA, datos.get(0).getMoneda().trim()));
		actor.attemptsTo(Click.on(PaginaReservaDeVuelo.BOTON_RESERVAR));
		

		
			
		
			
		
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	

	public static ReservarVuelo conDatosReserva(List<DatosReserva> datos) {
		
		return Tasks.instrumented(ReservarVuelo.class, datos);
	}

}
