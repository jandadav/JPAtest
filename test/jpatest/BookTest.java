/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jpatest;


import javax.persistence.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David
 */
public class BookTest {
    
    private static EntityManagerFactory emf;
    
    private static EntityManager em;
    
    
    
    public BookTest() {
    }
    
    //private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPATestPU");
    //private EntityManager em;
    //private EntityTransaction tx;
     
    
    @BeforeClass
    public static void setUpClass() {
           emf = Persistence.createEntityManagerFactory("JPATestPU");
           em = emf.createEntityManager();
    }
    
    @AfterClass
    public static void tearDownClass() {
        if (em != null) em.close();
    }
    
    
    @Before
    public void setUp(){
      
    }
    
    @After
    public void tearDown() {
        
    }

    /**
     * Test of getId method, of class Book.
     */
/*
    @Test
    public void testGetId() {
        System.out.println("getId");
        Book instance = new Book();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    
    @Test//(expected = Exception.class)
    public void testConnectionToDatabase() {
        System.out.println("connectionToDatabase");
        
        System.out.println(em.toString());

        
        
        //assertTrue(  );
        //fail("prototype");
    }
    
 
}
