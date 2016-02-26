/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package git.methodgearseb.xanadu.liittyma;

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
public class LiittymaTest {
    
    private Liittyma liittyma;
    
    public LiittymaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        liittyma = new Liittyma();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void liittymaEiOleNull() {
        assertNotEquals(null, liittyma);
    }
    
    @Test
    public void liittymaVastaaItseaan() {
        assertEquals(liittyma, liittyma);
    }
    
    @Test
    public void liittymaEiVastaaToistaLiittymaa() {
        assertNotEquals(new Liittyma(), liittyma);
    }
    
    @Test
    public void liittymaRun() {
        liittyma.run();
        assertEquals(true, true);
    }
}
