package Bernardo.framework.pages;

import Bernardo.framework.utils.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends SeleniumBase {
    public RegisterPage(WebDriver driver) {
        super(driver);
    }


    // DEFINIR LOCALIZADORES-----------------------------------------------------------------------

       By locatorFirstname =  By.name("firstname");
       By locatorLastname =  By.name("lastname");
       By locatorMail =  By.name("reg_email__");
       By locatorReMail =  By.name("reg_email_confirmation__");
       By locatorPassword =  By.name("reg_passwd__");
       By locatorDia =  By.name("birthday_day");
       By locatorMes =  By.id("month");
       By locatorAnio =  By.id("year");
       By locatorGeneros =  By.xpath("//label[contains(@for,'u_0_')]");
       By locatorPronombre =  By.name("preferred_pronoun");
       By locatorCustomGenero =  By.name("custom_gender");
       By locatorBotonIngresar =  By.xpath("//button[@type='submit']");
       By locatorCorreoYaAsociado =  By.xpath("//h3[contains(text(), 'tienes una cuenta de Facebook')]");





    // CENTRALIZAR ACCIONES------------------------------------------------------------------------



        public void ingresarUsername(){
           escribirTexto(esperarXElementoLocalizado(locatorFirstname),"Bernardo");
        }


        public void completarFormularioRegistro (String firstname, String lastname , String correo, String reCorreo, String password, String dia, String mes , String anio, int genero ){

            escribirTexto(esperarXElementoLocalizado(locatorFirstname),firstname);
            esperarXSegundos(1000);

            escribirTexto(esperarXElementoLocalizado(locatorLastname),lastname);
            esperarXSegundos(1000);

            escribirTexto(esperarXElementoLocalizado(locatorMail),correo);
            esperarXSegundos(1000);

            escribirTexto(esperarXElementoLocalizado(locatorReMail),reCorreo);
            esperarXSegundos(1000);

            escribirTexto(esperarXElementoLocalizado(locatorPassword),password);
            esperarXSegundos(1000);


            seleccionarComboBoxPorValor((locatorDia),dia);
            esperarXSegundos(1000);


            seleccionarComboBoxPorTextoVisible((locatorMes),mes);
            esperarXSegundos(1000);

            seleccionarComboBoxPorValor((locatorAnio),anio);
            esperarXSegundos(1000);

            click(buscarElementosWeb(locatorGeneros).get(0));
            esperarXSegundos(1000);

            click(buscarElementosWeb(locatorGeneros).get(1));
            esperarXSegundos(1000);

            click(buscarElementosWeb(locatorGeneros).get(2));
            esperarXSegundos(1000);

            click(buscarElementosWeb(locatorGeneros).get(0));
            esperarXSegundos(1000);

            click(esperarXElementoLocalizado(locatorBotonIngresar));








        }













}
