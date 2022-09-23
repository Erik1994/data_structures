import hashtable.SimpleHashTable;
import linkedlist.MyLinkedList;
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

        SimpleHashTable hashTable = new SimpleHashTable();
        hashTable.put("Jones", janeJones);
        hashTable.put("Wilson", mikeWilson);
        hashTable.put("Smith", marySmith);
        hashTable.print();
        System.out.println();

        System.out.println(hashTable.remove("Jones"));
        System.out.println(hashTable.remove("Wilson"));
        System.out.println();
        hashTable.print();
        System.out.println(hashTable.get("Smith"));
    }
}
