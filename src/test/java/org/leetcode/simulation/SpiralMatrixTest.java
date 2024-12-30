package org.leetcode.simulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrixTest {

    SpiralMatrix spiralMatrix = new SpiralMatrix();

    @Test
    public void testMatrix1(){
        int [][] matrix = { { 1,2,3},{4,5,6},{7,8,9}};
        ArrayList expected = new ArrayList(List.of(1,2,3,6,9,8,7,4,5));
        Assertions.assertEquals(expected, spiralMatrix.spiralOrder(matrix));
    }
    @Test
    public void testMatrix2(){
        int [][] matrix2 = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        ArrayList expected = new ArrayList(List.of(1,2,3,4,5,10,15,20,25,24,23,22,21,16,11,6,7,8,9,14,19,18,17,12,13));
        Assertions.assertEquals(expected, spiralMatrix.spiralOrder(matrix2));


    }
    @Test
    public void testMatrix3(){
        int [][] matrix3= {{1,2,3,4},{5,6,7,8}, {9,10,11,12}};
        ArrayList expected = new ArrayList(List.of(1,2,3,4,8,12,11,10,9,5,6,7));
        Assertions.assertEquals(expected, spiralMatrix.spiralOrder(matrix3));

    }
    @Test
    public void testMatrix4(){
        int[][] matrix4={{1}};
        ArrayList expected = new ArrayList(List.of(1));
        Assertions.assertEquals(expected, spiralMatrix.spiralOrder(matrix4));
    }
    @Test
    public void testMatrix5(){
        int[][] matrix7={{7,9,6}};
        ArrayList expected = new ArrayList(List.of(7,9,6));
        Assertions.assertEquals(expected, spiralMatrix.spiralOrder(matrix7));


    }
    @Test
    public void testMatrix6(){
        int[][] matrix8={{7},{9},{6}};
        ArrayList expected = new ArrayList(List.of(7,9,6));
        Assertions.assertEquals(expected, spiralMatrix.spiralOrder(matrix8));
    }
    @Test
    public void testMatrix7(){
        int[][] matrix9={{1,2,3,4,5,6,7,8,9,10}};
        ArrayList expected = new ArrayList(List.of(1,2,3,4,5,6,7,8,9,10));
        Assertions.assertEquals(expected, spiralMatrix.spiralOrder(matrix9));


    }
    @Test
    public void testMatrix8(){
        int[][] matrix10={{1},{2},{3},{4},{5},{6},{7},{8},{9},{10}};
        ArrayList expected = new ArrayList(List.of(1,2,3,4,5,6,7,8,9,10));
        Assertions.assertEquals(expected, spiralMatrix.spiralOrder(matrix10));


    }


    @Test
    public void testMatrix9(){
        int[][] matrix11={{1,2,3,4,5,6,7,8,9,10},
                {11,12,13,14,15,16,17,18,19,20},
                {21,22,23,24,25,26,27,28,29,30},
                {31,32,33,34,35,36,37,38,39,40},
                {41,42,43,44,45,46,47,48,49,50},
                {51,52,53,54,55,56,57,58,59,60},
                {61,62,63,64,65,66,67,68,69,70},
                {71,72,73,74,75,76,77,78,79,80},
                {81,82,83,84,85,86,87,88,89,90},
                {91,92,93,94,95,96,97,98,99,100}};
        ArrayList expected = new ArrayList(List.of(1,2,3,4,5,6,7,8,9,10,
                20,30,40,50,60,70,80,90,100,
                99,98,97,96,95,94,93,92,91,81,71,
                61,51,41,31,21,11,12,13,14,15,16,
                17,18,19,29,39,49,59,69,79,89,88,
                87,86,85,84,83,82,72,62,52,42,32,
                22,23,24,25,26,27,28,38,48,58,68,
                78,77,76,75,74,73,63,53,43,33,34,
                35,36,37,47,57,67,66,65,64,54,44,
                45,46,56,55));
        Assertions.assertEquals(expected, spiralMatrix.spiralOrder(matrix11));



    }
    @Test
    public void testMatrix10() {
        int[][] matrix12 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        ArrayList expected = new ArrayList(List.of(1, 2, 3, 4, 5, 10, 15, 14, 13, 12, 11, 6, 7, 8, 9));
        Assertions.assertEquals(expected, spiralMatrix.spiralOrder(matrix12));
    }

    }
