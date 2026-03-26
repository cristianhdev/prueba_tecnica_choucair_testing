package com.tricentis.demowebshop.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/tricentis/demowebshop/stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@CarritoCompras",
        plugin= {
                "pretty",
                "html:target/site/cucumber-report.html",
                "json:target/site/cucumber.json"
        })
public class Runner {
}
