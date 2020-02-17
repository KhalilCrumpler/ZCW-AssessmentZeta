package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int sum = 0;
        for(int i = 0; i < objectArray.length; i++){
            if(objectArray[i] == objectToCount){
                sum +=1;
            }
        }
        return sum;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Integer[] objectArray, Integer objectToRemove) {
        int len = objectArray.length;
        int sum = getNumberOfOccurrences(objectArray, objectToRemove);
        int newSum = len-sum;
        int counter = 0;
        Integer[] newArray = new Integer[newSum];
        for(int i = 0; i < objectArray.length; i++) {
            if (!objectArray[i].equals(objectToRemove)) {
                newArray[counter] = objectArray[i];
                counter++;
            }
        }
        return newArray;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Integer getMostCommon(Integer[] objectArray) {
        int mostOccurences = 0;
        int temp = 0;
        int mostCommon = 0;
        int number = 0;
        for(int i = 0; i < objectArray.length; i++){
            temp = getNumberOfOccurrences(objectArray, objectArray[i]);
            if(temp > mostOccurences){
                mostOccurences = temp;
                number = objectArray[i];
            }
            objectArray = (Integer[]) removeValue(objectArray, objectArray[i]);
        }

        return number;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Integer getLeastCommon(Integer[] objectArray) {

        return null;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Integer[] objectArray, Integer[] objectArrayToAdd) {
        int len = objectArray.length + objectArrayToAdd.length;
        Integer[] newArray = new Integer[len];
        int pos = 0;
        for(int i = 0; i < objectArray.length; i++){
            newArray[pos] = objectArray[i];
            pos++;
        }
        for(int i = 0; i < objectArrayToAdd.length; i ++){
            newArray[pos] = objectArrayToAdd[i];
            pos++;
        }

        return newArray;
    }
}
