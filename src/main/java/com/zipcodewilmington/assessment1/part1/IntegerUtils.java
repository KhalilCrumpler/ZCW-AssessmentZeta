package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum += i;
        }
        return sum;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        int sum = 1;
        for(int i = 1; i <= n; i++){
            sum *= i;
        }
        return sum;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        String newString = "";
        String intString = Integer.toString(val);
        int len = intString.length();
        String[] newArray2 = intString.split("");
        for(int i = len-1; i >= 0; i--){
            newString += newArray2[i];
        }
        return Integer.parseInt(newString);
    }
}
