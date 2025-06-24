package C03Inheritance;

import javax.print.DocFlavor;
import java.util.List;
//public class C06AbstractMain extends FinalParents{ //final키워드 붙은 class는 상속 불가, fianl 메서드 override불가

public class C06AbstractMain {
    public static void main(String[] args) {

        AbstractDog d1 = new AbstractDog();
        d1.makeSound1();
        d1.makesound2();

//        객체의 실체가 dog클래스를 통해 만들어지므로 여기서는 d2의 makesound2를 사용가능
        AbstractAnimal d2 = new AbstractDog();
        d1.makeSound1();
        d1.makesound2();

//        모든 메서드가 abstract인 클래스를 인터페이스라 한다.(중요!!!!!!!!!!!!!!!!!11)
//        인터페이스는 구현체가 없으므로, 기본적으로 별도의 객체 생성 불가
//        List<Integer> myLIst = new List<>(); //불가!!

//        추상클래스는 구현체 없는 메서드가 있으므로, 기본적으로 객체 생성 불가능(중요)
//        AbstractAnimal al = new AbstractAnimal();



    }




}

// 추상메서드가 하나라도 있으면 클래스에도 abstract 붙이고, 추상클래스가 됨(중요!!!!!!!!)

abstract class AbstractAnimal {
    void makeSound1() {
        System.out.println("동물은 소리를 냅니다.");
    }

//    메서드를 선언만 하고 구현이 없는 메서드 선언시 abstract 사용
    abstract void makesound2();

}

class AbstractDog extends AbstractAnimal{

    @Override
    void makesound2() {
        System.out.println("멍멍");
    }
}

final class FinalParents {


}