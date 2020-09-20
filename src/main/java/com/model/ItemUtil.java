package com.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ItemUtil {
    /**
     * Reads the string argument and removes all the characteres except the numbers
     * @param string string input
     * @return Returns only the numbers found in the string argument.
     */
    public static int extractNumberFromInput(String string) {
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(string);
        StringBuffer buffer = new StringBuffer();
        while(m.find()) {
            System.out.println(m.group());
            buffer.append(m.group());
        } 
        return Integer.parseInt(buffer.toString());
    }
}