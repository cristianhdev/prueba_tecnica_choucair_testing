package com.tricentis.demowebshop.stepdefinitions;

import com.tricentis.demowebshop.questions.ValidarEmail;
import com.tricentis.demowebshop.questions.ValidarTexto;
import com.tricentis.demowebshop.tasks.AbrirNavegador;
import com.tricentis.demowebshop.tasks.LoginUsuario;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.tricentis.demowebshop.UI.LoginPageUI.LBL_LOGIN_VALIDACION;
import static com.tricentis.demowebshop.helpers.MensajesValidacion.mensajeValidacionLoginExitoso;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class LoginStepDefinition {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    private Actor usuario_registrado;

    @Dado("que el usuario se encuentra en la página del login")
    public void queElUsuarioSeEncuentraEnLaPáginaDelLogin() {
        usuario_registrado = OnStage.theActorCalled("usuario registrado");

        usuario_registrado.attemptsTo(
                AbrirNavegador.navegar()
        );
    }

    @Cuando("ingresa las credenciales validas {string} y {string}")
    public void ingresaLasCredencialesValidasY(String email, String password) {
        usuario_registrado.attemptsTo(
                LoginUsuario.onFormularioLogin(email,password)
        );
    }

    @Entonces("se debe acceder correctamente a su cuenta")
    public void seDebeAccederCorrectamenteASuCuenta() {
        usuario_registrado.should(
                seeThat("Validando correo usuario logueado",ValidarEmail.onValidar(), equalTo(true)),
                seeThat("Validar titulo pagina login usuario registrado",ValidarTexto.onValidar(LBL_LOGIN_VALIDACION), equalTo(mensajeValidacionLoginExitoso))
        );
    }
}
