package co.com.automatizacionpractica.screenplay.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaRegistroAcompañantes {

	
	public static final Target NOMBRE_NIÑO1 = Target.the("").located(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[10]/form[1]/div[1]/div[1]/div[2]/div[3]/input[1]"));
	public static final Target APELLIDO_NIÑO1 = Target.the("").located(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[10]/form[1]/div[1]/div[1]/div[2]/div[4]/input[1]"));
	public static final Target FECHA_NACIMIENTO_NIÑO1 = Target.the("").located(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[10]/form[1]/div[1]/div[1]/div[2]/fieldset[1]/input[5]"));
	public static final Target CLICK_GENERO_NIÑO1 = Target.the("").located(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[10]/form[1]/div[1]/div[1]/div[2]/div[5]/div[1]/a[1]/span[2]/b[1]"));
	public static final Target SELECCIONA_GENERO_NIÑO1 = Target.the("").located(By.xpath("//DIV[@id='select2-drop']/self::DIV"));
	public static final Target NUMERO_DOCUMENTO_NIÑO1 = Target.the("").located(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[10]/form[1]/div[1]/div[1]/div[2]/div[7]/input[1]"));
	
	public static final Target NOMBRE_NIÑO2 = Target.the("").located(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[10]/form[1]/div[1]/div[1]/div[3]/div[3]/input[1]"));
	public static final Target APELLIDO_NIÑO2 = Target.the("").located(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[10]/form[1]/div[1]/div[1]/div[3]/div[4]/input[1]"));
	public static final Target FECHA_NACIMIENTO_NIÑO2 = Target.the("").located(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[10]/form[1]/div[1]/div[1]/div[3]/fieldset[1]/input[5]"));
	public static final Target CLICK_GENERO_NIÑO2 = Target.the("").located(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[10]/form[1]/div[1]/div[1]/div[3]/div[5]/div[1]/a[1]/span[1]"));
	public static final Target SELECCIONA_GENERO_NIÑO2 = Target.the("").located(By.xpath("//DIV[@id='select2-drop']/self::DIV"));
	public static final Target NUMERO_DOCUMENTO_NIÑO2 = Target.the("").located(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[10]/form[1]/div[1]/div[1]/div[3]/div[7]/input[1]"));
	
	public static final Target NOMBRE_INFANTE = Target.the("").located(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[10]/form[1]/div[1]/div[1]/div[4]/div[3]/input[1]"));
	public static final Target APELLIDO_INFANTE = Target.the("").located(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[10]/form[1]/div[1]/div[1]/div[4]/div[4]/input[1]"));
	public static final Target FECHA_NACIMIENTO_INFANTE = Target.the("").located(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[10]/form[1]/div[1]/div[1]/div[4]/fieldset[1]/input[5]"));
	
	
	public static final Target CLICK_BOTON_CONTINUAR = Target.the("").located(By.xpath("//A[@id='btnContinuePassengerDetails']/self::A"));
	
	
	public static final Target EQUIPAJE_PERSONA1 = Target.the("").located(By.xpath("//*[@id=\"select2-chosen-81\"]"));
	public static final Target NO_GRACIAS_PERSONA1 = Target.the("").located(By.xpath("//div[@id='select2-drop']"));
	public static final Target EQUIPAJE_PERSONA2 = Target.the("").located(By.xpath("//div[@id='ExtraContainerFCExtrasHandLuggage']/div[2]/div[1]/div[2]/div/div[2]/div/div[2]/div[1]/div/a"));
	public static final Target NO_GRACIAS_PERSONA2 = Target.the("").located(By.xpath("//DIV[@id='select2-drop']/self::DIV"));
	public static final Target EQUIPAJE_PERSONA3 = Target.the("").located(By.xpath("//div[@id='ExtraContainerFCExtrasHandLuggage']/div[2]/div[1]/div[3]/div/div[2]/div/div[3]/div[1]/div/a"));
	public static final Target NO_GRACIAS_PERSONA3 = Target.the("").located(By.xpath("//DIV[@id='select2-drop']/self::DIV"));
	public static final Target EQUIPAJE_BODEGA_PERSONA1  = Target.the("").located(By.xpath("//div[@id='divCheckInBaggage']/div[1]/div/div[1]/div/div[2]/div/div[1]/div[3]/div[1]/a"));
	public static final Target EQUIPAJE_BODEGA_NO_GRACIAS1  = Target.the("").located(By.xpath("//DIV[@id='select2-drop']/self::DIV"));
	public static final Target EQUIPAJE_BODEGA_PERSONA2  = Target.the("").located(By.xpath("//div[@id='divCheckInBaggage']/div[1]/div/div[2]/div/div[2]/div/div[4]/div[3]/div[1]/a"));
	public static final Target EQUIPAJE_BODEGA_NO_GRACIAS2  = Target.the("").located(By.xpath("//DIV[@id='select2-drop']/self::DIV"));
	public static final Target EQUIPAJE_BODEGA_PERSONA3  = Target.the("").located(By.xpath("//div[@id='divCheckInBaggage']/div[1]/div/div[3]/div/div[2]/div/div[7]/div[3]/div[1]/a"));
	public static final Target EQUIPAJE_BODEGA_NO_GRACIAS3  = Target.the("").located(By.xpath("//DIV[@id='select2-drop']/self::DIV"));
	public static final Target CHECK_INPERSONA1  = Target.the("").located(By.xpath("//div[@id='ExtraContainerExtrasExpress']/div[2]/div[1]/div[1]/div/div[2]/div/div[1]/div[1]/div/a"));
	public static final Target NO_CHECK_INPERSONA1  = Target.the("").located(By.xpath("//DIV[@id='select2-drop']/self::DIV"));
	public static final Target CHECK_INPERSONA2  = Target.the("").located(By.xpath("//div[@id='ExtraContainerExtrasExpress']/div[2]/div[1]/div[2]/div/div[2]/div/div[2]/div[1]/div/a"));
	public static final Target NO_CHECK_INPERSONA2  = Target.the("").located(By.xpath("//DIV[@id='select2-drop']/self::DIV"));
	public static final Target CHECK_INPERSONA3  = Target.the("").located(By.xpath("//div[@id='ExtraContainerExtrasExpress']/div[2]/div[1]/div[3]/div/div[2]/div/div[3]/div[1]/div/a"));
	public static final Target NO_CHECK_INPERSONA3  = Target.the("").located(By.xpath("//DIV[@id='select2-drop']/self::DIV"));
	public static final Target FILA_RAPIDA  = Target.the("").located(By.xpath("//div[@id='ExtraContainerExtrasExpressBaggage']/div[2]/div[1]/div/div[2]/div/div[1]/div/a"));
	public static final Target NO_FILA_RAPIDA  = Target.the("").located(By.xpath("//DIV[@id='select2-drop']/self::DIV"));
	public static final Target DES_CHECK  = Target.the("").located(By.xpath("//*[@id=\"travel-insurance-checkbox-5961\"]"));
	
	public static final Target BOTON_CONTINUAR  = Target.the("").located(By.xpath("//*[@id=\"extrasContinue\"]"));
	public static final Target YA_ESCOGI_LO_QUE_NECESITO  = Target.the("").located(By.xpath("//*[@id=\"fancyConfirm\"]/div[4]/a[2]"));
	public static final Target TOTAL_SERVICIO_ADICIONAL  = Target.the("").located(By.xpath("//*[@id=\"extras\"]/div[3]/span[2]"));
	
	
	
	
	
	
	



}
