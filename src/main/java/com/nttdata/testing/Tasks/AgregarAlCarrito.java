package com.nttdata.testing.Tasks;

import com.nttdata.testing.Pages.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarAlCarrito implements Task {

    public static Performable elProducto() {
        return instrumented(AgregarAlCarrito.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.LINK_PHONES),
                Click.on(HomePage.LINK_SAMSUNG_GALAXY_S6),
                Click.on(HomePage.BTN_ADD_TO_CART)
        );
    }
}