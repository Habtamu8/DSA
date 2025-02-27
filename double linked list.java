public class Main{
    static class Node {
      int data;
      Node next;
      Node prev;
  
      Node(int data){
          this.data = data;
          this.next = null;
          this.prev = null;
      }
    }
   public static void main(String[] args){
      Node firstnode = new Node (3);
      Node secondnode = new Node (5);
      Node thirdnode = new Node (7);
      Node fourtnode = new Node (17);
  
      firstnode.next= secondnode;   
      secondnode.next = thirdnode;
      secondnode.prev = firstnode;
    
      thirdnode.next = fourtnode;
      thirdnode.prev = secondnode;
  
      
      fourtnode.prev = thirdnode;
      
      Node currentNode = firstnode;
      System.out.print("Forward:  ");
      while (currentNode != null) {     
          System.out.print(currentNode.data + " -> ");
          currentNode = currentNode.next;
       }
      System.out.println("null");
          
     Node finalNode = fourtnode;
      System.out.print("backward: ");
    
      while (finalNode != null) {           
         System.out.print(finalNode.data + "-> ");   
             finalNode = finalNode.prev;
              
           }
           System.out.print("null");
         
      }
  
      
  
    }
  
  