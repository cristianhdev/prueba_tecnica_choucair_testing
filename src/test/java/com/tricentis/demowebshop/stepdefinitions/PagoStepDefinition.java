package com.tricentis.demowebshop.stepdefinitions;

import com.tricentis.demowebshop.questions.ValidarEmail;
import com.tricentis.demowebshop.questions.ValidarTexto;
import com.tricentis.demowebshop.tasks.CompraUsuario;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.Map;

import static com.tricentis.demowebshop.UI.CheckOutPageUI.LBL_VALIDACION_PAGO_EXITOSO;
import static com.tricentis.demowebshop.UI.LoginPageUI.LBL_LOGIN_VALIDACION;
import static com.tricentis.demowebshop.helpers.MensajesValidacion.mensajeValidacionLoginExitoso;
import static com.tricentis.demowebshop.helpers.MensajesValidacion.mensajeValidacionPagoExitoso;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class PagoStepDefinition {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Cuando("ingrese la informacion de envio")
    public void ingreseLaInformacionDeEnvio(DataTable dataEnvio) {

        Map<String , String> data = dataEnvio.asMaps().get(0);


        theActorInTheSpotlight().attemptsTo(
                CompraUsuario.onFormularioCompra(data)
        );
    }

    @Entonces("se debe visualizar el mensaje de confirmación de compra")
    public void seDebeVisualizarElMensajeDeConfirmaciónDeCompra() {
        theActorInTheSpotlight().should(
                seeThat("Valida el mensaje de confirmación pago exitoso", ValidarTexto.onValidar(LBL_VALIDACION_PAGO_EXITOSO), equalTo(mensajeValidacionPagoExitoso))
        );
    }
}
