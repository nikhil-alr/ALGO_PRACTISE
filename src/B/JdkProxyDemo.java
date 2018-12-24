package B;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
public class JdkProxyDemo {
    interface If {
        void originalMethoss(String s);
        void originalMethossa(String s);
    }
    static class Original implements If {


        @Override
        public void originalMethoss(String s) {
            System.out.println(s);
        }

        @Override
        public void originalMethossa(String s) {
            System.out.println("KIKI");
        }
    }
    static class Handler implements InvocationHandler {
        private final If original;
        public Handler(If original) {
            this.original = original;
        }
        public Object invoke(Object proxy, Method method, Object[] args)
                throws IllegalAccessException, IllegalArgumentException,
                InvocationTargetException {

            System.out.println("BEFORE");
            //method.invoke(original, args);
            System.out.println("AFTER");
            return null;
        }
    }
    public static void main(String[] args){
        Original original = new Original();
        Handler handler = new Handler(original);
        If f = (If) Proxy.newProxyInstance(If.class.getClassLoader(),
                new Class[] { If.class },
                handler);
        f.originalMethossa("Hallo");
    }
}