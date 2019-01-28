package co.com.automatizacionpractica.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaReservaDeVuelo {
	
	
	
	public static final Target CHECK_IDA = Target.the("").located(By.xpath("//label[@id='rbOneWayWrapper']//span[contains(text(),'Ida')]"));
	public static final Target CLICK_CIUDAD_ORIGEN = Target.the(" ").located(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[6]/form[1]/div[4]/div[1]/div[1]/a[1]/span[1]"));
	public static final Target SELECCIONA_CIUDAD_ORIGEN = Target.the(" ").located(By.xpath("//ul[@id='select2-results-20']"));
	public static final Target CLICK_CIUDAD_DESTINO = Target.the("").located(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[6]/form[1]/div[4]/div[2]/div[1]/a[1]/span[1]"));
	public static final Target SELECCIONA_CIUDAD_DESTINO = Target.the(" ").located(By.xpath("/html[1]/body[1]/div[11]/ul[1]"));
	public static final Target FECHA_IDA = Target.the(" ").located(By.xpath("//input[@id='DepartureDateForDisplay']"));
	public static final Target CLICK_NUMERO_PASAJEROS_ADULTOS = Target.the(" ").located(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[6]/form[1]/div[4]/div[3]/div[1]/a[1]/span[1]"));
	public static final Target SELECCIONA_NUMERO_PASAJEROS_ADULTOS = Target.the(" ").located(By.xpath("/html[1]/body[1]/div[12]"));
	public static final Target CLICK_NUMERO_PASAJEROS_NIÑOS = Target.the(" ").located(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[6]/form[1]/div[4]/div[3]/div[2]/a[1]/span[1]"));
	public static final Target SELECCIONA_NUMERO_PASAJEROS_NIÑOS = Target.the(" ").located(By.id("select2-results-23"));
	public static final Target CLICK_NUMERO_INFANTES = Target.the(" ").located(By.xpath(" /html[1]/body[1]/div[3]/div[2]/div[6]/form[1]/div[5]/div[4]/div[1]/a[1]/span[1]"));
	public static final Target SELECCIONA_NUMERO_INFANTES = Target.the(" ").located(By.xpath("//div[@id='select2-drop']"));
	public static final Target CHECK_PRECIO_DEL_MES = Target.the(" ").located(By.xpath("//span[contains(text(),'Precios del mes')]"));
	public static final Target CLICK_TIPO_MONEDA = Target.the(" ").located(By.xpath("//div[@id='s2id_Currency']//b[@role='presentation']"));
	public static final Target SELECCIONA_TIPO_MONEDA = Target.the(" ").located(By.xpath("//ul[@id='select2-results-15']"));
	public static final Target BOTON_RESERVAR = Target.the(" ").located(By.xpath("//a[@id='continueLink']"));
	
	
	
	
	
}
