package com.pruebabanistmo.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionCorporativaPage extends PageObject {
    public static final Target PROVEEDORES = Target.the("link a page proveedores").
            located(By.xpath("(//a[contains(text(),'Proveedores')]"));
}
