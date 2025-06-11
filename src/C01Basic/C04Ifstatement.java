package C01Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class C04Ifstatement {
    public static void main(String[] args) throws IOException {
//        도어락 키 예제
//        int answer = 1234;
//        Scanner sc = new Scanner(System.in);
//        int passwd = sc.nextInt();
//        if(answer == passwd) {
//            System.out.println("문이 열렸습니다.");
//        } else {
//            System.out.println("문이 닫혔습니다.");
//        }
//

//        버스카드 예제
//        System.out.println("현재 가지고 있는 금액을 입력해주세요.");
//        int money =0;
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        money = Integer.parseInt(br.readLine());
/*
        if (money >= 10000) {
            System.out.println("택시를 타시오.");
        } else if (money >= 3000) {
            System.out.println("버스를 타시오.");
        } else {
            System.out.println("걸어다니세요..");
        }
*/
//        if (money >= 10000) {
//            System.out.println("택시를 타시오");
//        }
//
//        if (money < 10000 && money >= 3000) {
//            System.out.println("버스를 타시오");
//        } else if (money < 3000){
//            System.out.println("걸어다니시오");
//        }

//        삼항연산자 : 결과값 = 조건식?반환값1:반환값2
//        조건식이 참인경우 반환값1이 결과값에 담기고, 거짓인 경우 반환값2가 결과값에 담김.
//        int answer = 1234;
//        Scanner sc = new Scanner(System.in);
//        int passwd = sc.nextInt();
//        String result = (answer == passwd)?"문이 열렸습니다":"비밀번호가 틀렸습니다.";
//        System.out.println(result);
//
//        switch문 : if, else if, else if 등 여러 조건식이 있을 때 조건문을 가독성 있게 표현한 구문
//        1: 대출업무입니다. 2:예금업무입니다. 3:적금업무입니다. 0:상담사연결됩니다. 그외:잘못된 입력입니다.

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("원하시는 번호를 눌러주세요");
            int inputNum = Integer.parseInt(br.readLine());
            switch (inputNum) {
                case 1:
                    System.out.println("대출업무 입니다.");
                    break;
                case 2:System.out.println("예금업무 입니다.");
                    break;
                case 3:System.out.println("적금업무 입니다.");
                    break;
                default:System.out.println("잘못된 입력입니다.");
                    break;
            }

    }
}
