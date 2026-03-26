package com.tricentis.demowebshop.tasks;

import com.tricentis.demowebshop.interactions.ClickElemento;
import com.tricentis.demowebshop.interactions.EnterElemento;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static com.tricentis.demowebshop.UI.LoginPageUI.BTN_LOGIN;
import static com.tricentis.demowebshop.UI.LoginPageUI.LNK_LOG_IN;
import static com.tricentis.demowebshop.UI.RegisterPageUI.INPUT_TEXT_EMAIL;
import static com.tricentis.demowebshop.UI.RegisterPageUI.INPUT_TEXT_PASSWORD;

public class LoginUsuario implements Task {

    private String email;
    private String password;



    public LoginUsuario(String email, String password) {
        this.email = email;
        this.password = password;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try{
            actor.attemptsTo(
                    ClickElemento.onElemento(LNK_LOG_IN),
                    EnterElemento.onCampo(INPUT_TEXT_EMAIL,this.email),
                    EnterElemento.onCampo(INPUT_TEXT_PASSWORD,this.password),
                    ClickElemento.onElemento(BTN_LOGIN)
            );

            //Guardamos el usaurio que ha realizado login
            actor.remember("email",this.email);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static LoginUsuario onFormularioLogin(String email,String password){
        return Instrumented.instanceOf(LoginUsuario.class).withProperties(email,password);
    }
}
