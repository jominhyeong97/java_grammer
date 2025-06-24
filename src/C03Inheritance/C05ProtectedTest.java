package C03Inheritance;

public class C05ProtectedTest {
    public static void main(String[] args) {
        C04ProtectedClass p1 = new C04ProtectedClass();
        System.out.println(p1.st1);
//        C04ProtectedClass.st2 = "hello C++"; //접근불가능
        System.out.println(p1.st3);
        System.out.println(p1.st4);
    }
}
