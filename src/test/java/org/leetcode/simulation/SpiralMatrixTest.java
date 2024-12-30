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

}
