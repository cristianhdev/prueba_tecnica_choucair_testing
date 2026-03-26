package com.tricentis.demowebshop.tasks;

import com.tricentis.demowebshop.interactions.ClickElemento;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static com.tricentis.demowebshop.UI.CarritoPageUI.*;

public class CarritoUsuario implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ClickElemento.onElemento(LNK_CATEGORIAS),
                ClickElemento.onElemento(BTN_OPCION_CATEGORIA),
                ClickElemento.onElemento(OPCION_PRODUCTOS_CATEGORIA),
                ClickElemento.onElemento(BTN_AGREGAR_CARRITO),
                ClickElemento.onElemento(BTN_CARRITO_COMPRA),
                ClickElemento.onElemento(RBTN_OPCION_SERVCIO_TERMINOS),
                ClickElemento.onElemento(BTN_CHEKOUT)
        );
    }

    public static CarritoUsuario onAgregarProductoCarrito(){
        return Instrumented.instanceOf(CarritoUsuario.class).newInstance();
    }
}
