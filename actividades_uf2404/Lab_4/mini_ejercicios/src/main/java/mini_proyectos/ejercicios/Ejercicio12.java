package mini_proyectos.ejercicios;

import mini_proyectos.clases.ArbolBinarioBusqueda;

public class Ejercicio12 {
    public static void main(String[] args) {
        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();
        arbol.insertar(5);
        arbol.insertar(3);
        arbol.insertar(7);
        arbol.insertar(1);
        arbol.insertar(4);
        arbol.insertar(6);
        arbol.insertar(8);

        System.out.println("Recorrido en orden del árbol:");
        arbol.recorridoEnOrden(); // Debe mostrar 1 3 4 5 6 7 8
    }
}
