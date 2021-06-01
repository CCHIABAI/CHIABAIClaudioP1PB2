/** 
 *
 * Programación Basica 2 - Comision 2900
 * @author Claudio J. CHIABAI <cchiabai@alumno.unlam.edu.ar>
 *
 **/


package CHIABAIClaudioP1PB2;

import java.util.ArrayList;

/**
 * 
 */
public class Biblioteca {
    
     ArrayList<Libro> libros;
     ArrayList<Prestamo> prestamos;
     Integer prestamoID = 0; // Incremental -------------------

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
    // True: si el prestamo es posible y ejecutado, False: en caso contrario
    public Boolean prestarLibro(String codigo, Integer estudianteDNI)
    {
       Boolean exito = false; 
       // Buscar el libro --------------- 
       Libro libro = getLibro(codigo);
       
       if (libro != null)
         {
           // No esta prestado?
           if (!isLibroPrestado(codigo))
             {
               prestamoID ++;
               prestamos.add(new Prestamo(prestamoID, codigo, estudianteDNI));
               return true;
             }   

         } 
       else return false;
         
    }        
    
    // Averiguar si el libro fue prestado ---------------------
    // true si lo esta, falso en caso contrario.
    public Boolean isLibroPrestado(String codigo)
    {
        for (Prestamo prestamo : prestamos)
          {
           // Buscar si hay un libro con un codigo igual? 
            if (prestamo.getLibro().getCodigo().equals(codigo))
               return true;
          }
          
        return false;
    }        
    

    
}
