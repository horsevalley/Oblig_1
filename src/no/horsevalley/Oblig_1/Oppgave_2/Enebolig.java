package no.horsevalley.Oblig_1.Oppgave_2;


public class Enebolig extends Eiendom {

    private int type;
    public static final int FRITTSTAAENDE = 1;
    public static final int REKKE = 2;
    public static final int TOMANNS = 3;

    public Enebolig(String addresse, String eiersNavn, double takst, int antKvm, int gnr, int bnr, int type) {
        super(addresse,eiersNavn,takst,antKvm,gnr,bnr);
        this.type = type;
    }

    public String getTypeAsString(){
        switch (type) {
            case 1:
                return "Frittstaaende";
            case 2:
                return "Rekke";
            case 3:
                return "Tomanns";
            default:
                return "FEIL";
        }
    }
    @Override
    public String toString() {
        return String.format("Bud gitt for ENEBOLIG %s, takst = %s, " +
                        "gnr = %s, bnr = %s, type = %s", getAdresse(), (int) getTakst(),
                getGnr(), getBnr(), getTypeAsString());
    }

    @Override
    public void skrivAlleBud() {
        toString();
        super.skrivAlleBud();
    }


}
