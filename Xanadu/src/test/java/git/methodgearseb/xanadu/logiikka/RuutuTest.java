package git.methodgearseb.xanadu.logiikka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class RuutuTest {

    private Ruutu ruutu;

    public RuutuTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        ruutu = new Ruutu(Vari.PINKKI, Vari.PUNAINEN);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void ruutuTallentaaOikeatVarit() {
        assertEquals(Vari.PINKKI, ruutu.getVari1());
        assertEquals(Vari.PUNAINEN, ruutu.getVari2());
    }
}
