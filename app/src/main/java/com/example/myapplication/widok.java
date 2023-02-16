package com.example.myapplication;

public class widok {
    private int idObrazka;
    private String OpisObrazka;

    public widok(int idObrazka, String opisObrazka) {
        this.idObrazka = idObrazka;
        OpisObrazka = opisObrazka;
    }

    public int getIdObrazka() {
        return idObrazka;
    }

    public String getOpisObrazka() {
        return OpisObrazka;
    }
}
