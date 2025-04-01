import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

/**
 * Implementación del Iterador Por Nivel
 */
public class IteradorNivel<T extends Comparable<T>> implements Iterador<T> {

    /** Cola para almacenar los nodos pendientes de visitar */
    private Queue<Nodo<T>> cola;
    

    /**
     * Constructor que inicializa el iterador para recorrer el árbol por niveles.
     * @param raiz Nodo raíz del árbol a recorrer
     */
    public IteradorNivel(Nodo<T> raiz) {
        cola = new LinkedList<>();
        if (raiz != null) {
            cola.add(raiz);
        }
    }
    

    /**
     * {@inheritDoc}
     * Verifica si hay más elementos por recorrer en el árbol.
     * @return {@code true} si quedan elementos por recorrer,
     *         {@code false} en caso contrario
     */
    @Override
    public boolean hasNext() {
        // Aqui va su codigo

    }
    

    /**
     * {@inheritDoc}
     * Devuelve el siguiente elemento en el recorrido por niveles.
     * @return El siguiente elemento en el recorrido por niveles
     * @throws NoSuchElementException si no hay más elementos para recorrer
     */
    @Override
    public T next() {
        // Aqui va su codigo
    }
}