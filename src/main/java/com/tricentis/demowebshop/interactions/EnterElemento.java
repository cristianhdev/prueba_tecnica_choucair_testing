package com.tricentis.demowebshop.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EnterElemento implements Interaction {

    private final Target elemento;
    private final String textoEntrada;

    public EnterElemento(Target elemento, String textoEntrada) {
        this.elemento = elemento;
        this.textoEntrada = textoEntrada;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
            WaitUntil.the(this.elemento,isVisible()).forNoMoreThan(5).seconds();
            elemento.resolveFor(actor).sendKeys(this.textoEntrada);
        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }

    }

    public static EnterElemento onCampo(Target elemento,String texto){
        return Tasks.instrumented(EnterElemento.class,elemento,texto);
    }
}
