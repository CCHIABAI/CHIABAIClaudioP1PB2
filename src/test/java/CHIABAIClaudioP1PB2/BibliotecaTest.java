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

    @Test
    public void testAddLibro()
    {
        Biblioteca instance = new Biblioteca();

        assertTrue(instance.addLibro(new Libro("-01", "generico", "EL principito", "Saint de algo en frances")));
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

    @Test
    public void testPrestarLibro()
    {
        Biblioteca instance = new Biblioteca();

        instance.addLibro(new Libro("G01", "generico", "EL principito", "Saint de algo en frances"));
        instance.addLibro(new Historia("H01", "El principito en la historia", "No es de Saint de algo en frances"));
        instance.addLibro(new Matematicas("M01", "¿Cuantos principitos hay?", "Tampoco de Saint de algo en frances"));

        //Estudiante estudiante = new Estudiante(25226349, "CHIABAI", "Claudio");
        // Prestar ----------------------------------------
        assertTrue(instance.prestarLibro("G01", 25226349));
        assertTrue(instance.prestarLibro("H01", 25226349));

        // Probar que no se peude más de dos prestamos -------------------
        assertFalse(instance.prestarLibro("M01", 25226349));
    }

    @Test
    public void testDevolucionLibro()
    {
        Biblioteca instance = new Biblioteca();

        instance.addLibro(new Libro("G01", "generico", "EL principito", "Saint de algo en frances"));
        instance.addLibro(new Historia("H01", "El principito en la historia", "No es de Saint de algo en frances"));
        instance.addLibro(new Matematicas("M01", "¿Cuantos principitos hay?", "Tampoco de Saint de algo en frances"));

        //Estudiante estudiante = new Estudiante(25226349, "CHIABAI", "Claudio");
        // Prestar ----------------------------------------
        assertTrue(instance.prestarLibro("G01", 25226349));
        assertTrue(instance.prestarLibro("H01", 25226349));

        // Devolver -----------------------------
        assertTrue(instance.devolucionLibro("G01"));
        
        // Probar devolver uno NO prestado 
        assertFalse(instance.devolucionLibro("M01"));
    }

    @Test
    public void testRegistrarEstudiante()
    {
    }

}
