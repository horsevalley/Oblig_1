/*package no.horsevalley.Oblig_1.Oppgave_2;

import java.util.*;

public class GnrOgBnrSok {

    Scanner input = new Scanner(System.in);

    ArrayList<Eiendom> eiendomSok = new ArrayList<Eiendom>();

    Enebolig eb1 = new Enebolig("Marihandstien 2", "Ole Joan Olsen", 1100000, 204,
            23, 400, Enebolig.FRITTSTAAENDE);
    Enebolig eb2 = new Enebolig("Eventyrveien 14", "Petra Elvide Jensen", 1100000, 204,
            23, 400, Enebolig.FRITTSTAAENDE);
    Enebolig eb3 = new Enebolig("Eventyrveien 14", "Petra Elvide Jensen", 1100000, 204,
            23, 400, Enebolig.FRITTSTAAENDE);
    Enebolig eb4 = new Enebolig("Eventyrveien 14", "Petra Elvide Jensen", 1100000, 204,
            23, 400, Enebolig.FRITTSTAAENDE);




    while (true){
        System.out.println("Skriv inn gnr: ");
        int gnr = input.nextInt();
        System.out.println("Skriv inn bnr: ");
        int bnr = input.nextInt();
        for (Eiendom i : eiendomSok) {
            if (gnr == i.getGnr() && bnr == i.getBnr()){
                i.skrivAlleBud();
            }
        }
    }
}
*/
