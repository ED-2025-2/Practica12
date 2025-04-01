public class Main {
    public static void main(String[] args) {
        // Crear un árbol binario de búsqueda
        ArbolBB<Integer> arbol = new ArbolBB<>();

        // Insertar elementos en el árbol
        System.out.println("Insertando elementos [50,30,70,20,40,60,80,95]");
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(70);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(60);
        arbol.insertar(80);
        arbol.insertar(95);

        System.out.println("Mostrando la construccion del Arbol");
        arbol.mostrar();


        // Buscar elementos en el árbol
        System.out.println("\nBuscando elementos...");
        System.out.println("¿Está el 40? " + arbol.buscar(40)); // true
        System.out.println("¿Está el 25? " + arbol.buscar(25)); // false

        // Recorrido inorden
        System.out.println("\nRecorrido Inorden:");
        Iterador<Integer> iteradorInorden = arbol.iteradorInorden();
        while (iteradorInorden.hasNext()) {
            System.out.print(iteradorInorden.next() + " ");
        }

        // Recorrido por niveles
        System.out.println("\n\nRecorrido por Niveles:");
        Iterador<Integer> iteradorNivel = arbol.iteradorPorNivel();
        while (iteradorNivel.hasNext()) {
            System.out.print(iteradorNivel.next() + " ");
        }
        
        // Eliminar elementos
        System.out.println("\n\nEliminando elementos [50, 30, 80]");
        arbol.eliminar(50); // Elimina la raíz
        arbol.eliminar(30);
        arbol.eliminar(80);

        System.out.println("Mostrando la construccion del Arbol actualizado");
        arbol.mostrar();

        // Recorrido inorden después de eliminar
        System.out.println("\nRecorrido Inorden después de eliminar:");
        iteradorInorden = arbol.iteradorInorden();
        while (iteradorInorden.hasNext()) {
            System.out.print(iteradorInorden.next() + " ");
        }
        
        // Verificar si el árbol está vacío
        System.out.println("\n\n¿El árbol está vacío? " + arbol.estaVacio());
    }


    
}
