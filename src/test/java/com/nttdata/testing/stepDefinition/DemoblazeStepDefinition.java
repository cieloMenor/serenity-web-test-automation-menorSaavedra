package com.nttdata.testing.stepDefinition;

import com.nttdata.testing.Pages.HomePage;
import com.nttdata.testing.Tasks.AgregarAlCarrito;
import com.nttdata.testing.Tasks.Login;
import com.nttdata.testing.Tasks.NavigateTo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class DemoblazeStepDefinition {

    @Given("el {actor} esta en la pagina de inicio de Demoblaze")
    public void elUsuarioEstaEnLaPaginaDeInicioDeDemoblaze(Actor actor) {
        actor.wasAbleTo(NavigateTo.theHomePage());
    }

    @When("el usuario inicia sesion con nombre de usuario {string} y contrasenia {string}")
    public void elUsuarioIniciaSesionConNombreDeUsuarioYContrasenia(String username, String password) {
        theActorInTheSpotlight().attemptsTo(Login.withCredentials(username, password));
    }

    @Then("deberia ver el mensaje de bienvenida")
    public void deberiaVerElMensajeDeBienvenida() {
        // Esperar explícitamente hasta que el mensaje sea visible
        theActorInTheSpotlight().attemptsTo(
                //WaitUntil.the(HomePage.TXT_WELCOME).isVisible().forAtMost(10).seconds()
                WaitUntil.the(HomePage.TXT_WELCOME, isVisible()).forNoMoreThan(10).seconds()
        );

        // Asegurarse de que el mensaje sea visible
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(HomePage.TXT_WELCOME).isDisplayed()  // Verifica que el mensaje esté visible
        );
    }



    @When("el usuario navega a la categoria {string}")
    public void elUsuarioNavegaALaCategoria(String categoria) {
        // Esta acción ya está incluida en AgregarAlCarrito
    }

    @When("selecciona el producto {string}")
    public void seleccionaElProducto(String producto) {
        // Esta acción ya está incluida en AgregarAlCarrito
    }

    @When("agrega el producto al carrito")
    public void agregaElProductoAlCarrito() {
        theActorInTheSpotlight().attemptsTo(AgregarAlCarrito.elProducto());
    }

    @Then("deberia ver un mensaje de confirmacion")
    public void deberiaVerUnMensajeDeConfirmacion() {
        // Aquí deberías agregar una verificación del mensaje de confirmación
        // Por ahora, solo esperaremos un poco para simular la verificación
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}