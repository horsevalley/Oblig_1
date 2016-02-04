package no.horsevalley.Oblig_1.Oppgave_2;

import java.util.ArrayList;

public class Eiendom {
    private String adresse;
    private String eiersNavn;
    private double takst;
    private int antKvm;
    private int gnr;
    private int bnr;

    ArrayList<Bud> budOversikt = new ArrayList<Bud>();

    public Eiendom(String addresse, String eiersNavn, double takst, int antKvm, int gnr, int bnr) {
        this.adresse = addresse;
        this.eiersNavn = eiersNavn;
        this.takst = takst;
        this.antKvm = antKvm;
        this.gnr = gnr;
        this.bnr = bnr;
    }

    public void nyttBud(String navn, float belop, String tel, int frist) {
        budOversikt.add(new Bud(navn, belop, tel, frist));
    }

    public String getSisteBud() {

        return String.format("Siste bud: %s", budOversikt.get(budOversikt.size() - 1));
    }

    public String getAdresse() {
        return adresse;
    }

    public String getEiersNavn() {
        return eiersNavn;
    }

    public double getTakst() {
        return takst;
    }

    public int getAntKvm() {
        return antKvm;
    }

    public int getGnr() {
        return gnr;
    }

    public int getBnr() {
        return bnr;
    }


    public void skrivAlleBud() {
        System.out.println(this.toString());
        System.out.println("Bud gitt:\t\t\t\t\t\tFrist:\t\t\t\t\t\tNavn:\t\t\tTel:\t\tBelop:");

        for(Bud bud: budOversikt){
            System.out.println(bud.toString());
        }

    }


}


