public class Main {
    public static int linearSearch(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void  main (String[] args) {
        int[] arr = {4, 2, 2, 6, 3, 3, 1, 6, 5, 2, 3};
        int target = 6;
        int index = linearSearch(arr, target);

        if(index != -1) {
            System.out.println("Target " + target + " found at index: " + index);
        } else {
            System.out.println("Target " + target + " not found in the array");
        }
    }
}
