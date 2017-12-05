package lofm.examples;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public void showExample() {
        Map<Integer,String> map = new HashMap<>();
        //Adding elements to map
        map.put(1, "Omar");
        map.put(5, "Carlos");
        map.put(2, "Raul");
        map.put(6, "Roque");
        map.put(7, "Gio");
        map.put(9, "Cristian");
        map.put(null, "John Doe");
        map.put(11, null);
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }

}
