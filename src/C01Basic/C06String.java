package C01Basic;

public class C06String {
    public static void main(String[] args) {
//        원시자료형은 스택메모리에 저장되므로 ,비교시 값자체를 비교
        int a = 10;
        int b = 10;
        System.out.println(a == b);

//        참조자료형의 비교는 기본적으로 메모리 주소값끼리의 비교
        String st1 = new String("hi");
        String st2 = new String("hi");
        System.out.println(st1 == st2);
        System.out.println(st1.equals(st2));

//        WrapperClass : 기본형 타입을 Wrapping한 클래스
        int i1 = 10;
        Integer ig1 = 10;
        

    }
}
