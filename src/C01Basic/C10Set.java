package C01Basic;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C10Set {
    public static void main(String[] args) {
////        중복이 없고 순서가 보장안됨.
//
//        Set<String> mySet = new HashSet<>();
//        mySet.add("5");
//        mySet.add("5");
//        mySet.add("5");
//        mySet.add("5");
//        mySet.add("5");
//        mySet.add("3");
//        mySet.add("1");
//        mySet.add("3");
//        mySet.add("5");
//        System.out.println(mySet);
//
//
////        백준 : 숫자카드(10815)
//
//
////        프로그래머스 : 폰켓몬
//
//
//
////        LinkedHashSet : 입력순서 보장
//        Set<Integer> linkedSet = new LinkedHashSet<>();
//        linkedSet.add(1);
//        linkedSet.add(1);
//        linkedSet.add(0);
//        linkedSet.add(3);
//        linkedSet.add(1);
//        System.out.println(linkedSet);  //103
//
//
////        TreeSet : 데이터를 오름차순 정렬
//        Set<Integer> treeSet = new TreeSet<>();
//        treeSet.add(1);
//        treeSet.add(1);
//        treeSet.add(0);
//        treeSet.add(3);
//        treeSet.add(1);
//        System.out.println(treeSet);  //013
//
//
//
////       집합관련함수 : 교집합(retainAll), 합집합(addAll), 차집합(removeAll)
//        Set<String> set1 = new HashSet<>();
//        set1.add("java");
//        set1.add("python");
//        set1.add("C++");
//        Set<String> set2 = new HashSet<>();
//        set2.add("java");
//        set2.add("html");
//        set2.add("css");

//        set1.retainAll(set2); //set1에는 java만 남음
//        System.out.println(set1);
//        set1.addAll(set2); //java phyon c++ html css
//        System.out.println(set1);
//        set1.removeAll(set2); //python c++
//        System.out.println(set1);


//        Queue<String> myQue = new LinkedList<>();
//        myQue.add("문서1");
//        myQue.add("문서2");
//        myQue.add("문서3");
//        myQue.add("문서4");
//
////        queue는 일반적으로 while문으로 요소 소모
//
//        while (!myQue.isEmpty()) {
//            System.out.println(myQue.poll());
//        }

//        2개씩 poll을 할 경우에는 queue가 empty가 되지 않도록 유의



//        백준 : 카드2



////        길이제한큐
//        Queue<String> blockingQueue = new ArrayBlockingQueue<>(3);
////        blockingQueue.add("문서1");
////        blockingQueue.add("문서2");
////        blockingQueue.add("문서3");
////        blockingQueue.add("문서4");
//
////        Offer : 길이제한될 경우 제한된 길이까지만 insert , add는 길이 초과시 에러 발생
//        blockingQueue.offer("문서1");
//        blockingQueue.offer("문서2");
////        blockingQueue.offer("문서3");
//        blockingQueue.offer("문서4");
//        System.out.println(blockingQueue);



////        우선순위 큐 : 데이터를 poll할 때 정렬된 데이터결과값 보장(매우 중요!!!!!!!!!!!!!)
////        전체 데이터가 계속해서 변경되면서 지속적으로 최소값을 추출해야 하는 경우.
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//        System.out.println(pq); //add할떄까지는 전체 정렬이 되어있지 않음.
//        while(!pq.isEmpty()) {
//            System.out.println(pq.poll()); //한개씩 poll할 때마다 최소값을 뽑아낸다. log(n)의 복잡도
//        }

//        프로그래머스 : 더 맵게






//        stack : 후입선출
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.peek());


//        프로그래머스 : 올바른 괄호???

//        프로그래머스 : 같은 숫자는 싫어




//        Deque : addFirst, addLast, peekFirst ...
        Deque<Integer> d1 = new ArrayDeque<>();
        d1.addLast(10);
        d1.addLast(20);
        d1.addLast(30);
        System.out.println(d1);







    }
}
