package info.tjohander.array;

public class LinkedList {

  class Node {

    Node next;
    int data;

    public Node(int data) {
      this.data = data;
    }

    public void append(int data) {
      Node current = this;
      while (current.next != null) {
        current = current.next;
      }
      current.next = new Node(data);
    }
  }

  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    Node node = linkedList.new Node(7);
    System.out.println(node.data);
    System.out.println(node.next);

  }
}
