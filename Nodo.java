/**
 * Clase Nodo para el árbol
 */
public class Nodo<T extends Comparable<T>> {
    T dato;
    Nodo<T> izquierdo;
    Nodo<T> derecho;
    
    /**
     * Representa un nodo del Arbol Binario.
     * @param dato el contenido almacenado en el nodo.
     */
    public Nodo(T dato) {
        this.dato = dato;
        this.izquierdo = null;
        this.derecho = null;
    }
}