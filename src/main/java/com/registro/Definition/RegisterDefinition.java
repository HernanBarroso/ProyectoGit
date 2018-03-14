package com.registro.Definition;

import com.registro.Steps.RegisterSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class RegisterDefinition {

    @Steps
    RegisterSteps pasos;

    @Given("estoy en la aplicacion de training site")
    public void AbrirUrl(){
        pasos.AbrirApp();

    }

    @When("me registro con usuario<usuario>, password<password>, repeatpassword<repeatpassword>, gender<gender>, address<address>, billing_address<billing_address>, state<state>")
    public void Registrar(@Named("usuario")String usuario, @Named("password")String password, @Named("repeatpassword") String repeatpassword, @Named("gender")String gender, @Named("address")String address, @Named("billing_address")String billing_address, @Named("state")String state){
        pasos.Registrarse(usuario,password,repeatpassword,gender,address,billing_address,state);
    }
    @Then("puedo iniciar sesion desde la pagina de login")
     public void InicioSesion(){
        pasos.MensajeRegistro();
    }

}
