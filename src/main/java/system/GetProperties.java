package system;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class GetProperties {

    public static void main(String[] args) {
        System.setProperty("JavaTuning", "Tune Lee");
        Properties prop = System.getProperties();
        Set key = prop.keySet();
        Iterator iter = key.iterator();
        while (iter.hasNext()) {
            String curKey = iter.next().toString();
            System.out.format("%s=%s\n", curKey, prop.getProperty(curKey));
        }
    }

}
