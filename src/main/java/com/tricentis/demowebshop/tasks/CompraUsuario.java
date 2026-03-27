package com.tricentis.demowebshop.tasks;

import com.tricentis.demowebshop.interactions.ClickElemento;
import com.tricentis.demowebshop.interactions.EnterElemento;
import com.tricentis.demowebshop.interactions.SelecionOpcion;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.Map;

import static com.tricentis.demowebshop.UI.CarritoPageUI.SEL_OPCION_CIUDAD;
import static com.tricentis.demowebshop.UI.CheckOutPageUI.*;

public class CompraUsuario implements Task {

    static Map<String, String> datosCompra;

    public CompraUsuario(Map<String, String> datos) {
        datosCompra = datos;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    SelecionOpcion.onOpcion(SEL_OPCION_DIRECCION_NUEVA,"New Address"),
                    EnterElemento.onCampo(INPUT_TEXTO_COMPANIA, datosCompra.get("compania")),
                    ClickElemento.onElemento(SEL_OPCION_PAIS_COMPRA),
                    SelecionOpcion.onOpcion(SEL_OPCION_PAIS_COMPRA, datosCompra.get("pais")),
                    EnterElemento.onCampo(INPUT_TEXTO_CIUDAD, datosCompra.get("ciudad")),
                    EnterElemento.onCampo(INPUT_TEXTO_DIRECCION, datosCompra.get("direccion")),
                    EnterElemento.onCampo(INPUT_TEXTO_CODIGO_ZIP, datosCompra.get("codigo_postal")),
                    EnterElemento.onCampo(INPUT_TEXTO_NUMERO_TELEFONO, datosCompra.get("numero_telefono")),
                    ClickElemento.onElemento(BTN_CONTINUAR_PASO1),
                    ClickElemento.onElemento(BTN_CONTINUAR_PASO2),
                    ClickElemento.onElemento(BTN_CONTINUAR_PASO3),
                    ClickElemento.onElemento(BTN_CONTINUAR_PASO4),
                    ClickElemento.onElemento(BTN_CONTINUAR_PASO5),
                    ClickElemento.onElemento(BTN_CONTINUAR_PASO6)
            );
        }
        catch (Exception e) {
                throw new RuntimeException(e);
        }
    }

    public static CompraUsuario onFormularioCompra(Map<String, String> datosCompra){
        return Instrumented.instanceOf(CompraUsuario.class).withProperties(datosCompra);
    }
}
