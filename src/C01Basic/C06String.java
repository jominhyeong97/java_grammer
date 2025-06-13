package C01Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class C06String {
    public static void main(String[] args) {
////        원시자료형은 스택메모리에 저장되므로 ,비교시 값자체를 비교
//        int a = 10;
//        int b = 10;
//        System.out.println(a == b);
//
////        참조자료형의 비교는 기본적으로 메모리 주소값끼리의 비교
//        String st1 = new String("hi");
//        String st2 = new String("hi");
//        System.out.println(st1 == st2);
//        System.out.println(st1.equals(st2));
//
////        WrapperClass : 기본형 타입을 Wrapping한 클래스
//        int i1 = 10;
////        Integer ig1 = new Integer(10);
////        오토박싱 : 원시자료형에서 Wrapper클래스로 자동 형변환
//        Integer ig1 = 10;
////        오토언박싱 : Wrapper클래스에서 원시자료형으로 자동 형변환
//        int i2 = ig1;
//
////        Wrapper클래스의 기능
//        int i3 = 10;
//        String st3 = Integer.toString(i3);
//        String st4 = String.valueOf(i3);
//        int i4 = Integer.parseInt(st3);
//
////        배열(참조자료형)에는 원시타입 자료형 세팅 가능
//        int[] arr = {10,20,30};
//
////        그 외(리스트, set map) 등에는 참조자료형을 세팅해야함
//        ArrayList<Integer> list1 = new ArrayList<>();
//        list1.add(10);
//

////        String 선언"
////        객체선언방식
//        String st1 = new String("hi");
//        String st2 = new String("hi");
////        리터럴방식 : java에서 추천하는 방식
//        String st3 = "hi";
//        String st4 = "hi";
//        System.out.println(st1 );
//        System.out.println(st1==st2);
//        System.out.println(st3==st4);
//        System.out.println(st1==st3);
//
////        참조자료형의 비교는 ==를 지양
//        System.out.println(st1.equals(st3));


//        equals : 두 문자열 비교
//        String st1 = "hello1";
//        String st2 = "hello1";
//        String st3 = "HeLlo1";
//        System.out.println(st1.equals(st2));
//        System.out.println(st1.equals(st3));
//        System.out.println(st1.equalsIgnoreCase(st3));






////        length : 문자열의 길이 출력
//        String st1 = "hello1 World2 Java3";
//        System.out.println(st1.length());
////        charAt : 특정 index의 문자(char)값을 리턴
//        char ch1 = st1.charAt(0);
//
////        위 문자열의 소문자 알파벳의 개수구하기
//        int count = 0;
//        for(int i=0;i<st1.length();i++) {
//            if(st1.charAt(i)>='a' && st1.charAt(i)<='z') {
//                count++;
//            }
//        }
//        System.out.println("소문자의 개수는 " + count + " 개 입니다.");
//
//        String st2 = "abcdsfaebaaa";
////        a의 개수가 몇개인지 출력
//        int count2 = 0;
//        for(int i=0; i<st2.length(); i++) {
//            if(st2.charAt(i) == 'a') {
//                count2++;
//            }
//        }
////        toCharArray : String 문자열을 char 배열로 리턴
//        int count3 = 0;
//        for(char j:st2.toCharArray()) {
//            if(j=='a') count3++; //실행문이 1줄밖에 없을 경우 중괄호 생략가능
//        }
//        System.out.println("a의 개수는 " + count3 + "개 입니다.");




////        indexOf(문자열) : 특정 문자열의 위치(index) 반환 가장 먼저 나오는 문자열의 위치 반환.
//        String st1 = "hello java java";
//        System.out.println(st1.indexOf("java"));
//



////        contains : 특정 문자열이 포함되어 있는지 여부(boolean)를 return
//        System.out.println(st1.contains("hello"));
//        System.out.println(st1.contains("world"));
//



////        문자열 더하기 : +=(많이 중요하지 않음........)
//        String st1 = "hello";
//        st1 += " world";
//        st1 += '1';  //String에 char를 더하면 String으로 더해짐.
//        System.out.println(st1);

//        프로그래머스 나머지 구하기(플랫폼 사용방법)
//        프로그래머스 특정 문자 제거하기


////        substring(a,b) : a이상 b미만의 index의 문자를 잘라 반환
//        String st1 = "hello world";
//        System.out.println(st1.substring(0,5));
//        System.out.println(st1.substring(0,st1.length()));
//        프로그래머스 가운데 글자 가져오기

////        trim, strip : 문자열 양쪽 끝의 공백 제거
//        String st1 = " hello world  ";
//        String trim1 = st1.trim();
//        String strip1 = st1.strip();
//        System.out.println(trim1);
//        System.out.println(strip1);
//
////        toUpperCase : 모든 문자열을 대문자로 변환, toLowerCase : 모든 문자열을 소문자로 변환
//        String s1 = "Hello";
//        String s2 = s1.toUpperCase();
//        String s3 = s1.toLowerCase();
//        System.out.println(s2);
//        System.out.println(s3);

////        replace(a,b) : a문자열을 b문자열로 대체
//        String st1 = "hello world";
//        String st2 = st1.replace("world", "java");
//        System.out.println(st2);
//        replaceAll(a,b) : replace와 사용법 동일. 정규표현식을 사용할 수 있는 점이 다름.
//        String st1 = "01abC123한글123";
////        소문자 알파벳 제거
//        String answer1 = st1.replaceAll("[가-힣]","");
//        System.out.println(answer1);
//        String answer2 = st1.replaceAll("[a-z]", "");
//        String answer3 = st1.replaceAll("[A-Za-z]","");
//        System.out.println(answer2);
//        System.out.println(answer3);
//

//
////        전화번호 검증
//        String number ="010-1234-1234";
//        boolean check1 = number.matches("^\\d{3}-\\d{4}-\\d{4}$");
//            System.out.println(check1);
////        이메일검증
//        String email = "asdf1234@naver.com";
//        boolean check2 = Pattern.matches("^[a-z0-9]+@[a-z]+.com$",email);
//            System.out.println(check2);
//

////            split : 특정 문자를 기준으로 잘라서 문자배열로 만드는 것
//            String a ="a:b:c:d";
//            String [] arr = a.split(":");
//            System.out.println(Arrays.toString(arr));
//
//            String b = "a b c  d";
//            String [] arr2 = b.split(" ");
//            String [] arr3 = b.split("\\s+"); // \s:공백 \n:줄바꿈
//            System.out.println(Arrays.toString(arr2));
//            System.out.println(Arrays.toString(arr3));
//
//
////            null과 공백의 차이, "" > isEmpty , " " > isBlank (매우중요!!!!)
//            String st1 = null; //null은 String이 아님
//            String st2 = ""; //빈 문자열은 문자열
//            String st3= " ";
//            System.out.println(st1==st2);
//            System.out.println(st1.isEmpty()); //null pointer exception 발생
//            System.out.println(st2.isEmpty()); //true
//            System.out.println(st3.isBlank()); //true
//            String abc = "hello    world  java";


////            문자열 합치기(중요도 낮음).......
//            String[] arr = {"java", "python", "javascript"};
//            String answer1 = "";
//            for(String a : arr) {
//                    answer1 += a;
//                    answer1 += " ";
//            }
//            String answer2 = String.join("\n", arr);
//            System.out.println(answer2);


////            StringBuffer : 문자열 조립 객체
//        StringBuffer sb = new StringBuffer();
//        sb.append("java"); //append는 맨 뒤에 문자열을 더하는 메서드
//        sb.append("\n");
//        sb.append("python");
//        sb.append("\n");
//        sb.append("javascript");
//        String answer = sb.toString();
//        System.out.println(answer);
//
//        String [] arr = {"java","phyton","javascript"};
//        StringBuffer sb1 = new StringBuffer();
//        for(int i=0; i<arr.length; i++) {
//            sb1.append(arr[i]);
//            sb1.append("\n");
//        }
//        sb1.insert(0, "C++");
//        sb1.deleteCharAt(sb.length()-1);
//        System.out.println(sb1);




////            StringBuilder : 문자열 조립 객체(가장빠름)
//        String st1 = "hello";
////        StringBuilder는 동시성이슈 있음 > Thread - safe하지않음 > 성능은 뛰어님
//        StringBuilder sb1 = new StringBuilder();
////        StringBuffer는 동시성이슈가 없음 > Thread - safe함 > 성능은 떨어짐
//        StringBuffer sb2 = new StringBuffer();




////        문자열 뒤집기
//        String st1 = "hello";
//        StringBuilder sb1 = new StringBuilder();
//        for(int i=st1.length()-1; i>=0; i--) {
//            sb1.append(st1.charAt(i));
//        }
//        System.out.println(sb1);



//        프로그래머스 - 문자열 밀기 로직 해결 그냥 억까문제





    }
}
