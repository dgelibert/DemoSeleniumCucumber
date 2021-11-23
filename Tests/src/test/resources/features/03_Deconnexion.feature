@testDeconnexion
Feature: Fonctionnalité déconnexion Footeroo

  Scenario Outline: Scenario_Deconnexion
    Given Je suis sur la page de connexion de Footeroo
    When Je me connecte avec les informations nom d'utilisateur <user> et le mot de passe <password>
    Then Je suis bien connecte
    When Je me deconnecte
    Then Je suis bien deconnecte

    Examples:
      |user				|password|
      |"poc.selenium@toto.com"		|"Selenium1234"|