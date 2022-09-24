package com.pruebabanistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.pruebabanistmo.userinterface.HomePage.ACERCA_DE_NOSOTROS;


public class NavegateToPage implements Task {
    public static NavegateToPage proveedores () {
        return Tasks.instrumented(NavegateToPage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ACERCA_DE_NOSOTROS),
                Click.on());
    }

    public class BOTON_DESCARGUE_DOCUMENTO {
    }
}
