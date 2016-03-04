/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.methodgearseb.xanadu.osat;

import git.methodgearseb.xanadu.osat.Nappula;
import git.methodgearseb.xanadu.osat.Ruutu;
import java.awt.Color;
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
    
    private Nappula n1;
    private Nappula n2;
    
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
        n1 = new Nappula(Color.BLACK);
        n2 = new Nappula(Color.WHITE);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void nappulaVoiOllaMusta() {
        assertEquals(Color.BLACK, n1.getVari());
    }
    
    @Test
    public void nappulaVoiOllaValkoinen() {
        assertEquals(Color.WHITE, n2.getVari());
    }
    
    @Test
    public void getVariToimii() {
        assertEquals(Color.BLACK, n1.getVari());
    }
}
