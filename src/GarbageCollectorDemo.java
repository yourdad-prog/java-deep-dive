public class GarbageCollectorDemo {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("i am thanos");
        System.out.println(sb);

        sb = null; // String builder has no reference that pointing it -> eligible for GC

        // many object creation might force minor GC ot run
        for(int i = 0; i<1_000_000 ; i++){
            String temp = "bot"+i; // each object becomes garbage instantly
        }
    }
}
