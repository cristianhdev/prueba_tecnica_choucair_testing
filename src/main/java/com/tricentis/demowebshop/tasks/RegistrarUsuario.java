package com.tricentis.demowebshop.tasks;

import com.tricentis.demowebshop.interactions.ClickElemento;
import com.tricentis.demowebshop.interactions.EnterElemento;
import com.tricentis.demowebshop.models.Usuario;
import com.tricentis.demowebshop.utils.ExcelDatatable;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
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
        actor.attemptsTo(
                ClickElemento.onElemento(LNK_REGISTRO),
                ClickElemento.onElemento(RBTN_GENERO),
                EnterElemento.onCampo(INPUT_TEXT_PRIMER_NOMBRE,"Cristian"),
                EnterElemento.onCampo(INPUT_TEXT_SEGUNDO_NOMBRE,"Hernandez"),
                EnterElemento.onCampo(INPUT_TEXT_EMAIL,"text28QA@hotmail.com"),
                EnterElemento.onCampo(INPUT_TEXT_PASSWORD,"$12345%"),
                EnterElemento.onCampo(INPUT_TEXT_CONFIRMAR_PASSWORD,"$12345%"),
                ClickElemento.onElemento(BTN_REGISTRAR)
        );
    }

    public static RegistrarUsuario onFormularioRegistro(){
        return Instrumented.instanceOf(RegistrarUsuario.class).newInstance();
    }
}
