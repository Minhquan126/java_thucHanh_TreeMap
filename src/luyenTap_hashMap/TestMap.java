package luyenTap_hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashmap = new HashMap<>();
        hashmap.put("quan",33);
        hashmap.put("tuan anh",23);
        hashmap.put("ngan",20);
        hashmap.put("men",23);
        System.out.println("Display entries in HashMap");
        System.out.println(hashmap + "\n");
Map<String,Integer> treemap = new TreeMap<>(hashmap);
        System.out.println(treemap);
    }
}
