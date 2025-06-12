package Exam.Baekjoon;

import java.io.*;

//https://www.acmicpc.net/problem/1475
public class Baekjoon1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] list = {0,1,2,3,4,5,6,7,8,9};
        String str = br.readLine();
        int [] arr = new int[str.length()]; // 122의 경우 3
        double [] countArray = new double[10];
        int maxNum = 0;

        for (int i=0; i<str.length(); i++) { //3번반복 : input받은 값의 자릿수 기준 ex)811 > 3
            arr[i] = str.charAt(i) - '0'; // ex) char 8을 int 8로 변환
            for (int j = 0; j < list.length; j++) { //10번 반복 > 1~10 어떤값이 등장했는지 찾는 반복문

                if (arr[i] == list[j]) { //arr의 0번 인덱스 8이 list의 8과 일치 하면 count배열에서 8값 +1
                    if (arr[i] == 6 || arr[i] == 9) {
                        countArray[arr[i]] += 0.5;
                    } else {
                        countArray[arr[i]]++;

                    }
                }
            }
            for (int k = 0; k < countArray.length; k++) { //arr의 배열 > 1이 몇개고 2가 몇개고... 중에서 최대값 구하기
                if (countArray[k] > maxNum) {
                    maxNum = (int) countArray[k];
                }
            }

            System.out.println(maxNum);

        }

    }
}
