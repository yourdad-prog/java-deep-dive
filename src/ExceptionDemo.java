public class ExceptionDemo {
    public static void main(String arg[]){
        System.out.println("trickyReturn returnss  " + trickyReturn()); // returns finally block's return

        validAge(2);//valid


        try{
            validAge(-1);//not valid
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("always returns");
        }
    }

    static int trickyReturn(){
        try {
            return 1;//it wont win....
        }
        finally {
            return 2;   //.....return statement of finally overrides it and returns 2
        }
    }

    static void validAge(int age ){
        if(age < 0){
            throw new IllegalArgumentException("Age cant be negative " + age);// exception thorws
        }
        System.out.println("valid age: "+age );
    }
}
