package co.com.automatizacionpractica.screenplay.stepdefinitions;

import java.util.List;

import org.hamcrest.Matchers;

import co.com.automatizacionpractica.screenplay.model.DatosAcompañantes;
import co.com.automatizacionpractica.screenplay.model.DatosAdultos;
import co.com.automatizacionpractica.screenplay.model.DatosReserva;
import co.com.automatizacionpractica.screenplay.questions.CostoAdicional;
import co.com.automatizacionpractica.screenplay.tasks.Ingresa;
import co.com.automatizacionpractica.screenplay.tasks.RegistroAcompañantes;
import co.com.automatizacionpractica.screenplay.tasks.RegistroAdulto;
import co.com.automatizacionpractica.screenplay.tasks.ReservarVuelo;
import co.com.automatizacionpractica.screenplay.tasks.SeleccionaTarifa;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class ReservaTiquetesVivaairStepDefinitions {

	
	
	
	@Dado("^que (.*) quiere ingresar a la pagina de vivaAir$")
	public void queJesusQuiereIngresarALaPaginaDeVivaAir(String jesus)  {
		OnStage.theActorCalled(jesus).attemptsTo(Ingresa.aLaPaginaVivaAir());
	}


	@Cuando("^el registra datos para reserva$")
	public void elRegistraDatosParaReserva(List<DatosReserva> datos)  {
		OnStage.theActorInTheSpotlight().attemptsTo(ReservarVuelo.conDatosReserva(datos));
	}
	@Cuando("^selecciona la tarifa mas baja$")
	public void seleccionaLaTarifaMasBaja()  {
		OnStage.theActorInTheSpotlight().attemptsTo(SeleccionaTarifa.laMasBaja());
	}
	@Cuando("^ingresa datos adulto$")
	public void ingresaDatosAdulto(List<DatosAdultos> datos)  {
		OnStage.theActorInTheSpotlight().attemptsTo(RegistroAdulto.conDatosAdulto(datos));
	}
	
	@Cuando("^ingresa datos acompañantes$")
	public void ingresaDatosAcompañantes(List<DatosAcompañantes> datos)  {
		OnStage.theActorInTheSpotlight().attemptsTo(RegistroAcompañantes.conDatosAcompañantes(datos));
	}
	

	@Entonces("^el valida el valor de servicios adicionales \"([^\"]*)\"$")
	public void elValidaElValorDeServiciosAdicionalesUSD(String valor)  {
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CostoAdicional.valorEsperado(), Matchers.equalTo(valor)));
	}



	
}
