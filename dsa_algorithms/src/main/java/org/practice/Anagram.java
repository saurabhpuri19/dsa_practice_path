package org.practice;

import java.util.Arrays;

public class Anagram {
    static void main() {

//        String s1 = "anagram";
//        String s2 = "nagaram";

        String s1 = "geek";
        String s2 = "eekgs";

        if(areAnagrams(s1,s2)){
            System.out.println("result :::::::: areAnagrams");
        }else{
            System.out.println("result :::::::: areNotAnagrams");
        }
    }

    public static boolean areAnagrams(String s1, String s2){

        if(s1.length() != s2.length()){
            return false;
        }

        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1, array2);
    }

}
