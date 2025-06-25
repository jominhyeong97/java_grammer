package C05AnonymousLamda;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C04StreamApi {
    public static void main(String[] args) {
//
////        전통적인 방식의 데이터 접근법 : 메모리 주소 접근
//        int [] arr = {10,20,30};
//        for (int i=0; i<arr.length; i++ ){
//            System.out.println(arr[i]);
//        }
//
////        함수형 프로그램 방식 : 데이터와 객체 중심이 아닌, 입력에 따른 출력만 존재
////        streamApi : java에서 함수형 프로그래밍을 지워하는 라이브러리
////        forEach는 스트림의 각 요소를 하나씩 소모하면서 동작을 수행
//        Arrays.stream(arr).forEach(a -> System.out.println(a));
//
//
////        스트림의 생성 : .stream()
//        List<String> myList = new ArrayList<>();
//        myList.add("HTML");
//        myList.add("CSS");
//        myList.add("JAVA");
//        Stream<String> stream1 =  myList.stream();
//
//        String[] myArr = new String[3];
//        myArr[0] = "HTML";
//        myArr[0] = "CSS";
//        myArr[0] = "JAVA";
//        Stream<String> stream2 = Arrays.stream(myArr);
//
////        원시자료형을 위한 STREAM객체가 별도로 존재.
//        int [] intArr = {19,20,30,40,50,};
//        IntStream stream3 = Arrays.stream(intArr);
//

////        stream의 중개연산(변환) : filter, map, sorted, distinct, mapToInt(좀 많이 쓰는듯??????)
//        int [] intArr = {10,20,30,40,50,};
////        30보다 작은 값을의 총합
////        filter : 특정기준으로 대상을 filtering하여 새로운 스트림 반환하는 중개연산 매서드
////        sum : 스트림의 요소를 하나씩 소모하여 총합을 구하는 메서드
//        int total = Arrays.stream(intArr).filter(a->a<=30).sum();
//        System.out.println(total);
//
//
////        map : 기존의 스트림을 조작하여 새로운 스트림을 반환
//        int[] intArr2 = {10,10,30,40,50,};
//        int total2 = Arrays.stream(intArr2).map(a->a*10).sum();
//        int[] newIntArr = Arrays.stream(intArr2).map(a->a*10).toArray();
//        System.out.println(Arrays.toString(newIntArr));
//
//
////        distinct : 중복제거
//        int [] intArr3 = {10,10,30,40,50};
//        int total3 = Arrays.stream(intArr3).distinct().sum();
//
////        sorted : 정렬
//        int[] intArr4 = {10,10,30,40,50};
//        int[] newArr4 = Arrays.stream(intArr4).sorted().toArray();
//
//
////        mapToInt : instream형태로 변환해주는 map(많이쓰임!!!!!!!!!!!!!!!!!!!!!!!!!!!!!)
//        String [] stArr = {"HTML", "CSS","PYTHON","C++"};
////        문자열 길이의 총합
//        int lengthTotal = Arrays.stream(stArr).mapToInt(a->a.length()).sum();
//
//
//
//            int[] arr = {1,2,5,4,3,6};
////            arr에서 홀수만 담은 배열 생성 후 출력
//            int[] newArr1 = Arrays.stream(arr).filter(a->a%2==1).toArray();
//
////            arr에서 홀수만 걸러서 해당 홀수의 제곱값을 담은 배열을 생성 후 출력
//            int[] newArr2 = Arrays.stream(arr).filter(a->a%2==1).map(b->b*b).toArray();
////            arr에서 홀수만 거르고, 제곱값을 구하고, 해당 숫자값을 오름차순한 순서로 배열을 생성 후 출력
//            int[] newArr3 = Arrays.stream(arr).filter(a->a%2==1).map(b->b*b).sorted().toArray();
//
//            System.out.println(Arrays.toString(newArr1));
//            System.out.println(Arrays.toString(newArr2));
//            System.out.println(Arrays.toString(newArr3));


//            스트림의 소모 : foreach(출력), sum(합계), reduce(누적연산). max, min, count, findFirst(많이쓰이는듯????)

//            int[] intArr = {10,20,30,40};
//            Arrays.stream(intArr).forEach(a-> System.out.println(a));
//            int total = Arrays.stream(intArr).sum();
//
////            optional객체 : 값이 있을수도 있고, 없을수도 있음을 명시한 객체
//            int max = Arrays.stream(intArr).max().getAsInt();
//            int min = Arrays.stream(intArr).min().getAsInt();
//            Long count = Arrays.stream(intArr).count();
//
////            reduce : 누적연산(초기값,연산식) (매우 많이씀!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!)
//            int accSum = Arrays.stream(intArr).reduce(0,(a,b) -> (a+b));
//            System.out.println(accSum);
//            int accMultiply = Arrays.stream(intArr).reduce(1,(a,b) -> (a*b));
//            System.out.println(accMultiply);
//            String [] stArr = {"hello","java","world"};
//            String stAcc = Arrays.stream(stArr).reduce("",(a,b)->a+b);
//            System.out.println(stAcc);
//
////            findFirst : 첫번째 요소 반환
//
//            String firstSt = Arrays.stream(stArr).filter(a->a.length()>=5).findFirst().get();
//            System.out.println(firstSt);


////            주의 사항 : 제네릭의 타입소거
////            자바의 런타임 시점에 <String>과 같은 제네릭의 타입소거 발생.
////            제네릭의 타입소거로 인해, toArray를 통해 바로 새로운 String배열을 만드는 것은 불가.
//            String[] stArr = {"hello", "java", "python"};
//            String [] answer = Arrays.stream(stArr).filter(a-> a.length()>=5).toArray(a->new String[a]);
//
//
////            메소드 참조 : 하나의 메소드만을 호출하는 경우에 매개변수를 제거한 형식. 클래스명::메서드명
//            Arrays.stream(stArr).forEach(System.out::println);
//            String [] answer2 = Arrays.stream(stArr).filter(a-> a.length()>=5).toArray(String[]::new);
//
//
////            StreamApi 실습
//        List에 Student 객체 4개 담기 : {"kim", "20} , {"choi", 30} ...
        List<Student> list = new ArrayList<>();
        list.add(new Student("kim", 20));
        list.add(new Student("choi", 32));
        list.add(new Student("lee", 35));
        list.add(new Student("park", 22));

////        1)모든 객체의 평균나이
//        double avg = list.stream().mapToDouble(a->a.getAge()).average().getAsDouble();
////        2)가장 나이 어린 사람 찾기
//        Student s1 = list.stream().sorted((o1, o2) -> o1.getAge()-o2.getAge()).findFirst().get();
////        3)30대인 사람들의 이름만 모아서 새로운 String 배열에 담기
//        String [] arr = list.stream().filter(a->a.getAge()>=30).map(a->a.getName()).toArray(String[]::new);
//
//
//
//
//
////        Optional 객체 (매우중요!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1)
////        특정개체에 값이 없을지돌 모른다는 것을 명시한 표현
//        String st1 = null;
//        if(st1!=null) {
//            System.out.println(st1.compareTo("Hello"));
//
//        } else {
//            System.out.println("값이없습니다.");
//        }
//
//        Optional<String> opt1 = Optional.ofNullable(null);
//        if(opt1.isPresent()) {
//            System.out.println(opt1.get().compareTo("hello"));
//        } else {
//            System.out.println("값이없습니다.");
//        }


//        Optional 객체 생성방법 3가지.
        Optional<String> opt1 = Optional.empty(); //비어있는 Optional 객체 생성
        Optional<String> opt2_1 = Optional.ofNullable(null); //비어있는 Optional 객체 생성
        Optional<String> opt2_2 = Optional.ofNullable("hi"); //값이 있는 Optional 객체 생성
        Optional<String> opt3 = Optional.of("hello"); //값이 있는 Optional 객체 생성


////        Optional 객체 처리방법 4가지
////        방법1. isPresent()로 확인후에 get
//        if(opt2_1.isPresent()) {
//            System.out.println(opt2_1.get());
//        } else {
////            System.out.println(opt2_1.get()); //에러발행
//            System.out.println("값이없습니다.");
//        }
//
//
////        방법2. orElse() : 값이 있으면 있는 값 return, 없으면 지정한 값 return
//        System.out.println(opt2_1.orElse("값이없습니다."));
//        System.out.println(opt2_2.orElse("값이없습니다."));
//
//
////        방법3. orElseGet : 값이 있으면 있는 값 return, 없으면 람다함수 실행 (잘안쓰임)
//        System.out.println(opt2_1.orElseGet(()->new String()));
//
//
//        방법4. 가장많이사용 orElseThrow : 값이 있으면 있는 값 return, 없으면 지정된 예외(에러)강제 발생.
//        개발에서 사용자에게 적절한 메시지 전달 목적과 의도된 코드중단을 목표로 강제로 예외발생시키는 경우는 매우 많음.
//        System.out.println(opt2_1.orElseThrow(()->new RuntimeException("값이 없습니다."))); //의도한 예외발생
//        System.out.println(opt2_1.get()); //에러발생. 의도치않은 에러발생


//        Optional 객체 예시1
        List<Student> studentList = new ArrayList<>();
//
//        OptionalDouble age = studentList.stream().mapToInt(a->a.getAge()).average();
//        if(age.isPresent()) {
//            System.out.println(age.getAsDouble());
//        } else {
//            throw new NoSuchElementException("값이 없습니다.");
//        }

//        평균구하기예제 2
//        Double age2 = studentList.stream().mapToInt(a->a.getAge()).average().orElseThrow(()->new NoSuchElementException("값이없습니다."));

//        Optional 객체 예시2

        studentList.add(new Student("kim", 20)); //DB라고생각
        studentList.add(new Student("choi", 32)); //조회
        studentList.add(new Student("lee", 35));
        studentList.add(new Student("park", 22));
        System.out.println("조회하고자 하는 student의 index번호를 입력해주세요");
        Scanner sc = new Scanner(System.in);
        int indexNum = Integer.parseInt(sc.nextLine());

//        index범위가 list범위 안에 있으면 optinal.ofnullable 또는 of, ofEmpty 생성
//        ????????????????????????????????/
        Optional<Student> optionalStudent; //??

        if(indexNum>=studentList.size()) {
            optionalStudent = Optional.ofNullable(null);
        } else {
            optionalStudent = Optional.ofNullable(studentList.get(indexNum));
        }
        System.out.println(optionalStudent.orElseThrow(()->new NoSuchElementException("x")));





    }
}
