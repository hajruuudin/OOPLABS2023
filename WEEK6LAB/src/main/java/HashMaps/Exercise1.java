package HashMaps;

import java.util.HashMap;
import java.util.Map;

public class Exercise1 {
    public static void main(String[] args){
        Map<String, String> names = new HashMap<String, String>();

        names.put("matti", "mage");
        names.put("mikael", "mixu");
        names.put("arto", "arppa");

        System.out.println(names.get("mikael"));
    }
}
