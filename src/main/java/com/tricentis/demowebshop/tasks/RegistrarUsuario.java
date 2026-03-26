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

    static ArrayList<Map<String, String>> datos;

    public RegistrarUsuario() {
        /*try {
            this.datos = (ArrayList<Map<String, String>>) this.getData();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        this.usuario = new Usuario();
        this.usuario.setPrimerNombre(this.datos.get(0).get("primerNombre"));*/
    }
    


    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    ClickElemento.onElemento(LNK_REGISTRO),
                    ClickElemento.onElemento(RBTN_GENERO),
                    EnterElemento.onCampo(INPUT_TEXT_PRIMER_NOMBRE,"Cristian"),
                    EnterElemento.onCampo(INPUT_TEXT_SEGUNDO_NOMBRE,"Hernandez"),
                    EnterElemento.onCampo(INPUT_TEXT_EMAIL,"text29QA@hotmail.com"),
                    EnterElemento.onCampo(INPUT_TEXT_PASSWORD,"$12346%"),
                    EnterElemento.onCampo(INPUT_TEXT_CONFIRMAR_PASSWORD,"$12346%"),
                    ClickElemento.onElemento(BTN_REGISTRAR)
            );
        }catch (Exception e){
            throw new RuntimeException(e);
        }

    }

    public static RegistrarUsuario onFormularioRegistro(){
        return Instrumented.instanceOf(RegistrarUsuario.class).newInstance();
    }
}
