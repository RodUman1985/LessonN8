package com.step.dubinin;

import java.math.BigDecimal;

public class Aucsilia {

    public static String getUserScrol(String[] arr) {
        StringBuffer sb = new StringBuffer("<ol>");
        for (String i : arr) {
            sb.append("<li>" + i + "</li>");
        }
        return sb.append("</ol>").toString();
    }


    public static BigDecimal Calc(String[] r) {
        BigDecimal it = BigDecimal.ZERO;
        for (String e :r) {
            String s = e.replaceAll("[\\D&&[^.]]", "");
            it = it.add(new BigDecimal(s));
        }
        return it;


    }


}
