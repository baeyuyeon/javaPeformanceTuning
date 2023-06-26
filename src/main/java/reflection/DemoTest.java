package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class DemoTest {

    public static void main(String[] args) {
        DemoClass dc = new DemoClass();

        DemoTest dt = new DemoTest();
        dt.getClassInfos(dc);
    }

    public void getClassInfos(Object clazz) {
        Class demoClass = clazz.getClass();
        getClassInfo(demoClass);
        System.out.println("------------------------------");
        getFiledInfo(demoClass);
        System.out.println("------------------------------");
        getMethodInfo(demoClass);
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

    public void getFiledInfo(Class demoClass) {
        Field[] filed1 = demoClass.getDeclaredFields();
        Field[] field2 = demoClass.getFields();

        for (Field field : filed1) {
            String fieldName = field.getName();
            int modifier = field.getModifiers();
            String modifierStr = Modifier.toString(modifier);
            String type = field.getType().getSimpleName();
            System.out.println("fieldName = " + fieldName);
            System.out.println("modifierStr = " + modifierStr);
            System.out.println("type = " + type);
        }
    }

    private void getMethodInfo(Class demoClass) {
        Method[] method1 = demoClass.getDeclaredMethods();
        Method[] method2 = demoClass.getMethods();
        for (Method met1 : method1) {
            String methodNAme = met1.getName();
            int modifier = met1.getModifiers();
            String modifierStr = Modifier.toString(modifier);
            String returnType = met1.getReturnType().getSimpleName();

            Class params[] = met1.getParameterTypes();
            StringBuilder paramStr = new StringBuilder();
            int paramLen = params.length;
            if( paramLen != 0 ){
                paramStr.append(params[0].getSimpleName()).append(" arg");
                for(int i=1; i<paramLen; i++){
                    paramStr.append(",").append(params[i].getName()).append(" arg").append(i);
                }
            }

            //method exception info
            Class exceptions[] = met1.getExceptionTypes();
            StringBuilder exceptionStr = new StringBuilder();
            int exceptionLen = exceptions.length;
            if( exceptionLen != 0 ){
                exceptionStr.append("throws").append(exceptions[0].getSimpleName());
                for(int i=1; i<exceptionLen; i++){
                    exceptionStr.append(",").append(exceptions[i].getSimpleName());
                }
            }

            System.out.format("%s %s %s(%s) %s\n", modifierStr, returnType,
                    methodNAme, paramStr, exceptionStr);
        }

    }

}
