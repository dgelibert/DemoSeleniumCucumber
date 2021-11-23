package com.jam.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Navigateur {

    private static WebDriver driver;

    public static void allerALUrl(String url) {
        driver.get(url);
    }

    public static String recupererLeTitre() {
        return driver.getTitle();
    }

    public static void ouvrir() {
        driver = new ChromeDriver();
    }

    public static void fermer() {
        driver.close();
    }

    public static void seConnecter(String login, String password){
        // On attend  que la page de connexion soit affichée avant de remplir les champs
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("mat-input-0")));
        WebElement userField = driver.findElement(By.id("mat-input-0"));
        userField.click();
        userField.sendKeys(login);

        WebElement passwordField = driver.findElement(By.id("mat-input-1"));
        passwordField.click();
        passwordField.sendKeys(password);

        WebElement connectionButton = driver.findElement(By.cssSelector(".mat-primary .mat-icon"));
        connectionButton.click();
    }

    public static boolean estConnecte() {
        // Bug connu sur la page, on doit la rafraîchir pour afficher le profil
        // on attend que le bouton manage my profile soit chargé
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".ng-star-inserted > .mat-button-wrapper")));

        //On rafraîchit la page
        driver.navigate().to(driver.getCurrentUrl());

        // On attend  que le bouton de profil soit affiché avant de faire l'évaluation
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".mat-menu-trigger .mat-icon")));

        return !driver.findElements(By.cssSelector(".mat-menu-trigger .mat-icon")).isEmpty();
    }

    public static void seDeconnecter() {
        if(estConnecte()){
            WebElement profilButton = driver.findElement(By.cssSelector(".mat-menu-trigger .mat-icon"));
            profilButton.click();

            // On attend  que le bouton de déconnexion soit affiché
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(.,'Sign out')]")));

            WebElement boutonDeconnexion = driver.findElement(By.xpath("//button[contains(.,'Sign out')]"));
            boutonDeconnexion.click();
        }
    }

    public static boolean estDeconnecte() {
        // Bug connu sur la page, on doit la rafraîchir pour afficher le profil
        // on attend que le bouton "create a new match" soit chargé
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(.,'post_add Create a new match')]")));

        //On rafraîchit la page
        driver.navigate().to(driver.getCurrentUrl());

        //On attend que la page soit rechargée pour évaluer la condition
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(.,'post_add Create a new match')]")));

        return driver.findElements(By.cssSelector(".mat-menu-trigger .mat-icon")).isEmpty();
    }
}
