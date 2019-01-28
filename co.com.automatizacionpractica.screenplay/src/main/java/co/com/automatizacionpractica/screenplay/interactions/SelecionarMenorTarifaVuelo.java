package co.com.automatizacionpractica.screenplay.interactions;

import org.apache.tools.ant.taskdefs.Replace;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class SelecionarMenorTarifaVuelo  implements Interaction {
	private static WebDriver driver = Serenity.getWebdriverManager().getCurrentDriver();
	 private Target lista;
	 
	 public SelecionarMenorTarifaVuelo(Target lista ) {
         this.lista = lista;
	 }
     
         @Override
         public <T extends Actor> void performAs(T actor) {
        	 String xpath = "//tbody[@id='CalendarBody']/tr/td[@class='DateBox Today' or @class='DateBox']/div/div[2]/div[2]/span[1]";
        	 List<WebElement> dias = driver.findElements(By.xpath(xpath));
        	 
        	 int size = dias.size();
        	 float menor = 100000;
        	 int indice= 0;
        	 for (int i = 0; i < size; i++) {
        		 String valor = dias.get(i).getText();
        		
        		 valor = valor.replaceAll("USD ", "");
        		 
 			float aux = Float.parseFloat(valor);
 			
				if (aux < menor) {
					menor = aux;
					indice = i;
					
				}
			}
 	       	dias.get(indice).click();
         }

         
         public static SelecionarMenorTarifaVuelo Desde(Target lista) {
             return new SelecionarMenorTarifaVuelo(lista);
         }
}

