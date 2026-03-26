package com.tricentis.demowebshop.stepdefinitions;

import com.tricentis.demowebshop.questions.ValidarElemento;
import com.tricentis.demowebshop.tasks.CarritoUsuario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.hamcrest.CoreMatchers;

import static com.tricentis.demowebshop.UI.CarritoPageUI.LBL_PAGINA_CHEKOUT;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CarritoCompraStepDefinition {


    @Cuando("selecciona un producto y lo agregue al carrito")
    public void seleccionaUnProductoYLoAgregueAlCarrito() {

        theActorInTheSpotlight().attemptsTo(
                CarritoUsuario.onAgregarProductoCarrito()
        );
    }

    @Entonces("el producto debe agregarse correctamente al carrito")
    public void elProductoDebeAgregarseCorrectamenteAlCarrito() {
        theActorInTheSpotlight().should(
                seeThat("Validando pagina de checkout", ValidarElemento.isPresent(LBL_PAGINA_CHEKOUT), CoreMatchers.equalTo(true)
                ));
    }
}
