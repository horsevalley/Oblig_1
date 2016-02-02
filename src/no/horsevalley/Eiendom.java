package no.horsevalley;

import java.util.ArrayList;

public class Eiendom {
    private String adresse;
    private String eiersNavn;
    private double takst;
    private int antKvm;
    private int gnr;
    private int bnr;
    private ArrayList<Bud> budOversikt = new ArrayList<Bud>();


    public void nyttBud(String navn, float belop, String tel, int frist) {
        budOversikt.add(new Bud(navn, belop, tel, frist));
    }

    public String getSisteBud() {
        return "BLA";
    }

    public void skrivAllebud() {

    }


}


