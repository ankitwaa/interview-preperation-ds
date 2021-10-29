package in.prepare.ds.linkedlist;

public class Node<T> {
    Object value;
    Node next;

    public Node(T t){
        value = (T)t;
    }

    public T getValue(){
        return (T)value;
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node<T> t){
        next = t;
    }
}
