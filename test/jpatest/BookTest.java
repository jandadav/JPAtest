/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jpatest;


import java.util.List;
import javax.persistence.*;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author David
 */
public class BookTest {
    
    
    
    {
  
    }
    
    public BookTest() {
    }
    
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAtestPU");
    private EntityManager em;
    private EntityTransaction tx;
     
    
    @BeforeClass
    public static void setUpClass() {
        
   
    }
    
    @AfterClass
    public static void tearDownClass() {
        
    }
    
    
    @Before
    public void setUp(){
      em = emf.createEntityManager();
      em.persist(new Book("Grand Marnier", 12f, "Tera", "isbn546", 12, false));
      em.persist(new Book("Holly Molly", 12f, "Tera", "isbn546", 12, false));
      em.persist(new Book("Fookeroo", 12f, "Tera", "isbn546", 12, false));
      em.persist(new Book("Ma Nigger", 12f, "Tera", "isbn546", 12, false));
      em.persist(new Book("Lobsterette", 12f, "Tera", "isbn546", 12, false));
      em.persist(new Book("Mamma Mia", 12f, "Tera", "isbn546", 12, false));
      em.persist(new Book("Le Derp", 12f, "Tera", "isbn546", 12, false));
      em.persist(new Book("Terra", 12f, "Tera", "isbn546", 12, false));
      em.persist(new Book("GTA", 12f, "Tera", "isbn546", 12, false));
      em.persist(new Book("Booya", 12f, "Tera", "isbn546", 12, false));
      
      
    }
    
    @After
    public void tearDown() {
        if (em != null) em.close();
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
    public void testDataInsert() {
        System.out.println("connectionToDatabase");
        //Book(String title, Float price, String description, String isbn, Integer nbOfPage, Boolean illustrations) {
        Book testSubject = new Book("H2G2", 34.4f, "desc", "isbn", 34, true);
        
        //tx.begin();
        em.persist(testSubject);
        //tx.commit();
        System.out.println("Persisted with ID: " + testSubject.getId().toString());
        System.out.println("Actual DB Contents:");
        
        List<Book> dbContents= (List<Book>)em.createQuery("SELECT b FROM Book b").getResultList();
        
        System.out.println("Query returns: "+ dbContents.size());
        
        for (Book b: dbContents){
            System.out.println(b.getId()+" , "+b.getTitle());
        }
        
        
  
        assertTrue( dbContents.size() > 0 );
        //fail("prototype");
    }
    
 
}
