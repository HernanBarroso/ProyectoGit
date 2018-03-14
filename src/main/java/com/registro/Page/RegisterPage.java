package com.registro.Page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.springframework.util.Assert;

@DefaultUrl("http://sahitest.com/demo/training/register.htm")

    public class RegisterPage extends PageObject {


    @FindBy(name = "username")
    private WebElementFacade Usuario;

    @FindBy(name = "password")
    private WebElementFacade Password;

    @FindBy(name = "password2")
    private WebElementFacade password2;

    @FindBy(name = "gender")
    private WebElementFacade genero;

    @FindBy(name = "address")
    private WebElementFacade direccion;

    @FindBy(name = "billaddress")
    private WebElementFacade billaddress;

    @FindBy(name = "state")
    private WebElementFacade estado;

    @FindBy(xpath = "/html/body/center/div/form/input[2]")
    private WebElementFacade Btnregistro;

    public RegisterPage(WebDriver driver){
        super(driver);

    }
    public void Register(String usuario, String password, String repeatpassword, String gender, String address, String billing_address, String state){

        Usuario.sendKeys(usuario);
        Password.sendKeys(password);
        password2.sendKeys(repeatpassword);
        genero.click();
        direccion.sendKeys(address);
        billaddress.sendKeys(billing_address);
        estado.sendKeys(state);
        Btnregistro.click();
    }

     public void ValidarRegistro(){
         String MensajeAlerta = getDriver().switchTo().alert().getText();
         Assert.hasText("Registered Successfully",MensajeAlerta);
     }

     //@AfterScenario
     //public void cerrarconexion() { driver.close();

}
