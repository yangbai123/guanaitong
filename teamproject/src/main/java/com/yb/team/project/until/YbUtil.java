package com.yb.team.project.until;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

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
    //判读输入的是否为邮箱
    public static boolean isEmailLegal(String str){
        String regExp = "\\w+@[a-zA-Z0-9]+(\\.[a-zA-Z]+){1,3}";
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(str);
        return m.matches();
    }
    //判读输入的是否为手机号
    public static boolean isPhoneLegal(String str){
        String regExp = "^((13[0-9])|(15[^4])|(18[0,2,3,5-9])|(17[0-8])|(147))\\d{8}$";
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(str);
        return m.matches();
    }
}
