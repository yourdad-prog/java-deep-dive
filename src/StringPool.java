public class StringPool {
    public static void main(String args[]){
        String a = "hello";
        String b = "hello";
        // a and b point to the SAME object in the String Pool
        System.out.println(a == b);  // true — same reference!


        String c = new String("hello");
        System.out.println(a == c);        // false — new String() forces a NEW heap object, bypassing the pool
        System.out.println(a.equals(c));   // true — same characters


        // new String
        String x = "hello";
        String y = "hello";
        String z = new String("hello");

        System.out.println("x == y  : " + (x == y));        // true  — same pooled object
        System.out.println("x == z  : " + (x == z));        // false — c is a separate heap object
        System.out.println("a.equals(c) : " + a.equals(z)); // true  — same content
    }
}
