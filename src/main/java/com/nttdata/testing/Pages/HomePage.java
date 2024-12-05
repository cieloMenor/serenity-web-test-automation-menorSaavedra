package com.nttdata.testing.Pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://www.demoblaze.com/")
public class HomePage extends PageObject {

    //  SIGN UP

    public static final Target BTN_SIGN_UP = Target.the("Boton para hacer el registro")
            .located(By.id("signin2"));

    public static final Target REGISTER_MODAL = Target.the("Modal de registro")
            .located(By.id("signInModalLabel"));

    public static final Target INP_USERNAME = Target.the("Nombre de usuario")
            .located(By.id("sign-username"));

    public static final Target INP_PASSWORD = Target.the("Contraseña")
            .located(By.id("sign-password"));

    public static final Target BTN_REGISTRAR = Target.the("Boton Registrar")
            .located(By.xpath("//button[text()='Sign up']"));

    //  LOG IN
    public static final Target BTN_LOGIN = Target.the("Boton para iniciar sesion")
            .located(By.id("login2"));
    public static final Target INP_LOGIN_USERNAME = Target.the("Campo de usuario para login")
            .located(By.id("loginusername"));
    public static final Target INP_LOGIN_PASSWORD = Target.the("Campo de contraseña para login")
            .located(By.id("loginpassword"));
    public static final Target BTN_LOGIN_SUBMIT = Target.the("Boton para enviar login")
            .located(By.xpath("//button[text()='Log in']"));

    // Welcome message
    public static final Target TXT_WELCOME = Target.the("Mensaje de bienvenida")
            .located(By.id("nameofuser"));

    // Categories
    public static final Target LINK_PHONES = Target.the("Enlace a categoría Phones")
            .located(By.linkText("Phones"));

    // Product
    public static final Target LINK_SAMSUNG_GALAXY_S6 = Target.the("Enlace al producto Samsung galaxy s6")
            .located(By.linkText("Samsung galaxy s6"));

    // Add to cart
    public static final Target BTN_ADD_TO_CART = Target.the("Botón Agregar al carrito")
            .located(By.linkText("Add to cart"));
}
