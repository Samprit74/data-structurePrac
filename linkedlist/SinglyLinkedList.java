import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SinglyLinkedList {
  private Node head;
  private int size = 0;

  private static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  SinglyLinkedList() {
    head = null;
  }

  // insert at end
  public void insert(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      size++;
      return;
    }
    Node temp = head;
    while (temp.next != null)
      temp = temp.next;
    temp.next = newNode;
    size++;
  }

  // traverse
  public void show() {
    if (head == null) {
      System.out.println("[<>]");
      return;
    }
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "->:");
      temp = temp.next;
    }
    System.out.println();
  }

  // delete at end
  public void delete() {
    if (head == null)
      return;
    if (head.next == null) {
      head = null;
      size--;
      return;

    }
    Node temp = head;
    while (temp.next.next != null) {
      temp = temp.next;
    }
    temp.next = null;
    size--;
  }

  // sort
  public void sort() {
    if (head == null || head.next == null)
      return;
    List<Integer> list = new ArrayList<>();
    Node temp = head;
    while (temp != null) {
      list.add(temp.data);
      temp = temp.next;
    }
    Collections.sort(list);
    temp = head;
    int i = 0;
    while (temp != null && i < size) {
      temp.data = list.get(i++);
      temp = temp.next;
    }

  }

  // delete from front
  public void deleteFirst() {
    if (head == null) {
      return;
    }
    head = head.next;
    size--;
    return;
  }

  // insert first
  public void insertFirst(int data) {
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
    size++;

  }

  // return current size of linked list
  public int size() {
    return size;
  }

  public static void main(String ar[]) {
    Scanner sc = new Scanner(System.in);
    SinglyLinkedList list = new SinglyLinkedList();

    int n = sc.nextInt();
    while (n-- > 0) {
      list.insert(sc.nextInt());
    }
    list.show();
    System.out.println("current size is :-->" + list.size());
    list.delete();
    list.show();
    System.out.println("current size is :-->" + list.size());
    list.delete();
    System.out.println("current size is :-->" + list.size());
    list.delete();
    list.show();
    System.out.println("current size is :-->" + list.size());

  }
}
