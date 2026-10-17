public class WindowSeatCounter {
    public static void main(String[] args){
        int windowSeatCount = 0;
        int evenSeatSum = 0;

        for ( int i =1; i<=10; i++){
            if(i%2==0){
                windowSeatCount = windowSeatCount + 1;
                System.out.println("Even seat: " + i);
                evenSeatSum = evenSeatSum + i;

            }
        }
        int average = evenSeatSum/windowSeatCount;
        System.out.println("Total window seats: " + windowSeatCount);
        System.out.println("Sum of even seat numbers: " +evenSeatSum);
        System.out.println("Average even seats number: " + average);
    }
}
