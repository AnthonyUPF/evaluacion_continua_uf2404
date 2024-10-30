package mini_proyectos.clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Grafo {
    private Map<Integer, List<Integer>> adyacencia;

    public Grafo() {
        adyacencia = new HashMap<>();
    }

    public void agregarVertice(int vertice) {
        adyacencia.putIfAbsent(vertice, new ArrayList<>());
    }

    public void agregarArista(int origen, int destino) {
        adyacencia.get(origen).add(destino);
        adyacencia.get(destino).add(origen); // Grafo no dirigido
    }

    public void dfs(int inicio) {
        Set<Integer> visitado = new HashSet<>();
        dfsRecursivo(inicio, visitado);
        System.out.print("\n");
    }

    private void dfsRecursivo(int vertice, Set<Integer> visitado) {
        visitado.add(vertice);
        System.out.print(vertice + " ");

        for (int adyacente : adyacencia.getOrDefault(vertice, new ArrayList<>())) {
            if (!visitado.contains(adyacente)) {
                dfsRecursivo(adyacente, visitado);
            }
        }
    }
}

