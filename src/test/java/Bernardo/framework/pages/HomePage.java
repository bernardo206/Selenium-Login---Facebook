package Bernardo.framework.pages;

import Bernardo.framework.utils.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.swing.plaf.PanelUI;

public class HomePage extends SeleniumBase {


    public HomePage(WebDriver driver) {
        super(driver);
    }


    // DEFINIR LOCALIZADORES-----------------------------------------------------------------------
    By localizadorBotonRegistrar = By.xpath("//a[contains(text(),'Registrarte')]");




    // CENTRALIZAR ACCIONES------------------------------------------------------------------------

    public void irARegistrarse(){
       // click(localizadorBotonRegistrar);
     click(esperarXElementoLocalizado(localizadorBotonRegistrar));
    }





}
