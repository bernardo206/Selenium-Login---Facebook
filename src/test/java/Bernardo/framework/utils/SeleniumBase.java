package Bernardo.framework.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SeleniumBase {

   // ATRIBUTOS--------------------------------------------------------------------------
    protected WebDriver driver;
    protected WebDriverWait espera;

    // METODOS----------------------------------------------------------------------------

    // CONSTRUCTOR DEL DRIVER---------Getters and Setters---------------------------------
    public SeleniumBase(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
// WRAPPER DE LAS ACCIONES DE SELENIUM------------------------------------------------

    public void click(By localizador){
        driver.findElement(localizador).click();
    }


    public void click(WebElement element){
        element.click();
    }



    public void escribirTexto(By localizador, String texto){
        driver.findElement(localizador).sendKeys(texto);
    }

    public void escribirTexto(WebElement element, String texto){
    element.sendKeys(texto);
    }

    public WebElement buscarElementoWeb(By localizador){
        return  driver.findElement(localizador);
    }



    public List<WebElement> buscarElementosWeb(By localizador){
        return driver.findElements(localizador);
    }


    public void esperarXSegundos (int milisegundos)  {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
         //   throw new RuntimeException(e);
            System.out.println("ups");
        }
    }

    public void cargarPagina(String url){
        driver.get(url);
    }

    //Driver que espera 20 milisegundos hasta que aparece un elemento, consulta cada 0.5 seg la condicion esperada --(ExpectedCondicions)--
    public WebElement esperarXElementoLocalizado(By localizador){
        espera = new WebDriverWait(this.getDriver(),20);
        return espera.until(ExpectedConditions.presenceOfElementLocated(localizador));

    }

    public String obtenerTexto(By localizador){
        return driver.findElement(localizador).getText();
    }


    public String obtenerTexto(WebElement element){
        return element.getText();
    }


    public void maximizarBrowser(){
        driver.manage().window().maximize();
    }

    public void cerrarBrowser(){
        driver.quit();
    }


    public WebDriver conexionDriver(String browser, String ruta, String property){
        if (browser.equalsIgnoreCase("Chrome")){
            System.setProperty(property,ruta);
            this.driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")){
            System.setProperty(property,ruta);
            this.driver = new FirefoxDriver();
        }
        return this.driver;
    }



    //FORMA DE SELECCIONAR EL DESPLEGABLE DE "Dia" -----------------------------------------------------
   // Select selectDia = new Select(driver.findElement(By.name("birthday_day")));
      //  selectDia.selectByValue("1");

    //FORMA DE SELECCIONAR EL DESPLEGABLE DE "MES" -----------------------------------------------------

   // WebElement dropdown = driver.findElement(By.id("month"));
  //  Select select = new Select(dropdown);
       // select.selectByVisibleText("jun");


    //FORMA DE SELECCIONAR EL DESPLEGABLE DE "AÑO" -----------------------------------------------------

  //  WebElement dropdownAnio = driver.findElement(By.id("year"));
   // Select selectAnio = new Select(dropdownAnio);
      //  selectAnio.selectByValue("1988");





    public void  seleccionarComboBoxPorValor(By localizador, String value){

        Select selectDia = new Select(esperarXElementoLocalizado(localizador));
        selectDia.selectByValue(value);

    }

    public void  seleccionarComboBoxPorTextoVisible(By localizador, String texto){

        Select selectDia = new Select(esperarXElementoLocalizado(localizador));
        selectDia.selectByVisibleText(texto);

    }



}
