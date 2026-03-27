package com.tricentis.demowebshop.stepdefinitions;

import com.tricentis.demowebshop.questions.ValidarElemento;
import com.tricentis.demowebshop.tasks.AbrirNavegador;
import com.tricentis.demowebshop.tasks.CarritoUsuario;
import com.tricentis.demowebshop.tasks.LoginUsuario;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.CoreMatchers;

import java.util.Map;

import static com.tricentis.demowebshop.UI.CarritoPageUI.LBL_PAGINA_CHEKOUT;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CarritoCompraStepDefinition {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    private Actor usuario_compra;

    @Cuando("que el usuario se encuentra autenticado")
    public void queElUsuarioSeEncuentraAutenticado(DataTable dataLogin) {

        usuario_compra = OnStage.theActorCalled("usuario compra");

        Map<String, String> datos = dataLogin.asMaps().get(0);

        theActorInTheSpotlight().attemptsTo(
                AbrirNavegador.navegar(),
                LoginUsuario.onFormularioLogin(datos.get("email"),datos.get("password"))
        );

    }

    @Cuando("selecciona un producto y lo agregue al carrito")
    public void seleccionaUnProductoYLoAgregueAlCarrito() {

        theActorInTheSpotlight().attemptsTo(
                CarritoUsuario.onAgregarProductoCarrito()
        );
    }

    @Entonces("el producto debe agregarse correctamente al carrito")
    public void elProductoDebeAgregarseCorrectamenteAlCarrito() {
        theActorInTheSpotlight().should(
                seeThat("Validando pagina de checkout", ValidarElemento.isPresente(LBL_PAGINA_CHEKOUT), CoreMatchers.equalTo(true)
                ));
    }
}
