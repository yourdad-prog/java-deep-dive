public class StringHeapOrPool {
    public static void main(String args[]) {
        String x = "java";
        String y = "ja" + "va";       // both parts are literals, joined at compile time
        String z = "ja";
        String w = z + "va";          // one part is a variable, joined at runtime

        System.out.println(x == y);   // it would return true
        System.out.println(x == w);     //it returns false

        // when compiler can see the the value in the code right there that concatenation happens at run time and java put that in pool area
        //when there is a variable + constant compiler wont concate it at compile time and wait for the code to run and that concatenation happens at runtime and java by default create a new object for that
        // to store a value in pool even though java created a new object you can use .intern() method
    }
}
