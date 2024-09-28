import java.util.*;
public class Hash_Map {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>(); //Creation HashMap< keyDataType , valueDataType> = new HashMap<>();

        //Insertion
        map.put("India",1);
        map.put("China", 2);
        map.put("USA", 2);

        System.out.println(map);

        map.put("China",4); //.put() can be used to add a key-value pair or update the value to an existing key.

        System.out.println(map); 

        // HashMaps are unordered datasets.

    }
}
