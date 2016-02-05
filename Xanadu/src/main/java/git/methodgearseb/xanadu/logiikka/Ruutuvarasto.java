package git.methodgearseb.xanadu.logiikka;

import java.util.*;

public class Ruutuvarasto {

    private List<Ruutu> ruudut;

    public Ruutuvarasto() {
        ruudut = new ArrayList<>();
        List<Ruutu> jarjestetty = new ArrayList<>();
        Random random = new Random();
        Vari[] varit = new Vari[]{
            Vari.KELTAINEN,
            Vari.PINKKI,
            Vari.PUNAINEN,
            Vari.SININEN,
            Vari.BEIGE,
            Vari.ORANSSI,
            Vari.VIHREA,
            Vari.VIOLETTI
        };

        for (int i = 0; i < 4; i++) {
            for (int j = 4; j < varit.length; j++) {
                jarjestetty.add(new Ruutu(varit[i], varit[j]));
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

    public List<Ruutu> getRuudut() {
        return ruudut;
    }
}
