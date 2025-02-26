 public class Main{
  public static int Binarysearch(int arry [], int targetvalue){
      int left = 0;
      int right = arry.length-1;
       while(left <=right){
        int mid = (left+right)/2;

        if (arry[mid]== targetvalue) {
           return mid;            
        }

        if(arry[mid]< targetvalue){
            left = mid +1;

        }
       else {
        right = mid -1;
       }
       }
       return -1;


  }
  public static void main(String[] args){
    int[] Myarray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
    int  target = 15;
    int result = Binarysearch(Myarray, target);

    if (result != -1){
        System.out.println("The value" + target + "is found at index = " + result);
    }
    else {
        System.out.println("The value Not found");

    }
    
     


  }

 }