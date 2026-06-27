import java.util.*;

public class CollectionsDemo {
    public static void main(String arg[]){

        List<String> arr = Arrays.asList("yoo","zoo","apple","banana","apple","orange");

        Set<String> Hash = new HashSet<>(arr);
        Set<String> linked = new LinkedHashSet<>(arr);
        Set<String> tree = new TreeSet<>(arr);


        //see the patterns
        System.out.println(Hash);
        System.out.println(linked);
        System.out.println(tree);

        List<String> list = new ArrayList<>(Arrays.asList("a", "remove me", "c","d"));

        try{
            for(String s : list){
                if(s.equals("remove me")){
                    list.remove(s);
                }
            }
        }catch (ConcurrentModificationException e){
            System.out.println("excpetion occured");
        }


        // The correct way — removeIf
        list.removeIf(s -> s.equals("remove me"));
        System.out.println("After safe removeIf: " + list);
    }
}
