public class LinkedList {
    
    // Node class to represent each element in the linked list
    static class Node {
        int data;
        Node next;
        
        // Constructor to initialize a node with data
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    // Head of the linked list
    Node head;
    
    // Method to add a new node to the end of the linked list
    public void append(int data) {
        Node newNode = new Node(data);
        
        // If the linked list is empty, make the new node as head
        if (head == null) {
            head = newNode;
            return;
        }
        
        // Traverse to the end of the linked list
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        
        // Add the new node to the end of the linked list
        current.next = newNode;
    }
    
    // Method to display the elements of the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        // Add elements to the linked list
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        
        // Display the linked list
        System.out.println("Linked List elements:");
        list.display();
    }
}
