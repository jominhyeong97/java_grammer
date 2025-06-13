package C01Basic;

import java.util.*;

public class C08List {
    public static void main(String[] args) {

////        List 선언방법
//        ArrayList <String> myList1 = new ArrayList<String>();
//        ArrayList <String> myList2 = new ArrayList<>();
//
////        List 선언방법2 : 가장 일반적인 방법
//        List<String> myList3 = new ArrayList<>();
//
////        초기값 세팅방법 1. 개별data add
//        myList3.add("java");
//        myList3.add("python");
//        myList3.add("C++");
//        System.out.println(myList3);
//
////        초기값 세팅방법 2. 배열을 리스트로 변환 (중요!!!)
//        String[] arr = {"java","python","C++"};
//        List<String> myList4 = new ArrayList<>(Arrays.asList(arr));
//
//        int[] intArr = {10,20,30};
//        List<Integer> myIntList = new ArrayList<>();
//        for(int i : intArr) {
//            myIntList.add(i);
//        }


////        add 메서드 : 리스트에 값을 하나씩 추가하는 메서드 (매우중요!!!)
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(0,30); //List는 중간에 데이터 삭제/삽입하는 것이 성능 비효율적
//        System.out.println(myList);
//
////        get(index) 메서드 : 특정리스트의 index 요소 반환
//        System.out.println(myList.get(0));
//
//
////        size : 리스트의 개수(길수)를 반환(매우중요!!!!!!!!!!1)
//        for(int i=0; i<myList.size(); i++) {
//            System.out.println(myList.get(i));
//        }


////        remove : 요소 삭제
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
////        1)index를 통한 삭제 2)value를 통한 삭제(일반적이지 않음)
//        myList.remove(0);
//        System.out.println(myList);
//
//        myList.remove(Integer.valueOf(30));
//        System.out.println(myList);
////        clear : 요소 전체 삭제
//        myList.clear();
//        System.out.println(myList.isEmpty());
//
////        indexOf : 특정값을 찾아 index retrun(별로 안중요), 가장먼저 나온느 값 리턴
//        List<Integer> myList2 = new ArrayList<>();
//        myList2.add(10);
//        myList2.add(20);
//        myList2.add(30);
//        myList2.add(30);
//        System.out.println(myList2.indexOf(30));


//        contains : 값이 있는지 없는지 여부를 리턴
//        System.out.println(myList2.contains(20));



//        프로그래머스 - n의 배수 고르기 억까문제



////        정렬 : 방법2가지(Collections클래스 사용, 객체사용)
//        List<Integer> myList = new ArrayList<>();
//        myList.add(5);
//        myList.add(4);
//        myList.add(3);
//        myList.add(2);
//        myList.add(1);
//
////        Collections.sort() : 디폴트는 오름차순 (매우중요!!! 둘 다 쓰임)
//        Collections.sort(myList);
//        Collections.sort(myList, Collections.reverseOrder()); //내림차순
//
////        객체(ArrayList클래스).sort() (매우중요!!!!!!!!!)
//        myList.sort(Comparator.naturalOrder());
//        myList.sort(Comparator.reverseOrder());



//        이중리스트 : 리스트 안의 리스트 ??????
//        [[1,2],[2,3],[3,5]]
        List<List<Integer>> myList = new ArrayList<>(); //  [[]]

        List<Integer> myList1 = new ArrayList<>(); //  []
        myList.add(myList1); // =  myList.add(new ArrayList<>());


        myList.get(0).add(1);
        myList.get(0).add(2); // [[1,2], []]
        myList.get(1).add(3);
        myList.get(1).add(4);// [[1,2],[3,4]]


//        for문 이용해서 [[1,2,3],[4,5,6,],[7,8,9],[10,11,12]] 만들기?????????



//        리스트 안에 배열
//        {{1,2},{1,2,3},{1,2,3,4}}
        List<int[]> myList2 = new ArrayList<>();
        myList2.add(new int[2]);
        myList2.get(0)[0]=1;
        myList2.get(0)[1]=2;
        myList2.add(new int[3]);
        myList2.get(1)[0]=1;
        myList2.get(1)[1]=2;
        myList2.get(1)[2]=3;
        myList2.add(new int[]{1,2,3,4});
        for(int[] a : myList2) {
            System.out.println(Arrays.toString((a)));
        }



























    }
}
