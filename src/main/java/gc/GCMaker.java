package gc;

import java.util.ArrayList;

public class GCMaker {

    public static void main(String[] args) throws InterruptedException {
        GCMaker maker = new GCMaker();
        for(int i=0; i<120; i++){
            maker.makeObject();
            Thread.sleep(1000);
            System.out.print(".");
        }
    }
    private void makeObject(){
        Integer[] intArr = new Integer[1024000];
        ArrayList<Integer> list = new ArrayList<>(1024000);
        for (int i = 0; i < 1024; i++) {
            intArr[i] = i;
            list.add(i);
        }
    }
}
