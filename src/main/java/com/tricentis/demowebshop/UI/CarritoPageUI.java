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
}
