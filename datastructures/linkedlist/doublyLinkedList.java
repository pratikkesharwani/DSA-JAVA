package datastructures.linkedlist;

public class doublyLinkedList {
    Node head;
    Node tail;
    int length;

    class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }
    }

    doublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;

    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println("DLL printlist value: " + temp.value);
            temp = temp.next;

        }
    }

    public void getHead() {
        System.out.println("head value: " + head.value);
    }

    public void getTail() {
        System.out.println("tail value: " + tail.value);
    }

    public void getLength() {
        System.out.println("DLL length value: " + length);
    }

    public void appendDLL(int value) {
        if (length == 0) {
            Node node1 = new Node(value);
            head = node1;
            tail = node1;

        } else {
            Node node1 = new Node(value);
            tail.next = node1;
            node1.prev = tail;
            tail = node1;

        }
        length++;
    }

    public Node removeLastElement() {
        Node temp = tail;
        if (length == 0) {
            return null;
        }
        if (length == 1) {
            head = null;
            tail = null;

        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;

        }
        length--;
        return temp;

    }

    public void prependDLL(int value) {
        Node n2 = new Node(value);
        if (length == 0) {
            head = n2;
            tail = n2;
        } else {
            n2.next = head;
            head.prev = n2;
            head = n2;
        }

        length++;
    }

    public Node removeFirstElement() {
        Node temp = head;
        if (length == 0) {
            return null;
        }

        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = temp.next;
            temp.next = null;
            head.prev = null;
        }
        length--;
        return temp;
    }

    public Node getNodeAtIndex(int index) {
        Node temp;
        if (index < 0 || index >= length)
            return null;
        if (index < length / 2) {
            temp = head;
            System.out.println("IN FIRST HALF OF LINKED LIST");
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            System.out.println("IN SECOND HALF OF LINKED LIST");
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }

    public boolean setValue(int index, int value) {
        Node temp = getNodeAtIndex(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insertAtIndex(int index, int value) {
        Node after;
        Node before;
        if (index < 0 || index > length) {
            // System.out.println("Cannot enter value for given position");
            return false;
        }
        if (index == 0) {
            prependDLL(value);
            return true;

        }
        if (index == length) {
            appendDLL(value);
            return true;

        }
        Node n4 = new Node(value);
        before = getNodeAtIndex(index - 1);
        after = before.next;
        n4.prev = before;
        n4.next = after;
        after.prev = n4;
        before.next = n4;

        length++;
        return true;

    }

    public Node Remove(int index) {
        if (index < 0 || index >= length)
            return null;
        if (index == 0) {
            return removeFirstElement();
           
        }
        if (index == length-1) {
            return removeLastElement();
             
        }
        Node temp=getNodeAtIndex(index);
        temp.next.prev=temp.prev;
        temp.prev.next=temp.next;
        temp.next=null;
        temp.prev=null;
        length--;
        return temp;
        
       

    }

}
