package org.practice;

import java.util.Arrays;

public class validAnagram {
    public static void main(String[] args){
//        String str1 = "abc";
//        String str2 = "cba";
        String str1 = "abc";
        String str2 = "cbae";

        if(isAnagram(str1, str2)){
            System.out.println("result ::::: " +isAnagram(str1, str2));
        } else {
            System.out.println("result ::::: " +isAnagram(str1, str2));
        }

    }

    public static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }

        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();
        Arrays.sort(str1Array);
        Arrays.sort(str2Array);

        return Arrays.equals(str1Array, str2Array);
    }

}
