public class Main {
    static class Node{
      int data;
      Node next;
  
      Node(int data){
          this.data = data;
          this.next = null;
        }
      } 
  
      public static void traversenode(Node head){
          Node currentNode = head;
          while (currentNode != null) {
              System.out.print(currentNode.data + " ->");
              currentNode = currentNode.next;          
          }
          System.out.println("null");    
      }
      public static Node deleteNode(Node head , Node nodeTobeDeleted){
       if(head == nodeTobeDeleted){
          return head.next;
       }
       Node currentNode = head;
       while (currentNode.next != null && currentNode.next != nodeTobeDeleted.next) {
          System.out.print(currentNode.data + " ->");
          currentNode= currentNode.next;
       }
       System.out.println("null");   
       
       if (currentNode.next==null) {
          return head;   
       }
       currentNode = currentNode.next.next;
       return head;
      }
    public static void main(String [] args){
      Node firstNode = new Node(3);
      Node secondnode =new Node(4);
      Node thirdnode =new  Node (5);
      Node fourthnode = new Node(12);
  
      firstNode.next = secondnode;
      secondnode.next = thirdnode;
      thirdnode.next = fourthnode;
  
      System.out.print("Before deleteion : " );
      traversenode(firstNode);
  
      System.out.print("After deletion : ");
      deleteNode(firstNode, fourthnode);
  
     }
  
    }