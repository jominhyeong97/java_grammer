package C02ClassBasic;

import java.util.Scanner;

public class C02MethodPractice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());

        if(isPrime(input)){
            System.out.println("소수입니다.");
        } else {
            System.out.println("소수아닙니다.");
        }
    }

//    소수판별기 메서드(isPrime) 생성
public static boolean isPrime(int input) {
    if (input < 2) return false;

    for (int i = 2; i * i <= input; i++) {
        if (input % i == 0) {
            return false;
        }
    }
    return true;
    }
}
