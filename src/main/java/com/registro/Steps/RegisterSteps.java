package com.registro.Steps;

import com.registro.Page.RegisterPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
//import org.jbehave.core.annotations.Named;

public class RegisterSteps extends ScenarioSteps {

    @Page
    RegisterPage prueba;

    @Step
    public void AbrirApp(){
        prueba.open();
    }

    @Step
    public void Registrarse(String usuario,String password,String repeatpassword,String gender,String address,String billing_address,String state){
        prueba.Register(usuario,password,repeatpassword,gender,address,billing_address,state);
    }

    @Step
    public void MensajeRegistro(){
        prueba.ValidarRegistro();
    }

    }