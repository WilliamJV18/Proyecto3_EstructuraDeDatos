
package proyecto03_estructuradedatos;

import javax.swing.JOptionPane;


public class Proyecto03_EstructuraDeDatos {

    
    public static void main(String[] args) {
        
        // Se crean las variables y el objeto
        int opcion = 0;
        String nombre;
        Arbol arbol = new Arbol();
        
        arbol.AgregarNodo("Carlos");
        arbol.AgregarNodo("María");
        arbol.AgregarNodo("Jorge");
        arbol.AgregarNodo("Ana");
        arbol.AgregarNodo("Luis");
        arbol.AgregarNodo("Andrés");
        arbol.AgregarNodo("Alicia");
        
        do{
            try{
                // Se crea el menú
               opcion = Integer.parseInt(JOptionPane.showInputDialog (null,
                       "1. Agregar nodo \n"
                               +"2. Recorrer el árbol INORDEN \n"
                               +"3. Recorrer el árbol PREORDEN \n"
                               +"4. Recorrer el árbol POSTORDEN \n"
                               +"5. Salir \n"
                               +"Elige una opción...: ","Árbol Genealógico de Carlos"
                       ,JOptionPane.QUESTION_MESSAGE));
               
               switch (opcion){
                   // Opción para agregar nodos
                   case 1:
                       nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del nodo... ","Inserción de nodo"
                               ,JOptionPane.QUESTION_MESSAGE);
                       arbol.AgregarNodo(nombre);
                       break;
                    // Opción para mostrar en InOrden
                   case 2:
                       if(!arbol.ArbVacio()){
                           System.out.println();
                           arbol.ListarInOrden(arbol.raiz);
                       }else{
                           JOptionPane.showMessageDialog(null, "El árbol esta vacio","¡Cuidado!"
                               ,JOptionPane.QUESTION_MESSAGE);
                       }
                       break;
                    // Opción para mostrar en PreOrden
                    case 3:
                       if(!arbol.ArbVacio()){
                           System.out.println();
                           arbol.ListarPreOrden(arbol.raiz);
                       }else{
                           JOptionPane.showMessageDialog(null, "El árbol esta vacio","¡Cuidado!"
                               ,JOptionPane.QUESTION_MESSAGE);
                       }
                       break;
                    // Opción para mostrar en PostOrden
                    case 4:
                       if(!arbol.ArbVacio()){
                           System.out.println();
                           arbol.ListarPostOrden(arbol.raiz);
                       }else{
                           JOptionPane.showMessageDialog(null, "El árbol esta vacio","¡Cuidado!"
                               ,JOptionPane.QUESTION_MESSAGE);
                       }
                       break;
                    // Opción para salir del programa
                   case 5:
                       JOptionPane.showMessageDialog(null, "Aplicación finalizada ","Fin"
                               ,JOptionPane.QUESTION_MESSAGE);
                       break;
                   default:
                       JOptionPane.showMessageDialog(null, "Elija alguna de las opciones anteriores","¡Cuidado!"
                               ,JOptionPane.QUESTION_MESSAGE);
                       break;
                   }
            }catch (NumberFormatException n){
                       if ("null".equals(n.getMessage())){
                       break;
                    }else{
                           JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
                         }
               }
        }while(opcion != 5);
        
    }
    
}
