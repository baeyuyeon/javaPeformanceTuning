package reflection;

public class DemoTest {

    public static void main(String[] args) {
        DemoClass dc = new DemoClass();

        DemoTest dt = new DemoTest();
        dt.getClassInfos(dc);
    }

    public void getClassInfos(Object clazz) {
        Class demoClass = clazz.getClass();
        getClassInfo(demoClass);
    }

    public void getClassInfo(Class demoClass) {
        String className = demoClass.getName();
        System.out.println("className = " + className);
        String classCanonicalName = demoClass.getCanonicalName();
        System.out.println("classCanonicalName = " + classCanonicalName);
        String classSimpleName = demoClass.getSimpleName();
        System.out.println("classSimpleName = " + classSimpleName);
        String packageName = demoClass.getPackageName();
        System.out.println("packageName = " + packageName);
        String toString = demoClass.toString();
        System.out.println("toString = " + toString);
    }

}
