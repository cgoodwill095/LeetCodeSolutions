package org.leetcode.math;

import java.util.ArrayList;
import java.util.Collections;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        if(digits.length == 0){
            return digits;
        }
        boolean toAdd = true;
        boolean loop = true;
        int pointer = digits.length-1;
        ArrayList<Integer> array = new ArrayList();
        while(loop){
            if(digits[pointer]==9 && toAdd){
                array.add(0);
                if(pointer==0){
                    array.add(1);
                    toAdd=false;
                    loop=false;
                }
            }
            else if(toAdd){
                array.add(digits[pointer]+1);
                toAdd=false;
            }
            else if(!toAdd){
                array.add(digits[pointer]);
            }
            if(pointer==0){
                loop=false;
            }
                pointer--;
        }
        Collections.reverse(array);
        return convertToIntArray(array);
    }

    public int[] plusOneBetterImplementation(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 != 10) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }



    private static int[] convertToIntArray(ArrayList<Integer> list)
    {
        int[] intArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
        {
            intArray[i] = list.get(i);
        }
        return intArray;
    }



}
