package refleksja;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Optional;

public class Zadanie3 {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Method[] declaredMethods = Zadanie1.class.getDeclaredMethods();
/*        for (Method method : declaredMethods) {
            if(method.isAnnotationPresent(SuperMethod.class)){
                superMethodName = method.getName();
            }
        }*/
        Optional<Method> first = Arrays.asList(declaredMethods).stream()
                .filter(method -> method.isAnnotationPresent(SuperMethod.class)).findFirst();
        String superMethodName = first.map(p -> p.getName()).orElse("");
        System.out.println(superMethodName);
        Class<?> refleksjaKlasy = Zadanie1.class;
        Constructor<?> refleksjaConstruktor = refleksjaKlasy.getConstructor();
        //refleksjaConstruktor.setAccessible(true);
        Object object = refleksjaConstruktor.newInstance();
        Method m = refleksjaKlasy.getDeclaredMethod(superMethodName);
        System.out.println(m.invoke(object));
    }
}
