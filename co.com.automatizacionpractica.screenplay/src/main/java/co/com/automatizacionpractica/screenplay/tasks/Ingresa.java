package co.com.automatizacionpractica.screenplay.tasks;

import co.com.automatizacionpractica.screenplay.userinterface.PaginaPrincipalVivaair;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Ingresa implements Task {
	
	private PaginaPrincipalVivaair paginaPrincipalVivaair;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(paginaPrincipalVivaair));
		
	}

	public static Ingresa aLaPaginaVivaAir() {
		
		return Tasks.instrumented(Ingresa.class);
	}

}
