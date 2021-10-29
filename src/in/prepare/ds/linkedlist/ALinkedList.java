package in.prepare.ds.linkedlist;

public class ALinkedList<T> implements AList<T>{

    private Node<T> start;

    @Override
    public void add(T value) {
        Node<T> n1 = new Node<>(value);
        if(start == null){
            start = n1;
        }else{
            n1.setNext(start);
            start = n1;
        }
    }

    @Override
    public void deleteNode(T value) {
        Node<T> trv = start;
        Node<T> prev=null;
        while(!trv.getValue().equals(value)){
            prev = trv;
            System.out.println("prev-"+ prev.toString());
            trv = trv.getNext();
        }
        // Found node before the node which needs to be deleted.
        Node<T> nodeToBeDeleted = trv;

        if(start.getValue().equals(nodeToBeDeleted.getValue())){
            start = nodeToBeDeleted.getNext();
        }else {
            // set Next to point to next to next, hence the node will not be in the list (orphan node)
            prev.setNext(nodeToBeDeleted.getNext());
        }

    }

    @Override
    public void addAtLast(T value) {
        Node<T> trv = start;
        while(trv.getNext() != null){
            trv = trv.getNext();
        }
        Node<T> newNode = new Node<>(value);
        trv.setNext(newNode);
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        Node<T> trv = start;
        while(trv.getNext() != null){
            stringBuilder.append(trv.getValue().toString()).append(",");
            trv = trv.getNext();
        }
        stringBuilder.append(trv.getValue()).append("]");
        return stringBuilder.toString();

    }
}
