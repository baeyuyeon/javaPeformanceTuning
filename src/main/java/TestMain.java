public class TestMain {

    public static void main(String[] args) {
        AAA.testAAA();//이거는 클래스 단위로 걸릴것이고..
        AAA a = new AAA();
        AAA b = new AAA();
        a.testAAA();
        b.testAAA();

    }
}
