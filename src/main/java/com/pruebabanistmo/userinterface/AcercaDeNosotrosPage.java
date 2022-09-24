package com.pruebabanistmo.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AcercaDeNosotrosPage extends PageObject {
    public static final Target INFORMACION_CORPORATIVA = Target.the("link a informacion corporativa").
            located(By.xpath("//a[@id='serv']"));
}


