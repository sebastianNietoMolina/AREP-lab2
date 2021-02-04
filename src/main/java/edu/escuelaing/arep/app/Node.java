package edu.escuelaing.arep.app;

public class Node<E> {

    private E current;
    private Node next;

    /**
     * Constructor del nodo
     * @param current Es el nodo a iniciar
     */
    public Node(E current) {
        this.current = current;
        this.next = null;
    }

    /**
     * Retorna el valor actual del nodo.
     * @return Valor que tiene el nodo.
     */
    public E getCurrent(){
        return this.current;
    }

    /**
     * Retorna el valor del siguiente nodo.
     * @return valor del nodo.
     */
    public Node<E> getNext(){ return this.next;}

    /**
     * Actualiza el valor del siguiente nodo.
     * @param data El nuevo nodo.
     */
    public void nextNode(Node data){
        this.next = data;
    }
}
