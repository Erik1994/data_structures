import linkedlist.MyDoublyLinkedList;
import linkedlist.MyLinkedList;
import stackandqueu.ArrayQueue;
import stackandqueu.ArrayStack;
import stackandqueu.Employee;

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

        System.out.println("ArrayStack");
        ArrayStack arrayStack = new ArrayStack(5);
        arrayStack.push(janeJones);
        arrayStack.push(johnDoe);
        arrayStack.push(marySmith);
        arrayStack.push(mikeWilson);
        arrayStack.push(jamesBond);
        arrayStack.printStack();
        System.out.println(arrayStack.getSize());
        System.out.println(arrayStack.peek());
        System.out.println(arrayStack.getSize());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.getSize());
        arrayStack.printStack();
        System.out.println(arrayStack.peek());

        System.out.println("ArrayQueue");
        ArrayQueue arrayQueue = new ArrayQueue(5);
        arrayQueue.add(janeJones);
        arrayQueue.add(johnDoe);
        arrayQueue.add(marySmith);
        arrayQueue.add(mikeWilson);
        arrayQueue.add(jamesBond);
        arrayQueue.printQueue();
        System.out.println(arrayQueue.size());
        System.out.println(arrayQueue.peek());
        System.out.println(arrayQueue.size());
        System.out.println(arrayQueue.remove());
        System.out.println(arrayQueue.size());
        arrayQueue.printQueue();
        System.out.println(arrayQueue.peek());
    }
}
