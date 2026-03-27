package com.tricentis.demowebshop.stepdefinitions;

import com.tricentis.demowebshop.questions.ValidarEmail;
import com.tricentis.demowebshop.questions.ValidarTexto;
import com.tricentis.demowebshop.tasks.AbrirNavegador;
import com.tricentis.demowebshop.tasks.LoginUsuario;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Map;

import static com.tricentis.demowebshop.UI.LoginPageUI.LBL_LOGIN_VALIDACION;
import static com.tricentis.demowebshop.helpers.MensajesValidacion.mensajeValidacionLoginExitoso;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class LoginStepDefinition {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    private Actor usuario_login;

    @Dado("que el usuario se encuentra en la página del login")
    public void queElUsuarioSeEncuentraEnLaPáginaDelLogin() {
        usuario_login = OnStage.theActorCalled("usuario login");

        usuario_login.attemptsTo(
                AbrirNavegador.navegar()
        );
    }


    @Cuando("ingrese las credenciales validas")
    public void ingreseLasCredencialesValidas(DataTable dataLogin) {

        Map<String, String> datos = dataLogin.asMaps().get(0);

        usuario_login.attemptsTo(
                LoginUsuario.onFormularioLogin(datos.get("email"),datos.get("password"))
        );
    }


    @Entonces("se debe acceder correctamente a su cuenta")
    public void seDebeAccederCorrectamenteASuCuenta() {
        usuario_login.should(
                seeThat("Validando correo usuario logueado",ValidarEmail.onValidar(), equalTo(true)),
                seeThat("Validar titulo página login usuario registrado",ValidarTexto.onValidar(LBL_LOGIN_VALIDACION), equalTo(mensajeValidacionLoginExitoso))
        );
    }
}
