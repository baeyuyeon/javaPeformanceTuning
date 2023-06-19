package system;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GetEnv {

    public static void main(String[] args) {
        Map<String, String> envMap = System.getenv();
        Set<String> key = envMap.keySet();
        Iterator<String> iter = key.iterator();
        while (iter.hasNext()) {
            String curKey = iter.next().toString();
            System.out.format("%s = %s\n", curKey, envMap.get(curKey));

        }
    }

}
