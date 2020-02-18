package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    int jumps1 = 0;
    int additionalJumps = 0;
    public int jumps(int k, int j) {
        jumps1 = k/j;
        additionalJumps = k % j;
        return jumps1 + additionalJumps;
    }
}
