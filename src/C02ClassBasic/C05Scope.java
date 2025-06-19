package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;

// 변수의 유효 범위
public class C05Scope {
    public static int v2 = 10;
    public static void main(String[] args) {

//        지역변수의 유효범위 : 지역범위와 스태틱 변수는 if else문 중괄호 바깥에 선언 비유로 이해
        int v1 = 10;
        scope(v1); //20
        System.out.println(v1); //10

//        객체의 유효범휘
        C04Person p1 = new C04Person();
        p1.setName("kim");
        p1.setEmail("kim@naver.com");
        p1.setAge(10);
        scope2(p1);
        System.out.println(p1.printPerson());





        List<C04Person> myList = new ArrayList<>();
        myList.add(p1); //메모리 주소를 add
        myList.get(0).setAge(40);


//        클래스의 유효범위
        System.out.println(v2);


    }

    public static void scope(int v1) { //call by value
        v1 = 20;
        v2 = 30;
        System.out.println(v1); //20
    }
    public static void scope2(C04Person p1) { //call by reference 주소를 넘겨서
        p1.setAge(30);
        System.out.println(p1.printPerson());
    }

}
