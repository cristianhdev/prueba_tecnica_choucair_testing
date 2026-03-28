package com.tricentis.demowebshop.UI;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class RegisterPageUI {

    /* Localizadores Pagina  Registro*/

    public static final Target LNK_REGISTRO = Target.the("Link registro").located(By.linkText("Register"));

    public static final Target RBTN_GENERO = Target.the("Boton genero").located(By.id("gender-male"));

    public static final Target INPUT_TEXT_PRIMER_NOMBRE = Target.the("Input texto primer nombre").located(By.id("FirstName"));

    public static final Target INPUT_TEXT_SEGUNDO_NOMBRE = Target.the("Input texto segundo nombre").located(By.id("LastName"));

    public static final Target INPUT_TEXT_EMAIL = Target.the("Input texto email").located(By.id("Email"));

    public static final Target INPUT_TEXT_PASSWORD = Target.the("Input texto password").located(By.id("Password"));


    public static final Target INPUT_TEXT_CONFIRMAR_PASSWORD = Target.the("Input texto confirmar password").located(By.id("ConfirmPassword"));

    public static final Target BTN_REGISTRAR = Target.the("Boton confirmar registro").located(By.id("register-button"));

    public static final Target LBL_REGISTRAR_VALIDACION = Target.the("Label confirmar registro exitoso").located(By.xpath("//div[@class='result']"));


}
