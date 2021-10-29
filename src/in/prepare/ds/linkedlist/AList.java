package in.prepare.ds.linkedlist;

public interface AList<T> {
    void add(T value);
    void deleteNode(T value);
    void addAtLast(T value);
    String toString();
}
