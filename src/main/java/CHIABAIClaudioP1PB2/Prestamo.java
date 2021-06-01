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
        Integer estudiante;
        String  libro;

    public Prestamo(Integer id, String libro, Integer estudiante)
    {
        this.id = id;
        this.estudiante = estudiante;
        this.libro = libro;
    }

    public Integer getId()
    {
        return id;
    }

    public Integer getEstudiante()
    {
        return estudiante;
    }

    public String getLibro()
    {
        return libro;
    }

    

}
