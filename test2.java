// Import TreeMap, replacement for the now obsolete Dictionary
import java.util.TreeMap;

// Class used for testing multiple a's
public class test2 {

    // Everything runs in main
    public static void main(String[] args) {

        // Creates a new TreeMap
        // TreeMaps are ordered unlike HashMaps but require more system resources
        TreeMap<Integer, String> hm = new TreeMap<Integer, String>();
        
        // Blank line for readability
        System.out.println("");

        // Adds a new key-value pair to the TreeMap using the format (i, "a"*i)
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
    
        // Stores the value at the largest key in the TreeMap so that it can be used later before the value in key 1 overwrites it
        String hm1 =  hm.get(hm.size());
        
        // For range loop that goes from 1 to the size of the TreeMap 
        for (int i = 1; i <= hm.size(); i++) {
            
            // If the i is 1, it moves the value at key 1 to key i and moves the value at key 2 to key i+1
            if (i == 1) {
                hm.put(hm.size(), hm.get(1));
                hm.put(i, hm.get(i + 1));
            }

            // Moves the value at key 10 to key 9 using the cached variable stored earlier
            else if (i == hm.size()) {
                hm.put(i - 1, hm1);
            }

            // For all other values, it moves the value at key i+1 to key i
            else {
                hm.put(i, hm.get(i + 1));
            }
        }
        // Prints the values in the TreeMap
        for (int key : hm.keySet()) {
            System.out.println(hm.get(key));
        }
    }
}
