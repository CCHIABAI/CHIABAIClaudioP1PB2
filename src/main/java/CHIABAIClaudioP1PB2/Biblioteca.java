/**
 *
 * Programación Basica 2 - Comision 2900
 *
 * @author Claudio J. CHIABAI <cchiabai@alumno.unlam.edu.ar>
 *
 *
 */
package CHIABAIClaudioP1PB2;

import java.util.ArrayList;

/**
 *
 */
public class Biblioteca
{

    ArrayList<Libro> libros;
    ArrayList<Prestamo> prestamos;
    Integer prestamoID = 0; // Incremental -------------------
    final Integer MAX_PRESTAMOS = 2;
    final Integer NO_PRESTADO = -1;

    // Constructor ==========================
    public Biblioteca()
    {
        libros = new ArrayList<>();
        prestamos = new ArrayList<>();
    }

    // Libros =========================================
    // Agregar un nuevo libro -------------------------------
    // Devuelve TRUE si se pudo agregar, FALSE en caso contrario
    public Boolean addLibro(Libro libroAgregado)
    {
        Boolean encontrado = false;
        // Buscar si hay un libro con un codigo igual? 
        for (Libro libro : libros)
          {
            if (libro.getCodigo() == libroAgregado.getCodigo())
                encontrado = true;
          }

        // Agregar si no fue encontrado -------------
        if (!encontrado)
          {
            libros.add(libroAgregado);
            return true;
          }
        else return false;
    }

    // TODO  removeLibro()
    // Buscar libro por codigo -------------------------------
    // Devuelve el libro si se lo encuentra, NULL en caso contrario
    public Libro getLibro(String codigo)
    {
        // Buscar si hay un libro con un codigo igual? 
        for (Libro libro : libros)
          {
            if (libro.getCodigo().equals(codigo))
                return libro;
          }

        return null;
    }

    // PRESTAMOS ================================================
    // Averiguar si el libro fue prestado ---------------------
    // NO_PRESTADO si no est aprestado el libro, en caso contrario devuelve 
    // el indice del prestamo. (NO el ID)
    public Integer isLibroPrestado(String codigo)
    {
        for (int i = 0; i < prestamos.size(); i++)
          {
            // Buscar si hay un libro con un codigo igual? 
            if (prestamos.get(i).getLibro().equals(codigo))
                return i;
          }

        return NO_PRESTADO;
    }

    // Verificar si el estudiante llego al maximo de prestamos -------------------------
    // TODO:  La verificacion de un maximo de 2 libros podría hacerse por otro medio más simple.
    public Integer cantidadPrestamos(Integer estudianteDNI)
    {
        Integer cantidad = 0;

        for (Prestamo prestamo : prestamos)
          {
            // Buscar si hay un libro con un codigo igual? 
            if (prestamo.getEstudiante().equals(estudianteDNI))
                cantidad++;
          }

        return cantidad;
    }

    // Hacer un prestamo ---------------------------------------
    // True: si el prestamo es posible y ejecutado, False: en caso contrario
    public Boolean prestarLibro(String codigo, Integer estudianteDNI)
    {
        // Buscar el libro --------------- 
        Libro libro = getLibro(codigo);

        if (libro != null)
          {
            // No esta prestado y el estudiante no alcanzo el maximo?
            if ((isLibroPrestado(codigo) != NO_PRESTADO)
                    && (cantidadPrestamos(estudianteDNI) > MAX_PRESTAMOS))
              {
                prestamoID++;
                prestamos.add(new Prestamo(prestamoID, codigo, estudianteDNI));
                return true;
              }
          }

        // No es posible prestar el libro
        return false;
    }

    // Hacer un prestamo ---------------------------------------
    // True: si el prestamo es posible y ejecutado, False: en caso contrario
    public Boolean devolucionLibro(String codigo)
    {
        Boolean exito = false;
        Integer indicePrestamo = isLibroPrestado(codigo);

        // No esta prestado?
        if (!indicePrestamo.equals(NO_PRESTADO))
          {
            prestamos.remove(indicePrestamo);
            return true;
          }
        else // No es posible prestar el libro
            return false;
    }
    
    
    // IMPRIMIR ========================================
    public String impirmirLibros()
    {
       String result = " - Impresiones ----------------\n";
       
        for (Libro libro : libros)
          {
            if (libro.isFotocopiable())
                result += libro.toString() + "\";
          }
    

    }    
}
