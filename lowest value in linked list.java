public class Main {
    static class Node{
      int data;
      Node next;
  
      Node(int data){
          this.data = data;
          this.next = null;
            }
        }
  
    public static int lowestvalue(Node head){
      int minvalue = head.data;
  
      Node currentNode = head.next;
      while ( currentNode != null) {
            if(currentNode.data < minvalue){
              minvalue = currentNode.data;
            }
            currentNode = currentNode.next;
          
      }
      return minvalue;
  
    }
    public static void main(String [] args){
      Node firstNode = new Node(3);
      Node secondnode =new Node(4);
      Node thirdnode =new  Node (5);
      Node fourthnode = new Node(1);
  
      firstNode.next = secondnode;
      secondnode.next = thirdnode;
      thirdnode.next = fourthnode;
      
      System.out.println("The loweset value is " + lowestvalue(firstNode));
  
    }
  }
