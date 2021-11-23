@testConnexion
Feature: Fonctionnalité connexion Footeroo

  Scenario Outline: Scenario_Connexion
    Given Je suis sur la page de connexion de Footeroo
    When Je me connecte avec les informations nom d'utilisateur <user> et le mot de passe <password>
    Then Je suis bien connecte

    Examples:
      |user				|password|
      |"poc.selenium@toto.com"		|"Selenium1234"|