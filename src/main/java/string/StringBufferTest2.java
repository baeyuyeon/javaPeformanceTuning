package string;

public class StringBufferTest2 {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        //이렇게 사용해도 되고
        sb.append("ABCDE");
        sb.append("FGHIJ");
        sb.append("KLMNO");

        //이렇게 사용해도 된다.
        sb.append("ABCDE")
                .append("KLMNO")
                .append("FGHIJ");

        //이렇게는 사용하지 말자
        sb.append("ABCDE" + "=" + "FGHIJ");

        sb.insert(3, "123");
        System.out.println("sb = " + sb);


    }

}
