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
public class Historia extends Libro {

    public Historia(String codigo, String nombre, String autor)
    {
        super(codigo, "Historia", nombre, autor);
    }

    @Override
    protected Boolean isFotocopiable()
    {
        return true;
    }

}
