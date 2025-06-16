package Programmers01;
import java.util.*;
import java.util.ArrayList;


class Exam07 {
    public static void main(String[] args) {

//        String [][]
        Map<String, Integer> mySet = new HashMap<>();
        String [][] clothes = new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        String [] arr = new String[clothes.length];
        for(int i=0; i<arr.length; i++) {
            arr[i] = clothes[i][1];
        }

        for(String a : arr) {
            mySet.put(a, mySet.getOrDefault(a,0)+1);
        }


        int result = 1;
        for(int v : mySet.values()) {
            int sum = 0;
            sum += v + 1;
            result = result * sum;
        }
        int answer = result - 1;
        System.out.println(answer);
    }
}