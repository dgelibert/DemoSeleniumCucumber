package com.jam.demo.steps;

import com.jam.demo.Navigateur;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class EtapesCommunes {

    @Before
    public void ouvrirNavigateur() {
        Navigateur.ouvrir();
    }

    @After
    public void fermerNavigateur() {
        Navigateur.fermer();
    }
}
