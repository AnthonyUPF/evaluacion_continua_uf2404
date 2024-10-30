package lab_3.ejercicios;

import java.util.HashMap;
import lab_3.clases.Nodo;

public class Ejercicio6 {
    public static void main(String[] args) {
        // Tabla hash
        HashMap<String, Integer> edadMap = new HashMap<>();
        edadMap.put("Juan", 25);
        edadMap.put("Maria", 30);
        edadMap.put("Pedro", 35);

        System.out.println("Tabla Hash:");
        for (String key : edadMap.keySet()) {
            System.out.println("Nombre: " + key + ", Edad: " + edadMap.get(key));
        }

        // Árbol binario básico
        Nodo raiz = new Nodo(10);
        raiz.setIzquierdo(new Nodo(5));
        raiz.setDerecho(new Nodo(15));
        
        System.out.println("Raíz: " + raiz.getValor());
        System.out.println("Izquierdo: " + raiz.getIzquierdo().getValor());
        System.out.println("Derecho: " + raiz.getDerecho().getValor());
    }
}
