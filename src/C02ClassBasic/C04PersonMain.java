package C02ClassBasic;

public class C04PersonMain {
    public static void main(String[] args) {

////        회원가입 예시
//        String name1 = "hong1";
//        String email1 = "hong1@naver.com";
//        int age1 = 30;
//        printMember1(name1, email1, age1);
//
//        String name2 = "hong2";
//        String email2 = "hong2@naver.com";
//        int age2 = 35;
//        printMember1(name2, email2, age2);
//        위와 같은 방식의 문제점
//        어떤 요소(속성)들이 그룹화되어 있지 않다보니 중복과 코드의 가독성이 저하된다.


//        위와 같은 문제점을 해결하기 위해 클래스에 속성을 정의하고, 객체로 생성하여 그룹화를 시킨다.

//        C04Person p1 = new C04Person();
//        p1.name = "hong1";
//        p1.email = "hong1@naver.com";
//        p1.age =  10;
//
//
//        C04Person p2 = new C04Person();
//        p2.name = "hong2";
//        p2.email = "hong2@naver.com";
//        p2.age =  20;

//        System.out.println(p1);
//        printMember2(p2);
//
////        person의 변수값이 public 오픈 돼 있을경우 너무 편하게 다른 클래스(패키지)에서 쉽게 변경 가능
//        p2.name = "hongildong2";
//        printMember2(p2);

        C04Person p3 = new C04Person();
        p3.setName("hong3");
        p3.setEmail("hong3@naver.com");
        p3.setAge(30);
        p3.printPerson();

    }

//    public static void printMember1(String name, String email, int age){
//        System.out.println("이름은 : " + name + " 이메일은 : " + email + " 나이는 : " + age);
//    }
//
//    public static void printMember2(C04Person person){ //person은 객체에 주소값이 매개변수로 전달(매우중요!!)
//        System.out.println("이름은 : " + person.name +  " 이메일은 : " + person.email +  " 나이는 : " + person.age);
//    }
public static void printMember2(C04Person person){ //person은 객체에 주소값이 매개변수로 전달(매우중요!!)
    System.out.println("이름은 : " + person.getName() +  " 이메일은 : " + person.getEmail() +  " 나이는 : " + person.getAge());
}


}
