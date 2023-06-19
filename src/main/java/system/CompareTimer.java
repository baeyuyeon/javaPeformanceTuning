package system;
import java.util.*;

public class CompareTimer {

    public static void main(String[] args) {
        CompareTimer timer = new CompareTimer();
        for(int i=0; i<10; i++){
            timer.checkNanoTime();
            timer.checkCurrentTimeMillis();
        }
    }

    private DummyData dummy;

    private void checkCurrentTimeMillis() {
        long startTime = System.currentTimeMillis();
        dummy = timeMakeObjects();
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("millis = " + elapsedTime);

    }

    private void checkNanoTime() {
        long startTime = System.nanoTime();
        dummy = timeMakeObjects();
        long endTime = System.nanoTime();
        double elapsedTime = (endTime - startTime)/1000000.0;
        System.out.println("nano = " + elapsedTime);

    }
    private DummyData timeMakeObjects() {
        Map<String, String> map = new HashMap<String, String>(1000000);
        List<String> list = new ArrayList<String>(1000000);
        return new DummyData(map, list);
    }



}
