import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        Map<Bot, Integer> map = new HashMap<>();
        Bot b = new Bot();

        map.put(b,1);
        System.out.println(map.get(b));
        b.setKey(2);
        System.out.println(map.get(b));


    }
}

class Bot{
    int key;
    String val;

    public Bot(){
        this.key = 1;
        this.val = "bot";
    }

    @Override
    public int hashCode() {
        return Objects.hash(key,val);
    }

    public void setKey(int key){
        this.key = key;
    }
}
