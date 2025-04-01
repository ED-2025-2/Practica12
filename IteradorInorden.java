import java.util.NoSuchElementException;
import java.util.Stack;

/**
 * Implementación del Iterador Inorden
 */
public class IteradorInorden<T extends Comparable<T>> implements Iterador<T> {

    /** Pila para almacenar los nodos pendientes de visitar */
    private Stack<Nodo<T>> pila;
    /** Nodo actual en el recorrido */
    private Nodo<T> actual;
    

    /**
     * Constructor que inicializa el iterador para recorrer el árbol en orden.
     * @param raiz Nodo raíz del árbol a recorrer
     */
    public IteradorInorden(Nodo<T> raiz) {
        pila = new Stack<>();
        actual = raiz;
        // Colocar todos los nodos del extremo izquierdo en la pila
        while (actual != null) {
            pila.push(actual);
            actual = actual.izquierdo;
        }
    }
    

    /**
     * {@inheritDoc}
     * Verifica si hay más elementos por recorrer en el árbol.
     * @return {@code true} si quedan elementos por recorrer, {@code false} en caso contrario
     */
    @Override
    public boolean hasNext() {
        // Aqui va su codigo
    }
    
    /**
     * {@inheritDoc}
     * Devuelve el siguiente elemento en el recorrido inorden.
     * @return El siguiente elemento en el recorrido inorden
     * @throws NoSuchElementException si no hay más elementos para recorrer
     */
    @Override
    public T next() {
        // Aqui va su codigo

    }
}