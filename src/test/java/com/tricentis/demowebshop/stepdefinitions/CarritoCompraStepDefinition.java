package com.tricentis.demowebshop.stepdefinitions;

import com.tricentis.demowebshop.questions.ValidarEmail;
import com.tricentis.demowebshop.questions.ValidarTexto;
import com.tricentis.demowebshop.tasks.CarritoUsuario;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.tricentis.demowebshop.UI.LoginPageUI.LBL_LOGIN_VALIDACION;
import static com.tricentis.demowebshop.helpers.MensajesValidacion.mensajeValidacionLoginExitoso;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class CarritoCompraStepDefinition {


    @Cuando("selecciona un producto y lo agregue al carrito")
    public void seleccionaUnProductoYLoAgregueAlCarrito() {

        theActorInTheSpotlight().attemptsTo(
                CarritoUsuario.onAgregarProductoCarrito()
        );
    }

    @Entonces("el producto debe agregarse correctamente al carrito")
    public void elProductoDebeAgregarseCorrectamenteAlCarrito() {

    }
}
