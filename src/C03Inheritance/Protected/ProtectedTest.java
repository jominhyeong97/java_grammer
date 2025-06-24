package C03Inheritance.Protected;
//같은 패키지 내의 클래스가 아닌경우에는 import 필요
import C03Inheritance.C04ProtectedClass;

public class ProtectedTest {
    public static void main(String[] args) {
        C04ProtectedClass p1 = new C04ProtectedClass();
//        public : 프로젝트 전역 가능
        p1.st1 = "hello python";
//        default : 패키지가 달라져서 변수는 접근불가
//        p1.st3 = "hello python"; // 불가

//        상속관계가 있을 경우, 패키지가 달라도 protected 변수에 접근가능



    }
}
