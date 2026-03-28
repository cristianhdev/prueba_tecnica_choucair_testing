package com.tricentis.demowebshop.UI;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class CheckOutPageUI {


    public static final Target SEL_OPCION_DIRECCION_NUEVA= Target.the("Seleccion dirección nueva").located(By.id("billing-address-select"));

    public static final Target INPUT_TEXTO_COMPANIA = Target.the("Input text compañia").located(By.id("BillingNewAddress_Company"));

    public static final Target SEL_OPCION_PAIS_COMPRA= Target.the("Seleccion pais").located(By.id("BillingNewAddress_CountryId"));

    public static final Target INPUT_TEXTO_CIUDAD = Target.the("Input text ciudad").located(By.id("BillingNewAddress_City"));

    public static final Target INPUT_TEXTO_DIRECCION = Target.the("Input texto dirección").located(By.id("BillingNewAddress_Address1"));

    public static final Target INPUT_TEXTO_CODIGO_ZIP = Target.the("Input texto codigo zip").located(By.id("BillingNewAddress_ZipPostalCode"));

    public static final Target INPUT_TEXTO_NUMERO_TELEFONO = Target.the("Input texto numero telefono").located(By.id("BillingNewAddress_PhoneNumber"));

    public static final Target BTN_CONTINUAR_PASO1 = Target.the("Boton continuar direccion").locatedBy(" //div[@id='billing-buttons-container']/input");

    public static final Target BTN_CONTINUAR_PASO2 = Target.the("Boton continuar metodo envio ").locatedBy(" //div[@id='shipping-buttons-container']/input");

    public static final Target BTN_CONTINUAR_PASO3 = Target.the("Boton continuar metodo envio ").locatedBy(" //div[@id='shipping-method-buttons-container']/input");

    public static final Target BTN_CONTINUAR_PASO4 = Target.the("Boton continuar pago").locatedBy(" //div[@id='payment-method-buttons-container']/input");

    public static final Target BTN_CONTINUAR_PASO5 = Target.the("Boton continuar pago").locatedBy(" //div[@id='payment-info-buttons-container']/input");

    public static final Target BTN_CONTINUAR_PASO6 = Target.the("Boton continuar confirmacion pedido").locatedBy(" //div[@id='confirm-order-buttons-container']/input");

    public static final Target LBL_VALIDACION_PAGO_EXITOSO = Target.the("Label confirmación pago exitoso").located(By.cssSelector("div.title strong"));

}
