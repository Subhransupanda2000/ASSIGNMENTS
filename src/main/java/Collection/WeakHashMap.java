package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class WeakHashMap {


    public static void main(String[] args) {
        Map<Integer, String> weakhashmap = new HashMap<>();
        weakhashmap.put(1, "ind");
        weakhashmap.put(2, "aus");
        weakhashmap.put(3, "eng");
        Integer key = null;
        String valuee = "exampleValue";


        weakhashmap.put(key, valuee);


        System.out.println(weakhashmap.size());


        if (weakhashmap.containsKey(2)) {
            String value = weakhashmap.get(2);
            System.out.println("Value for key 3" + " " + value);
        } else {
            System.out.println(" not found in the HashMap.");
        }
        weakhashmap.remove(1);
        Iterator<Integer> keyIterator = weakhashmap.keySet().iterator();
        while (keyIterator.hasNext()) {
            System.out.println(keyIterator.next());
        }


    }
}
