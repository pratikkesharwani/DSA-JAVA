package datastructures.linkedlist;

public class LinkedList {
    Node head;
    Node tail;
    int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            // next = null;

        }
    }

    LinkedList(int value) {
        Node n1 = new Node(value);
        head = n1;
        tail = n1;
        length = 1;
    }

    public void printList() {

        Node temp;
        temp = head;
        if (temp == null)
            System.out.println("Linked list is empty");
        else {
            while (temp != null) {
                System.out.println(temp.value);
                temp = temp.next;
            }
        }

    }

    public void append(int value) {
        Node n2 = new Node(value);
        if (head == null) {
            head = n2;
            tail = n2;
        } else {
            tail.next = n2;
            tail = n2;

        }
        length++;

    }

    public void prepend(int value) {
        Node n3 = new Node(value);
        n3.next = head;
        head = n3;
        length++;

    }

    public void getLength() {
        System.out.println("Linked List Length : " + length);
    }

    public void insert(int pos, int value) {

        Node temp = head;
        for (int i = 0; i < pos; i++) {
            temp = temp.next;
        }
        Node n4 = new Node(value);
        n4.next = temp.next;
        temp.next = n4;
        length++;

    }

    public void deleteFirst() {
        Node temp = head;
        head = temp.next;
        temp = head;
        length--;

    }

    public void deleteLast() {
        Node temp = head;
        Node pre = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
            
        }
        //System.out.println("pre value "+pre.value);
        pre.next = null;
        tail=pre;
        length--;

    }

    public void deleteMid(int pos){
        Node temp=head;
        for(int i=0;i<pos-1;i++){
            temp=temp.next;
            
        }
        //System.out.println("temp value: "+temp.value);
        temp.next=temp.next.next;
        length--;

    }
}