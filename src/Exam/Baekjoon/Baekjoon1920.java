package Exam.Baekjoon; //이거 제출시에 빼야됨

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon1920 { //제출 때마다 Main으로 바꿔야함
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t1 = Integer.parseInt(br.readLine());
        String [] str1 = br.readLine().split(" ");
        int t2 = Integer.parseInt(br.readLine());
        String [] str2 = br.readLine().split(" ");

        int [] arr1 = new int[str1.length];
        int [] arr2 = new int[str2.length];
        int index1 = 0;
        for(String a : str1) {
            arr1[index1] = Integer.parseInt(a);
            index1++;
        }
        Arrays.sort(arr1);
        int index2 = 0;
        for(String b : str2) {
            arr2[index2] = Integer.parseInt(b);
            index2++;
        }

        for(int i=0; i < arr2.length; i++) {
            if(Arrays.binarySearch(arr1,arr2[i])>=0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
