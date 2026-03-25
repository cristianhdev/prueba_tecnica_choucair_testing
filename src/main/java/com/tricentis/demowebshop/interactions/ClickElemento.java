package com.tricentis.demowebshop.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class ClickElemento implements Interaction {

    private final Target elemento;

    public ClickElemento(Target elemento) {
        this.elemento = elemento;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            WaitUntil.the(this.elemento,isVisible()).forNoMoreThan(5).seconds();
            this.elemento.resolveFor(actor).click();
        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }

    }

    public static ClickElemento onElemento(Target elemento){
        return Tasks.instrumented(ClickElemento.class,elemento);
    }
}
