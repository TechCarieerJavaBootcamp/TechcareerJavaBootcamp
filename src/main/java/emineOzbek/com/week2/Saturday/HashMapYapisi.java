package emineOzbek.com.week2.Saturday;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapYapisi {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"Can");
        map.put(2, "Beliz");
        map.put(2, "Cavit");

        map.putIfAbsent(3, null);

        System.out.println(map.size());

        String value = map.get(1);
        System.out.println(value);

        for(Integer key : map.keySet()){
            System.out.println("key: " + key + " Value: "+ map.get(key));
        }


        for(Map.Entry<Integer, String> entry : map.entrySet()){
            Integer key = entry.getKey();
            String value2 = entry.getValue();
            System.out.println("key: " + key + " Value: "+ value2);

        }

        List<String> femaleNames = List.of("Emine", "Yağmur", "Beliz", "Nisa");
        List<String> maleNames = List.of("Salih", "Can","Eren");

        Map<String, List<String>> nameMap = new HashMap<>();
        nameMap.put("Kadınlar", femaleNames);
        nameMap.put("Erkekler", maleNames);

        for(Map.Entry<String, List<String>> entry : nameMap.entrySet()){
            String key = entry.getKey();
            List<String> values = entry.getValue();
            System.out.println("Cinsiyet: " + key + " Value" + values);

            for(String name : values){
                System.out.println("Cinsiyet: " + key + " Value" + name);
            }


        }







    }
}
