package co.com.automatizacionpractica.screenplay.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;
public class PaginaSeleccionTarifa {

	
	public static final Target FECHA_VUELO_MENOR_TARIFA = Target.the("").located(By.xpath("//tbody[@id='CalendarBody']/tr/td[@class='DateBox Today' or @class='DateBox']/div/div[2]/div[2]/span[3]"));
	public static final Target CLICK_TARIFA_BAJA = Target.the("").located(By.xpath("//div[@id='Event_Out_32']"));
	public static final Target CLICK_BOTON_CONTINUAR = Target.the("").located(By.xpath("//a[@id='monthContinue']"));
	public static final Target CONFIRMA_TARIFA = Target.the("").located(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[7]/div[1]/div[1]/div[3]/div[2]/div[3]/fieldset[1]/div[1]/div[1]/div[1]/div[2]/label[1]/div[1]/div[1]/div[3]/div[1]"));
	public static final Target CLICK_BOTON_ACEPTAR = Target.the("").located(By.xpath("//div[@id='fancyConfirm']/div[4]/a/span"));
	
	
	
}
