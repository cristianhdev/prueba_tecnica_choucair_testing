package com.tricentis.demowebshop.stepdefinitions;

import com.tricentis.demowebshop.questions.ValidarTexto;
import com.tricentis.demowebshop.tasks.AbrirNavegador;
import com.tricentis.demowebshop.tasks.RegistrarUsuario;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import static com.tricentis.demowebshop.UI.RegisterPageUI.LBL_REGISTRAR_VALIDACION;
import static com.tricentis.demowebshop.helpers.MensajesValidacion.mensajeValidacionRegistroUsuario;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;


public class RegistroStepDefinition {


    @Managed
    private WebDriver driver;

    private Actor usuario;

    @Before
    public void setup(){
        usuario =  Actor.named("usuario").can(BrowseTheWeb.with(driver));
    }


    @Dado("que el usuario se encuentra en la página de registro")
    public void queElUsuarioSeEncuentraEnLaPáginaDeRegistro() {
        usuario.attemptsTo(
                AbrirNavegador.navegar()
        );
    }

    @Cuando("ingresa la información personal y sus credenciales de usuario")
    public void ingresaLaInformaciónPersonalYSusCredencialesDeUsuario() {

        usuario.attemptsTo(
                RegistrarUsuario.onFormularioRegistro()
        );

    }


    @Entonces("se debe visualizar el mensaje de confirmación")
    public void seDebeVisualizarElMensajeDeConfirmación() {
        usuario.should(
                seeThat(ValidarTexto.onValidar(LBL_REGISTRAR_VALIDACION), equalTo(mensajeValidacionRegistroUsuario))
        );
    }

}
