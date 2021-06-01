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
public class Libro {
     String codigo;
     String nombre;
     String autor;
     Estudiante estudiante;

    public Libro(String codigo, String nombre, String autor)
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.autor = autor;
        estudiante  = null;
    }

    public String getCodigo()
    {
        return codigo;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getAutor()
    {
        return autor;
    }
     
     protected Boolean isFotocopiable()
     {
       return false;
     }
     
     public Boolean isPrestado()
     {
       return estudiante != null;   
     }

    @Override
    public String toString()
    {
       if (isFotocopiable()) 
           return toStringTexto();
        else
            return "";
    }

    private String toStringTexto()
    {
        return " --> " + this.codigo + " - " + this.nombre + " (" + this.autor + ")";
    }
}
