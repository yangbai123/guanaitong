package com.yb.team.project.until;

/**
 * Created by Administrator on 2017/1/20.
 */
public class YbUtil {
    //判断字符串是否为空
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0 || str.equals("")|| str.matches("\\s*");
    }
    //判断字符串是否为非空
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }
}
