public  class Main {
    static class Node {
      int data;
      Node next;
  
      Node(int data){
          this.data = data;
          this.next = null;
        }
    }
  
    public static void Traversal(Node head){
      Node currentNode = head;
      while (currentNode != null) {
          System.out.print(currentNode.data + "->");
          currentNode = currentNode.next;
          
      }
      System.out.print("null");
  
  }
     public static void main(String[] args){
      Node firstNode = new Node(3);
      Node secondnode =new Node(4);
      Node thirdnode =new  Node (5);
      Node fourthnode = new Node(12);
  
      firstNode.next = secondnode;
      secondnode.next = thirdnode;
      thirdnode.next = fourthnode;
  
      Traversal(firstNode);
  
     } 
  
  }
  