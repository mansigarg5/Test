package Collections;
import java.util.*;

public class DecreaseFreq {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);list.add(2);list.add(4);list.add(3);list.add(4);
        list.add(4);list.add(3);list.add(3);list.add(2);list.add(1);
        Set<Integer> set = new LinkedHashSet<>();
        for(int i=0;i<list.size();i++){
            set.add(list.get(i));
        }
        Map<Integer,Integer> map = new LinkedHashMap<>();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            int c = (int)iterator.next();
            map.put(c,Collections.frequency(list, c));
        }
        System.out.println(entriesSortedByValues(map));
    }
    static <K,V extends Comparable<? super V>>
    List<Map.Entry<K, V>> entriesSortedByValues(Map<K,V> map) {

        List<Map.Entry<K,V>> sortedEntries = new ArrayList<Map.Entry<K,V>>(map.entrySet());

        Collections.sort(sortedEntries,
                new Comparator<Map.Entry<K,V>>() {
                    @Override
                    public int compare(Map.Entry<K,V> e1, Map.Entry<K,V> e2) {
                        return e2.getValue().compareTo(e1.getValue());
                    }
                }
        );
        return sortedEntries;
    }
}
