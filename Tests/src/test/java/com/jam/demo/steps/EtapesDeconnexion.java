package com.jam.demo.steps;


import com.jam.demo.Pages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EtapesDeconnexion {
    @When("Je me deconnecte")
    public void jeMeDeconnecte() {
        Pages.pageAccueil().seDeconnecter();
    }

    @Then("Je suis bien deconnecte")
    public void jeSuisBienDeconnecte() {
        Assert.assertTrue(Pages.pageAccueil().estDeconnecte());
    }
}
