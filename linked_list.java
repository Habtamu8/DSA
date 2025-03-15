public class main{
    static class Node {
        int data;
        Node next;
    Node(int data){
        this.data = data;
        this.next = null;
      }
    }
public static  void main(String[] args){
   Node firstnode = new Node(4);
   Node secondnode = new Node(2);
   Node thirdnode = new Node(3);
   Node fourthnode = new Node(1);

   firstnode.next = secondnode;
   secondnode.next = thirdnode;
   thirdnode.next = fourthnode;

   Node currentNode =  firstnode;
   while (currentNode != null) {
    System.out.print(currentNode.data + "->" );
    currentNode.next = currentNode;
    
   }
   

}

}