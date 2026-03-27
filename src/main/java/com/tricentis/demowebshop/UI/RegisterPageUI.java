package com.tricentis.demowebshop.UI;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class RegisterPageUI {

    /* Localizadores Pagina  Registro*/

    //link: Registrar
    //Locator://a[contains(text(),"Register") and @href="/register"]
    public static final Target LNK_REGISTRO = Target.the("Link registro").located(By.xpath("//a[contains(text(),'Register') or @href='/register']"));

    //Radio Button: Genero
    //input[@id='gender-male']
    public static final Target RBTN_GENERO = Target.the("Boton genero").locatedBy("//input[@id='gender-male']");

    //Input text: Primer Nombre
    //input[@id='FirstName']
    public static final Target INPUT_TEXT_PRIMER_NOMBRE = Target.the("Input texto primer nombre").locatedBy("//input[@id='FirstName']");

    //Input text: Segundo Nombre
    //input[@id='LastName']
    public static final Target INPUT_TEXT_SEGUNDO_NOMBRE = Target.the("Input texto segundo nombre").locatedBy("//input[@id='LastName']");

    //Input text: Email
    //input[@id='Email']
    public static final Target INPUT_TEXT_EMAIL = Target.the("Input texto email").locatedBy("//input[@id='Email']");

    //Input text: Password
    //input[@id='Password']
    public static final Target INPUT_TEXT_PASSWORD = Target.the("Input texto password").locatedBy("//input[@id='Password']");

    //Input text: Confirm Password
    //input[@id='ConfirmPassword']
    public static final Target INPUT_TEXT_CONFIRMAR_PASSWORD = Target.the("Input texto confirmar password").locatedBy("//input[@id='ConfirmPassword']");

    //Boton registrar:
    //input[@id='register-button' and @type="submit"]
    public static final Target BTN_REGISTRAR = Target.the("Boton confirmar registro").located(By.xpath("//input[@id='register-button' and @type='submit']"));

    //Texto validacion registro
    //div[@class="result"]
    public static final Target LBL_REGISTRAR_VALIDACION = Target.the("Label confirmar registro exitoso").located(By.xpath("//div[@class='result']"));


}
