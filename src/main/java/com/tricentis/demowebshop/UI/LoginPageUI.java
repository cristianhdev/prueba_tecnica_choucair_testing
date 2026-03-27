package com.tricentis.demowebshop.UI;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class LoginPageUI {

    //link: Login
    //a[contains(text(),'Log in') or @href='/Log in']
    public static final Target LNK_LOG_IN = Target.the("Link login").located(By.xpath("//a[contains(text(),'Log in') or @href='/Log in']"));

    //Input text: Email
    //input[@id='Email']
    public static final Target INPUT_TEXT_EMAIL = Target.the("Input texto email").locatedBy("//input[@id='Email']");

    //Input text: Password
    //input[@id='Password']
    public static final Target INPUT_TEXT_PASSWORD = Target.the("Input texto password").locatedBy("//input[@id='Password']");

    //Boton log In:
    //input[@type="submit" and @value="Log in"]
    public static final Target BTN_LOGIN = Target.the("Boton log in").located(By.xpath("//input[@type='submit' and @value='Log in']"));

    //Texto validacion ingreso login
    //h2[@class='topic-html-content-header']
    public static final Target LBL_LOGIN_VALIDACION = Target.the("Label confirmar login exitoso").located(By.xpath("//h2[@class='topic-html-content-header']"));

    //Texto correo usuario logeado
    //a[contains(text(),'{0}') and @href='/customer/info'] dinamico
    public static final Target LBL_EMAIL_VALIDACION = Target.the("Label confirmar correo {0} exitoso").locatedBy("//a[contains(text(),'{0}') and @href='/customer/info']");
}
