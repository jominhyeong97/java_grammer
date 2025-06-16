package Exam.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Baekjoon1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        List<Integer> list1 = new ArrayList<>(); //값의 크기 순서별로 담을 배열
        List<Integer> list2 = new ArrayList<>();
        List<Integer> listCopy = new ArrayList<>();

        int [] listindex = new int[x];
        //1. A와 B배열 생성, B배열 카피 A를 오름차순으로 B카피를 내림차순으로 두개의 같은 인덱스를 곱함 배열안의 값 합 출력
        String [] str1 = br.readLine().split(" ");
        for(int i=0; i<x; i++) {

            list1.add(Integer.parseInt(str1[i]));
        }
        String [] str2 = br.readLine().split(" ");
        for(int i=0; i<x; i++) {
            list2.add(Integer.parseInt(str2[i]));
        }

        for(int i=0; i<x; i++) { //B의 크기별 리스트를 구해서 index배열에 넣어야함 그리고 배열[index]와 list[a]를 곱해서 출력

        }

        for(int a : list2) {
            listCopy.add(a);
        }
        list1.sort(Comparator.naturalOrder());
        listCopy.sort(Comparator.reverseOrder());

        int result = 0;

        for(int i=0; i<x; i++) {
            result = result + (list1.get(i) * listCopy.get(i));
        }
        System.out.println(result);
    }


}
