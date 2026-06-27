import java.util.Arrays;

public class MyArrayList {
    public void main (String arg[]){
        ListArray arr = new ListArray();
        for(int i = 1; i <6; i++){
            arr.add(i);
        }


        arr.showData();
        arr.remove(2);
        arr.showData();
    }

}
class ListArray{
    static int pointer;
    int [] arr;

    public ListArray(){
        this.arr = new int[8];
        this.pointer = 0;
    }


    public void getSize(){
        System.out.println(arr.length);
    }

    public void showData(){
        for(int i = 0; i<pointer; i++){
            System.out.println(arr[i]);
        }
    }
    public void add(int a){
        if(pointer == arr.length){
            grow();
        }
        arr[pointer] = a;
        pointer ++;
    }

    private void grow(){
        int newcap = arr.length *2;

        arr = Arrays.copyOf(arr, newcap);
    }

    public void remove(int index){
        if(index < 0 || index >= pointer){
            throw new IndexOutOfBoundsException();
        }

        for(int i = index; i<pointer-1; i++){
            arr[i] = arr[i+1];
        }
        arr[pointer - 1] = 0;
        pointer--;



    }
}