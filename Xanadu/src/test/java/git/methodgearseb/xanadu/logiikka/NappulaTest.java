/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.methodgearseb.xanadu.logiikka;

import git.methodgearseb.xanadu.osat.Vari;
import git.methodgearseb.xanadu.osat.Nappula;
import git.methodgearseb.xanadu.osat.Ruutu;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sexsarvi
 */
public class NappulaTest {
    
    public NappulaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void nappulaVoiOllaMusta() {
        Nappula nappula = new Nappula(Vari.MUSTA);
        
        assertEquals(Vari.MUSTA, nappula.getVari());
    }
    
    @Test
    public void nappulaVoiOllaValkoinen() {
        Nappula nappula = new Nappula(Vari.VALKOINEN);
        
        assertEquals(Vari.VALKOINEN, nappula.getVari());
    }
    
    @Test
    public void nappulaEiVoiOllaMuunVarinen() {
        Vari[] varit = {
            Vari.BEIGE,
            Vari.KELTAINEN,
            Vari.ORANSSI,
            Vari.PINKKI,
            Vari.PUNAINEN,
            Vari.SININEN,
            Vari.VIHREA,
            Vari.VIOLETTI
        };
        
        for (int i = 0; i < varit.length; i++) {
            Vari vari = varit[i];
            Nappula nappula = new Nappula(vari);
            
            assertNotEquals(vari, nappula.getVari());
        }
    }
    
    @Test
    public void nappulalleVoiAsettaaRuudun() {
        Nappula nappula = new Nappula(Vari.MUSTA);
        Ruutu ruutu = new Ruutu(Vari.BEIGE, Vari.BEIGE);
        
        nappula.setRuutu(ruutu);
        
        assertEquals(ruutu, nappula.getRuutu());
    }
}
