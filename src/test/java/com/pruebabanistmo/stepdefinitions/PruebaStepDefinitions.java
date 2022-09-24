package com.pruebabanistmo.stepdefinitions;

import com.pruebabanistmo.tasks.NavegateToPage;
import com.pruebabanistmo.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class PruebaStepDefinitions {
    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    @Given("^the user is on the page Proveedores$")
    public void theUserIsOnTheProveedores()  {
            theActorCalled("user").wasAbleTo(OpenUp.thePage(), NavegateToPage.proveedores());
        }

    }

    @When("^the user click on button descarga el documento on Proveedores Page$")
    public void theUserClickOnButtonDescargaElDocumentoOnProveedoresPage()  {
theActorInTheSpotlight()
    }

    @Then("^the user check the document politicas\\.pdf$")
    public void theUserCheckTheDocumentPoliticasPdf()  {

    }

}
