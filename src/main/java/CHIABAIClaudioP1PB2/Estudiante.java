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
public class Estudiante {
        Integer DNI;
        String apellido;
        String nombre;

    public Estudiante(Integer DNI, String apellido, String nombre)
    {
        this.DNI = DNI;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public Integer getDNI()
    {
        return DNI;
    }

    public String getApellido()
    {
        return apellido;
    }

    public String getNombre()
    {
        return nombre;
    }

}
