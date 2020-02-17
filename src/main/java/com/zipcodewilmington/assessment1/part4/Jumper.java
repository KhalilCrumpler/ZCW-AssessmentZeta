package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        int jumps = 0;
        int remainingJumps = 0;
        float jumps2 = 0;


        if(k == j){
            return 1;
        }
        else if(k % j != 0){
            jumps2 = (float) Math.floor(k/j);
            jumps = Math.round(jumps2);
            remainingJumps = k - jumps;
            return jumps + (remainingJumps);
        }
        if(j ==1){
            return k;
        }

        return 1;
    }
}
