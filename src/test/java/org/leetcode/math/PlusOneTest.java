package org.leetcode.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PlusOneTest {

    PlusOne plusOne = new PlusOne();

    @Test
    public void testList1(){
        int [] list = {1,2,3,4};
        int[] expected = {1,2,3,5};
        Assertions.assertArrayEquals(expected, plusOne.plusOne(list));
    }

    @Test
    public void testList2(){
        int [] list = {4,3,2,1};
        int[] expected = {4,3,2,2};
        Assertions.assertArrayEquals(expected, plusOne.plusOne(list));
    }

    @Test
    public void testList3(){
        int [] list = {9};
        int[] expected = {1,0};
        Assertions.assertArrayEquals(expected, plusOne.plusOne(list));
    }

    @Test
    public void testList4(){
        int [] list = {9,9,9};
        int[] expected = {1,0,0,0};
        Assertions.assertArrayEquals(expected, plusOne.plusOne(list));
    }

    @Test
    public void testList5(){
        int [] list = {1,2,3,4,5,6,7,8,9};
        int[] expected = {1,2,3,4,5,6,7,9,0};
        Assertions.assertArrayEquals(expected, plusOne.plusOne(list));
    }

    @Test
    public void testList6(){
        int [] list = {9,8,7,6,5,4,3,2,1};
        int[] expected = {9,8,7,6,5,4,3,2,2};
        Assertions.assertArrayEquals(expected, plusOne.plusOne(list));
    }

    @Test
    public void testBetterList1(){
        int [] list = {1,2,3,4};
        int[] expected = {1,2,3,5};
        Assertions.assertArrayEquals(expected, plusOne.plusOne(list));
    }

    @Test
    public void testBetterList2(){
        int [] list = {4,3,2,1};
        int[] expected = {4,3,2,2};
        Assertions.assertArrayEquals(expected, plusOne.plusOne(list));
    }

    @Test
    public void testBetterList3(){
        int [] list = {9};
        int[] expected = {1,0};
        Assertions.assertArrayEquals(expected, plusOne.plusOne(list));
    }

    @Test
    public void testBetterList4(){
        int [] list = {9,9,9};
        int[] expected = {1,0,0,0};
        Assertions.assertArrayEquals(expected, plusOne.plusOne(list));
    }

    @Test
    public void testBetterList5(){
        int [] list = {1,2,3,4,5,6,7,8,9};
        int[] expected = {1,2,3,4,5,6,7,9,0};
        Assertions.assertArrayEquals(expected, plusOne.plusOne(list));
    }

    @Test
    public void testBetterList6(){
        int [] list = {9,8,7,6,5,4,3,2,1};
        int[] expected = {9,8,7,6,5,4,3,2,2};
        Assertions.assertArrayEquals(expected, plusOne.plusOne(list));
    }


}
