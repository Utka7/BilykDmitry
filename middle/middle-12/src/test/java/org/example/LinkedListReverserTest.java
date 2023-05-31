package org.example;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class LinkedListReverserTest extends TestCase {

    @Test
    public void reverseLinkedList_UsualList_ReturnExpectedResult() {
        var linkedList = generateRandomLinkedList();

        var reverser = new LinkedListReverser();

        linkedList = reverser.reverseLinkedList(linkedList);

        assertReversedLinkedList(linkedList);

    }

    private Node generateRandomLinkedList() {
        var length = 5;
        var value = 1;
        Node head = null;
        Node prev = null;

        for (var i = 0; i < length; i++) {
            Node newNode = new Node();
            newNode.setValue(value++);
            newNode.setNext(null);

            if (head == null) {
                head = newNode;
            } else {
                prev.setNext(newNode);
            }

            prev = newNode;
        }

        return head;
    }

    private void assertReversedLinkedList(Node head) {
        assertEquals(5, head.getValue());
        assertEquals(4, head.getNext().getValue());
        assertEquals(3, head.getNext().getNext().getValue());
        assertEquals(2, head.getNext().getNext().getNext().getValue());
        assertEquals(1, head.getNext().getNext().getNext().getNext().getValue());
        assertNull(head.getNext().getNext().getNext().getNext().getNext());
    }
}