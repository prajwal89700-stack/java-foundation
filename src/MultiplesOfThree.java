public class MultiplesOfThree {
    public static void main(String[] args){
        int count = 0;
        int sum = 0;
        for (int i = 1; i<=15; i++){
            if( i%3==0){
                System.out.println("Multiple of 3: " + i);
                count = count + 1;
                sum = sum + i;
            }
        }
        int average = sum/count;
        System.out.println("Total count: " + count);
        System.out.println("Total sum: " + sum);
        System.out.println("Total average: " + average);
    }
}