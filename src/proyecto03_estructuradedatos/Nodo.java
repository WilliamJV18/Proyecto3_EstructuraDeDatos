
package proyecto03_estructuradedatos;


public class Nodo {
    
    // Se le ponen los atributos a la clase
    String nombre;
    Nodo hizquierdo, hderecho;
    
    // Se crea un constructor
    public Nodo(String nom){
    this.nombre = nom;
    this.hizquierdo = null;
    this.hderecho = null;
    } 
    
    // Función que devuelve el nombre del nodo
    public String toString(){
    return "El nombre del nodo es: " + nombre;
    }
}
