package example_2;

public class LinkedListApp {

    public static void main(String[] args) {

        MySinglyLinkedList list1=new MySinglyLinkedList();

        for (int i = 0; i < 11; i++) {
            list1.addToEndOfLinkedList(i);
        }

        list1.printNodes();
        System.out.println();

        list1.removeKthFromLast(4);
        list1.printNodes();
        System.out.println();


//        System.out.println("Kth item from last is: " +list1.getKthFromLast(4));

//
//        System.out.println(list1.indexOf(4));
//        System.out.println("The size of the linked list " + list1.size);

//        list1.deleteNode(5);
//        System.out.println("After deletion");
//        list1.printNodes();
//        System.out.println();
//        System.out.println("The size of the linked list after deletion" + list1.size);

    }
}
