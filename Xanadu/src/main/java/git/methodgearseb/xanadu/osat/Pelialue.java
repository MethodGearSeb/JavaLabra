package git.methodgearseb.xanadu.osat;

import git.methodgearseb.xanadu.logiikka.PelialueRakentaja;
import java.util.*;

public class Pelialue {
    List<Ruutu> ruudut;

    public Pelialue() {
        ruudut = new PelialueRakentaja().getRuudut();
    }

    public List<Ruutu> getRuudut() {
        return ruudut;
    }
}
