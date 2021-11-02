package level2.hw3;

import java.util.*;

public class CollectionHW3 {

    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>(Arrays.asList("hello","project","business","sky","project","business",
//                "clouds","project","sky","noise","project","hello","sky"));
//        HashSet<String> hashSet = new HashSet<>(list);
//        System.out.println(hashSet);
//        HashSet<String> printed = new HashSet<>();//Как посчитать количество повторений ума не хватило, нашел код в инете.
//        for (String s : list) {
//            if (printed.add(s))
//                System.out.println("element: " + s + ", count: " + Collections.frequency(list, s));
//        }

        HashMap<String, Integer> humansNumbersHashMap = new HashMap<>();
        humansNumbersHashMap.put("Сазонов", 445533);
        humansNumbersHashMap.put("Ковалев", 553322);
        humansNumbersHashMap.put("Сазонов", 444444);
        System.out.println("Номер телефона:  " + humansNumbersHashMap.get("Ковалев"));
        System.out.println(humansNumbersHashMap);




    }
}
