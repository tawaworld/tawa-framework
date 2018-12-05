package world.tawa.framework.util;

/**
 * Created by tawa on 2018/12/5
 */
public final class StringUtil {
    public static boolean isEmpty(String str){
        return str == null || str.isEmpty();
    }

    public static boolean isNotEmpty(String str){
        return str != null && !str.isEmpty();
    }
}
