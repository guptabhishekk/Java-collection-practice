package MAP;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Abhi");
        map.put(2,"Bob");
        map.put(3,"Jack");
        map.put(4,"Rob");
        map.put(5,"Sam");

        System.out.println("Map is " +map);

        System.out.println("Size of Map is " +map.size());
        System.out.println("Keys of Map is " +map.keySet());
        System.out.println("Values of Map is " +map.values());
        System.out.println("Keys of Map is " +map.keySet());
        System.out.println("Users with the id --> " + map.get(1));

        System.out.println("========== All users ==========");

        for(Map.Entry<Integer,String > entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
