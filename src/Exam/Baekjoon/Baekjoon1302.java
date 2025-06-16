package Exam.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Baekjoon1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        Map<String, Integer> myMap = new HashMap<>();

        for(int i=0; i<x; i++) {
            String str = br.readLine();

            if(myMap.keySet().contains(str)) {
                myMap.put(str,myMap.get(str) + 1);
            } else  {
                int count = 1;
                myMap.put(str, count);}
        }
        int max = Integer.MIN_VALUE;
        String maxString = "";

        for(String k : myMap.keySet()) {
            if(max < myMap.get(k)) {
                max = myMap.get(k);
                maxString = k;
            }
            else if(max == myMap.get(k)) {
                if(k.compareTo(maxString) < 0) {
                    max = myMap.get(k);
                    maxString = k;
                } else {
                    max = myMap.get(k);
                }
            }
        }
        System.out.println(maxString);

    }
}
