//package C03Inheritance;
////extends 키워드를 통해 상속 > 부모의 변수와 메서드를 자식클래스에서 물려받는 것
////java에서는 클래스의 다중상속을 지원하지 않음(parents1 , 2 ,3 ...에 같은 메서드나 변수명이 있을 경우 혼선이 존재)
//public class C01inheritance extends Parents{
//    public int b = 20;
//
//    public static void main(String[] args) {
//        Parents c1 = new C01inheritance(); //왜자식객체를 복사
////        자식클래스에서 부모클래스의 a변수 상속
//        System.out.println(b); //왜 그냥 b는 안되는 것이지
//        System.out.println(c1.a);
//
//
//
////        메서드 상속
//        c1.m1();
//        c1.m2();
//    }
//
////    부모메서드의 재정의(overriding : 부모클래스의 메서드명과 자식클래스의 메서드명이 동일한 상황)
//    @Override //override된 메서드임을 명시적으로 표현하는 표현식, 성능 최적화를 위해 붙여주는게 좋다.
//    public void m1() {
//        System.out.println("자식클래스의 m1입니다.");
//    }
//
//    public void m2() {
//        System.out.println("자식클래스의 m2 메서드입니다.");
//    }
//
//}
//
//class Parents {
//    public int a = 10;
////    private 접근제어자는 클래스 내부에서만 접근가능, 자식 클래스에서도 접근불가.
//    private int c = 20;
//    public void m1(){
//        System.out.println("부모입니다?");
//        System.out.println(c);
//    }
//}