public class StringImmutabilityTrace {
    public static void main(String[] args){
        String name = "prajwal";
        name.toUpperCase();
        System.out.println("Line 1: " + name);

        name = name.toUpperCase();
        System.out.println("Line 2: " + name);
    }
}
