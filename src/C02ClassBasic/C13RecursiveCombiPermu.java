package C02ClassBasic;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;

//조합과 순열
//주로 백트래킹 알고리즘에서 사용
public class C13RecursiveCombiPermu {
    public static void main(String[] args) {
//        2중 for문으로 helloworld1 helloworld2... helloworldn
//        2중 for문의 반복횟수는 동적으로 결정되지 않고, 정적으로 코딩할 수 밖에 없는 한계가 존재


//        forRecur(0,3);

//        재귀함수 예제 : 조합
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
//        숫자 1,2,3,4,를 가지고 만들 수 있는 2개짜리 숫자조합을 이중리스트에 담아 출력
//        [[1,2],[1,3],[1,4],[2,3],[2,4]...[3,4]]
//        List<List<Integer>> doubleList = new ArrayList<>();
//        for(int i=1; i<=myList.size(); i++) {
//            for(int j=i+1; j<=myList.size(); j++) {
//                List<Integer> newList = new ArrayList<>();
//                newList.add(i);
//                newList.add(j);
//                doubleList.add(newList);
//            }
//        }
//        System.out.println(doubleList);




//        숫자 1,2,3,4,를 가지고 만들 수 있는 2개짜리 숫자조합을 재귀함수로 만들기
//        [[1,2],[1,3],[1,4],[2,3],[2,4]...[3,4]]

        List<List<Integer>> doubleList = new ArrayList<>();
//        List<Integer> temp = new ArrayList<>();

//        for(int i=1; i<=myList.size(); i++) {
//            temp.add(myList.get(i));
//
//            for(int j=i+1; j<=myList.size(); j++) {
//                temp.add(myList.get(j));
//                doubleList.add(new ArrayList<>(temp)); //[1,3][1,3]
//                temp.remove(temp.size()-1);
//            }
//            temp.remove(temp.size()-1);
//        }
//        System.out.println(doubleList);

//        combi(myList, new ArrayList<>(), doubleList,2,0);

//        1,2,3,4,를 n개씩 뽑은 순열구하기
//        [1,2],[1,3],[1,4],[2,1]...[4,3]


        permu(myList,new ArrayList<>(),doubleList,2,new boolean[myList.size()]);
        System.out.println(doubleList);

//        백준 : 15649 - N 과 M
//        백준 : 로또(6603)

    }

    static void permu(List<Integer> myList, List<Integer> temp, List<List<Integer>> doubleList, int target, boolean[] visited) {
        if(temp.size() == target) {
            doubleList.add(new ArrayList<>(temp)); //temp넣어야함 중요
            return;
        }

        for(int i =0; i<myList.size(); i++) {
            if(!visited[i]) {
                visited[i] = true;
                temp.add(myList.get(i));
                permu(myList, temp, doubleList, target, visited);
                temp.remove(temp.size() - 1);
                visited[i] = false;
            }
        }
    }


//    static void combi(List<Integer> myList, List<Integer> temp, List<List<Integer>> doubleList, int target, int start) {
//        if(temp.size() == target) {
//            doubleList.add(new ArrayList<>(temp)); //temp넣어야함 중요
//            return;
//        }
//
//        for(int i =start; i<myList.size(); i++) {
//            temp.add(myList.get(i));
//            combi(myList, temp, doubleList, target,i+1);
//            temp.remove(temp.size()-1);
//
//        }
//    }




//    static int staticCount = 0;
//
//    static void forRecur(int num, int target) {
//        if(num==target) {
//            System.out.println("helloWorld"+staticCount);
//            staticCount++;
//            return;
//        }
//
//        for(int i=0; i<3; i++) {
//
//            forRecur(num+1,target);
//        }
//    }
}
