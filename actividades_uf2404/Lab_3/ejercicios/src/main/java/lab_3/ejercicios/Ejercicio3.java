package lab_3.ejercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Lista enlazada
        LinkedList<String> lista = new LinkedList<>();
        lista.add("Juan");
        lista.add("Maria");
        lista.add("Pedro");

        System.out.println("Nombres en la lista enlazada:");
        for (String nombre : lista) {
            System.out.println(nombre);
        }

        // Pila
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        
        System.out.println("Pila:");
        pila.pop(); // Elimina el número en la parte superior
        System.out.println("Número en la parte superior después de pop: " + pila.peek());

        // Cola
        Queue<String> cola = new LinkedList<>();
        cola.add("Elemento1");
        cola.add("Elemento2");
        cola.add("Elemento3");

        System.out.println("Cola:");
        cola.poll(); // Elimina el primer elemento
        System.out.println("Siguiente elemento en la cola: " + cola.peek());
    }
}
