package linkedlist;

public class MyLinkedList<E> {
    private Node<E> head;
    private int size = 0;

    public void addToFront(E data) {
        Node<E> node = new Node<E>(data);
        node.next = head;
        head = node;
        ++size;
    }

    public E removeFromFront() {
        if (isEmpty()) return null;
        Node<E> node = head;
        E data = node.data;
        head = head.next;
        node.next = null;
        --size;
        return data;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

    public void printList() {
        Node<E> node = head;
        if (node == null) {
            System.out.println("{ empty }");
            return;
        }
        while (node.next != null) {
            System.out.println(node);
            node = node.next;
        }
        // For last item
        System.out.println(node);
    }
}
