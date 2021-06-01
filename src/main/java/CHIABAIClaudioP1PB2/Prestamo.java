/** 
 *
 * Programación Basica 2 - Comision 2900
 * @author Claudio J. CHIABAI <cchiabai@alumno.unlam.edu.ar>
 *
 **/


package CHIABAIClaudioP1PB2;

/**
 * 
 */
public class Prestamo {
        Integer id;
        Estudiante estudiante;
        Libro libro;

    public Prestamo(Integer id, Estudiante estudiante, Libro libro)
    {
        this.id = id;
        this.estudiante = estudiante;
        this.libro = libro;
    }

    public Integer getId()
    {
        return id;
    }

    public Estudiante getEstudiante()
    {
        return estudiante;
    }

    public Libro getLibro()
    {
        return libro;
    }

}
