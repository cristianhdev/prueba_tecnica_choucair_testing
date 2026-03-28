package com.tricentis.demowebshop.UI;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class LoginPageUI {

    //link: Login
    public static final Target LNK_LOG_IN = Target.the("Link login").located(By.linkText("Log in"));

    public static final Target INPUT_TEXT_EMAIL = Target.the("Input texto email").located(By.id("Email"));

    public static final Target INPUT_TEXT_PASSWORD = Target.the("Input texto password").located(By.id("Password"));

    public static final Target BTN_LOGIN = Target.the("Boton log in").located(By.xpath("//input[@type='submit' and @value='Log in']"));

    public static final Target LBL_LOGIN_VALIDACION = Target.the("Label confirmar login exitoso").located(By.xpath("//h2[@class='topic-html-content-header']"));

    public static final Target LBL_EMAIL_VALIDACION = Target.the("Label confirmar correo {0} exitoso").locatedBy("//a[contains(text(),'{0}') and @href='/customer/info']");
}
