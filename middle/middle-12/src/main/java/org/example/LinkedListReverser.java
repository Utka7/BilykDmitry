package org.example;

public class LinkedListReverser {

    public Node reverseLinkedList(Node head) {
        Node currentNode = head;
        Node nextNode;
        Node previousNode = null;

        while (currentNode != null) {
            nextNode = currentNode.getNext();
            currentNode.setNext(previousNode);
            previousNode = currentNode;
            currentNode = nextNode;
        }

        return previousNode;
    }


}
