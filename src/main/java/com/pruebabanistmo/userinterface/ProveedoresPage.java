package com.pruebabanistmo.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ProveedoresPage extends PageObject {
    public static final Target BOTON_DESCARGUE_DOCUMENTO = Target.the ("button download the file").

    located(By.xpath("//a[@class='btn btn-primary'])[6]"));
}

}
