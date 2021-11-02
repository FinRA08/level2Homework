package level2.hw3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class TelephoneDirectory extends ArrayList<Phone>{
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Phone phone : this) {
            stringBuilder.append("----------------------------\n");
            stringBuilder.append("Name:" + phone.getName() + "\n");
            stringBuilder.append("Number:" + phone.getNumber() + "\n");
        }

        return stringBuilder.toString();
    }

}
