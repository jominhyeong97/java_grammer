package C01Basic;

import java.util.*;

public class C09Map {
    public static void main(String[] args) {

////        key, value로 이루어진 자료구조
////        key 값은 중복이 있으면 value를 덮어쓰기.
//        Map<String, Integer> myMap = new HashMap<>();
//        myMap.put("baseball",2);
//        myMap.put("basketball",1);
//
////        Map은 key를 통해 value를 get
////        map에서 key값을 통한 검색 복잡도는 0(1) --- 매우중요!!
//
//        System.out.println(myMap.get("baseball"));
//
//
//
////        Map의 전체데이터 출력
////        Map의 key값 접근시에 인덱스 사용 불가능(순서가 없으므로)
////        keySet() : Map의 key목록을 리턴하는 메서드 (매우중요!!!!)
////        values() : Map의 value목록을 리턴하는 메서드 (매우중요!!!)
//        int total = 0;
//        for(int v : myMap.values()) {
//            total += v;
//        }
//
//
//        int total2 = 0;
//        for(String k : myMap.keySet()) {
//            total2 += myMap.get(k);
//        }
//
//
//
//
//
////        remove : 키를 통해 map 요소 삭제
//        myMap.remove("basketball");
//        System.out.println(myMap);
//
//        myMap.put("baseball",10);
//        System.out.println(myMap);
//


//        Map<String, String> sports = new HashMap<>();
//        sports.put("soccer", "축구");
//        sports.put("baseball", "야구");
//        sports.put("basketball", "농구");
////        putIfAbsent : key 값이 없는 경우에만 put
//        sports.putIfAbsent("soccer", "운동");
//        sports.putIfAbsent("tennis","테니스");
//        System.out.println(sports);
//
//
////        containsKey : 키가 있으면 true, 없으면 false
//        System.out.println(sports.containsKey("tennis"));
//        System.out.println(sports.containsKey("pingpong"));
//
//
//
////        Map출력방법 2가지 : 1.for each문 2.iterator(중요도 조금 있음)
////        1. foreach문
//        for(String a : sports.keySet()) {
//            System.out.println(a); //key
//            System.out.println(sports.get(a)); //value
//        }
////        1-1. keySet대신 set배열 안에 받아서 출력하는 법
//        Set<String> mySet = sports.keySet();
//        for(String a : mySet) {
//            System.out.println(a);
//        }


////        2. iterator 활용(추후에 Spring에서 iterator 객체를 활용하여 데이터를 받음)
//
//        Map<String, String> sports = new HashMap<>();
//        sports.put("soccer", "축구");
//        sports.put("baseball", "야구");
//        sports.put("basketball", "농구");
//        Iterator<String> iterators = sports.keySet().iterator();
//////        next라는 메서드는 데이터를 하나씩 소모시키면서 값을 반환
////        System.out.println(iterators.next());
//////        hasNext메서드는 iterator 안에 그 다음값이 있는지 없는지 boolean으로 리턴
////        System.out.println(iterators.hasNext());
//        while(iterators.hasNext()) {
//            System.out.println(iterators.next());
//        }


////        map은 key의 value수를 count하는 목적으로 많이 활용
//        String[] arr = {"농구","축구","농구","야구","축구"};
//
////      농구:2, 축구:2, 야구:1
//        Map<String, Integer> sports = new HashMap<>();
//        for(int i=0; i<arr.length; i++) {
////            int count = 1;
////            if(sports.containsKey(arr[i])) {
////                //sports.put(arr[i],count+1); 내가짠거
////                sports.put(arr[i],sports.get(arr[i])+1);
////            } else  {
////                sports.put(arr[i],1);
////                count++;
////            }
////            getOrDefault(키값,초기값) : key값 없을경우 초기값 리턴 (매우중요!!!)
//            sports.put(arr[i], sports.getOrDefault(arr[i], 0)+1);
//        }
//        System.out.println(sports);
//
//        String[] removeArr = {"농구","농구","농구","축구","야구"}; ????????????????
////        축구:1
//
//        for(int i=0; i<removeArr.length; i++) {
//            if(sports.containsKey(removeArr[i]) && sports.get(removeArr[i])>0) {
//                sports.put(removeArr[i],sports.get(removeArr[i])-1);
//            } else if(sports.containsKey(removeArr[i]) && sports.get(removeArr[i]) <= 0) {
//                sports.remove(removeArr[i]);
//            }
//
//            for(String r : removeArr) {
//                if(sports.get(r) ==1) {
//                    sports.remove(r);
//                }
//            } else

//        }
//        System.out.println("제거후 : " + sports);


        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("축구",3);
        myMap.put("농구",2);
        myMap.put("야구",1);

//        가장 value가 큰 key값 찾기(최대값 찾는 로직)
        int max =Integer.MIN_VALUE;
        String maxS = "";
        Set<String> setList = new HashSet<>();
        for(String a : myMap.keySet()) {
            if(myMap.get(a)> max) {
                max = myMap.get(a);
                maxS = a;
            }
        }

        System.out.println(maxS + max);


//        백준 : 베스트셀러



//        프로그래머스 : 완주하지 못한 선수 : exam06




//        프로그래머스 : 의상
        
        
//        LinkedHashMap : 데이터의 삽입순서를 보장(유지)
        Map<String,Integer> linkedMap = new LinkedHashMap<>();
        linkedMap.put("hello5",1);
        linkedMap.put("hello4",2);
        linkedMap.put("hello3",3);
        linkedMap.put("hello2",4);
        linkedMap.put("hello1",5);
        for(String l : linkedMap.keySet()) {
            System.out.println(l);
        }

//        TreeMap : key를 정렬(오름차순)하여 map을 저장

        TreeMap<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("hello5",1);
        treeMap.put("hello4",2);
        treeMap.put("hello3",3);
        treeMap.put("hello2",4);
        treeMap.put("hello1",5);
        for(String l : treeMap.keySet()) {
            System.out.println(l);
        }


//        백준 - 파일정리 문자열자르기 .는 "\\."









    }
}
