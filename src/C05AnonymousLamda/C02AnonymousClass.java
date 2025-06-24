package C05AnonymousLamda;

import org.w3c.dom.ls.LSOutput;

//익명 내부클래스
public class C02AnonymousClass {
    public static void main(String[] args) {

//        AbstractAnimal을 상속한 클래스가 별도로 존재하지 않음.(추상클래스는 상속받아 구현한 클래스로부터 객체를 만들어야됨)
//        익명 클래스가 만들어짐과 동시에 익명객체가 생성되고 있음.

        AbstractAnimal a1 = new AbstractAnimal() {
            @Override
            void makeSound1() {}
        };
        a1.makeSound1();
        a1.makeSound2();


//        구현체가 없는 추상클래스 또는 인터페이스는 익명객체로 생성가능하다.
        Animal1 a2 = new Animal1() {
            @Override
            public void makeSound1() {

            }

            @Override
            public void makeSound2() {

            }
        };

//        인터페이스의 익명객체에 구현메서드가 1개밖에 없을때에는 람다표현식(화살표함수) 사용가능
        Animal2 a3 = () -> {
            System.out.println("helloWorld1");
            System.out.println("helloWorld2");
        };

        a3.makeSound1();

//        실행문이 한 줄 일때는 {} 제거가능, 하나의 인터페이스를 여러 익명클래스를 통해 오버라이딩 가능
        Animal2 a4 = () -> System.out.println("helloWorld1");



//        매개변수가 있는 익명객체의 람다함수 생성

        Animal3 a5 = (i1,i2,i3) -> {return i1 + "," + i2 + "," + i3;};
        Animal3 a6 = (i1,i2,i3) ->  i1 + "," + i2 + "," + i3;
        System.out.println(a6.makeSound1("java","hello","C++"));



//        실습 : Animal4인터페이스를 정의
//        ma/keSound메서드 선언(매개변수는 String, String, int 리턴타입:String)
//        익명객체생성 : 메서드의 기능 - int숫자값이 10이상이면 a+b를 리턴 10미만이면 a만 리턴

        Animal4 ms = (a,b,c) -> {if(c>=10) {return a + "," + b;} else {return a;}};

        System.out.println(ms.makeSound("hi","hello",11));

    }
}


abstract class AbstractAnimal {
    abstract void makeSound1 ();
    void makeSound2() {

    }
}

interface Animal1{
    void makeSound1();
    void makeSound2();
}

interface Animal2{
    void makeSound1();
}

interface Animal3 {
    String makeSound1(String a, String b, String c);
}

interface Animal4 {
    String makeSound(String a, String b, int c);
}