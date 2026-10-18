public class ArrayTrace {
    public static void main(String[] args){
        int[] scores = new int[3];
        System.out.println("Default at index 0 : " + scores[0]);
        scores[0] = 85;
        scores[1] = 90;
        scores[2] = 95;
        System.out.println("Array length: " + scores.length);
        for(int i =0; i < scores.length; i++){
            System.out.println("Score at index " + i + ": " + scores[i]);
        }
        System.out.println("DONE");
    }
}
