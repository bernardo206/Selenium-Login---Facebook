package Bernardo.framework.test;

import Bernardo.framework.pages.HomePage;
import Bernardo.framework.pages.RegisterPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;


public class TestFacebook {

    //ATRIBUTOS

    WebDriver driver;
    HomePage home ;
    RegisterPage register;
    String rutaDriver = "C:\\Users\\bernardo.estrada\\OneDrive - TSOFT\\Escritorio\\BOOTCAMP\\SEMANA 1\\17 DE AGOSTO NIVELACION\\CODIGOS Y EJERCICIOS\\Selenium_Bernardo_Estrada\\src\\test\\resources\\drivers\\chromedriver.exe";
    String browser = "Chrome";

    String property = "webdriver.chrome.driver";


    @BeforeEach
    public void preTest(){

        home = new HomePage(driver);
        home.conexionDriver(browser,rutaDriver,property);

        register = new RegisterPage(home.getDriver());
        home.cargarPagina("https://es-es.facebook.com/");

    }



    @Test
    public void CP001_IngresoOk(){

        home.irARegistrarse();
        register.completarFormularioRegistro("Bernardo","Estrada","bernardo_88_3@hotmail.com", "bernardo_88_3@hotmail.com","12345678","1","jun","1988",1);
        Assertions.assertTrue(true);
    }


    @AfterEach
    public void afterTest(){
        home.cerrarBrowser();
    }


}
