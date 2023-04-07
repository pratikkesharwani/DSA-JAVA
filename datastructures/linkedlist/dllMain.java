package datastructures.linkedlist;

public class dllMain {

    public static void main(String args[]) {
        doublyLinkedList dll1 = new doublyLinkedList(200);

        dll1.appendDLL(300);
        dll1.appendDLL(400);
        dll1.appendDLL(500);
        dll1.prependDLL(100);
        // System.out.println(dll1.removeLastElement().value);
        // System.out.println(dll1.removeLastElement().value);
        // System.out.println(dll1.removeLastElement());
        // System.out.println("removeFirstElement : "+dll1.removeFirstElement().value);
        // System.out.println("removeFirstElement : "+dll1.removeFirstElement().value);
        // System.out.println("removeFirstElement : "+dll1.removeFirstElement().value);
        // System.out.println("removeFirstElement : "+dll1.removeFirstElement());

        // dll1.getHead();
        // dll1.getTail();

        // System.out.println(dll1.getNodeAtIndex(577));
       // dll1.insertAtIndex(3, 350);
        //dll1.setValue(5, 550);
        dll1.Remove(4);
        dll1.printList();
        dll1.getLength();
    }
}
