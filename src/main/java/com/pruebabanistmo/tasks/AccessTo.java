package com.pruebabanistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.pruebabanistmo.userinterface.ProveedoresPage.BOTON_DESCARGUE_DOCUMENTO;

public class AccessTo implements Task {
    public static AccessTo Proveedores () {
        return Tasks.instrumented(AccessTo.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTON_DESCARGUE_DOCUMENTO),
                Click.on(BOTON_DESCARGUE_DOCUMENTO));

    }
}
