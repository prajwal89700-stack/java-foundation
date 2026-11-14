public class JvmInternalsTrace {
    public static void main(String[] args){
        System.out.println("App ClassLoader: " + JvmInternalsTrace.class.getClassLoader());
        System.out.println("String ClassLoader: " + String.class.getClassLoader());

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Initial Free Heap (MB): " + (runtime.freeMemory() / (1024 * 1024)));

        for( int i=0; i< 100_000; i++) {
            String temp = new String("TX-" + i);
        }
        System.out.println("FreeHeap before GC (MB): " + (runtime.freeMemory() / (1024 * 1024)));
        System.gc();
        System.out.println("Free Heap after GC (MB): " + (runtime.freeMemory() / (1024 * 1024)));
    }
}
