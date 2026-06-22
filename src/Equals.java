import java.util.Objects;

public class Equals {



    public static void main(String args[]) {
        Person p1 = new Person("bot", 18);
        Person p2 = new Person("bot", 18);

        System.out.println(p1.equals(p2));// default .equals under the hood uses "==" so gives false here
        //after overriding this it  checks the content inside and returns true if they are equal


    }
}
class Person{
    String name ;
    int age;


    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public boolean equals(Object obj) {
        //same obj
        if (this == obj) return true;
        //null of diff types of class
        if (obj== null || getClass() != obj.getClass()) return false;

        //Caste Obj to Person to compare
        Person p = (Person) obj;
        // compare the fields now
        return name.equals(p.name) && age == p.age;
    }

    // to make it purely equals both the object should that are equals should have the same hashcode for hashmap and hashset collection


    @Override
    public int hashCode() {
        return Objects.hash(name,age);// this creates hashcode not on bases of object address but the content that we put here name and age,so same object with same content would get same hashcode
    }
    //you never call this method to get hashcode manually but hashmap would calll it for you whne needed
}
