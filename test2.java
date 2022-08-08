// Import TreeMap, replacement for the now obsolete Dictionary
import java.util.TreeMap;

// Class used for testing multiple a's
public class test2 {

    // Everything runs in main
    public static void main(String[] args) {

        // Creates a new TreeMap
        // TreeMaps are ordered unlike HashMaps but require more system resources
        TreeMap<Integer, String> hm = new TreeMap<Integer, String>();
        
        System.out.println("");

        hm.put(1, "a");
        hm.put(2, "aa");
        hm.put(3, "aaa");
        hm.put(4, "aaaa");
        hm.put(5, "aaaaa");
        hm.put(6, "aaaaaa");
        hm.put(7, "aaaaaaa");
        hm.put(8, "aaaaaaaa");
        hm.put(9, "aaaaaaaaa");
        hm.put(10, "aaaaaaaaaa");
        hm.put(11, "aaaaaaaaaaa");
    
        String hm1 = hm.get(hm.size()); 

        for (int i = 1; i <= hm.size(); i++) {
            if (i == 1) {
                hm.put(hm.size(), hm.get(1));
                hm.put(i, hm.get(i + 1));
            }
            else if (i == hm.size()) {
                hm.put(i - 1, hm1);
            }
            else {
                hm.put(i, hm.get(i + 1));
            }
        }
        for (int key : hm.keySet()) {
            System.out.println(hm.get(key));
        }
    }
}
