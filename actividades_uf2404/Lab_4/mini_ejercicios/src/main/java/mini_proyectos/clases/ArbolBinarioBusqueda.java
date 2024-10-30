package mini_proyectos.clases;

public class ArbolBinarioBusqueda {
    private Nodo raiz;

    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private Nodo insertarRecursivo(Nodo actual, int valor) {
        if (actual == null) {
            return new Nodo(valor);
        }
        if (valor < actual.valor) {
            actual.izquierdo = insertarRecursivo(actual.izquierdo, valor);
        } else if (valor > actual.valor) {
            actual.derecho = insertarRecursivo(actual.derecho, valor);
        }
        return actual;
    }

    public void recorridoEnOrden() {
        recorridoEnOrdenRecursivo(raiz);
        System.out.print("\n");
    }

    private void recorridoEnOrdenRecursivo(Nodo nodo) {
        if (nodo != null) {
            recorridoEnOrdenRecursivo(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            recorridoEnOrdenRecursivo(nodo.derecho);
        }
    }
}