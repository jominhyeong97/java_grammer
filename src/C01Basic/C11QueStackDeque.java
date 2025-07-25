package C01Basic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class C11QueStackDeque {
    public static void main(String[] args) {


//        Queue인터페이스를 LinkedList가 구현한 아래와 같은 방식을 가장 많이 사용
        Queue<Integer> myQue = new LinkedList<>();
        myQue.add(10);
        myQue.add(20);
        myQue.add(30);

//        poll : queue에서 데이터를 삭제하면서 동시에 return하는 메서드
        int temp = myQue.poll(); //10
        System.out.println(temp);
        System.out.println(myQue); //20,30

//        peek : queue에서 데이터를 삭제하지 않고, 가장 앞의 데이터를 반환
        int temp2 = myQue.peek();
        System.out.println(temp2);
        System.out.println(myQue);

//        LinkedList와 ArrayLIst 성능차이 비교
//        LinkedList가 add시에 더 빠르지만 ArrayList가 조회시에 성능이 더 좋음




    }
}
