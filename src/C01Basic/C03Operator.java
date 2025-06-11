package C01Basic;

public class C03Operator {
    public static void main(String[] args) {

//        산술연산자 : 사칙연산
//        int n2 = 3;
//        int n1 = 7;
//        System.out.println("n1 * n2 = " + (n1*n2));
//        System.out.println("n1 / n2 = " + (n1/n2));
//        System.out.println("n1 % n2 = " + (n1%n2));

//        대입연산자
//        int n1 = 7;
//        int n2 = 7;
//        int n3 = 7;
//        n1 = n1 -3;
//        n2 -=3;
//        int n4=10;
//        int n5=10;
//
//        n4 /=3;
//        n5%=3;

////        증감연산자
//        int a = 10;
//        a = a + 1;
//        a +=1;
//        a++;
//        ++a;

//        a++ : 현재 라인의 명령문이 실행되고 나서 증가
//        ++a : 현재 라인의 명령문이 실행되기 전에 증가
//        int b = 5;
//        int c = b++;
//        int d = ++b;
//

//        비교연산자 : ==/=, !=, >, >= 등

//        논리연산자 : &&, ||, !
//        int num1 = 10;
//        int num2 = 20;
//        boolean b1 = num1 > 5 && num1 < 20;
//
//        boolean b2 = num2 >= 10 && num2 <30;
//        boolean b3 = !(num2 < 10 || num2 > 30);

//        비트연산자 : 컴퓨터의 2진체계에서의 연산방식 : &, !, ^ ,<< ,>>
        int n1 = 5;
        int n2 = 4;
//        두 수를 &비트연산 하게 되면 각 자릿수에 모두 1이 있어야 1의 결과값이 나옴
        System.out.println(n1 & n2);
//        두 수를 &비트연산 하게 되면 각 자릿수에 하나라도 1이 있어야 1의 결과값이 나옴
        System.out.println(n1 | n2);
//        왼쪽으로 1칸 옮긴다는 의미는 해당 숫자값에 x2한다는 의미
//        오른쪽으로 1칸 옮긴다는 의미는 해당 숫잘값에 /2한다는 의미
        System.out.println(n1<<1);
        System.out.println(n2>>1);
    }
}
