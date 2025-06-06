/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crispublicacion;

/**
 *
 * @author Aprendiz
 */
public class CRISPUBLICACION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Biblioteca biblioteca1= new Biblioteca("Biblioteca Nacional");
     
      
    //public Libro(String autor, String referencia_bibliografica, String titulo, String editorial, int anio_publicacion)
      Libro libro1= new Libro( "Gabriel Garcia Marquez", "historia","Cien años de Soledad", "enlace",1958);
      biblioteca1.agregarPublicacion(libro1);
      //biblioteca1.mostrarPublicacion();
      
      //public Revista(int periodicidad, String pais, String titulo, String editorial, int anio_publicacion)
      Revista revista1= new Revista( 3,"Colombia","Semana","Enlace",2020);
      biblioteca1.agregarPublicacion(revista1);
      biblioteca1.mostrarPublicacion();
      
      
    
    }
    
}
