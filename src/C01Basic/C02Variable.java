package C01Basic;

import javax.xml.transform.Source;
import java.math.BigDecimal;
import java.sql.SQLOutput;

public class C02Variable {
    public static void main(String[] args) {
        /*
//        정수 : byte(1바이트), int(4바이트), long(8바이트)
        byte a = 127;
        byte b = -128;

//        오버플로우 : 자료형이 표현할 수 있는 범위를 넘어선경우
//        언더플로우
        int i1 = 10;
        long l1 = 10;
//        long은 명시적으로 l을 붙여 long 타입임을 명시하기도 함
        long l2 = 20L;

//        실수 : float, double -> 실수 연산은 오차를 발생시킨다
        float f1 = 1.123f;
        double d1 = 1.123;

//        부동소수점 오차테스트
        double d2 = 0.1;
        System.out.println(d2);
        double total = 0;
        for(int i=0; i<1000; i=i+1) {
            total = total + 0.1;
        }
        System.out.println(total);

        double total2 = 0;
        for(int i=0; i<1000; i=i+1) {
            total2 = total2 + 0.1*10;
        }
        System.out.println(total/10);
        */
//        소수점 오차 해결 방법 : Bigdecimal 클래스 사용
        /*double d1 = 1.03;
        double d2 = 0.42;
        System.out.println(d1 - d2);

//        값을 입력받을때부터 소수점으로 받게 되면 이미 오차가 발생하므로 문자로 입력
        BigDecimal b1 = new BigDecimal("1.03");
        BigDecimal b2 = new BigDecimal("0.42");
        double d3 = b1.subtract(b2).doubleValue();
        System.out.println(d3);
        */

//        문자형 : char
        /*char c1 = '가';
        String s1 = "가나";

//        boolean : ture of false
        boolean b1 = true;

//        null도 하나의 타입
//        참조형 자료에 값을 할당하지 않으면 null이 할당
        String st1 = "";
        String st2 = null;
        System.out.println(st1);
        System.out.println(st2); //null을 대상으로 string의 메서드 사용 불가
        */

//        타입변환
//        묵시적 타입병합, 명시적 타입병합
        /*char c1 = 'a';
        int i1 = c1;
        System.out.println(i1);
        System.out.println('a' > 'b'); //문자비교를 위한 묵시적 타입변환 발생

//        알파벳 소문자 제거문제[
        String st1 = "01abcd123한글123";
        */

//        int -> double
        /*int i1 = 10;
        doubl1 d1 = i1;
//        double -> int
        double d2 = 10.5;
        int i2 =(int)d2;
*/

//        정수/정수의 경우 소숮머 절사 문제 발행
//        두수가 모두 정수이면 결과값이 정수일것이라고 jaav가 판단
        /*int a = 1;
        int b = 4;
        double d1 =a/b;
        System.out.println(d1);
        double d2 = (double) a/b;
        System.out.println(d2);*/
/*
//        변수와 상수
        int a1 = 10;
        a1 = 10; //가능

//        상수는 초기값을 할당한 이후에 재할당하는것이 불가능
//        상수는 final 키워드를 사용
        final int f1 = 10;
        f1 = 30;
*/



    }
}
