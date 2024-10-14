/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author Iker Aboitiz, Francisco Pérez, Elías Penhos, Emiliano Cervantez
 * @version 1.0
 * La clase representa la excpeción necesaria para poder manejar un arreglo vacio sin que se rompa el programa.
 */

public class ExcepciónColecciónVacía extends RuntimeException{

    
    public ExcepciónColecciónVacía(){
        super("Colección vacía");
    }
    
   /** 
    * Constructor que hereda una excepción cuando corres algo con una pila vacía
    * 
    */
    

    public ExcepciónColecciónVacía(String mensaje){
        super(mensaje);
    }
    
    /** 
    * Constructor que hereda una excepción cuando corres algo con una pila vacía
    * @param mensaje lo que aparece al accesar una colección vacía, el mensaje de error
    */
}
