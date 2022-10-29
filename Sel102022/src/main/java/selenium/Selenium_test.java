package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_test {

	public static void main(String[] args) {

         String exePath = "./driver/chromedriver.exe"; //Crear variable para indicarle de donde va a tomar el driver, el ./ sirve para decirlo que lo tome de mi carpeta driver de eclipse.
         System.setProperty("webdriver.chrome.driver", exePath); //Agregamos la propiedad con la ruta del chromeDriver
         WebDriver driver = new ChromeDriver(); //Se crea el objeto driver para asignarle el ChromeDriver para controlar el navegador
         driver.get("https://www.google.com"); //Abrir URL de Google Chrome
	}

}
