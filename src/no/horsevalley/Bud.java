package no.horsevalley;


import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Bud {

    private GregorianCalendar budGitt;
    private GregorianCalendar budFrist;
    private float belop;
    private String navn;
    private String telefon;

    public Bud(String navn, float belop, String tel, int frist) {
        this.navn = navn;
        this.belop = belop;
        this.telefon = tel;
        // this.budGitt = NOW() ; this.budFrist = budGitt + frist
        this.budGitt = new GregorianCalendar();
        this.budFrist = budGitt;
        this.budFrist.add(GregorianCalendar.HOUR,frist);
    }

    @Override
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.mm.YYYY HH:mm:ss");
        return String.format("%s\t\t\t\t%s\t\t\t%s\t%s\t%.0f",
                formatter.format(budGitt.getTime()),
                formatter.format(budFrist.getTime()),
                navn, telefon, belop
        );
    }
}
