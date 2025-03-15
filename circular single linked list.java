public class Main {
  
    static  class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void  main(String [] args) {
      Node firstnode = new Node(2);
      Node secondnode = new Node(3);
      Node thirdnode = new Node(12);
      Node fourthnode = new Node (20);

      Node currentNode = firstnode;
      Node lastnode = fourthnode;

      System.out.print( currentNode.data + " ->");
      currentNode = currentNode.next;

      while(currentNode != lastnode){
        system.out.print(currentNode.data)
        currentNode = currentNode.next;

      }

    }

}