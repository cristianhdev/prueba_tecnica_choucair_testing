package com.tricentis.demowebshop.tasks;

import com.tricentis.demowebshop.interactions.ClickElemento;
import com.tricentis.demowebshop.interactions.EnterElemento;
import com.tricentis.demowebshop.models.Usuario;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.ArrayList;
import java.util.Map;

import static com.tricentis.demowebshop.UI.RegisterPageUI.*;

public class RegistrarUsuario implements Task {

    private Usuario usuario;

    static Map<String, String> datos;

    public RegistrarUsuario(Map<String, String>  datosUsuario) {
        datos = datosUsuario;

        this.usuario = new Usuario();

        this.usuario.setPrimerNombre(datos.get("primerNombre"));
        this.usuario.setSegundoNombre(datos.get("segundoNombre"));
        this.usuario.setEmail(datos.get("email"));
        this.usuario.setPassword(datos.get("password"));

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    ClickElemento.onElemento(LNK_REGISTRO),
                    ClickElemento.onElemento(RBTN_GENERO),
                    EnterElemento.onCampo(INPUT_TEXT_PRIMER_NOMBRE,this.usuario.getPrimerNombre()),
                    EnterElemento.onCampo(INPUT_TEXT_SEGUNDO_NOMBRE,this.usuario.getSegundoNombre()),
                    EnterElemento.onCampo(INPUT_TEXT_EMAIL,this.usuario.getEmail()),
                    EnterElemento.onCampo(INPUT_TEXT_PASSWORD,this.usuario.getPassword()),
                    EnterElemento.onCampo(INPUT_TEXT_CONFIRMAR_PASSWORD,this.usuario.getPassword()),
                    ClickElemento.onElemento(BTN_REGISTRAR)
            );
        }catch (Exception e){
            throw new RuntimeException(e);
        }

    }

    public static RegistrarUsuario onFormularioRegistro(Map<String, String> datos){
        return Instrumented.instanceOf(RegistrarUsuario.class).withProperties(datos);
    }
}
