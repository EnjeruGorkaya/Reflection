/**
 * Created by 11007122 on 13.12.2017.
 */

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/**
 * Scans object "from" for all getters. If object "to"
 * contains correspondent setter, it will invoke it
 * to set property value for "to" which equals to the property
 * of "from".
 * <p/>
 * Тип в сеттере должен быть совместим с возвращаемым значением
 * по геттеру (если нет, никакой вызов не выполнялся).
 * Совместимость означает, что тип параметра в сеттере должен
 * быть одинаковым или быть суперклассом возвращаемого типа геттера.
 * <p/>
 * The method takes care only about public methods.
 *
 * @param to   Object which properties will be set.
 * @param from Object which properties will be used to get values.
 */

public class BeanUtils {
    public static void assign(Object to, Object from) {
        // Картинка!!!
        Class classTo = to.getClass();
        Class classFrom = to.getClass();

    }



    public static boolean isGetter(Method method){
        if(!method.getName().startsWith("get"))      return false;
        if(method.getParameterTypes().length != 0)   return false;
        if(void.class.equals(method.getReturnType())) return false;
        return true;
    }

    public static boolean isSetter(Method method){
        if(!method.getName().startsWith("set")) return false;
        if(method.getParameterTypes().length != 1) return false;
        return true;
    }

    //TO DO
    public static boolean areComparableTypes (Type setter, Type getter) {
//        if (setter == getter || setter == getter.getSuperclass)
//            return true;
//        else
            return false;
    }

}

