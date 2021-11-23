package com.jam.demo.steps;

import com.jam.demo.Pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EtapesConnexion {

    @Given("Je suis sur la page de connexion de Footeroo")
    public void jeSuisSurLaPageDeConnexionDeFooteroo() {
        Pages.pageConnexion().allerA();
    }

    @Then("Je suis bien connecte")
    public void jeSuisBienConnecte() {
        Assert.assertTrue(Pages.pageConnexion().estConnecte());
    }

    @When("Je me connecte avec les informations nom d'utilisateur {string} et le mot de passe {string}")
    public void jeMeConnecteAvecLesInformationsNomDUtilisateurUserEtLeMotDePassePassword(String user, String password) {
        Pages.pageConnexion().seConnecter(user, password);
    }
}
