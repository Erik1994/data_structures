package hashtable;

import stackandqueu.Employee;

public class SimpleHashTable {
    private StoredEmployee[] hashtable;

    public SimpleHashTable() {
        hashtable = new StoredEmployee[10];
    }

    public void put(String key, Employee value) {
        int hashKey = hashKey(key);
        if (occupied(hashKey)) {
            int stopIndex = hashKey;
            if (hashKey == hashtable.length - 1) {
                hashKey = 0;
            } else {
                ++hashKey;
            }
            while (occupied(hashKey) && hashKey != stopIndex) {
                hashKey = (hashKey + 1) % hashtable.length;
            }
        }
        if (occupied(hashKey)) {
            System.out.println("Sorry, there is already an employee at position " + hashKey);
        } else {
            hashtable[hashKey] = new StoredEmployee(key, value);
        }
    }

    public Employee get(String key) {
        int hashKey = findKey(key);
        if (hashKey == -1) {
            return null;
        }
        return hashtable[hashKey].value;
    }

    public Employee remove(String key) {
        int hashKey = findKey(key);
        if(hashKey == -1) {
            return null;
        }
        Employee employee = hashtable[hashKey].value;
        hashtable[hashKey] = null;
        StoredEmployee[] oldHashTable = hashtable;
        hashtable = new StoredEmployee[oldHashTable.length];
        for (StoredEmployee storedEmployee : oldHashTable) {
            if (storedEmployee != null) {
                put(storedEmployee.key, storedEmployee.value);
            }
        }
        return employee;
    }

    private int findKey(String key) {
        int hashKey = hashKey(key);
        if (hashtable[hashKey] != null && hashtable[hashKey].key.equals(key)) {
            return hashKey;
        }
        int stopIndex = hashKey;
        if (hashKey == hashtable.length - 1) {
            hashKey = 0;
        } else {
            ++hashKey;
        }
        while (hashKey != stopIndex && hashtable[hashKey] != null && !hashtable[hashKey].key.equals(key)) {
            hashKey = (hashKey + 1) % hashtable.length;
        }

        if (hashtable[hashKey] != null && hashtable[hashKey].key.equals(key)) {
            return hashKey;
        } else {
            return -1;
        }
    }

    private boolean occupied(int index) {
        return hashtable[index] != null;
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    public void print() {
        for (StoredEmployee i : hashtable) {
            if (i == null) {
                System.out.println("Empty");
            } else {
                System.out.println(i.value);
            }
        }
    }
}
