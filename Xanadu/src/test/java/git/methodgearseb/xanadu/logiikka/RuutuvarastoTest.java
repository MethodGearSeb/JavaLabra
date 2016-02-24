/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.methodgearseb.xanadu.logiikka;

import git.methodgearseb.xanadu.osat.Ruutu;
import java.util.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sebastian
 */
public class RuutuvarastoTest {

    private PelialueRakentaja varasto;
    private List<Ruutu> ruudut;

    public RuutuvarastoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        varasto = new PelialueRakentaja();
        ruudut = varasto.getRuudut();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void ruutujaOnOikeaMaara() {
        assertEquals(16, ruudut.size());
    }

    @Test
    public void ruudutEivatToistu() {
        boolean uniikitRuudut = true;

        for (int i = 0; i < ruudut.size() - 1; i++) {

            for (int j = i + 1; j < ruudut.size(); j++) {
                uniikitRuudut = !(ruudut.get(i) == ruudut.get(j));
            }
        }

        assertEquals(true, uniikitRuudut);
    }

    @Test
    public void ruudukotMuuttuvat() {
        boolean eivatOleSamat = false;
        List<Ruutu> verrattavat = new PelialueRakentaja().getRuudut();

        for (int i = 0; i < ruudut.size() && i < verrattavat.size(); i++) {

            if (ruudut.get(i) != verrattavat.get(i)) {
                eivatOleSamat = true;
                break;
            }
        }

        assertEquals(true, eivatOleSamat);
    }
}
