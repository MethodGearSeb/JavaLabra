package git.methodgearseb.xanadu.logiikka;

import git.methodgearseb.xanadu.osat.Ruutu;
import git.methodgearseb.xanadu.tyokalut.VarinMaarittaja;
import java.util.*;
import javafx.scene.paint.Color;

public class PelialueRakentaja {

    private final ArrayList<Ruutu> ruudut;

    public PelialueRakentaja() {
        ruudut = new ArrayList<>();
        List<Ruutu> jarjestetty = new ArrayList<>();
        VarinMaarittaja maarittaja = new VarinMaarittaja();
        Random random = new Random();
        Color[] raakaVarit = new Color[]{
            Color.KHAKI, // yellow
            Color.VIOLET, // pink
            Color.ORANGERED, // red
            Color.TEAL, // blue
            Color.PERU, // beige
            Color.DARKORANGE, // orange
            Color.LIMEGREEN, // green
            Color.PURPLE // purple
        };
        java.awt.Color[] varit = new java.awt.Color[raakaVarit.length];
        for (int i = 0; i < varit.length; i++) {
            Color raakaVari = raakaVarit[i];

            maarittaja.setVari(raakaVari);

            float r = maarittaja.punainen();
            float g = maarittaja.vihrea();
            float b = maarittaja.sininen();
            varit[i] = new java.awt.Color(r, g, b);
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 4; j < varit.length; j++) {
                jarjestetty.add(new Ruutu(varit[i], varit[j]));
//                jarjestetty.add(new Ruutu(varit[1], varit[4]));
            }
        }

        int luku;
        Set<Integer> kaytetyt = new HashSet<>();

        while (ruudut.size() < 16) {
            luku = random.nextInt(jarjestetty.size());

            if (!kaytetyt.contains(luku)) {
                ruudut.add(jarjestetty.get(luku));
                kaytetyt.add(luku);
            }
        }
    }

    public ArrayList<Ruutu> getRuudut() {
        return ruudut;
    }
}
