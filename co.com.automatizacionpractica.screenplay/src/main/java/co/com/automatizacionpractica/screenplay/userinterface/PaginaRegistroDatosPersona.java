package co.com.automatizacionpractica.screenplay.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaRegistroDatosPersona {

	public static final Target NOMBRES_ADULTO = Target.the("").located(By.id("Adults[0].FirstName"));
	public static final Target APELLIDO_ADULTO = Target.the("").located(By.id("Adults[0].LastName"));
	public static final Target CLICK_PARA_GENERO = Target.the("").located(By.id("select2-chosen-35"));
	public static final Target SELECCIONA_GENERO = Target.the("").located(By.id("select2-results-35"));
	public static final Target NUMERO_DOCUMENTO_ADULTO = Target.the("").located(By.id("Adults[0].IdentificationNumber"));
	public static final Target CORREO = Target.the("").located(By.id("Passengers[0].email"));
	public static final Target CONFIRMA_CORREO = Target.the("").located(By.id("Passengers[0].repeatemail"));
	public static final Target CELULAR = Target.the("").located(By.id("Passengers0_mobile"));
	
	
	
	
	
	
	
	
}
