package C01Basic;

import java.util.*;

public class C07Array {
    public static void main(String[] args) {


////        배열표현식1. 배열 선언 후 할당 방식
////        배열은 반드시 사전에 길이가 결정되어야 함.
//        int [] arr1 = new int[5];
//        arr1[0] = 10;
//        arr1[1] = 20;
//        arr1[3] = 40;
//        arr1[4] = 50;
//        arr1[5] = 60; index out of bounds 예외 발생. 배열의 길이가 동적으로 늘어날 수 없음.
//
////        배열표현식2. 리터럴 방식
//        int [] arr2 = {10,20,30,40,50};
//
//
//
////        배열표현식3.
//        int [] arr3 = new int[]{10,20,30,40,50};
////        배열표현식3.예시
//        ArrayList<int[]> list = new ArrayList<>();
//        list.add(new int[5]);
//        list.add(new int[]{1,3,5});
//
//
////        배열표현식4 : 불가 -> 배열의 길이를 반드시 확정시켜야함
//        int [] arr4 = new int[];


////        Arrays.fill : 배열에 모든 값을 변경
//        String[] arr =new String[5];
//        for(int i=0; i<arr.length; i++) {
//            arr[i] = "";
//        }
//        Arrays.fill(arr,"");
//

////        예제: 85, 65 , 90으로 구성된 int 배열을 선언하고, 총합과 평균을 구해보시오.
//        int [] arr = new int[]{85,65,90};
//        int sum =0;
//        for(int i=0; i<arr.length; i++) {
//            sum += arr[i];
//        }
//        System.out.println("총 합은 " + sum);
//        System.out.println("평균은 " + (double)sum/arr.length);
//
//
////        배열의 최대값과 최소값
//        int[] arr2 = {10,20,30,12,8,17};
//        int max = Integer.MIN_VALUE;
//        for(int i=0; i<arr.length; i++) {
//            if(max < arr2[i]) {
//                max = arr2[i];
//            }
//        }
//        int min = max;
//        for(int i=0; i<arr.length; i++) {
//            if(min > arr2[i]) {
//                min = arr2[i];
//            }
//        }
//        System.out.println("최대값은 " + max);
//        System.out.println("최소값은 " + min);
//        System.out.println(Arrays.stream(arr2).max());




////        배열의 자리 바꾸기
//        int[] arr = {20,10,30};
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;
//        System.out.println(Arrays.toString(arr));




////        배열 뒤집기
//        int [] arr = {10,20,30,40,50};
//        int [] newArr = new int[arr.length];
//        int k = 0;
//        for(int i=arr.length-1; i>=0; i--) { //43210
//
//            newArr[k] = arr[i];
//            k++;
//
//        }
//        System.out.println(Arrays.toString(newArr));
//        int q = 4;
//                for(int j=0; j<arr.length; j++) {
//            arr[q] = newArr[j];
//            q--;
//        }
//
//        System.out.println(Arrays.toString(arr));







////        배열의 정렬
//        int [] arr = {17,12,20,10,15};
//        Arrays.sort(arr); //오름차순 정렬
//        System.out.println(Arrays.toString(arr));
////        Arrays.sort(arr, Comparator.reverseOrder()); 원시자료형은 comparator 사용불가능
//
//        String[] stArr = {"abc","aaa","acb","abb"};
//        Arrays.sort(stArr, Comparator.reverseOrder());//내림차순
//        System.out.println(Arrays.toString(stArr));





////        선택정렬 알고리즘 직접구현 : 1)min값찾기 2)자리change 3)2중for문(index주의)
//        int [] arr = {17,12,20,10,15};
////        자리를 결정
//        for(int i=0;i<arr.length;i++) {
//            int min = arr[i];
//            int minIndex = i;
////        min값을 찾기 위한 for문
//            for(int j=i+1;j<arr.length;j++) {
//                if(min < arr[j]) {
//                    min = arr[j];
//                    minIndex = j;
//                }
//            }
////        자리체인지 로직
//            int temp = arr[i];
//            arr[i] = arr[minIndex];
//            arr[minIndex] = temp;
//        }
//        System.out.println(Arrays.toString(arr));





////        조합문제 : 모두 각기 다른 숫자의 배열이 있을때, 만들어질 수 있는 두 숫자의 조합을 문자열 형태로 출력
////        ex.(10.20)(10,30)(10,40)(10,50)(20,30)...(40,50)
//
//        int[] intArr = {10,20,30,40,50};
//        for(int i=0; i<intArr.length; i++) {
//            for(int j=i+1; j<intArr.length; j++) {
//                System.out.println("(" + intArr[i] + ") (" + intArr[j] + ")");
//            }
//        }






////        배열의 중복제거 : set 자료구조(중복x,순서x)를 활용하여 중복제거
//        int[] arr = {10,10,20,30,30,40};
//        Set<Integer> mySet = new HashSet<>();
//        for(int a : mySet) {
//            mySet.add(a);
//        }
//        int [] intArr = new int[mySet.size()];
//        int index = 0;
//        for(int b : mySet) {
//            intArr[index] = b;
//            index++;
//        }
//        Arrays.sort(intArr);
//        for(int i=0; i<intArr.length; i++) {
//            for(int j=0; j<intArr.length; j++) {
//                if(i==j) {
//                    continue;
//                }
//                System.out.println("(" + intArr[i] + ") (" + intArr[j] + ")");
//            }
//        }
//



//        프로그래머스 - 두 개 뽑아서 더하기(조합+중복제거)




////        배열의 검색
//        int[] arr = {5,3,1,8,7};
//        int target = 8;
////        8이 몇번째 index에 있는지 출력
//        for(int i=0; i<arr.length; i++) {
//            if(arr[i] == target) {
//                System.out.println(i+1 + "번째에 있습니다.");
//                break;
//            }
//        }

////        이분탐색(이진검색) - binary search
////        사전에 데이터가 오름차순 정렬 돼 있을 경우, 이분탐색 가능
//        int [] arr = {1,3,6,8,9,11,15};
//        System.out.println(Arrays.binarySearch(arr,15));
////        값이 있으면 해당 index리턴
////        값이 없으면 마이너스 리턴



//        백준 - 수 찾기 : 1920번





////        배열의 값 비교
//        int [] arr1 = {10,20,30};
//        int [] arr2 = {10,20,30};
//        System.out.println(Arrays.equals(arr1,arr2));






////        2차원 배열의 선언과 값 할당
////        {{1,2},{1,2},{1,2}}
//
//        int [][] arr = new int[3][2];
//        arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[1][0] = 3;
//        arr[1][1] = 4;
//        arr[2][0] = 4;
//        arr[2][1] = 4;
//
////        리터럴 방식
//        int [][] arr2 = {{1,2},{3,4},{5,6}};
//
//
//
////        가변배열 : 배열의 전체길이는 반드시 할당
//        int[][] arr3 = {{1,2},{1,2,3},{1,2,3,4}};
////        2차원 배열의 출력
//        System.out.println(arr3); //2차원 배열의 주소
//        System.out.println(Arrays.toString(arr3)); //각 2차원 배열의 주소
//        System.out.println(Arrays.deepToString(arr3)); //모든 각 2차원 배열의 값
//
//        int [][] arr4 = new int [3][];
//        arr4[0] = new int[2];
//        arr4[1] = new int[3];
//        arr4[2] = new int[4];


//        [3][4] 사이즈 선언하고 1~12까지 숫자값을 각 배열에 순차적으로 할당
//        {{1,2,3,4},{5,6,7,8},{9,10,11,12}}


//        int [][] arr = new int[3][4];
//        int val = 1;
//        for(int i=0; i<arr.length; i++) {
//            for(int j=0; j<arr[i].length; j++) {
//                arr[i][j] = val;
//                val++;
//            }
//        }
//        System.out.println(Arrays.deepToString(arr));
//
//
////        가변배열 값 채우기
//        int[][] arr2 = new int [3][];
//        int num = 1;
//        for(int i=0; i<arr2.length; i++) {
//            arr2[i] = new int[4];
//            for(int j=0; j<arr2[i].length; j++) {
//                arr2[i][j] = num;
//                num++;
//            }
//        }
//        System.out.println(Arrays.deepToString(arr2));
//




//        행렬의 덧셈 - 프로그래머스
//        K번째 수 - 프로그래머스???



////        배열복사 : Arrays.copyOf(배열명, length), Arrays.copyOfRange(배열명, start, end)
//        int [] arr = {1,2,3,4,6,67,7,8,6,4,2,1};
//        int [] arr1 = Arrays.copyOf(arr,4);
//        System.out.println(Arrays.toString(arr1));
//        int [] arr2 = Arrays.copyOfRange(arr, 3,6);
//        System.out.println(Arrays.toString(arr2));
//









    }
}
