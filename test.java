import java.util.*;
public class test {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer >();
        map.put("test1", 1);
        map.put("test2", 2);
        map.put("test3", 3);

        System.out.println(map.get("test3"));
        map.replace("test3", 3, 17);
        System.out.println(map.get("test3"));

        /*
        map.remove("test3");
        System.out.println(map.get("test3"));
        */

        if (map.containsKey("test3")) {
            map.replace("test3", 17, 10);
            System.out.println(map.get("test3"));
        }
        else {
            map.replace("test3", 17, 15);
            System.out.println(map.get("test3"));
        }

        map.put("test3", 3);
        System.out.println(map.get("test3"));
        for (Integer value : map.values()) {
            System.out.println(value);
        }
    }
}