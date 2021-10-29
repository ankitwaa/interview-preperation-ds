package in.prepare.ds.linkedlist;

public class ALinkedListDemo {
    public static void main(String[] args) {
        ALinkedList<String> list = new ALinkedList<>();
        list.add("ankit");
        list.add("kumar");
        list.add("nayak");
        list.addAtLast("last1");
        list.addAtLast("last2");
        list.addAtLast("last3");
        System.out.println(list.toString());
        list.deleteNode("nayak");
        System.out.println(list.toString());
    }
}
