package mini_proyectos.ejercicios;

import mini_proyectos.clases.Grafo;

public class Ejercicio13 {
    public static void main(String[] args) {
        Grafo grafo = new Grafo();
        
        // Agregar vértices
        grafo.agregarVertice(1);
        grafo.agregarVertice(2);
        grafo.agregarVertice(3);
        grafo.agregarVertice(4);
        grafo.agregarVertice(5);

        // Agregar aristas
        grafo.agregarArista(1, 2);
        grafo.agregarArista(1, 3);
        grafo.agregarArista(2, 4);
        grafo.agregarArista(3, 5);
        
        System.out.println("Recorrido DFS desde el vértice 1:");
        grafo.dfs(1); // Debe mostrar algo como: 1 2 4 3 5
    }
}
