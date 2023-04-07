package datastructures.linkedlist;

public class Main {

    public static void main(String[] args) {

        LinkedList l1= new LinkedList(7);
        
        //l1.printList();

        l1.append(5);
        l1.append(5456);
        //
        l1.prepend(100);
        l1.prepend(103);
        l1.insert(2,34);
        l1.deleteFirst();
        l1.deleteLast();
        l1.deleteMid(2);
        l1.printList();
        
        l1.getLength();


        

    }
    
}



