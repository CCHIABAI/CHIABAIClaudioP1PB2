/**
 *
 * Programación Basica 2 - Comision 2900
 *
 * @author Claudio J. CHIABAI <cchiabai@alumno.unlam.edu.ar>
 *
 *
 */
package CHIABAIClaudioP1PB2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Claudio J. CHIABAI <cchiabai@alumno.unlam.edu.ar>
 */
public class BibliotecaTest
{
    
    public BibliotecaTest()
    {
    }

    /**
     * Test of addLibro method, of class Biblioteca.
     */
    @Test
    public void testAddLibro()
    {
        Biblioteca instance = new Biblioteca();
        
        assertTrue(instance.addLibro(new Libro("G01", "generico", "EL principito", "Saint de algo en frances")));
        assertTrue(instance.addLibro(new Historia("H01", "El principito en la historia", "No es de Saint de algo en frances")));
        assertTrue(instance.addLibro(new Matematicas("M01", "¿Cuantos principitos hay?", "Tampoco de Saint de algo en frances")));
        assertTrue(instance.addLibro(new Geografia("G01", "¿donde vivia El principito?", "Saint de otra cosa en frances")));
        assertTrue(instance.addLibro(new Matematicas("M02", "¿Cuantos principitos más había?", "Tampoco de Saint de algo en frances")));

        // Rechazar duplicados ---------------------
        assertFalse(instance.addLibro(new Matematicas("M01", "¿Cuantos pricipitos hay?", "Tampoco de Saint de algo en frances")));
    }

    /**
     * Test of getLibro method, of class Biblioteca.
     */
    @Test
    public void testGetLibro()
    {
        Biblioteca instance = new Biblioteca();
        
        instance.addLibro(new Libro("G01", "generico", "EL principito", "Saint de algo en frances"));
        instance.addLibro(new Historia("H01", "El principito en la historia", "No es de Saint de algo en frances"));
        instance.addLibro(new Matematicas("M01", "¿Cuantos principitos hay?", "Tampoco de Saint de algo en frances"));

        // Recuperar un libro ------------------
        Libro libro = instance.getLibro("G01");
        assertEquals("G01", libro.getCodigo());
        
    }

    /**
     * Test of isLibroPrestado method, of class Biblioteca.
     */
    @Test
    public void testIsLibroPrestado()
    {
        System.out.println("isLibroPrestado");
        String codigo = "";
        Biblioteca instance = new Biblioteca();
        Integer expResult = null;
        Integer result = instance.isLibroPrestado(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cantidadPrestamos method, of class Biblioteca.
     */
    @Test
    public void testCantidadPrestamos()
    {
        System.out.println("cantidadPrestamos");
        Integer estudianteDNI = null;
        Biblioteca instance = new Biblioteca();
        Integer expResult = null;
        Integer result = instance.cantidadPrestamos(estudianteDNI);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prestarLibro method, of class Biblioteca.
     */
    @Test
    public void testPrestarLibro()
    {
        System.out.println("prestarLibro");
        String codigo = "";
        Integer estudianteDNI = null;
        Biblioteca instance = new Biblioteca();
        Boolean expResult = null;
        Boolean result = instance.prestarLibro(codigo, estudianteDNI);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of devolucionLibro method, of class Biblioteca.
     */
    @Test
    public void testDevolucionLibro()
    {
        System.out.println("devolucionLibro");
        String codigo = "";
        Biblioteca instance = new Biblioteca();
        Boolean expResult = null;
        Boolean result = instance.devolucionLibro(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
