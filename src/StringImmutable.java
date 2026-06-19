import java.util.Locale;

public class StringImmutable {
    public static void main(String args []){
        String s = "thanos";
        s.toUpperCase(); // this creates a brand new object if you assign it a variable("THANOS")
        System.out.println(s);// this would print "thanos" since original object is untouched

        s = s.toUpperCase(); // now s is pointing to a brand new object leaving previous one,"THANOS"
        System.out.println(s);// Prints "THANOS"
    }
}
