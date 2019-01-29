package co.com.automatizacionpractica.screenplay.tasks;

import java.util.List;



import co.com.automatizacionpractica.screenplay.interactions.SeleccionarLista;
import co.com.automatizacionpractica.screenplay.model.DatosAdultos;
import co.com.automatizacionpractica.screenplay.userinterface.PaginaRegistroDatosPersona;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegistroAdulto implements Task{
	
		
	private List<DatosAdultos> datos;
	
	public RegistroAdulto(List<DatosAdultos> datos) {
		super();
		this.datos = datos;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Enter.theValue(datos.get(0).getNombres()).into(PaginaRegistroDatosPersona.NOMBRES_ADULTO));
		actor.attemptsTo(Enter.theValue(datos.get(0).getApellidos()).into(PaginaRegistroDatosPersona.APELLIDO_ADULTO));
		actor.attemptsTo(Click.on(PaginaRegistroDatosPersona.CLICK_PARA_GENERO));
		actor.attemptsTo(SeleccionarLista.Desde(PaginaRegistroDatosPersona.SELECCIONA_GENERO, datos.get(0).getGenero().trim()));
		actor.attemptsTo(Enter.theValue(datos.get(0).getNumeroDocumento()).into(PaginaRegistroDatosPersona.NUMERO_DOCUMENTO_ADULTO));
		actor.attemptsTo(Enter.theValue(datos.get(0).getCorreo()).into(PaginaRegistroDatosPersona.CORREO));
		actor.attemptsTo(Enter.theValue(datos.get(0).getCorreo()).into(PaginaRegistroDatosPersona.CONFIRMA_CORREO));
		actor.attemptsTo(Enter.theValue(datos.get(0).getCelular()).into(PaginaRegistroDatosPersona.CELULAR));
		
		
		
	}

	public static RegistroAdulto conDatosAdulto(List<DatosAdultos> datos) {
		// TODO Auto-generated method stub
		return Tasks.instrumented(RegistroAdulto.class, datos);
	}


	}


