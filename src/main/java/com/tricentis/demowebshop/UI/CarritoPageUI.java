package com.tricentis.demowebshop.UI;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class CarritoPageUI {

    //link: Categorias menu
    //ul[@class="list"]/li/a[contains(text(),"Computers") and @href="/computers"]
    public static final Target LNK_CATEGORIAS = Target.the("Link categorias").located(By.xpath("//ul[@class='list']/li/a[contains(text(),'Computers') and @href='/computers']"));

    //link: opcion categoria equipos
    //(//div[@class='item-box'])[1]
    public static final Target BTN_OPCION_CATEGORIA = Target.the("Opcion categoria equipos").located(By.xpath("(//div[@class='item-box'])[1]"));

    //link: producto de categoria
    //(div[@class="item-box"])[1]
    public static final Target OPCION_PRODUCTOS_CATEGORIA = Target.the("Opcion productos categoria").located(By.xpath("(//div[@class='item-box'])[1]"));//link: producto de categoria

    //Button: agregar al carrito
    //input[@type="button" and contains(@id,"add-to-cart-button")]
    public static final Target BTN_AGREGAR_CARRITO = Target.the("Boton agregar al carrito").located(By.xpath("//input[@type='button' and contains(@id,'add-to-cart-button')]"));

    //Button: carrito compra
    //a[contains(text(),"Shopping cart") and @href="/cart"]
    public static final Target BTN_CARRITO_COMPRA = Target.the("Boton carito de compra").located(By.xpath("//a[contains(text(),'Shopping cart') and @href='/cart']"));//Button: carrito compra

    //Button: seleccion ciudad
    //select[@id='CountryId']
    public static final Target SEL_OPCION_CIUDAD= Target.the("Seleccion ciudad").located(By.xpath("//select[@id='CountryId']"));

    //Radio: terminos del servicio
    //input[@id='termsofservice']
    public static final Target RBTN_OPCION_SERVCIO_TERMINOS= Target.the("Radio button terminos y servicio").located(By.xpath("//input[@id='termsofservice']"));

    //Botton: Chekout
    //button[@id='checkout']
    public static final Target BTN_CHEKOUT= Target.the("Boton Chekout").located(By.xpath(" //button[@id='checkout']"));

    //Texto validacion pagina checkout
    //h1[contains(text(),"Checkout")]
    public static final Target LBL_PAGINA_CHEKOUT = Target.the("Label confirmar pagina checkout").located(By.xpath("//h1[contains(text(),'Checkout')]"));
}
