package Lista;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Felipe");
        list.add("Mateus");
        list.add("Carlos");
        list.add("Lucas");
        list.add(2,"Marcos");
        list.remove("Lucas");
        list.remove(0);
        System.out.println(list.size());
        for(String x : list){
            System.out.println(x);
        }
    }
}
