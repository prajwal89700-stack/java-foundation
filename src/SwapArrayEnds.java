public class SwapArrayEnds {
    public static void main(String[] args){
        int[] arr = {10, 20, 30};
        System.out.println("Before: " + arr[0] + ", " + arr[1] + ", " + arr[2]);
        int temp = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;
        System.out.println("After: " + arr[0] + ", " + arr[1] + ", " + arr[2]);
    }
}
