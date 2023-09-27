package casosDePrueba;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class Cp_Facebook {


    private WebDriver driver;// ATRIBUTO GLOBAL

    @BeforeEach
    public void precondiciones() {

        //Parametrizar la ruta del driver
        String rutaDriver = "C:\\Users\\bernardo.estrada\\OneDrive - TSOFT\\Escritorio\\BOOTCAMP\\SEMANA 1\\17 DE AGOSTO NIVELACION\\CODIGOS Y EJERCICIOS\\Selenium_Bernardo_Estrada\\src\\test\\resources\\drivers\\chromedriver.exe";

        // Enlazar el Driver-----------------------------------------------------
        System.setProperty("webdriver.chrome.driver", rutaDriver);

        // Instanciar un objeto de tipo webdriver en google chrome-------------------------------------
        driver = new ChromeDriver(); // Levanta Browser--------------------------------------

        driver.get("https://es-es.facebook.com/login.php"); // Carga  url al browser------------------------------

    }


    @AfterEach
    public void  poscondiciones(){
        driver.quit();
    }


    @Test

    public void cp_01_Ceacion_cuenta() throws InterruptedException{


        // LOCALIZAR EL ELEMENTO DEL HTML---------------------------------------------------------
        By localizadorBotonRegistrar = By.xpath("//a[contains(text(),'Registrarte')]");

        // CREAR EL ELEMENTO WEB------------------------------------------------------------------
        WebElement btnregistrar = driver.findElement(localizadorBotonRegistrar);


        // HACER CLICK EN EL BOTON----------------------------------------------------------------
        btnregistrar.click();

        // HACER ESPERAR------------------------------------------------------------------------
        Thread.sleep(3000);


        //--------------------NOMBRE----------------------------
        driver.findElement(By.name("firstname")).sendKeys("Bernardo");


        //----------------------APELLIDO--------------------------
        driver.findElement(By.name("lastname")).sendKeys("Estrada");


        //------------------EMAIL------------------------------
        driver.findElement(By.name("reg_email__")).sendKeys("bernardo_88_3_@hotmail.com");


        //------------------EMAIL------------------------------
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("bernardo_88_3_@hotmail.com");

        // HACER ESPERAR------------------------------------------------------------------------
        Thread.sleep(1000);


        //-----------------PASSWORD------------------------------
        driver.findElement(By.name("reg_passwd__")).sendKeys("12345678");


        //FORMA DE SELECCIONAR EL DESPLEGABLE DE "Dia" -----------------------------------------------------
        Select selectDia = new Select(driver.findElement(By.name("birthday_day")));
        selectDia.selectByValue("1");

        //FORMA DE SELECCIONAR EL DESPLEGABLE DE "MES" -----------------------------------------------------

        WebElement dropdown = driver.findElement(By.id("month"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("jun");


        //FORMA DE SELECCIONAR EL DESPLEGABLE DE "AÑO" -----------------------------------------------------

        WebElement dropdownAnio = driver.findElement(By.id("year"));
        Select selectAnio = new Select(dropdownAnio);
        selectAnio.selectByValue("1988");



        //-SELECCIONAR ENTRE VARIAS OPCCIONES-TIPO CHECKBOX-------------GENERO---------------------------------------
        List<WebElement> generos = driver.findElements(By.xpath("//label[contains(@for,'u_0_')]"));


        Thread.sleep(1000);
        generos.get(0).click();// SON LISTAS "0" ES LA POSICION 1 DE LA LISTA "MUJER" EN ESTE CASO
        Thread.sleep(1000);
        generos.get(1).click();
        Thread.sleep(1000);
        generos.get(2).click();
        Thread.sleep(2000);

        //SELECCIONAR PRONOMBRE--------------------------------------------------------------------------------------
        WebElement dropdownPronombre = driver.findElement(By.name("preferred_pronoun"));
        Select selectPronombre = new Select(dropdownPronombre);
        selectPronombre.selectByValue("2");


        // GENERO OPCCIONAL----------------------------------------------------------------------------------------
        driver.findElement(By.name("custom_gender")).sendKeys("Masculino");

        //BOTON REGISTRATE-----------------------------------------------------------------------------------------
        driver.findElement(By.xpath("//button[@type='submit']")).click();


    }


    @Test

    public void cp_01_Ceacion_cuenta_mail_asociado() throws InterruptedException{


        // LOCALIZAR EL ELEMENTO DEL HTML---------------------------------------------------------
        By localizadorBotonRegistrar = By.xpath("//a[contains(text(),'Registrarte')]");

        // CREAR EL ELEMENTO WEB------------------------------------------------------------------
        WebElement btnregistrar = driver.findElement(localizadorBotonRegistrar);


        // HACER CLICK EN EL BOTON----------------------------------------------------------------
        btnregistrar.click();

        // HACER ESPERAR------------------------------------------------------------------------
        Thread.sleep(3000);



        //--------------------NOMBRE----------------------------
        driver.findElement(By.name("firstname")).sendKeys("Bernardo");


        //----------------------APELLIDO--------------------------
        driver.findElement(By.name("lastname")).sendKeys("Estrada");


        //------------------EMAIL------------------------------
        driver.findElement(By.name("reg_email__")).sendKeys("bernardo_88_3_@hotmail.com");


        //------------------EMAIL------------------------------
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("bernardo_88_3_@hotmail.com");

        // HACER ESPERAR------------------------------------------------------------------------
        Thread.sleep(1000);


        //-----------------PASSWORD------------------------------
        driver.findElement(By.name("reg_passwd__")).sendKeys("12345678");


        //FORMA DE SELECCIONAR EL DESPLEGABLE DE "Dia" -----------------------------------------------------
        Select selectDia = new Select(driver.findElement(By.name("birthday_day")));
        selectDia.selectByValue("1");

        //FORMA DE SELECCIONAR EL DESPLEGABLE DE "MES" -----------------------------------------------------

        WebElement dropdown = driver.findElement(By.id("month"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("jun");


        //FORMA DE SELECCIONAR EL DESPLEGABLE DE "AÑO" -----------------------------------------------------

        WebElement dropdownAnio = driver.findElement(By.id("year"));
        Select selectAnio = new Select(dropdownAnio);
        selectAnio.selectByValue("1988");



        //-SELECCIONAR ENTRE VARIAS OPCCIONES-TIPO CHECKBOX-------------GENERO---------------------------------------
        List<WebElement> generos = driver.findElements(By.xpath("//label[contains(@for,'u_0_')]"));


        Thread.sleep(1000);
        generos.get(0).click();// SON LISTAS "0" ES LA POSICION 1 DE LA LISTA "MUJER" EN ESTE CASO
        Thread.sleep(1000);
        generos.get(1).click();
        Thread.sleep(1000);
        generos.get(2).click();
        Thread.sleep(2000);

        //SELECCIONAR PRONOMBRE--------------------------------------------------------------------------------------
        WebElement dropdownPronombre = driver.findElement(By.name("preferred_pronoun"));
        Select selectPronombre = new Select(dropdownPronombre);
        selectPronombre.selectByValue("2");


        // GENERO OPCCIONAL----------------------------------------------------------------------------------------
        driver.findElement(By.name("custom_gender")).sendKeys("Masculino");

        //BOTON REGISTRATE-----------------------------------------------------------------------------------------
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(3000);

        // YA TIENES CUENTA ASOCIADA AL MAIL------------------------------------------------------------------------

        String resultadoEsperado =   corregirEncoding("¿Ya tienes una cuenta de Facebook?");


        WebElement textoMensaje = driver.findElement(By.xpath("//h3[contains(text(), 'tienes una cuenta de Facebook')]"));

        String resultadoObtenido = textoMensaje.getText();

        Assertions.assertEquals(resultadoEsperado,resultadoObtenido);

    }

    // PASA DE ENCODING (LOS ASENTOS)
    public static String corregirEncoding(String textoIncorrecto){
        byte[] bytes= textoIncorrecto.getBytes(StandardCharsets.ISO_8859_1);
        String textoCorregido = new String(bytes,StandardCharsets.UTF_8);
        return  textoCorregido;
    }



    @Test
    public void cp_01_Ceacion_cuenta_mail_no_coincide() throws InterruptedException{


        // LOCALIZAR EL ELEMENTO DEL HTML---------------------------------------------------------
        By localizadorBotonRegistrar = By.xpath("//a[contains(text(),'Registrarte')]");

        // CREAR EL ELEMENTO WEB------------------------------------------------------------------
        WebElement btnregistrar = driver.findElement(localizadorBotonRegistrar);


        // HACER CLICK EN EL BOTON----------------------------------------------------------------
        btnregistrar.click();

        // HACER ESPERAR------------------------------------------------------------------------
        Thread.sleep(3000);


        //--------------------NOMBRE----------------------------
        driver.findElement(By.name("firstname")).sendKeys("Bernardo");


        //----------------------APELLIDO--------------------------
        driver.findElement(By.name("lastname")).sendKeys("Estrada");


        //------------------EMAIL------------------------------
        driver.findElement(By.name("reg_email__")).sendKeys("bernardo_88_3_@hotmail.com");

        Thread.sleep(1000);
        //------------------EMAIL------------------------------
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("bernardo_88_3@hotmail.com");

        // HACER ESPERAR------------------------------------------------------------------------
        Thread.sleep(1000);


        //-----------------PASSWORD------------------------------
        driver.findElement(By.name("reg_passwd__")).sendKeys("12345678");


        //FORMA DE SELECCIONAR EL DESPLEGABLE DE "Dia" -----------------------------------------------------
        Select selectDia = new Select(driver.findElement(By.name("birthday_day")));
        selectDia.selectByValue("1");

        //FORMA DE SELECCIONAR EL DESPLEGABLE DE "MES" -----------------------------------------------------

        WebElement dropdown = driver.findElement(By.id("month"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("jun");


        //FORMA DE SELECCIONAR EL DESPLEGABLE DE "AÑO" -----------------------------------------------------

        WebElement dropdownAnio = driver.findElement(By.id("year"));
        Select selectAnio = new Select(dropdownAnio);
        selectAnio.selectByValue("1988");



        //-SELECCIONAR ENTRE VARIAS OPCCIONES-TIPO CHECKBOX-------------GENERO---------------------------------------
        List<WebElement> generos = driver.findElements(By.xpath("//label[contains(@for,'u_0_')]"));


        Thread.sleep(1000);
        generos.get(0).click();// SON LISTAS "0" ES LA POSICION 1 DE LA LISTA "MUJER" EN ESTE CASO
        Thread.sleep(1000);
        generos.get(1).click();
        Thread.sleep(1000);
        generos.get(2).click();
        Thread.sleep(2000);

        //SELECCIONAR PRONOMBRE--------------------------------------------------------------------------------------
        WebElement dropdownPronombre = driver.findElement(By.name("preferred_pronoun"));
        Select selectPronombre = new Select(dropdownPronombre);
        selectPronombre.selectByValue("2");


        // GENERO OPCCIONAL----------------------------------------------------------------------------------------
        driver.findElement(By.name("custom_gender")).sendKeys("Masculino");

        //BOTON REGISTRATE-----------------------------------------------------------------------------------------
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);

        // ------------TUS DIRECCIONES DE MAIL NO COINCIDEN------------------------------------------------------------

        String resultadoEsperado =   corregirEncodingg("Tus direcciones de correo no coinciden. Inténtalo de nuevo.");
        WebElement textoMensaje = driver.findElement(By.xpath("//div[contains(text(), 'Tus direcciones')]"));
        String resultadoObtenido = textoMensaje.getText();
        Assertions.assertEquals(resultadoEsperado,resultadoObtenido);

    }

    // PASA DE ENCODING (LOS ASENTOS)
    public static String corregirEncodingg(String textoIncorrecto){
        byte[] bytes= textoIncorrecto.getBytes(StandardCharsets.ISO_8859_1);
        String textoCorregido = new String(bytes,StandardCharsets.UTF_8);
        return  textoCorregido;
    }


}












