package com.tricentis.demowebshop.UI;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class LoginPageUI {

    //link: Login
    //Locator://a[contains(text(),'Log in') or @href='/Log in']
    public static final Target LNK_LOG_IN = Target.the("Link login").located(By.xpath("//a[contains(text(),'Log in') or @href='/Log in']"));

    //Input text: Email
    //input[@id='Email']
    public static final Target INPUT_TEXT_EMAIL = Target.the("Input text email").locatedBy("//input[@id='Email']");

    //Input text: Password
    //input[@id='Password']
    public static final Target INPUT_TEXT_PASSWORD = Target.the("Input text password").locatedBy("//input[@id='Password']");

    //Boton log In:
    //input[@type="submit" and @value="Log in"]
    public static final Target BTN_REGISTRAR = Target.the("Boton confirmar registro").located(By.xpath("//input[@type='submit' and @value='Log in']"));
}
