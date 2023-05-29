package bridgelabz;


public class MyLinkedList<K, V> {

    MyNode<K, V> head;
    MyNode<K, V> tail;

    public void push(K key, V value) {
        MyNode<K, V> newNode = new MyNode(key, value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void add(K key, V value) {
        MyNode<K, V> newNode = new MyNode(key, value);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail=newNode;
    }

    public void show() {
        MyNode<K, V> temp = head;
        while (temp != null) {
            System.out.print(temp.key + " = " + temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }


    public MyNode<K, V> pop() {
        if (head == null)
            return null;
        MyNode<K, V> popData = head;
        head = head.next;
        return popData;
    }

    public MyNode<K, V> popLast() {
        if (head == null)
            return null;
        MyNode<K, V> popData = tail;
        if (head == tail) {
            head = null;
            return popData;
        }
        MyNode<K, V> temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        return popData;
    }

    public MyNode<K, V> search(K searchData) {
        MyNode<K, V> temp = head;
        while (temp != null) {
            if (temp.key.equals(searchData))
                return temp;
            temp = temp.next;
        }
        return null;
    }

    public boolean insertAfter(K searchData, K insertKey,V insertValue) {
        MyNode<K, V> newNode = new MyNode<>(insertKey,insertValue);
        MyNode<K, V> searchedNode = search(searchData);
        if (searchedNode != null) {
            newNode.next = searchedNode.next;
            searchedNode.next = newNode;
            return true;
        }
        return false;
    }
    public boolean delete(K key) {
        MyNode<K, V> temp = head;
        MyNode<K, V> temp2 = head;
        MyNode<K, V> temp3 = head;
        int count = 0;
        while (temp != null & temp2 != null & temp3 != null) {
            count++;
            if (count > 2) {
                temp3 = temp3.next;
            }
            if (temp.key == key) {
                temp2 = temp2.next;
                temp3.next = temp2;
                return true;
            }
            temp = temp.next;
            temp2 = temp2.next;
        }
        return false;
    }

    @Override
    public String toString() {
        return " \n{" + head + "}";
    
}
}