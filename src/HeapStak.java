public class HeapStak {
    public static void main(String args[]) {
        Change c = new Change(10,20);
        changeVal(c);
        System.out.println(c.getNum());

        int a = 10;
        int b = a;
        b = 20;
        System.out.println(a + " " + b);

    }
    public static void changeVal(Change c){
        c.setNum(200);
    }

}

class Change{
    private int num;
    private int num2;



    public Change(int num, int num2){
        this.num = num;
        this.num2 = num2;
    }

    public int getNum() {
        return num;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setNum2(int num2){
        this.num2 = num2;
    }
}
