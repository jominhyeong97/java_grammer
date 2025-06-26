package C06EtcClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class C04GenericMain {
    public static void main(String[] args) {

        //<> : 제네릭
        String [] stArr = {"java","python","C++"};
        Integer [] intArr = {10,20,30,};
        stChange(stArr,0,1);
        allChange(stArr,0,1);
        allChange(intArr,0,1);



//        일반객체 생성시
        Person p1 = new Person("name");
        GenericPerson<Integer> p2 = new GenericPerson<Integer>(1);
        GenericPerson<String> p3 = new GenericPerson<>("hong2");


//        제네릭 사용예시
        List<String> myList = new ArrayList<>();
//        GenericTest<Person> g1 = new GenericTest<>(p1, 10); : 안됨 이유는 모름..
        GenericPerson2<Integer> g2 = new GenericPerson2<>(10,"hi");
    }


//    제네릭메서드 : 반환타입 왼쪽에 <T>라고 선언
//    이때 T에는 참조형변수인 객체타입만을 허용(int x)
    static <T> void allChange(T[] arr, int a, int b) {
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void stChange (String[] arr, int a, int b){
        String temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }

    static void intChange (Integer[] arr, int a, int b){
        Integer temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }

}

//제네릭 클래스는 클래스명 옆에 <T>선언
class GenericPerson<T> {
    private T value;

    public GenericPerson(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}



class Person {
    private String value;

    public Person(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

class GenericTest<T> {
    Person person;
    T value;

    public GenericTest(Person person, T value) {
        this.person = person;
        this.value = value;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericTest{" +
                "person=" + person +
                ", value=" + value +
                '}';
    }
}

class GenericPerson2<T>{
    private T value;
    private String value2;
    public GenericPerson2(T value, String value2) {
        this.value = value;
        this.value2  = value2;
    }
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
}
