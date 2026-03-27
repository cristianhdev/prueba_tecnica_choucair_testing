package com.tricentis.demowebshop.UI;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class CheckOutPageUI {


    //Seleccion: seleccion nueva direccion
    //select[@id='billing-address-select']
    public static final Target SEL_OPCION_DIRECCION_NUEVA= Target.the("Seleccion dirección nueva").located(By.xpath("//select[@id='billing-address-select']"));

    //Input text: Compañia
    //input[@id='BillingNewAddress_Company']
    public static final Target INPUT_TEXTO_COMPANIA = Target.the("Input text compañia").locatedBy("//input[@id='BillingNewAddress_Company']");

    //Button: seleccion pais
    //select[@id='BillingNewAddress_CountryId']
    public static final Target SEL_OPCION_PAIS_COMPRA= Target.the("Seleccion ciudad").located(By.xpath("//select[@id='BillingNewAddress_CountryId']"));

    //Input text: Ciudad
    //input[@id='BillingNewAddress_City']
    public static final Target INPUT_TEXTO_CIUDAD = Target.the("Input text compañia").locatedBy("//input[@id='BillingNewAddress_City']");

    //Input text: Dirección 1
    //input[@id='BillingNewAddress_Address1']
    public static final Target INPUT_TEXTO_DIRECCION = Target.the("Input texto compañia").locatedBy("//input[@id='BillingNewAddress_Address1']");

    //Input text: Código ZIP - Codigo postal
    //input[@id='BillingNewAddress_ZipPostalCode']
    public static final Target INPUT_TEXTO_CODIGO_ZIP = Target.the("Input texto compañia").locatedBy("//input[@id='BillingNewAddress_ZipPostalCode']");

    //Input text: Numero de telefono
    //input[@id='BillingNewAddress_PhoneNumber']
    public static final Target INPUT_TEXTO_NUMERO_TELEFONO = Target.the("Input texto compañia").locatedBy("//input[@id='BillingNewAddress_PhoneNumber']");

    //Button: Continuar paso 1
    //div[@id="billing-buttons-container"]/input
    public static final Target BTN_CONTINUAR_PASO1 = Target.the("Boton continuar direccion").locatedBy(" //div[@id='billing-buttons-container']/input");

    //Button: Continuar paso 2
    //div[@id="shipping-buttons-container"]/input
    public static final Target BTN_CONTINUAR_PASO2 = Target.the("Boton continuar metodo envio ").locatedBy(" //div[@id='shipping-buttons-container']/input");//Button: Continuar

    //Button: Continuar paso 3
    //div[@id="shipping-method-buttons-container"]/input
    public static final Target BTN_CONTINUAR_PASO3 = Target.the("Boton continuar metodo envio ").locatedBy(" //div[@id='shipping-method-buttons-container']/input");

    //Button: Continuar pago paso 4
    //div[@id="payment-method-buttons-container"]/input
    public static final Target BTN_CONTINUAR_PASO4 = Target.the("Boton continuar pago").locatedBy(" //div[@id='payment-method-buttons-container']/input");

    //Button: Continuar pago paso 5
    //div[@id="payment-info-buttons-container"]/input
    public static final Target BTN_CONTINUAR_PASO5 = Target.the("Boton continuar pago").locatedBy(" //div[@id='payment-info-buttons-container']/input");

    //Button: Continuar confirmar orden paso 6
    //div[@id="confirm-order-buttons-container"]/input
    public static final Target BTN_CONTINUAR_PASO6 = Target.the("Boton continuar confirmacion pedido").locatedBy(" //div[@id='confirm-order-buttons-container']/input");

    //Texto validacion pago exitoso
    //strong
    public static final Target LBL_VALIDACION_PAGO_EXITOSO = Target.the("Label confirmación pago exitoso").located(By.xpath("//strong"));

}
