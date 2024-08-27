import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Filtering {
    public static void main(String[] args) {
        Map firstMap = new HashMap();
        List MapKey = new ArrayList<>();
        MapKey.add(1);
        MapKey.add(2);
        MapKey.add(4);
        MapKey.add(3);
        firstMap.put(3, "c");
        firstMap.put(1, "a");
        filtering(firstMap, MapKey);
    }

    public static <K, V> void filtering(Map<K, V> firstParam, List<K> secondParam) {
        for (int i = 0; i < secondParam.size(); i++) {
            Map<K, V> newMap = new HashMap<>();
            newMap.put((K) secondParam.get(i), (V) firstParam.get(secondParam.get(i)));
            if (!newMap.containsValue(null))
                System.out.println(newMap);
        }
    }
}
