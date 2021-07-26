package com.neosoft.basic;

public class DoublyLinkedList {
	
	class Node{  
        int item;  
        Node prev;  
        Node next;  
   
        public Node(int item) {  
            this.item = item;  
        }  
    }  
    
  
    Node head, tail = null;  
   

    public void addNode(int item) {  
 
        Node newNode = new Node(item);  
 
        
        if(head == null) {  
            head = tail = newNode;  
     
            head.prev = null;  
  
            tail.next = null;  
        }  
        else 
        {  
            
            tail.next = newNode;  
      
            newNode.prev = tail;  
             
            tail = newNode;  
          
            tail.next = null;  
        }  
    }  
   
 
    public void printNodes() {  
       
        Node current = head;  
        if(head == null) {  
            System.out.println("List is Empty");  
            return;  
        }  
        System.out.println("Doubly list: ");  
        while(current != null) {  
          
            System.out.print(current.item + " ");  
            current = current.next;  
        }  
    }  

    public static void main(String[] args) {  
        
        DoublyLinkedList d = new DoublyLinkedList();  
        
        d.addNode(10);  
        d.addNode(20);  
        d.addNode(30);  
        d.addNode(40);  
        d.printNodes();  
    }  

}
