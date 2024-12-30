package org.leetcode.simulation;

import java.util.ArrayList;

public class SpiralMatrix {
    //Assumption: A linear spiral matrix is entered.
    //Given an m x n matrix, return all elements of the matrix in spiral order.

    public void solution(){
        int [][] matrix = { { 1,2,3},{4,5,6},{7,8,9}};
        int [][] matrix2 = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int [][] matrix3= {{1,2,3,4},{5,6,7,8}, {9,10,11,12}};
        int[][] matrix4={{1}};
        int[][] matrix5={{1,2}};
        int[][] matrix6={{1,2,3}};
        int[][] matrix7={{7,9,6}};
        int[][] matrix8={{7},{9},{6}};
        int[][] matrix9={{1,2,3,4,5,6,7,8,9,10}};
        int[][] matrix10={{1},{2},{3},{4},{5},{6},{7},{8},{9},{10}};


        //System.out.println(spiralOrder(matrix).toString());
      //  System.out.println(spiralOrder(matrix3).toString());
        //System.out.println(spiralOrder(matrix4).toString());
        //System.out.println(spiralOrder(matrix5).toString());
        //System.out.println(spiralOrder(matrix7).toString());
        //System.out.println(spiralOrder(matrix8).toString());
        //System.out.println(spiralOrder(matrix9).toString());
        System.out.println(spiralOrder(matrix10).toString());


    }
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> output = new ArrayList<>();
        int x = 0, y = 0, total = matrix.length*matrix[0].length;

        int right = matrix[0].length-1, left = matrix[0].length-1, down=matrix.length-1, up=matrix.length-1;
        if(matrix.length<=1 ){
            left=0;
            total = matrix[0].length;
        }

        while(output.size()<total){
            for(int i = 0; i < right; i++){
                if(output.size()>=total){break;}
                output.add(matrix[x][y]);
                y++;
            }
            right--;
            if(output.size()>=total){break;}
            for(int i = 0; i < down; i++){
                if(output.size()>=total){break;}
                output.add(matrix[x][y]);
                x++;
            }
            down--;
            down--;
            if(output.size()>=total){break;}
            for(int i = 1; i <= left; i++){
                output.add(matrix[x][y]);
                y--;
            }
            left--;
            left--;
            if(output.size()>=total){break;}
            for(int i = 1; i < up; i++){
                if(output.size()>=total){break;}
                output.add(matrix[x][y]);
                x--;
            }
            up--;
            up--;
            if(output.size()>=total){break;}
            if(right<=0 && left <=0 && up <= 0 && down <=0){
                output.add(matrix[x][y]);
            }
        }
        return output;
    }

}
