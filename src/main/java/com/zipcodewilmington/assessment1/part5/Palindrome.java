package com.zipcodewilmington.assessment1.part5;

import static com.zipcodewilmington.assessment1.part1.BasicStringUtils.reverse;

public class Palindrome {

    public Integer countPalindromes(String input) {
        Integer counter = 0;
        for(int i = 0; i <= input.length(); i++){
            for(int j = i+1; j <= input.length(); j++){

                if(input.substring(i,j).equals(reverse(input.substring(i,j)))){
                    counter++;
                }

            }
        }

        return counter;
    }
}
