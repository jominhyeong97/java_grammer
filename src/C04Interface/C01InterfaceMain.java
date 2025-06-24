package C04Interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01InterfaceMain {
    public static void main(String[] args) {
        C01Cat c1 = new C01Cat();
        C01Dog d1 = new C01Dog();
        c1.makeSound();
        d1.makeSound();


//        다형성 : 하나의 부모타입으로 여러 자식객체를 다룰 수 있음. (이 밑에 멀티상속이나 다형성은 자바구조를 이해하는 예시)
        C01AnimalInterface1 c2 = new C01Cat();
        C01AnimalInterface1 d2 = new C01Dog();
        c2.makeSound();
        d2.makeSound();

//        예시(매우중요!!!!!!!!!!!!!!!!!!)
//        인터페이스의 장점 : 개발의 표준을 지정 (list는 remove와 add가 있어야 하고...)
//        다형성의 장점 : 기존의 구현체를(오른쪽) 다른 구현체로 변경시 이점(List로 선언하면 list의 메서드만 구현해서 오른쪽 구현체를 바꿀수 있음)
        List<Integer> myList1 = new ArrayList<>();
        myList1.add(10);
        List<Integer> myList2 = new LinkedList<>();
        myList2.add(10);

//        다중구현의 예시 > 인터페이스에 따라 사용가능 메서드가 제한. (중요!!)
//        같은 linkedlist지만 list에서 정의한 메서드를 쓰느냐 ,queue에서 정의한 메서드를 쓰느냐
        List<Integer> list = new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();


//        다중구현(상속)
        C01AnimalInterface1 c3 = new C01Cat();
        C01AnimalInterface2 d3 = new C01Dog();
        c3.makeSound();
        System.out.println(d3.play("시츄","말티즈"));


    }
}
