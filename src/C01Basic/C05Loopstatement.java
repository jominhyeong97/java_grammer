package C01Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class C05Loopstatement {
    public static void main(String[] args) throws IOException {
        /*int a = 2;
        while (a < 11) {
            System.out.println(a);
            a += 1;
        }
        System.out.println("while문 끝");
        System.out.println("for문 시작");
        for (int i = 2; i < 11; i++) {
            System.out.println(i);
        }

        System.out.println("for문 끝");
        */
        /*int answer = 1234;
        int count = 0;
        while(count < 5) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int passwd = Integer.parseInt(br.readLine());
            if(passwd == answer) {
                System.out.println("문이 열렸습니다.");
                break;
            } else {
                count +=1;
                System.out.println("비밀번호가 " + count + "회 틀렸습니다.");
            }
            if(count == 5) {
                System.out.println("5회 이상 비밀번호를 틀렸습니다.");
            }

            }*/

//        입력한 숫자의 구구단 단수 출력


//        while (true) {
//            System.out.println("구구단 단수를 입력해주세요");
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//            int input = Integer.parseInt(br.readLine());
//            int a = 1;
//            while (a < 10) {
//                System.out.println(input + " x " + a + " = " + (input * a));
//                a++;        }
//
//        }



////        do while 문 : 무조건 1번은 실행되는 while문
//
//        int a = 100;
//        do {
//            System.out.println(a);
//        } while (a<10);



////        for 문 : 초기식, 조건식, 증감식이 모두 포함돼 있는 반복문
////        for 문은 사용했던 변수명을 for문이 끝난 이후에 재선언이 가능하다.
//        for(int a=1; a<11; a++) {
//            if(a%2 !=0) {
//                System.out.println(a);
//            }
//        }
//
////        1~20까지 짝수의 총합 출력
//        int result = 0;
//        for (int i=1; i<21; i++) {
//            if(i%2 == 0) {
//                result += i;}
//        }
//        System.out.println(result);


////        두 수의 최대 공약 수 찾기
//        int a = 24;
//        int b = 36;
//        int min = a>b?b:a;
//        int result = 0;
//        for(int i=1; i<=min; i++) {
//           if (a%i == 0 && b%i ==0) {
//               result = i;
//           }
//        }
//        System.out.println(result);



//        소수 구하기 : 1과 자신을 제외한 숫자로 나누어지지 않는 수
////        사용자가 입력한 값이 소수인지 아닌지 판별하는 프로그램
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int a = Integer.parseInt(br.readLine());
//        int count = 0;
//        if(a<2) {
//            System.out.println("유효하지 않은 값입니다.");
//        } else {
//            for (int i = 2; i*i < a; i++) {
//                if (a % i == 0) {
//                    count++;
//                    break;
//                }
//            }
//            if (count > 0) {
//                System.out.println("소수가 아닙니다.");
//            } else {
//                System.out.println("소수입니다.");
//            }
//        }


////        continue : 반복문의 조건식으로 이동하는 명령어
////        홀수만 출력
//        for(int i=1; i<11; i++) {
//            if(i%2==0) {
////                코드의 직관성과 가동성을 위해 사용
//                continue;
//            }
//            System.out.println(i);
//        }


////        향상된 for 문 = for each문
//        int [] arr = {1,3,5,7};
////        일반 for 문을 활용한 배열 접근 방식
//        for(int i=0; i<arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
////        향상된 for문을 활용한 배열 접근 방식
//        for(int a : arr){
//            System.out.println(a);
//        }
//
////        일반 for문을 통한 arr의 저장된 값 변경
//        for(int i=0; i<arr.length; i++) {
//            arr[i] +=10;
//        }
////        참조형변수(객체타입)는 기본적으로 변수를 통한 출력시에 메모리 값이 출력
//        System.out.println(Arrays.toString(arr));
////        향상된 for문을 통한 arr의 저장된 값 변경 > 원본의 값 변경 불가
//        for(int a : arr) {
//            a +=10;
//        }
//

//            다중 반복문

//        for(int i=2; i<10; i++) {
//            System.out.println(i + " 단 입니다.");
//            for(int j=1; j<10; j++) {
//                System.out.println(i + " x " + j + " = " + (i * j));
//            }
//            System.out.println("----------");
//        }

////            라벨문 : 반복문에 이름을 붙이는 것
//        loop1:
//        for(int i=2; i<10; i++) {
//            System.out.println(i + " 단 입니다.");
//            loop2:
//            for(int j=1; j<10; j++) {
//                System.out.println(i + " x " + j + " = " + (i * j));
//                break loop1; //원하는 for문을 라벨링을 통해 종료시킬 수 있음.
//            }
//            System.out.println("----------");
//        }

//        int [][] arr = {{1,2,3},{4,5,11},{7,8,9},{10,11,12}};
//        System.out.println(arr[1][2]); //1번쨰 배열에 2번째 값을 찾는 것.
//
////        숫자 11이 위치한 배열의 index값 출력
////        가장 먼저 찾아지는 11의 위치만 출력
//        loop1:
//        for(int i=0;i<arr.length;i++) {
//            loop2:
//            for(int j=0;j<arr[i].length;j++) {
//                if(arr[i][j] == 11) {
//                    System.out.println(i + "," + j);
//                    break loop1;
//                }
//            }
//        }


//          라벨링 활용 문제풀이
//          100~200까지 수 중에서 가장 작은 소수를 출력
        int result = 0;

        loop1:for(int a=100;a<201;a++) {
            boolean isPrime = true;
            loop2:for(int b=2;b*b<=a;b++){
                if(a%b == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(a);
                break loop1;
            }
        }





    }
}

