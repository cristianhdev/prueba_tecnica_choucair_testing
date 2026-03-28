package com.tricentis.demowebshop.UI;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class CarritoPageUI {

    public static final Target LNK_CATEGORIAS = Target.the("Link categorias").located(By.xpath("//ul[@class='list']/li/a[contains(text(),'Computers') and @href='/computers']"));

    public static final Target BTN_OPCION_CATEGORIA = Target.the("Opcion categoria equipos").located(By.xpath("(//div[@class='item-box'])[1]"));

    public static final Target OPCION_PRODUCTOS_CATEGORIA = Target.the("Opcion productos categoria").located(By.xpath("(//div[@class='item-box'])[1]"));//link: producto de categoria

    public static final Target BTN_AGREGAR_CARRITO = Target.the("Boton agregar al carrito").located(By.xpath("//input[@type='button' and contains(@id,'add-to-cart-button')]"));

    public static final Target BTN_CARRITO_COMPRA = Target.the("Boton carito de compra").located(By.xpath("//a[contains(text(),'Shopping cart') and @href='/cart']"));//Button: carrito compra

    public static final Target SEL_OPCION_CIUDAD= Target.the("Seleccion ciudad").located(By.id("CountryId"));

    public static final Target RBTN_OPCION_SERVCIO_TERMINOS= Target.the("Radio button terminos y servicio").located(By.id("termsofservice"));

    public static final Target BTN_CHEKOUT= Target.the("Boton Chekout").located(By.id("checkout"));

    public static final Target LBL_PAGINA_CHEKOUT = Target.the("Label confirmar pagina checkout").located(By.xpath("//h1[contains(text(),'Checkout')]"));
}
