package com.jam.demo.steps;

import com.jam.demo.Pages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EtapesAcces {

    @When("Jessaie dacceder a la page daccueil")
    public void jessaieDaccederALaPageDaccueil() {
        Pages.pageAccueil().allerA();
    }

    @Then("Jai acces a la page daccueil")
    public void jaiAccesALaPageDaccueil() {
        Assert.assertTrue(Pages.pageAccueil().estSur());
    }
}
