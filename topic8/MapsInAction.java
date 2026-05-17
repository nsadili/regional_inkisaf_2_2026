package topic8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class MapsInAction {
    public static void main(String[] args) {

        // Map<String, Integer> ages = new HashMap<>();
        // Map<String, Integer> ages = new LinkedHashMap<>();
        // Map<String, Integer> ages = new TreeMap<>();
        Map<String, Integer> ages = new TreeMap<>(new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            };
        });

        ages.put("nuraddin", 33);
        ages.put("muraz", 24);
        ages.put("latifa", 20);
        ages.put("ravan", 19);
        ages.put("nazim", 19);
        ages.put("ayxan", 20);
        ages.put("ismayil", 20);
        ages.put("ali", 18);
        ages.put("ayxan", 19);

        System.out.println(ages);
        // for (var key : ages.keySet())
        // System.out.println(key + ": " + ages.get(key));

        // Iterator it = ages.keySet().iterator();
        // while (it.hasNext()) {
        // var key = it.next();
        // System.out.println(key + ": " + ages.get(key));
        // }

        // Iterator<Entry<String, Integer>> entryIt = ages.entrySet().iterator();
        // while (entryIt.hasNext()) {
        // Entry entry = entryIt.next();
        // System.out.println(entry.getKey() + ": " + entry.getValue());
        // }

        // TODO: sort the map based on the non-descending order of the values
    }
}
