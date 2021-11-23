package com.jam.demo;

public class PageConnexion {

    private static String url = "https://footeroo.marca2.net/sign-in";

    public void allerA() {
        Navigateur.allerALUrl(url);
    }

    public void seConnecter(String login, String password) {
        Navigateur.allerALUrl(url);
        Navigateur.seConnecter(login, password);
    }

    public boolean estConnecte() {
        return Navigateur.estConnecte();
    }
}
