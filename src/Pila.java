public class Pila {
    private Nodo top;

    public Pila() {
        this.top = null;
    }

    // Metodo para apilar (push) un elemento en la pila
    public void apilar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        nuevoNodo.siguiente = top;
        top = nuevoNodo;
    }

    // Metodo para visualizar los elementos de la pila
    public void visualizar() {
        if (top == null) {
            System.out.println("La pila esta vacia.");
        } else {
            Nodo actual = top;
            while (actual != null) {
                System.out.print(actual.dato);
                if (actual.siguiente != null){
                    System.out.print(",");
                }
                actual = actual.siguiente;
            }
        }
    }
}
