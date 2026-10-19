public class ReverseArray {
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40};
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left = left + 1;//left++
            right = right -1;// right--
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}