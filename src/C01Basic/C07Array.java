package C01Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

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





//        선택정렬 알고리즘 직접구현
        int [] arr = {17,12,20,10,15};
        int [] temp = new int[arr.length];
        int index = 0;
        int min = Integer.MAX_VALUE;

        /*
        1.배열에서 최소값을 찾는다. 최소값의 범위는 0~길이까지 최소값의 인덱스번호를 받는다.
        인덱스 번호에 맞는 새 배열에 그 값을 저장한다.
        2. 배열에서 최소값을 찾는다. 최소값의 범위는 1~길이까지
         */

        for(int i=0; i<arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];

            }
            temp[i] = min;

        }
        System.out.println(Arrays.toString(temp));







    }
}
