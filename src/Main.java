import linkedlist.MyDoublyLinkedList;
import linkedlist.MyLinkedList;

public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith",22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee jamesBond = new Employee("James", "Bond", 7);

        System.out.println("Singly LinkedList");
        MyLinkedList<Employee> linkedList = new MyLinkedList<>();
        System.out.println(linkedList.isEmpty());
        linkedList.addToFront(janeJones);
        linkedList.addToFront(johnDoe);
        linkedList.addToFront(marySmith);
        linkedList.addToFront(mikeWilson);
        linkedList.printList();
        System.out.println(linkedList.getSize());
        System.out.println(linkedList.isEmpty());
        linkedList.removeFromFront();
        linkedList.printList();
        System.out.println(linkedList.getSize());

        System.out.println("Doubly LinkedList");
        MyDoublyLinkedList<Employee> doublyLinkedList = new MyDoublyLinkedList<>();
        System.out.println(doublyLinkedList.isEmpty());
        doublyLinkedList.addToFront(janeJones);
        doublyLinkedList.addToFront(johnDoe);
        doublyLinkedList.addToEnd(marySmith);
        doublyLinkedList.addToEnd(mikeWilson);
        doublyLinkedList.printList();
        System.out.println(doublyLinkedList.getSize());
        doublyLinkedList.addBefore(jamesBond, johnDoe);
        doublyLinkedList.printList();
        System.out.println(doublyLinkedList.getSize());
        System.out.println(doublyLinkedList.getSize());
        System.out.println(doublyLinkedList.isEmpty());
        doublyLinkedList.removeFromFront();
        doublyLinkedList.printList();
        System.out.println(doublyLinkedList.getSize());
        doublyLinkedList.removeFromEnd();
        doublyLinkedList.printList();
        System.out.println(doublyLinkedList.getSize());

        System.out.println("Iterable");
        for (Employee item : doublyLinkedList) {
            System.out.println(item);
        }
    }
}
