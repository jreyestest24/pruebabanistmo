package com.pruebabanistmo.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\features\\prueba_banistmo.feature",
        tags = "",
        glue = "com.pruebabanistmo.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
