package level2.hw3;

import java.util.*;

public class CollectionHW3 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("hello","project","business","sky","project","business",
                "clouds","project","sky","noise","project","hello","sky"));
        HashSet<String> hashSet = new HashSet<>(list);
        System.out.println(hashSet);
        HashSet<String> printed = new HashSet<>();//Как посчитать количество повторений ума не хватило, нашел код в инете.
        for (String s : list) {
            if (printed.add(s))
                System.out.println("element: " + s + ", count: " + Collections.frequency(list, s));
        }

        Phone Frost = new Phone();
        Frost.setName("Frost");
        Frost.setNumber("222222");

        Phone Smit = new Phone();
        Smit.setName("Smit");
        Smit.setNumber("333333");

        Phone Tor = new Phone();
        Tor.setName("Tor");
        Tor.setNumber("444455");


        TelephoneDirectory phoneBook = new TelephoneDirectory();
        phoneBook.add(Frost);
        phoneBook.add(Smit);
        phoneBook.add(Tor);

        System.out.println(phoneBook);
    }
}
