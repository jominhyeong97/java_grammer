package Programmers01;

import java.util.Arrays;

public class Exam05 {
    public static void main(String[] args) {
        int [] array = {1,5,2,6,3,7,4};
        int [][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int [] result = new int[commands.length];
        //return {5,6,3}
        for(int i=0; i < commands.length; i++) {
            int startNum = commands[i][0];
            int endNum = commands[i][1];
            int indexNum = commands[i][2];
            int [] temp = new int[endNum-startNum+1];
            for(int j=0; j<temp.length; j++) {
                temp[j] = array[startNum+j-1];
            }

            Arrays.sort(temp);
            result[i] = temp[indexNum-1];

        }


    }
}

/*
import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int startNum = commands[i][0];
            int endNum = commands[i][1];
            int indexNum = commands[i][2];

            int[] temp = new int[endNum - startNum + 1];
            for (int j = 0; j < temp.length; j++) {
                temp[j] = array[startNum + j - 1];
            }

            Arrays.sort(temp);
            result[i] = temp[indexNum - 1];
        }

        return result;
    }
}

 */
