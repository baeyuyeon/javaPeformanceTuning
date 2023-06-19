package string;

public class StringBufferTest1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("ABCDE");
        StringBufferTest1 sbt = new StringBufferTest1();
        sbt.check(sb);
    }
    private void check(CharSequence cs) {
        StringBuffer sb = new StringBuffer(cs);
        System.out.println("sb.length() = " + sb.length());
    }
}
