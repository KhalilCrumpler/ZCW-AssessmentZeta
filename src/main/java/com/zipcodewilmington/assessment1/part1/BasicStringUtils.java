package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String newString = "";
        newString = str.substring(0,1).toUpperCase() + str.substring(1);
        return newString;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String[] newArray = str.split("");
        String newString = "";
        int j = str.length() - 1;
        for(int i = j; i >= 0; i--){
            newString += newArray[i];
        }
        return newString;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String newString = BasicStringUtils.reverse(str);
        String newString2 = "";
        newString2 = newString.substring(0,1).toUpperCase() + newString.substring(1);
        return newString2;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        int len = str.length();
        return str.substring(1, len-1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] newChar = str.toCharArray();
        for(int i = 0; i < newChar.length; i ++){
            if(Character.isUpperCase(newChar[i])){
                newChar[i] = Character.toLowerCase(newChar[i]);
            }
            else if(Character.isLowerCase(newChar[i])){
                newChar[i] = Character.toUpperCase(newChar[i]);
            }
        }
        return new String(newChar);
    }
}
