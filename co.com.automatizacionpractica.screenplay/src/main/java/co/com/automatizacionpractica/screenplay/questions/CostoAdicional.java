package co.com.automatizacionpractica.screenplay.questions;

import co.com.automatizacionpractica.screenplay.userinterface.PaginaRegistroAcompañantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CostoAdicional  implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return Text.of(PaginaRegistroAcompañantes.TOTAL_SERVICIO_ADICIONAL).viewedBy(actor).asString();
	}

	public static CostoAdicional valorEsperado() {
		// TODO Auto-generated method stub
		return new CostoAdicional();
	}

}
