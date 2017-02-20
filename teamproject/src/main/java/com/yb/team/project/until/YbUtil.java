package com.yb.team.project.until;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Created by Administrator on 2017/1/20.
 */
public class YbUtil {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm");
        Date sBookDate = null;
        Date eBookDate = null;
        int isOk = 0;
        try {
            sBookDate = simpleDateFormat.parse("12:30");
            eBookDate = simpleDateFormat.parse("22:00");
            Date sBookedDate = null;
            Date eBookedDate = null;
            sBookedDate = simpleDateFormat.parse("10:30");
            eBookedDate = simpleDateFormat.parse("14:00");
            if (eBookDate.after(sBookedDate) && sBookDate.before(eBookedDate)) {
                isOk = 1;
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(isOk);
    }

    //判断字符串是否为空
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0 || str.equals("") || str.matches("\\s*");
    }

    //判断字符串是否为非空
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    //判读输入的是否为邮箱
    public static boolean isEmailLegal(String str) {
        String regExp = "\\w+@[a-zA-Z0-9]+(\\.[a-zA-Z]+){1,3}";
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(str);
        return m.matches();
    }

    //判读输入的是否为手机号
    public static boolean isPhoneLegal(String str) {
        String regExp = "^((13[0-9])|(15[^4])|(18[0,2,3,5-9])|(17[0-8])|(147))\\d{8}$";
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(str);
        return m.matches();
    }

    public static String[] chars = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    //生成随机8位的授权码
    public static String generateShortUuid() {
        StringBuffer shortBuffer = new StringBuffer();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        for (int i = 0; i < 8; i++) {
            String str = uuid.substring(i * 4, i * 4 + 4);
            int x = Integer.parseInt(str, 16);
            shortBuffer.append(chars[x % 0x3E]);
        }
        return shortBuffer.toString();
    }
}
