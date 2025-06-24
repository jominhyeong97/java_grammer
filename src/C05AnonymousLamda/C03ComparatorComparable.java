package C05AnonymousLamda;

import java.util.*;

public class C03ComparatorComparable {
    public static void main(String[] args) {
//        자바에서는 비교를 위한 인터페이스가 대표적으로 2개가 제공

////        Comparable : compareTo메서드 선언
////        Comparator : compare메서드 선언
//
////        String 클래스에 compareTo메서드 내장
////        String 클래스 및 java에 많은 클래스에서 Comparable을 상속하여 compareTo메서드를 구현.
//        String a = "hello";
//        String b = "world";
//        System.out.println(a.compareTo(b)); //마이너스
//
//        List<String> myList = new ArrayList<>();
//        myList.add("java");
//        myList.add("python");
//        myList.add("C++");
//
////        String안의 compareTo메서드를 사용하여 정렬이 이뤄짐.
//        Collections.sort(myList);

//        직접 만든 Student를 LIst에 담아 정렬
        List<Student> studentList = new ArrayList<>();
        studentList.add( new Student("Kim",24));
        studentList.add(new Student("Lee",23));
        studentList.add( new Student("Park",27));
        studentList.add(new Student("Choi",22));
        studentList.add( new Student("Jo",21));


////        정렬 방법 1 : Student객체에서 Comparable을 직접 구현한 방식
////        단점 : student객체를 직접수정해야 하므로 유연성이 떨어짐
////        Collections.sort에서 Comparabale을 구현한 객체를 요구.
//        Collections.sort(studentList);
//        System.out.println(studentList);

//        정렬 방법 2 : Comparator를 구현한 익명객체를 사용.
//        람다식으로 바꿔보기, Comparator의 활용도가 높은 이유는 많은 정렬 메서드에서 Comparator객체를 요구하기 때문
        studentList.sort((o1,o2) -> { return o1.getName().compareTo(o2.getName());});

        System.out.println(studentList);

        String[] stArr = {"hello","java","C++","world2"};
        Arrays.sort(stArr);
        Arrays.sort(stArr,Comparator.reverseOrder());

//        글자길이를 기준으로 내림차순 정렬
        Arrays.sort(stArr, (o1, o2) -> o2.length()-o1.length());
        System.out.println(Arrays.toString(stArr));

//        백준 : 단어 정렬

        Queue<String> que = new PriorityQueue<>();
        Queue<String> que2 = new LinkedList<>();

//        백준 : 절댓값 힙


//        배열 안의 배열 정렬
//        [4,5],[1,2],[5,0],[3,1]

        List<int[]> myList = new ArrayList<>();
        myList.add(new int []{4,5});
        myList.add(new int []{1,2});
        myList.add(new int []{5,0});
        myList.add(new int []{3,1});
//        리스트안의 배열에 index 1번째 값을 기준으로 오름차순
        myList.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        for(int[] a : myList) {
            System.out.println(Arrays.toString(a));
        }

//        백준 : 선긋기
//        arr[0]기준으로 정렬
//        3가지의 경우의수에 따라 total





    }
}

class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    정렬은 결국 2개의 값을 비교하는 것으로, A와 B대상 2개만 있으면 충분
//    두 수 또는 문자 비교의 경우 음수,0,양수 세 값중에 하남나 return 이를 통해 정렬 수행.
//    this가 앞에 있을 땐 오름차순, this가 뒤에 있으면 내림차순으로 내부적으로 정렬
    @Override
    public int compareTo(Student o) {
        return o.getName().compareTo(this.getName());
//        return o.getAge() - this.getAge();

    }
}