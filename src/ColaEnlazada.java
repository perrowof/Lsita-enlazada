public class ColaEnlazada {
    public Nodo cima;
    public Nodo fin;

    public ColaEnlazada() {
        this.cima = null;
        this.fin = null;
    }

    public void encolar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cima == null) {
            cima = nuevoNodo;
            fin = nuevoNodo;
        } else {
            fin.siguiente = nuevoNodo;
            fin = nuevoNodo;
        }
    }

    public void mostrar() {
        if (cima == null) {
            System.out.print("La cola esta vacia");
            return;
        }

        Nodo actual = cima;
        while (actual != null) {
            System.out.print(actual.dato);
            if (actual.siguiente != null) { // Si hay un siguiente nodo, agregar una coma
                System.out.print(",");
            }
            actual = actual.siguiente;
        }
        System.out.println();
    }

    public int numeroPares() {
        int contador = 0;
        Nodo actual = cima;

        while (actual != null) {
            if (actual.dato % 2 == 0) { // Verifica si el dato es par
                contador++;
            }
            actual = actual.siguiente; // Avanza al siguiente nodo
        }

        return contador;
    }
    // Metodo para calcular la media de los datos en la cola
    public double calcularMedia() {
        if (cima == null) {
            return 0; // Si la cola está vacía, la media es 0
        }

        int suma = 0;
        int contador = 0;
        Nodo actual = cima;

        while (actual != null) {
            suma += actual.dato; // Suma el valor del nodo actual
            contador++; // Incrementa el contador de elementos
            actual = actual.siguiente; // Avanza al siguiente nodo
        }

        return (double) suma / contador; // Calcula y devuelve la media
    }
}
