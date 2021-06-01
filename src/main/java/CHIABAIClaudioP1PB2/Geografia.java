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
public class Geografia extends Libro {

    public Geografia(String codigo, String nombre, String autor)
    {
        super(codigo, nombre, autor);
    }

    @Override
    protected Boolean isFotocopiable()
    {
        return true;
    }
    
    

}
