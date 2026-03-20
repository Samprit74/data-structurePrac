package datastructure.linkedlist;

public class SinglyLinkedList {
    private Node head;
    private int size=0;
    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
//insert at end
    public void insert(int data){
       Node newNode=new Node(data);
       if (head == null){
          head=newNode;
          size++;
          return;
       }
       Node temp=head;
       while(temp.next!= null) 
            temp=temp.next;
       temp.next=newNode;    
       size++;
      }
//traverse
    public void show(){
      if(head == null){
      System.out.println("[<>]");
        return;
      }
      Node temp =head;
      while(temp != null){
        System.out.print(temp.data+"->:");
        temp = temp.next; 
      }
      System.out.println();
    }

//delete at end
public void delete(){
  if (head == null) return;
  if(head.next == null){
    head=null;
    size--;
    return;
    
  }
  Node temp = head;
  while(temp.next.next != null){
    temp=temp.next;
  }
  temp.next=null;
  size--;
}
//return current size of linked list
public int size(){
    return size;
}

}
