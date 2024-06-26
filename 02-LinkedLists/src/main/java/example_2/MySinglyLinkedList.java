package example_2;

import java.util.NoSuchElementException;

public class MySinglyLinkedList {

    Node head;
    Node tail;
    int size;

    public MySinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    boolean isEmpty(){
        return head==null;
    }

    //adds element into last position in the linked list
    void addToEndOfLinkedList(int data){
        //create a new node with data value
        Node node=new Node(data);
        //check if empty
        if (isEmpty()){
            head=tail=node;
        }else {
            tail.next=node;
            tail=node;
        }
        size++;
    }
    void printNodes(){
      Node current=head;
      while (current!=null){
          if (current.next==null){
              System.out.print(current.value+" => null");
          }else {
              System.out.print(current.value + " =>");
          }
          current=current.next;
      }
    };

    //deletes first item with the value
    void deleteNode(int value){

        if (isEmpty()) System.out.println("No values with the value send!!!");

        //first one
        Node current=head;
        Node prev=head;
        while (current!=null){

            if (current.value==value){
                if (current==head){
                    head=current.next;
                    current.next=null;
                }else if (current==tail){
                    tail=prev;
                    prev.next=null;
                }else {
                    prev.next=current.next;
                    current.next=null;
                }
                size--;

            }
            prev=current;
            current=current.next;

        }
        //last one
        //middle
    }




    int indexOf(int value){

        int pos=0;
        Node current=head;

        if(isEmpty()) return -1;

        while (current!=null){

            if (current.value==value) return pos;

            pos++;
            current=current.next;

        }
        return -1;
    }


   public int getKthFromLast(int k){
        Node ptr1=head;
        Node ptr2=head;

       for (int i = 0; i <k-1; i++) {

           ptr2=ptr2.next;

           if (ptr2==null) return -1;
           
       }

       while(ptr2.next!=null){

           ptr1=ptr1.next;
           ptr2=ptr2.next;


       }

        return ptr1.value;
    }


    public void removeKthFromLast(int k){
        Node prevDelete=null;
        Node ptr1=head;
        Node ptr2=head;

        for (int i = 0; i <k-1; i++) {

            ptr2=ptr2.next;

            if (ptr2==null) System.out.println("No such value");;

        }

        while(ptr2.next!=null){
            prevDelete=ptr1;
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }

        if(ptr1==head){
            head=ptr1.next;
            ptr1.next=null;
            size--;
        }else {
            prevDelete.next=ptr1.next;
            ptr1.next=null;
            size--;
        }


    }


    void removeDuplicatesFromLinkedList(){

        Node current=head;
        while(current!=null){
            Node nextDistinctNode=current.next;
            while (nextDistinctNode!=null&&nextDistinctNode.value== current.value){
                nextDistinctNode=nextDistinctNode.next;
            }
            current.next=nextDistinctNode;
            current=nextDistinctNode;
        }
    }

    void reverse(){

        if(isEmpty()) return;

        Node previous=head;
        Node current=head.next;

        while(current!=null){
            Node nextNode=current.next;
            current.next=previous;
            previous=current;
            current=nextNode;
        }
        tail=head;
        tail.next=null;
        head=previous;


    }

}
