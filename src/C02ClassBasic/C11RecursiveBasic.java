package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;

public class C11RecursiveBasic  {
    public static void main(String[] args) {

        recur0(0, 3);

    }

    public static void recur0(int count, int maxCount) {
        if(count == maxCount) {
            return;
        }
        System.out.println("재귀 호출 전 count : "+count); //0(첫번쨰) > 1(두번째) > 2(세번째)
        recur0(count+1,maxCount);
        System.out.println("재귀 호출 후 count : "+count); //0(4번째) > 1(5번) > 2(6번)

    }


//    아래 함수 출력순서 : 전C:0 > 전C:1 > 전C:2 > 후C:3 > 후 C:2 > 후 C:1
    public static void recur1(int count, int maxCount) {
        if(count == maxCount) {
            return;
        }
        System.out.println("재귀 호출 전 count : "+count); //
        count = count +1;
        recur1(count,maxCount);
        System.out.println("재귀 호출 후 count : "+count); //

    }

//    객체를 매개변수로 활용한 재귀함수 : 객체는 힙메모리를 통해 원본객체가 변경될 수 있으므로, 재귀함수간에 값이 일치되는 현상
    public static void recur2(List<Integer> myList, int num, int target) {

        if(myList.size() == target) {
            return;
        }
        myList.add(num);
        recur2(myList,num+1,target);
        System.out.println(myList);

    }


}
