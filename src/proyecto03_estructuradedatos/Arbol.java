
package proyecto03_estructuradedatos;


public class Arbol {
    
    // Se crea el nodo raiz del árbol
    Nodo raiz; 
    
    public Arbol(){
        // Se inicializa el nodo creado como nulo
        raiz = null; 
    }

    // Se crea este método para verificar si el arból está vacío
    public boolean ArbVacio(){
        return raiz == null;
    }

    // Se crea este método para insertar un nodo en el árbol
    public void AgregarNodo(String nom){
        Nodo nuevo = new Nodo(nom);
        if (raiz==null){
            raiz = nuevo;
        }else{
            Nodo auxiliar = raiz;
            Nodo padre;
            while(true){
                padre = auxiliar;
                if(nom.compareTo(auxiliar.nombre)<=0){
                    auxiliar = auxiliar.hizquierdo;
                    if(auxiliar == null){
                        padre.hizquierdo = nuevo;
                        return;
                    }
                }else{
                    auxiliar = auxiliar.hderecho;
                    if(auxiliar == null){
                        padre.hderecho = nuevo;
                        return;
                    }
                }
            }
        }
    }
  
    // Se crea este método para recorrer árbol INORDEN
    public void ListarInOrden(Nodo r){
        if(r!=null){
            ListarInOrden(r.hizquierdo);
            System.out.print(r.nombre + ", ");
            ListarInOrden(r.hderecho);
        }
    }
    
    public void ListarPreOrden(Nodo r){
        if(r!=null){
            System.out.print(r.nombre + ", ");
            ListarPreOrden(r.hizquierdo);
            ListarPreOrden(r.hderecho);
        }
    }
    
    public void ListarPostOrden(Nodo r){
        if(r!=null){
            ListarPostOrden(r.hizquierdo);
            ListarPostOrden(r.hderecho);
            System.out.print(r.nombre + ", ");
        }
    }
    
}
