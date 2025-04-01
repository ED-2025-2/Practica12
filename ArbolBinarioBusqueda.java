/**
 * Interfaz que define las operaciones del Árbol Binario de Búsqueda
 * @author Kevin Jair Torres Valencia
 */
public interface ArbolBinarioBusqueda<T extends Comparable<T>> {

    /**
     * Inserta un nuevo elemento en el árbol manteniendo las 
     * propiedades del árbol binario de búsqueda.
     * @param elemento El elemento a insertar en el árbol
     */
    void insertar(T elemento);

    /**
     * Busca un elemento en el árbol binario de búsqueda.
     * @param elemento El elemento a buscar
     * @return {@code true} si el elemento existe en el árbol, {@code false} en caso contrario
     */
    boolean buscar(T elemento);

    /**
     * Elimina un elemento del árbol binario de búsqueda si existe.
     * Mantiene las propiedades del árbol después de la eliminación.
     * @param elemento El elemento a eliminar
     */
    void eliminar(T elemento);

    /**
     * Verifica si el árbol está vacío.
     * @return {@code true} si el árbol no contiene elementos,
     *         {@code false} en caso contrario
     */
    boolean estaVacio();
    
    /**
     * Obtiene un iterador que permite recorrer el árbol en 
     * orden (izquierda-raíz-derecha).
     * Este recorrido visita los nodos del árbol en orden 
     * ascendente según la comparación.
     * @return Un iterador para recorrer el árbol en orden
     */
    Iterador<T> iteradorInorden();

    /**
     * Obtiene un iterador que permite recorrer el árbol por niveles.
     * El recorrido comienza por la raíz, luego visita todos
     * los nodos del nivel 1, después todos los del nivel 2,
     * y así sucesivamente.
     * @return Un iterador para recorrer el árbol por niveles
     */
    Iterador<T> iteradorPorNivel();
}