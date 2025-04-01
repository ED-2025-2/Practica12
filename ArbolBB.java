/**
 * Implementación del Árbol Binario de Búsqued
 * @see Nodo
 * @see ArbolBinarioBusqueda
 * @author Kevin Jair Torres Valencia
 */
public class ArbolBB<T extends Comparable<T>> implements ArbolBinarioBusqueda<T> {
    
    /** Nodo raiz del arbol*/
    private Nodo<T> raiz;
    

    /**
     * Constructor por defecto
     * Crea un arbol vacio
     */
    public ArbolBB() {
        this.raiz = null;
    }
   
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean estaVacio() {
        return raiz == null;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void insertar(T elemento) {
        raiz = insertarRecursivo(raiz, elemento);
    }
    

    /**
     * Método recursivo auxiliar para insertar un elemento en el árbol.
     * @param nodo Nodo actual en la recursión
     * @param elemento Elemento a insertar
     * @return El nodo actualizado después de la inserción
     */
    private Nodo<T> insertarRecursivo(Nodo<T> nodo, T elemento) {
        // Si el nodo es nulo, crear un nuevo nodo
        if (nodo == null) {
            return new Nodo<>(elemento);
        }
        
        // Aqui va su codigo
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean buscar(T elemento) {
        return buscarRecursivo(raiz, elemento);
    }
    
    /**
     * Método recursivo auxiliar para buscar un elemento en el árbol.
     * @param nodo Nodo actual en la recursión
     * @param elemento Elemento a buscar
     * @return {@code true} si el elemento fue encontrado, {@code false} en caso contrario
     */
    private boolean buscarRecursivo(Nodo<T> nodo, T elemento) {
        // Si el nodo es nulo, el elemento no existe
        if (nodo == null) {
            return false;
        }
        
        // Aqui va su codigo
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void eliminar(T elemento) {
        raiz = eliminarRecursivo(raiz, elemento);
    }
    
    /**
     * Método recursivo auxiliar para eliminar un elemento del árbol.
     * @param nodo Nodo actual en la recursión
     * @param elemento Elemento a eliminar
     * @return El nodo actualizado después de la eliminación
     */
    private Nodo<T> eliminarRecursivo(Nodo<T> nodo, T elemento) {
        // Si el árbol está vacío
        if (nodo == null) {
            return null;
        }

        // Aqui va su codigo
    }
    
    /**
     * Encuentra el valor mínimo en el subárbol que comienza con el nodo dado.
     * @param nodo Raíz del subárbol donde buscar
     * @return El valor mínimo encontrado
     */
    private T encontrarMinimo(Nodo<T> nodo) {
        T minimo = nodo.dato;
        while (nodo.izquierdo != null) {
            minimo = nodo.izquierdo.dato;
            nodo = nodo.izquierdo;
        }
        return minimo;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public Iterador<T> iteradorInorden() {
        return new IteradorInorden<>(raiz);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public Iterador<T> iteradorPorNivel() {
        return new IteradorNivel<>(raiz);
    }


    /** Metodo para visualizar la estructura */
    public void mostrar() {
        mostrar(raiz, 0);
    }
    
    /** Metodo para visualizar la estructura */
    private void mostrar(Nodo<T> nodo, int nivel) {
        if (nodo == null) return;
        
        mostrar(nodo.derecho, nivel + 1);
        
        for (int i = 0; i < nivel; i++) {
            System.out.print("   ");
        }
        System.out.println(nodo.dato);
        
        mostrar(nodo.izquierdo, nivel + 1);
    }
    
}