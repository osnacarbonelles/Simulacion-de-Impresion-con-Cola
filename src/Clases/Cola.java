package Clases;

import java.util.Iterator;

/**
 *
 * @author Osna Carbonell
 */
public class Cola<T> {

    private Nodo<T> primero;
    private Nodo<T> ultimo;
    private int tamaño;

    public Cola() {
        primero = null;
        ultimo = null;
        tamaño = 0;

    }

    /**
     * Indica si la cola esta vacia
     *
     * @return
     */
    public boolean isEmpty() {
        return primero == null;
    }

    /**
     * Indica el tamaño de la cola
     *
     * @return
     */
    public int size() {
        return tamaño;
    }

    /**
     * Devuelve el primer elemento en la cola
     *
     * @return
     */
    public T primero() {
        if (isEmpty()) {
            return null;
        }

        return primero.getElemento();
    }

    /**
     * Elimina y devuelve el primer elemento de la cola
     *
     * @return
     */
    public T dequeue() {

        if (isEmpty()) {
            return null;
        }

        T elemento = primero.getElemento();
        Nodo<T> aux = primero.getSiguiente();
        primero = null;

        primero = aux;
        tamaño--;
        if (isEmpty()) {
            ultimo = null;
        }

        return elemento;
    }

    /**
     * Añade un nuevo elemento a la cola
     *
     * @param elemento
     * @return
     */
    public void enqueue(T valor) {

        Nodo<T> nodo = new Nodo<>(valor);
        if (primero == null) { // Cola vacia?
            this.primero = this.ultimo = nodo;
            this.ultimo = nodo;
        } else {
            nodo.setSiguiente(null);
            this.ultimo.setSiguiente(nodo);
            this.ultimo = nodo;

        }
        this.tamaño++;
    }

    /**
     * Muestra el contenido
     *
     * @return
     */
    public String toString() {

        if (isEmpty()) {
            return "La lista esta vacia";
        } else {

            String cadena = "";

            Nodo<T> aux = primero;
            while (aux != null) {
                cadena += aux;
                aux = aux.getSiguiente();
            }

            return cadena;

        }

    }

}//FinClase

