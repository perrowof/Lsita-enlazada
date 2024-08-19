import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pila pila = new Pila();
        ColaEnlazada cola = new ColaEnlazada();

        System.out.print("Introduce el numero de elementos: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Introduce el valor para el elemento " + (i + 1) + ": ");
            int valor = scanner.nextInt();
            pila.apilar(valor);   // Insertar en la pila
            cola.encolar(valor); // Insertar en la cola
        }

        System.out.println("Elementos en la pila:");
        pila.visualizar();

        System.out.println();

        System.out.println("Elementos en la cola:");
        cola.mostrar();


        System.out.println("Numero de pares ingresados:"+cola.numeroPares());

        double media = cola.calcularMedia();
        System.out.println("Media de los elementos en la cola: " + media);

        System.out.println("Ultimo nodo ingresado: " + cola.fin.getDato());

        scanner.close();
    }
}