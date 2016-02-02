package no.horsevalley;


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
}
