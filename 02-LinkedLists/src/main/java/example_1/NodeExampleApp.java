package example_1;

import example_1.MyNode;

public class NodeExampleApp {

    public static void main(String[] args) {

        MyNode nodeA=new MyNode("Node A");
        MyNode nodeB=new MyNode("Node B");
        MyNode nodeC=new MyNode("Node C");

        System.out.println(nodeA);

        nodeA.next=nodeB;
        nodeB.next=nodeC;

        System.out.println(nodeA.name+" "+nodeA.next.name+" "+nodeB.next.name);

        MyNode current=nodeA;

        while (current!=null){
            System.out.println(current.name);
            current=current.next;
        }


    }
}
