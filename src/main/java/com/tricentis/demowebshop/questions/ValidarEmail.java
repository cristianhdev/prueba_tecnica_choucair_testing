package com.tricentis.demowebshop.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.tricentis.demowebshop.UI.LoginPageUI.LBL_EMAIL_VALIDACION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidarEmail implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        //traemos el email del usuario log in
        String email = actor.recall("email");
        //esperamos que el login se complete
        WaitUntil.the(LBL_EMAIL_VALIDACION,isVisible()).forNoMoreThan(5).seconds();
        String textoUI = LBL_EMAIL_VALIDACION.of(email).resolveFor(actor).getText();

        return textoUI.contains(email);
    }

    public static ValidarEmail onValidar(){
        return new ValidarEmail();
    }
}