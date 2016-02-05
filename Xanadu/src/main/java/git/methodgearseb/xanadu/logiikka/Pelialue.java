package git.methodgearseb.xanadu.logiikka;

import java.util.*;

public class Pelialue {
    List<Ruutu> ruudut;

    public Pelialue() {
        ruudut = new Ruutuvarasto().getRuudut();
    }

    public List<Ruutu> getRuudut() {
        return ruudut;
    }
}
