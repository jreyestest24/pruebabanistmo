package com.pruebabanistmo.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    public static final Target ACERCA_DE_NOSOTROS = Target.the("link to page acerca de nosotros").
            located(By.xpath("//a[@id='header-nosotros']"));
}
