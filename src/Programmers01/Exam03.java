package Programmers01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Exam03 {
    public int[] solution(int[] numbers) {

        Set<Integer> setList = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) {
                    continue;
                }
                setList.add(numbers[i] + numbers[j]);
            }
        }
        int [] arr = new int[setList.size()];
        int index1 = 0;
        for(int c : setList) {
            arr[index1] = c;
            index1++;
        }
        Arrays.sort(arr);
        return arr;
    }
}