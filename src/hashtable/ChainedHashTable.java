package hashtable;

import stackandqueu.Employee;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTable {
    private LinkedList<StoredEmployee>[] hashTable;

    public ChainedHashTable() {
        hashTable = new LinkedList[10];
        for (int i = 0; i < hashTable.length; ++i) {
            hashTable[i] = new LinkedList<>();
        }
//        for (LinkedList<StoredEmployee> item : hashTable) {
//            item = new LinkedList<StoredEmployee>();
//        }
    }

    public void put(String key, Employee value) {
        int hashKey = hashKey(key);
        hashTable[hashKey].add(new StoredEmployee(key, value));
    }

    public Employee get(String key) {
        int hashKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashTable[hashKey].listIterator();
        StoredEmployee employee = null;
        while (iterator.hasNext()) {
            employee = iterator.next();
            if (employee.key.equals(key)) {
                return employee.value;
            }
        }
        return null;
    }

    public Employee remove(String key) {
        int hashKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashTable[hashKey].listIterator();
        StoredEmployee employee = null;
        int index = -1;
        while (iterator.hasNext()) {
            employee = iterator.next();
            ++index;
            if (employee.key.equals(key)) {
                break;
            }
        }
        if (employee == null || !employee.key.equals(key)) {
            return null;
        }
        hashTable[hashKey].remove(index);
        return employee.value;
    }
    private int hashKey(String key) {
        return Math.abs(key.hashCode() % hashTable.length);
    }

    public void printHashTable() {
        for(int i = 0; i < hashTable.length; ++i) {
            if (hashTable[i].isEmpty()) {
                System.out.println("Position " + i + ": empty");
            } else {
                System.out.println("Position " + i + ": ");
                ListIterator<StoredEmployee> iterator = (ListIterator<StoredEmployee>) hashTable[i].iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next().value);
                }
            }
        }
    }
}
