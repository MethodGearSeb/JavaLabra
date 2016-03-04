package git.methodgearseb.xanadu.osat;

import git.methodgearseb.xanadu.logiikka.PelialueRakentaja;
import java.util.*;

public class Pelialue {
    ArrayList<Ruutu> ruudut;

    public Pelialue() {
        ruudut = new PelialueRakentaja().getRuudut();
    }

    public ArrayList<Ruutu> getRuudut() {
        return ruudut;
    }
}
