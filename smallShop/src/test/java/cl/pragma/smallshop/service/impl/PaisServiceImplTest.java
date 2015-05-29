/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.pragma.smallshop.service.impl;

import cl.pragma.smallshop.dao.beans.domain.Pais;
import cl.pragma.smallshop.dao.beans.domain.Region;
import cl.pragma.smallshop.service.PaisService;
import org.junit.Assert;
import static org.junit.Assert.fail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author mberoiza
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
(
  {
   "classpath:/META-INF/spring/demo-config-context.xml",
   "classpath:/META-INF/spring/demo-servlet-context.xml"
  }
)
public class PaisServiceImplTest {

private PaisService service;

    @Autowired(required=true)
    @Qualifier(value="paisService")
    public void setService(PaisService service) {
        this.service = service;
    }

    @Test
    public void testAddPais() {
        System.out.println("addPais");
        Pais p = new Pais();
        p.setId("CL");
        p.setNombre("Chile");
        Region r = new Region();
        r.setId(1);
        p.setRegion(r);
        service.addPais(p);

        Pais p2 = service.getPais("CL");
        Assert.assertEquals(p2.getNombre(),"Chile");
    }
}

//public class PaisServiceImplTest {
//    
//    public PaisServiceImplTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of setPaisRepository method, of class PaisServiceImpl.
//     */
//    @Test
//    public void testSetPaisRepository() {
//        System.out.println("setPaisRepository");
//        PaisRepository paisRepo = null;
//        PaisServiceImpl instance = new PaisServiceImpl();
//        instance.setPaisRepository(paisRepo);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addPais method, of class PaisServiceImpl.
//     */
//    @Test
//    public void testAddPais() {
//        System.out.println("addPais");
//        Pais p = new Pais();
//        p.setId("CL");
//        p.setNombre("Chile");
//        Region r = new Region();
//        r.setId(1);
//        p.setRegion(r);
//        PaisServiceImpl instance = new PaisServiceImpl();
//        instance.addPais(p);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of updatePais method, of class PaisServiceImpl.
//     */
//    @Test
//    public void testUpdatePais() {
//        System.out.println("updatePais");
//        Pais p = null;
//        PaisServiceImpl instance = new PaisServiceImpl();
//        instance.updatePais(p);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of listPaises method, of class PaisServiceImpl.
//     */
//    @Test
//    public void testListPaises() {
//        System.out.println("listPaises");
//        PaisServiceImpl instance = new PaisServiceImpl();
//        Iterable<Pais> expResult = null;
//        Iterable<Pais> result = instance.listPaises();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getPais method, of class PaisServiceImpl.
//     */
//    @Test
//    public void testGetPais() {
//        System.out.println("getPais");
//        String id = "";
//        PaisServiceImpl instance = new PaisServiceImpl();
//        Pais expResult = null;
//        Pais result = instance.getPais(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of removePais method, of class PaisServiceImpl.
//     */
//    @Test
//    public void testRemovePais() {
//        System.out.println("removePais");
//        String id = "";
//        PaisServiceImpl instance = new PaisServiceImpl();
//        instance.removePais(id);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
//}
