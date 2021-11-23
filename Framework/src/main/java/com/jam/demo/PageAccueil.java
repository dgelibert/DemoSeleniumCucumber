package com.jam.demo;

public class PageAccueil {

    private static String url = "https://footeroo.marca2.net/";
    private static String title = "Footeroo";

    public void allerA() {
        Navigateur.allerALUrl(url);
    }

    public boolean estSur() {
        return Navigateur.recupererLeTitre().equals(title);
    }

    public void seDeconnecter() {
        Navigateur.seDeconnecter();
    }

    public boolean estDeconnecte() {
        return Navigateur.estDeconnecte();
    }
}
