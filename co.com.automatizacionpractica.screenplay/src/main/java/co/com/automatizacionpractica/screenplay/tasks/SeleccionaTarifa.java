package co.com.automatizacionpractica.screenplay.tasks;




import co.com.automatizacionpractica.screenplay.interactions.SelecionarMenorTarifaVuelo;
import co.com.automatizacionpractica.screenplay.userinterface.PaginaRegistroDatosPersona;
import co.com.automatizacionpractica.screenplay.userinterface.PaginaSeleccionTarifa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;  

public class SeleccionaTarifa implements Task{
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		

		
		actor.attemptsTo(SelecionarMenorTarifaVuelo.Desde(PaginaSeleccionTarifa.FECHA_VUELO_MENOR_TARIFA));
		actor.attemptsTo(Click.on(PaginaSeleccionTarifa.CLICK_BOTON_CONTINUAR));
		actor.attemptsTo(WaitUntil.the(PaginaSeleccionTarifa.CONFIRMA_TARIFA, isVisible()).forNoMoreThan(5).seconds());
		actor.attemptsTo(Click.on(PaginaSeleccionTarifa.CONFIRMA_TARIFA));
		actor.attemptsTo(WaitUntil.the(PaginaSeleccionTarifa.CLICK_BOTON_ACEPTAR, isVisible()).forNoMoreThan(5).seconds());
		actor.attemptsTo(Click.on(PaginaSeleccionTarifa.CLICK_BOTON_ACEPTAR));
		actor.attemptsTo(WaitUntil.the(PaginaRegistroDatosPersona.NOMBRES_ADULTO, isVisible()).forNoMoreThan(5).seconds());
		
		
		
	}

	public static SeleccionaTarifa laMasBaja() {
		
		return Tasks.instrumented(SeleccionaTarifa.class);
	}
	
	

}
